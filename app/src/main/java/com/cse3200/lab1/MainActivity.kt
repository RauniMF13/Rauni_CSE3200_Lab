package com.cse3200.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.cse3200.lab1.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBindings: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityMainBindings = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBindings.root)

        activityMainBindings.trueButton.setOnClickListener {
            View.OnClickListener {
                Toast.makeText(this,"Toast!",Toast.LENGTH_SHORT).show()
            }
        }

        activityMainBindings.falseButton.setOnClickListener {
            View.OnClickListener {
                Toast.makeText(this,"Toast!",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }
}