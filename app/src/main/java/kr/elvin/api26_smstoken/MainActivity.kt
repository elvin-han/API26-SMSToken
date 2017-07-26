package kr.elvin.api26_smstoken

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.util.Log
import android.widget.TextView
import android.content.Intent
import android.app.PendingIntent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById(R.id.tv_token) as TextView
        val smsManager = SmsManager.getDefault()
        val appSmsToken = smsManager.createAppSpecificSmsToken(createSmsTokenPendingIntent())

        textView.text = appSmsToken
        Log.i("MainActivity", "sms token " + appSmsToken);
    }

    private fun createSmsTokenPendingIntent(): PendingIntent {
        return PendingIntent.getActivity(this, 1234,
                Intent(this, SmsTokenResultVerificationActivity::class.java), 0)
    }
}
