package com.example.madpr2_64

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showMessage("onCreate method is called")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is  called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("Resume method is  called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("Destroy method is called called")
    }

    fun showMessage(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
    }
}