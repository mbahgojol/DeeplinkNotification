package com.example.notificationdeeplink.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.deeplinkdispatch.DeepLink
import com.example.notificationdeeplink.R

// todo cara kedua
//@DeepLink("https://www.ibid.astra.co.id/detail-lelang/{category}/{name}/{id}")
class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
    }
}