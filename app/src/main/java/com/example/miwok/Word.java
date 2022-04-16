package com.example.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private final String mEnglishTranslation;
    private final String mMiwokTranslation;
    private final int mAudio;
    private int mImage = NO_IMAGE_PROVIDED;

    public Word(int imageId, String englishTranslation, String miwokTranslation, int audioId) {
        mImage = imageId;
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audioId;
    }

    public Word(String englishTranslation, String miwokTranslation, int audioId) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audioId;
    }

    public int getImage() {
        return mImage;
    }

    public int getAudio() {
        return mAudio;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public boolean hasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }
}
