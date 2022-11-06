package com.example.silennt_hours

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import com.example.silennt_hours.databinding.ActivityFloatDataBinding
import com.example.silennt_hours.databinding.ActivityMainBinding
import com.google.android.material.chip.Chip
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.util.*
import java.util.zip.Inflater
import kotlin.collections.ArrayList

class floatData : AppCompatActivity() {
    lateinit var bindf:ActivityFloatDataBinding

    lateinit var mat: MaterialTimePicker
    lateinit var edmat: MaterialTimePicker
    lateinit var fcalendar: Calendar
    lateinit var scalendar: Calendar
    lateinit var tcalendar: Calendar
    lateinit var fourcalendar: Calendar
    lateinit var fvcalendar: Calendar
    lateinit var sixcalendar: Calendar
    lateinit var svcalendar: Calendar
    lateinit var padding: PendingIntent
    lateinit var spadding: PendingIntent
    lateinit var Alam: AlarmManager
    lateinit var k :String
    lateinit var sm:String
    lateinit var nme:String
    lateinit var  t1:TextView
    lateinit var t2 :TextView
    val arrayList = ArrayList<Int>()
     var su:Int =0
    var mu:Int =0
    var tu:Int =0
    var we:Int =0
    var th:Int =0
    var fr:Int =0
    var sat:Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindf= ActivityFloatDataBinding.inflate(layoutInflater)
        setContentView(bindf.root)
//       t1  = findViewById(R.id.sttime)
//      t2  = findViewById(R.id.edtime)

        bindf.sttime.setOnClickListener {settime() }

        bindf.edtime.setOnClickListener {
            Endtime()
        }
        bindf.su.setOnClickListener {
             //su =1;
             arrayList.add(1)
            fcalendar= Calendar.getInstance()
            fcalendar[Calendar.DAY_OF_WEEK]=su
            fcalendar[Calendar.HOUR_OF_DAY]=mat.hour
            fcalendar[Calendar.MINUTE] = mat.minute
            fcalendar[Calendar.SECOND] =0
            fcalendar[Calendar.MILLISECOND] =0

        }
        bindf.mu.setOnClickListener {
            //mu =2;
            arrayList.add(1)
//            scalendar= Calendar.getInstance()
//            scalendar[Calendar.DAY_OF_WEEK]=mu
//            scalendar[Calendar.HOUR_OF_DAY]=mat.hour
//            scalendar[Calendar.MINUTE] = mat.minute
//            scalendar[Calendar.SECOND] =0
//            scalendar[Calendar.MILLISECOND] =0
        }
        bindf.tu.setOnClickListener {
            //tu =3;
//            arrayList.add(1)
//            tcalendar= Calendar.getInstance()
//            tcalendar[Calendar.DAY_OF_WEEK]=tu
//            tcalendar[Calendar.HOUR_OF_DAY]=mat.hour
//            tcalendar[Calendar.MINUTE] = mat .minute
//            tcalendar[Calendar.SECOND] =0
//            tcalendar[Calendar.MILLISECOND] =0
        }
        bindf.we.setOnClickListener {
//            we =4;
            arrayList.add(4)

//            fourcalendar= Calendar.getInstance()
//            fourcalendar[Calendar.DAY_OF_WEEK]=we
//            fourcalendar[Calendar.HOUR_OF_DAY]=mat.hour
//            fourcalendar[Calendar.MINUTE] = mat .minute
//            fourcalendar[Calendar.SECOND] =0
//            fourcalendar[Calendar.MILLISECOND] =0
        }
        bindf.thu.setOnClickListener {
          //th =5;
            arrayList.add(5)
//            fvcalendar= Calendar.getInstance()
//            fvcalendar[Calendar.DAY_OF_WEEK]=th
//            fvcalendar[Calendar.HOUR_OF_DAY]=mat.hour
//            fvcalendar[Calendar.MINUTE] = mat .minute
//            fvcalendar[Calendar.SECOND] =0
//            fvcalendar[Calendar.MILLISECOND] =0
        }
        bindf.fri.setOnClickListener {
            //fr =6;
            arrayList.add(6)
//            sixcalendar= Calendar.getInstance()
//            sixcalendar[Calendar.DAY_OF_WEEK]=fr
//            sixcalendar[Calendar.HOUR_OF_DAY]=mat.hour
//            sixcalendar[Calendar.MINUTE] = mat .minute
//            sixcalendar[Calendar.SECOND] =0
//            sixcalendar[Calendar.MILLISECOND] =0
        }
        bindf.st.setOnClickListener {
            //sat =7;
            arrayList.add(7)
//            svcalendar= Calendar.getInstance()
//            svcalendar[Calendar.DAY_OF_WEEK]=sat
//            svcalendar[Calendar.HOUR_OF_DAY]=mat.hour
//            svcalendar[Calendar.MINUTE] = mat .minute
//            svcalendar[Calendar.SECOND] =0
//            svcalendar[Calendar.MILLISECOND] =0
        }

