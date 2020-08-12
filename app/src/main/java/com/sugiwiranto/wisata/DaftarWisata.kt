/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
Tanggal           : 08-08-2020 sampai 12-08-2020
 */
package com.sugiwiranto.wisata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sugiwiranto.wisata.tampilan.*
import kotlinx.android.synthetic.main.activity_daftar.*

class DaftarWisata : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        backwisata.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        farmhouse.setOnClickListener(){
            val intent = Intent(this, Farm::class.java)
            startActivity(intent)
        }
        deranch.setOnClickListener(){
            val intent = Intent(this, Deranch::class.java)
            startActivity(intent)
        }
        lodge.setOnClickListener(){
            val intent = Intent(this, Lodge::class.java)
            startActivity(intent)
        }
        tangkuban.setOnClickListener(){
            val intent = Intent(this, Tangkuban::class.java)
            startActivity(intent)
        }
        floating.setOnClickListener(){
            val intent = Intent(this, Floating::class.java)
            startActivity(intent)
        }
        begonia.setOnClickListener(){
            val intent = Intent(this, Begonia::class.java)
            startActivity(intent)
        }
        bambu.setOnClickListener(){
            val intent = Intent(this, Bambu::class.java)
            startActivity(intent)
        }
        orchid.setOnClickListener(){
            val intent = Intent(this, Orchid::class.java)
            startActivity(intent)
        }
        asia.setOnClickListener(){
            val intent = Intent(this, Asia::class.java)
            startActivity(intent)
        }
    }
}