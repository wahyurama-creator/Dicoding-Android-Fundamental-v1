package com.way.gituser.presentation.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.way.gituser.R
import com.way.gituser.presentation.ui.home.HomeActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch {
            CoroutineScope(Dispatchers.IO).launch {
                delay(4000)
                startActivity(Intent(this@SplashScreenActivity, HomeActivity::class.java))
                finish()
            }
        }
    }
}