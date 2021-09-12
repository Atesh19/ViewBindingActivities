package com.atesh19.viewbindingactivities.ui.main

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.atesh19.viewbindingactivities.Mock.Mock
import com.atesh19.viewbindingactivities.R
import com.atesh19.viewbindingactivities.data.enum.ApiInfo
import com.atesh19.viewbindingactivities.data.network.RetrofitClient
import com.atesh19.viewbindingactivities.data.network.api.YouTubeService
import com.atesh19.viewbindingactivities.data.network.response.GetPlayListResponse
import com.atesh19.viewbindingactivities.databinding.ActivityMainBinding
import com.atesh19.viewbindingactivities.ui.adapter.Adapter
import com.atesh19.viewbindingactivities.ui.fragment.DetailFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity() : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)
        init()
        with(mainBinding) {
            rv.adapter = Adapter(Mock.getMockData()) {
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


    fun init() {

        val zengEdenObject = RetrofitClient.getRetrofit()?.create(YouTubeService::class.java)

        val zeng = zengEdenObject?.getPlaylist(
            part = ApiInfo.PART.value,
            channelID = ApiInfo.CHANNEL_ID.value,
            maxResults = ApiInfo.MAX_RESULTS.value,
            apikey = ApiInfo.API_KEY.value
        )

        zeng?.enqueue(object : Callback<GetPlayListResponse> {
            override fun onResponse(
                call: Call<GetPlayListResponse>,
                response: Response<GetPlayListResponse>,
            ) {
                Log.e("a", "${call.request().url()}")
                Log.e("a", "${response.body()?.toString()}")
            }

            override fun onFailure(call: Call<GetPlayListResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }

}





