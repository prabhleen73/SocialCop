package com.example.dell.social;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;
import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Jahnavi on 1/20/2018.
 */

public class user_page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_page);

        Button GoToNewActivity = (Button) findViewById(R.id.login_button);

        // Set a click listener on that View
        GoToNewActivity.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(user_page.this,Activity1.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        Button GoToNewActivity1 = (Button) findViewById(R.id.admin_button);

        // Set a click listener on that View
        GoToNewActivity1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(user_page.this,ViewDataActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
    }
}
