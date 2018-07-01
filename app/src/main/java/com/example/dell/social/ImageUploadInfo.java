package com.example.dell.social;

/**
 * Created by Dell on 22-Jan-18.
 */

public class ImageUploadInfo {
    private String name;

    private String imageUri;
    private String location;

    public ImageUploadInfo(String name,String location, String imageUri) {
        this.name = name;

        this.imageUri = imageUri;
        this.location = location;
    }

    public ImageUploadInfo() {
    }

    public String getLocation()
    {
        return location;
    }
    public String getName() {
        return name;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}

