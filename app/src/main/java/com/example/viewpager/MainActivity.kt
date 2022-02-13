package com.example.viewpager

import android.os.Bundle
import android.os.CountDownTimer
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var i: Int = 0
    private lateinit var binding: ActivityMainBinding
    private lateinit var countDownTimer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        val adapter = PagerAdapter(this@MainActivity, 15)
        binding.viewPager.adapter = adapter

//        binding.barTimer.setProgress(i)
//        countDownTimer = object : CountDownTimer(5000, 1000) {
//            override fun onTick(miliSecond: Long) {
//                i++
//                binding.barTimer.setProgress(i * 100 / (5000 / 1000))
//                println("MainActivity.onTick" + i + miliSecond)
//            }
//
//            override fun onFinish() {
//                i++
//                binding.barTimer.setProgress(100)
//            }
//
//        }

//        countDownTimer.start()

    }


}