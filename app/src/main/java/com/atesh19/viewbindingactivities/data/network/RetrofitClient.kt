package com.atesh19.viewbindingactivities.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient {

    val BASE_URL = "https://youtube.googleapis.com/youtube/v3/"

    var INSATANCE: Retrofit? = null

    fun getRetrofit(): Retrofit? {
        if (INSATANCE == null){
            INSATANCE= Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return INSATANCE
        }
        return INSATANCE
    }
}


//abstract class RetrofitClient {
//    companion object {
//        @Volatile
//        private var INSTANCE: Retrofit? = null
//
//        private fun getRetrofit(): Retrofit {
//            return INSTANCE ?: run {
//                synchronized(this) {
//                    Retrofit.Builder()
//                        .addConverterFactory(GsonConverterFactory.create())
//                        .baseUrl("BuildConfig.BASE_URL")
//                        .build()
//                }
//            }
//        }
//    }
//}
