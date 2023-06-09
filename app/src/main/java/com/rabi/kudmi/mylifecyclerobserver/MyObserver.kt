package com.rabi.kudmi.mylifecyclerobserver

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver:LifecycleObserver {
    val TAG = "MyObserver";
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun onCreate()
    {
        Log.e(TAG,"onCreate")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun onStart()
    {
        Log.e(TAG,"onStart");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun onResume()
    {
        Log.e(TAG,"onResume");
    }
   @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun onPause()
    {
        Log.e(TAG,"onPause")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
  private fun onStop()
  {
      Log.e(TAG,"onStop")
  }
 @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun onDestroy()
    {
        Log.e(TAG,"onDestroy");
    }
}