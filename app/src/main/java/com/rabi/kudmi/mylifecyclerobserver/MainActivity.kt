package com.rabi.kudmi.mylifecyclerobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
           lifecycle.addObserver(MyObserver())
        Log.e(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy")
    }
}