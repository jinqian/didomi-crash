package com.example.didomiplayground

import android.app.Application
import io.didomi.sdk.Didomi
import io.didomi.sdk.DidomiInitializeParameters

class DidomiPlaygroundApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        try {
            Didomi.getInstance().initialize(
                this,
                DidomiInitializeParameters(
                    apiKey = "your-api-key"
                )
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}