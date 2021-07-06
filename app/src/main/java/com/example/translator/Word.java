package com.example.translator;

public class Word {
    private String mword;
    private String translate;
    private int mImage=NO_IMAGE;
    private static final int NO_IMAGE=-1;
    private int aaudio=NO_AUDIO;
    private static final int NO_AUDIO=-1;
    private int mImage2=NO_IMAG;
    private static final int NO_IMAG=-1;

    public Word(String one, String ik, int number_one,int maudio, int ima) {
        mword = one;
        translate =  ik;
        mImage=number_one;
        aaudio=maudio;
        mImage2=ima;

    }
    public Word(String one, String ik) {
        mword = one;
        translate =  ik;

    }

    public int getmImage2() {
        return mImage2;
    }

    public String getTranslate(){
        return translate;
    }

    public String getWord() {
        return mword;
    }

    public int getmImage() {
        return mImage;
    }
    public boolean check() {
        return mImage != NO_IMAGE;
    }
    public boolean check2(){
        return mImage2!=NO_IMAG;
    }
    public int getAaudio() {
        return aaudio;
    }
    public boolean checka() {
        return aaudio!=NO_AUDIO;
    }
}
