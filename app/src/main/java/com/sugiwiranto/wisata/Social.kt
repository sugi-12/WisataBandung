/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
Tanggal           : 08-08-2020 sampai 12-08-2020
 */
package com.sugiwiranto.wisata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_social.*

class Social : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social)

        backmenu.setOnClickListener() {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }

        ighint.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/soegi_12/"))
            startActivity(i)
        }

        fbhint.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/profile.php?id=100002282952600"))
            startActivity(i)
        }
    }
}
