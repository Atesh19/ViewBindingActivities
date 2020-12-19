package com.atesh19.viewbindingactivities.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.atesh19.viewbindingactivities.Mock.Mock
import com.atesh19.viewbindingactivities.R
import com.atesh19.viewbindingactivities.databinding.ActivityMainBinding
import com.atesh19.viewbindingactivities.ui.adapter.Adapter
import com.atesh19.viewbindingactivities.ui.fragment.DetailFragment

class MainActivity() : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        with(mainBinding) {
            rv.adapter = Adapter(Mock.getMockData()){
//                callFragment(DetailFragment())
                val x = DetailFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.amli, x)
                  //  .add(R.id.amli, x)
                    .commit()

                Toast.makeText(this@MainActivity, "$it.toString()", Toast.LENGTH_LONG).show()
            }
            rv.layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }
//    fun callFragment(fragment: Fragment) {
//        val fragmentTransaction =
//            supportFragmentManager.beginTransaction()
//        //  fragmentTransaction.replace(R.id.frameLayoutForFragments, fragment)
//        fragmentTransaction.commit()
//    }


}





