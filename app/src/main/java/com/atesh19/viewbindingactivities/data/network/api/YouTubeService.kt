package com.atesh19.viewbindingactivities.data.network.api

import com.atesh19.viewbindingactivities.data.network.response.GetPlayListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeService {

    @GET("playlists")
    fun getPlaylist(
        @Query("part") part: String,
        @Query("channelId") channelID: String,
        @Query("maxResults") maxResults: String,
        @Query("key") apikey: String,
    ): Call<GetPlayListResponse>
}
