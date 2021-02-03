package com.example.notificationdeeplink.module

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.airbnb.deeplinkdispatch.DeepLinkModule
import com.example.notificationdeeplink.ui.OneActivity

@DeepLinkModule
class AppDeepLinkModule

// todo cara pertama
@NotifLink("/detail-lelang/{category}/{name}/{id}")
fun startOne(context: Context, bundle: Bundle): Intent {
    return Intent(context, OneActivity::class.java)
}