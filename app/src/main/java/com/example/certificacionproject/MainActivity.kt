package com.example.certificacionproject

import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener {
            val inflater = layoutInflater
            val layout = inflater.inflate(R.layout.custom_toast, custom_toast_container)
            val text: TextView = layout.findViewById(R.id.text)
            text.text = "This is a custom toast"
            with (Toast(applicationContext)) {
                setGravity(Gravity.TOP, 0, 0)
                duration = Toast.LENGTH_LONG
                view = layout
                show()
            }
        }

        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)

        with(toast){
            setGravity(Gravity.TOP or Gravity.START, 0, 0)
            show()
        }
    }
}
