package com.surelabs.kcorners.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.surelabs.kcorners.MainActivity
import com.surelabs.kcorners.R

class SplashScreenActivity : AppCompatActivity() {

    private val mHandler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        mHandler.postDelayed({
            Intent(this@SplashScreenActivity, MainActivity::class.java)
                .apply {
                    this@SplashScreenActivity.finish()
                    startActivity(this)
                }
        }, 3000)
    }

    override fun onPause() {
        mHandler.removeCallbacksAndMessages(null)
        super.onPause()
    }

    override fun onStop() {
        mHandler.removeCallbacksAndMessages(null)
        super.onStop()
    }
}
