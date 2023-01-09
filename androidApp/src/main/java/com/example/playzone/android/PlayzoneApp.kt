package com.example.playzone.android

import PlatformSdk
import android.app.Application
import platform.PlatformConfiguration

class PlayzoneApp : Application() {
    override fun onCreate() {
        super.onCreate()

        initPlatformSdk()
    }
}

fun PlayzoneApp.initPlatformSdk() =
    PlatformSdk.init(
        configuration = PlatformConfiguration(androidContext = applicationContext)
    )