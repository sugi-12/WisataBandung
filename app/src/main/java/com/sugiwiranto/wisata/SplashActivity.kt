/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
Tanggal           : 08-08-2020 sampai 12-08-2020
 */
package com.sugiwiranto.wisata

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sugiwiranto.wisata.ViewPager.Walkt

class SplashActivity : AppCompatActivity() {

    lateinit var handler:Handler

    private lateinit var mSharedPreferences: SharedPreferences
    private var MODE_PRIVATE = 0
    private var PREF_NAME = "splash-screen"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mSharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE)

        handler = Handler()
        handler.postDelayed({
            val status = mSharedPreferences.getBoolean(PREF_NAME,false)
            if(status == false){

                PREF_NAME = "splash-screen"
                val editor = mSharedPreferences.edit()
                editor.putBoolean(PREF_NAME, true)
                editor.apply()

                val intent = Intent(this@SplashActivity,Walkt::class.java)
                startActivity(intent)
                finish()
            }else{
                val intent = Intent(this@SplashActivity,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)
    }
}
