package edu.washington.bycao96.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val Tag = "Activity Spy"
    /*

     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(Tag, "onCreate event fired")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(Tag, "onCreate event fired");
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(Tag, "onRestart event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(Tag, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(Tag, "onStop event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(Tag,"onResume event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(Tag, "We're going down, Captain")
    }
}
