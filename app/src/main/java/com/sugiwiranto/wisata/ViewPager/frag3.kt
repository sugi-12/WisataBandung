/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
 */
package com.sugiwiranto.wisata.ViewPager


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sugiwiranto.wisata.MainActivity
import com.sugiwiranto.wisata.R
import kotlinx.android.synthetic.main.fragment_frag3.*

/**
 * A simple [Fragment] subclass.
 */
class frag3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag3, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_lanjut.setOnClickListener {
            val intent = Intent(getActivity(),MainActivity::class.java)
            startActivity(intent)
        }
    }

}
