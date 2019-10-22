package br.com.leorv.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({

            nextScreen()

        }, 2000L)

    }

    private fun nextScreen() {


            val nextScreen = Intent(this, PlayerActivity::class.java)

            startActivity(nextScreen)

            finish()


    }



}
