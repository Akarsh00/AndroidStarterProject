package com.example.androidstarterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.androidstarterproject.ui.customdialog.ExampleCustomDialog
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        ExampleBottomSheetFragment().show(supportFragmentManager, null)
        ExampleCustomDialog().show(supportFragmentManager, null)
        findViewById<BottomNavigationView>(R.id.bottomNav).setupWithNavController(findNavController(R.id.home_nav_host))

    }
}