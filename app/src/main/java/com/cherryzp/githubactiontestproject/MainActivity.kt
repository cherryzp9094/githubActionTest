package com.cherryzp.githubactiontestproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkNum(any: Any): Boolean {
        if (any is Int) {
            return true
        }
        return false
    }
}