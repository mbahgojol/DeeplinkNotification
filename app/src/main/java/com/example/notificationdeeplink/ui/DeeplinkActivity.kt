package com.example.notificationdeeplink.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.deeplinkdispatch.DeepLink
import com.airbnb.deeplinkdispatch.DeepLinkHandler
import com.example.notificationdeeplink.R
import com.example.notificationdeeplink.module.AppDeepLinkModule
import com.example.notificationdeeplink.module.AppDeepLinkModuleRegistry

@DeepLinkHandler(AppDeepLinkModule::class)
class DeeplinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink)

        val deepLinkDelegate =
            DeepLinkDelegate(AppDeepLinkModuleRegistry())
        deepLinkDelegate.dispatchFrom(this)

        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false)) {
            Log.e("TEST", intent.extras?.getString("msg").toString())
        }
        finish()
    }
}