        bindf.button.setOnClickListener {
          nme = bindf. textField.toString();

            
            SetAlram()

        }
    }

    private fun SetAlram(){

        val aml = getSystemService(ALARM_SERVICE) as AlarmManager
        val  intr = Intent(this,MyReciever::class.java)
        padding =PendingIntent.getBroadcast(this,0,intr,0)
        for (item in arrayList.indices) {
            if (item!=0) {
                fcalendar = Calendar.getInstance()
                fcalendar[Calendar.DAY_OF_WEEK] = su
                fcalendar[Calendar.HOUR_OF_DAY] = mat.hour
                fcalendar[Calendar.MINUTE] = mat.minute
                fcalendar[Calendar.SECOND] = 0
                fcalendar[Calendar.MILLISECOND] = 0

                aml?.setRepeating(
                    AlarmManager.RTC_WAKEUP, fcalendar.timeInMillis, 1 * 60 * 60 * 1000, padding
                )
            }
        }

//        val mpadding:PendingIntent =PendingIntent.getBroadcast(this,0,intr,0)
//        val tpadding:PendingIntent =PendingIntent.getBroadcast(this,0,intr,0)
//        val wpadding:PendingIntent =PendingIntent.getBroadcast(this,0,intr,0)
//        val thpadding:PendingIntent =PendingIntent.getBroadcast(this,0,intr,0)
//        val  frpadding:PendingIntent =PendingIntent.getBroadcast(this,0,intr,0)
//        val spadding:PendingIntent =PendingIntent.getBroadcast(this,0,intr,0)
       // padding =PendingIntent.getBroadcast(this,0,intr,0)


//        aml?.setRepeating(
//            AlarmManager.RTC_WAKEUP,fcalendar.timeInMillis,1 * 60 * 60 * 1000,padding)
//        aml?.setRepeating(
//            AlarmManager.RTC_WAKEUP,scalendar.timeInMillis, AlarmManager.INTERVAL_DAY,padding)
//        aml?.setRepeating(
//            AlarmManager.RTC_WAKEUP,tcalendar.timeInMillis, AlarmManager.INTERVAL_DAY,padding)
//        aml?.setRepeating(
//            AlarmManager.RTC_WAKEUP,fourcalendar.timeInMillis, AlarmManager.INTERVAL_DAY,padding)
//        aml?.setRepeating(
//            AlarmManager.RTC_WAKEUP,fvcalendar.timeInMillis, AlarmManager.INTERVAL_DAY,padding)
//        aml?.setRepeating(
//            AlarmManager.RTC_WAKEUP,sixcalendar.timeInMillis, AlarmManager.INTERVAL_DAY,padding)
//        aml?.setRepeating(
//                AlarmManager.RTC_WAKEUP,svcalendar.timeInMillis, AlarmManager.INTERVAL_DAY,padding)

    }


    private fun settime() {
        mat = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_12H)
            .setHour(12).setMinute(0).setTitleText("Myfirst")
            .build()
        mat.show(supportFragmentManager ,"myFrag")
        mat.addOnPositiveButtonClickListener {
            if (mat.hour>12)
            {
                 k = "${mat.hour-12} : ${mat.minute} pm"

                bindf.sttime.setText(k)
            }
            else
            {
                 k = "${mat.hour} : ${mat.minute} Am"
                bindf.sttime.setText(k)
            }
        }

    }

    private fun Endtime() {
        edmat = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_12H)
            .setHour(12).setMinute(0).setTitleText("Myfirst")
            .build()
        edmat.show(supportFragmentManager ,"myFrag")
       edmat.addOnPositiveButtonClickListener {
            if (edmat.hour>12)
            {
                sm = "${edmat.hour-12} : ${edmat.minute} pm"
                t2.setText(sm)
            }
            else
            {
                sm = "${edmat.hour} : ${edmat.minute} Am"
                t2.setText(sm)
            }
//            scalendar= Calendar.getInstance()
//            scalendar[Calendar.HOUR_OF_DAY]=mat.hour
//            scalendar[Calendar.MINUTE] = mat .minute
//            scalendar[Calendar.SECOND] =0
//            scalendar[Calendar.MILLISECOND] =0
//            EndTime()

        }
    }
}