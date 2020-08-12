/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
 */

package com.sugiwiranto.wisata.ViewPager


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sugiwiranto.wisata.R

/**
 * A simple [Fragment] subclass.
 */
class frag1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag1, container, false)
    }


}
