/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
Tanggal           : 08-08-2020 sampai 12-08-2020
 */
package com.sugiwiranto.wisata.tampilan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sugiwiranto.wisata.DaftarWisata
import com.sugiwiranto.wisata.R
import kotlinx.android.synthetic.main.wis3.*
import kotlinx.android.synthetic.main.wis3.lok

class Lodge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wis3)

        backwis3.setOnClickListener() {
            val intent = Intent(this, DaftarWisata::class.java)
            startActivity(intent)
        }
        lok.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/f5EKoJNbrYENeFi1A"))
            startActivity(i)
        }
    }
}