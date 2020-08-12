/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
 */
package com.sugiwiranto.wisata.ViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    private val pages = listOf(
        frag1(),
        frag2(),
        frag3()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

}