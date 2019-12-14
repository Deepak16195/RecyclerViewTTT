package com.example.recyclerviewttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import kotlinx.android.synthetic.main.activity_splash_screen.*
import java.lang.Exception

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()


        splashScreen()



    }

    fun splashScreen(){
        var background = object :Thread(){
            override fun run() {
                super.run()
                        try {
                            animation()
                            Thread.sleep(2000)
                            var intent = Intent(baseContext,MainActivity::class.java)
                            startActivity(intent)
                        }catch (e:Exception){e.printStackTrace()}
            }
        }
        background.start()
    }

    fun animation(){
        var rotateAnimation = RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f)
//        rotateAnimation.interpolator = LinearInterpolator()
//        rotateAnimation.repeatCount = Animation.INFINITE
        rotateAnimation.duration = 2000
        rotateAnimation.repeatCount = Animation.INFINITE

        imageView.animation = rotateAnimation
        imageView.startAnimation(rotateAnimation)
    }
}
