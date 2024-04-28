package com.example.videogen.ui.myVideos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.videogen.databinding.FragmentMyVideosBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyVideosFragment : Fragment() {

    private lateinit var binding: FragmentMyVideosBinding
    private val loveViewModel: MyVideosViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyVideosBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        makeRequest()
    }

    private fun makeRequest() {

    }
}