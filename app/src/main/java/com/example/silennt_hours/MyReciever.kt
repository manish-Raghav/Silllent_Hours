package com.example.silennt_hours

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReciever : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {


        Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()

    }
}