package com.example.videogen.data.service

import com.example.videogen.data.model.Video
import com.example.videogen.data.model.VideoPostResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST("videos/")
    fun postVideo(
        @Header("Authorization") key: String,
        @Body request: Video
    ): Call<VideoPostResponse>
}