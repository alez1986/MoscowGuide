package com.example.android.moscowguide;


public class Place {

    private int mTitleResourceId;
    private int mAddressResourceId;
    private int mDescriptionResourceId;
    private int mImageResourceId;

    public Place(int titleResourceId, int addressResourceId, int descriptionResourceId, int imageResourceId) {
        mTitleResourceId = titleResourceId;
        mAddressResourceId = addressResourceId;
        mDescriptionResourceId = descriptionResourceId;
        mImageResourceId = imageResourceId;
    }

    public int getTitleResourceId() {
        return mTitleResourceId;
    }

    public int getAddressResourceId() {
        return mAddressResourceId;
    }

    public int getDescriptionResourceId() {
        return mDescriptionResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

