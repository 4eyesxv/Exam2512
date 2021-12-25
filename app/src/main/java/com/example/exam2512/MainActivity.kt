package com.example.exam2512

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exam2512.fragment.FragmentCategories

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.container, FragmentCategories())
            .commit()
    }
}