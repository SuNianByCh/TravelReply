package com.example.travelreply

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.reply.ReplyFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fl,ReplyFragment.instance()).commitNowAllowingStateLoss()
    }
}
