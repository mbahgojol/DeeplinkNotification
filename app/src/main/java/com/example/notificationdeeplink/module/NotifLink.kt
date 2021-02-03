package com.example.notificationdeeplink.module

import com.airbnb.deeplinkdispatch.DeepLinkSpec

@DeepLinkSpec(prefix = ["https://www.ibid.astra.co.id"])
@Retention(AnnotationRetention.BINARY)
annotation class NotifLink(vararg val value: String)