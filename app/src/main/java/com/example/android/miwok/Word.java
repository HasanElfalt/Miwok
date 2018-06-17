package com.example.android.miwok;

/**
 * Created by hassan on 10/03/18.
 */

public class Word {

    private String mDefaultTranslation ;

    private String mMiwokTranslation ;

    private int mImagResourceID = NO_IMAGE_PROVIDED ;

    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1 ;

    public Word(String defaultTranslation , String miwokTranslation, int AudioResourceId){

        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mAudioResourceId = AudioResourceId ;
    }
    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceID, int AudioResourceId){

        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mImagResourceID = ImageResourceID ;
        mAudioResourceId = AudioResourceId ;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImagResourceID() {
        return mImagResourceID;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImagResourceID != NO_IMAGE_PROVIDED ;
    }
}
