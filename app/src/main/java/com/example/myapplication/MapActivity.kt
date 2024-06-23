package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ScrollView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_map)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val HomeRoute: ImageButton = findViewById(R.id.home_btn)
        HomeRoute.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val MapRoute: ImageButton = findViewById(R.id.map_btn)
        MapRoute.setOnClickListener {
            val scrollView: ScrollView = findViewById(R.id.scroll_main)
            scrollView.smoothScrollTo(0, 0)
        }

        val PersonRoute: ImageButton = findViewById(R.id.person_btn)
        PersonRoute.setOnClickListener {
            val intent = Intent(this, PersonActivity::class.java)
            startActivity(intent)
        }
    }
}