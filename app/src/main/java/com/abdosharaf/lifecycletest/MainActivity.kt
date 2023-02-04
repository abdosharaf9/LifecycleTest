package com.abdosharaf.lifecycletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdosharaf.lifecycletest.databinding.ActivityMainBinding
import timber.log.Timber

private const val COUNT = "count"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState != null){
            count = savedInstanceState.getInt(COUNT)
        }

        binding.count = count
        binding.btnAdd.setOnClickListener {
            count++
            binding.count = count
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNT, count)
    }
}