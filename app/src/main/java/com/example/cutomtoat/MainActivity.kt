package com.example.cutomtoat

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onSuccess(v: View) {
        val toast: Toast = Toast.makeText(this, "Sunccess Toast", Toast.LENGTH_LONG) as Toast
        val toastView = toast.view
        val textView = toastView.findViewById(android.R.id.message) as TextView
        textView.setTextSize(20F)
        textView.setTextColor(Color.WHITE)
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_thumb_up, 0, 0, 0)
        textView.setCompoundDrawablePadding(25)
        textView.setGravity(Gravity.CENTER)
        toastView.setBackgroundResource(R.drawable.success_background)
        toast.show()
    }

    fun onFailure(v: View) {
        val toast: Toast = Toast.makeText(this, "Failure Toast", Toast.LENGTH_LONG) as Toast
        val toastView = toast.view
        val textView = toastView.findViewById(android.R.id.message) as TextView
        textView.setTextSize(20F)
        textView.setTextColor(Color.WHITE)
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_thumb_down, 0, 0, 0)
        textView.setCompoundDrawablePadding(25)
        textView.setGravity(Gravity.CENTER)
        toastView.setBackgroundResource(R.drawable.faluer_background)
        toast.show()
    }
}
