/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
 */
package com.sugiwiranto.wisata.tampilan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sugiwiranto.wisata.DaftarWisata
import com.sugiwiranto.wisata.R
import kotlinx.android.synthetic.main.wis7.*
import kotlinx.android.synthetic.main.wis7.lok

class Bambu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wis7)

        backwis7.setOnClickListener() {
            val intent = Intent(this, DaftarWisata::class.java)
            startActivity(intent)
        }
        lok.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/8iD3QcV9Q3bBu7Bs8"))
            startActivity(i)
        }
    }
}