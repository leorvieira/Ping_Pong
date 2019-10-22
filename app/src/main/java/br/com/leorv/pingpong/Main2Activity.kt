package br.com.leorv.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class Main2Activity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Handler().postDelayed({

            nextScreen()

        }, 200L)

    }

    private fun nextScreen() {
        fun nextScreen() {

            val nextScreen = Intent(this, PlayerActivity::class.java)

            startActivity(nextScreen)

            finish()

        }


    }

}

