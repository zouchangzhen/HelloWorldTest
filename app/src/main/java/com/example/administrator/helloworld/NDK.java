package com.example.administrator.helloworld;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NDK extends Activity {
    private static String Tag=NDK.class.getSimpleName();
    static {
       System.loadLibrary("MyJni");
    }

    public native  String getStringFromNative();
    public native String getString_From_c();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndk);
        Log.e("getStringFromNative",getStringFromNative());
        Log.e("getString_From_c",getString_From_c());
    }
}
