package com.example.didomiplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.didomiplayground.R.*
import io.didomi.sdk.Didomi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val didomi = Didomi.getInstance()
        didomi.onReady {
            didomi.setupUI(this)
        }
    }
}