package com.example.silennt_hours

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silennt_hours.databinding.ActivityMainBinding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding
    lateinit var mat: MaterialTimePicker
    lateinit var calendar: Calendar
    lateinit var padding: PendingIntent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bind.root)
         bind.floatingActionButton.setOnClickListener {
               val inte = Intent(this,floatData::class.java)
             startActivity(inte)
         }

        val bundle = intent.extras

      //  bundle.getString("id")

}
}