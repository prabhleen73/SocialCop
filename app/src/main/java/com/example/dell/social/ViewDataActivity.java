package com.example.dell.social;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ViewDataActivity extends AppCompatActivity {
    ListView listView;
    List<ImageUploadInfo> list, list_temp;
    ProgressDialog progressDialog;
    MyAdapter myAdapter;
    int j = 0;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);


        listView = (ListView) findViewById(R.id.list1);

        list = new ArrayList<>();
        list_temp = new ArrayList<>();
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Fetching Please wait");
        progressDialog.show();

        databaseReference = FirebaseDatabase.getInstance().getReference(News.Database_Path);

        final ListView finalListView = listView;
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                progressDialog.dismiss();
                list_temp.clear();

                for (DataSnapshot snap : dataSnapshot.getChildren()) {
                    ImageUploadInfo person = snap.getValue(ImageUploadInfo.class);
                    list_temp.add(person);
                }
                method(list_temp, list);
                myAdapter = new MyAdapter(ViewDataActivity.this, R.layout.data_items, list);
                listView.setAdapter(myAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public static void method(List<ImageUploadInfo> list_temp, List<ImageUploadInfo> list) {
        for (int j = list_temp.size() - 1; j >= 0; j--) {
            list.add(list_temp.get(j));
        }
    }

}

