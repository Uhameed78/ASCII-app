package com.example.ascii

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val tvAscii = findViewById<TextView>(R.id.tvAscii)

        Log.d("", "ASCII Art app loaded")

        // Use a while loop to build the star pattern
        var row    = 1
        var result = ""

        while (row <= 7) {
            var stars = ""
            var col   = 1

            // Build each row of stars
            while (col <= row) {
                stars = "$stars*"
                col++
            }

            result = "$result$stars\n"
            Log.d("", "Row $row: $stars")
            row++
        }

        tvAscii.text = result
        Log.d("", "ASCII pattern complete")
    }
}