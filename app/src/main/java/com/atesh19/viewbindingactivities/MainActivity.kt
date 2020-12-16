package com.atesh19.viewbindingactivities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.atesh19.viewbindingactivities.Mock.Mock
import com.atesh19.viewbindingactivities.adap.Adapter
import com.atesh19.viewbindingactivities.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)


        with(mainBinding) {
            rv.adapter = Adapter(Mock.getMockData())
            rv.layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }


}





