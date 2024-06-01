package com.yash.android.bnr.photogallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yash.android.bnr.photogallery.databinding.FragmentPhotoPageBinding

class PhotoPageFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPhotoPageBinding.inflate(inflater, container, false)
        return binding.root
    }
}