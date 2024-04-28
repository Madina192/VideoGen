package com.example.videogen.ui.postVideo

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.videogen.data.model.VideoPostResponse
import com.example.videogen.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PostVideoViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    fun postVideo(videoRequest: com.example.videogen.data.model.Video): LiveData<VideoPostResponse> {
        return repository.postVideo(videoRequest)
    }
}