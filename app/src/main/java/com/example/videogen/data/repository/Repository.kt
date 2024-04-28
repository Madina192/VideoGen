package com.example.videogen.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.videogen.data.model.Video
import com.example.videogen.data.model.VideoPostResponse
import com.example.videogen.data.service.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(
    private val api: ApiService
) {

    fun postVideo(videoRequest : Video): MutableLiveData<VideoPostResponse> {
        val liveData = MutableLiveData<VideoPostResponse>()
        val error = MutableLiveData<String>()
        api.postVideo("Ggo3jrS7kNfPhznRoPaPps1GTiYHZ48o", videoRequest)
            .enqueue(object : Callback<VideoPostResponse> {
                override fun onResponse(call: Call<VideoPostResponse>, response: Response<VideoPostResponse>) {
                    liveData.postValue(response.body())
                }

                override fun onFailure(call: Call<VideoPostResponse>, t: Throwable) {
                    error.postValue(t.message)
                }
            })
        return liveData
    }
}