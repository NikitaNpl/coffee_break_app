package com.example.coffee_break;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "COFFEE-BREAK";

    protected Toast getToast(CharSequence text, int duration) {
        Context context = getApplicationContext();

        return Toast.makeText(context, text, duration);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main);
            getToast("onCreate", Toast.LENGTH_SHORT).show();
            Log.w(TAG, "onCreate");
            Log.i(TAG, "onCreate");
            Log.d(TAG, "onCreate");
            Log.v(TAG, "onCreate");
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение: onCreate()", exception);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        getToast("onStart", Toast.LENGTH_SHORT).show();
        try {
            getToast("onStart", Toast.LENGTH_SHORT).show();
            Log.w(TAG, "onStart");
            Log.i(TAG, "onStart");
            Log.d(TAG, "onStart");
            Log.v(TAG, "onStart");
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение: onStart()", exception);
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        try {
            getToast("onStop", Toast.LENGTH_SHORT).show();
            Log.w(TAG, "onStop");
            Log.i(TAG, "onStop");
            Log.d(TAG, "onStop");
            Log.v(TAG, "onStop");
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение: onStop()", exception);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            getToast("onDestroy", Toast.LENGTH_SHORT).show();
            Log.w(TAG, "onDestroy");
            Log.i(TAG, "onDestroy");
            Log.d(TAG, "onDestroy");
            Log.v(TAG, "onDestroy");
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение: onDestroy()", exception);
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        try {
            getToast("onPause", Toast.LENGTH_SHORT).show();
            Log.w(TAG, "onPause");
            Log.i(TAG, "onPause");
            Log.d(TAG, "onPause");
            Log.v(TAG, "onPause");
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение: onPause()", exception);
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        try {
            getToast("onResume", Toast.LENGTH_SHORT).show();
            Log.w(TAG, "onResume");
            Log.i(TAG, "onResume");
            Log.d(TAG, "onResume");
            Log.v(TAG, "onResume");
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение: onResume()", exception);
        }
    }

}