/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
 */
package com.sugiwiranto.wisata.ViewPager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sugiwiranto.wisata.MainActivity
import com.sugiwiranto.wisata.R
import kotlinx.android.synthetic.main.activity_walkt.*

class Walkt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkt)

        viewpager.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
