/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7 AKB
Tanggal           : 08-08-2020 sampai 12-08-2020
 */
package com.sugiwiranto.wisata


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import androidx.drawerlayout.widget.DrawerLayout
import com.sugiwiranto.wisata.About
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tulbars)

        drawerLayout = findViewById(R.id.drawer)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, tulbars,0,0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.homee -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent);
                Toast.makeText(this,"Home clicked", Toast.LENGTH_SHORT).show();
                return true;
            }

            R.id.daftar -> {
                val intent = Intent(this, DaftarWisata::class.java)
                startActivity(intent);
                Toast.makeText(this,"Home clicked", Toast.LENGTH_SHORT).show();
                return true;
            }

            R.id.about -> {
                val intent = Intent(this, About::class.java)
                startActivity(intent);
                Toast.makeText(this,"About clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
