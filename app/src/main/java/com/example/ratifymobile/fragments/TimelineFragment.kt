package com.example.ratifymobile.fragments

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.animation.doOnStart
import androidx.fragment.app.Fragment
import com.example.ratifymobile.R
import com.example.ratifymobile.databinding.FragmentTimelineBinding


private  var _binding : FragmentTimelineBinding? = null
private  val binding  get() = _binding!!

class TimelineFragment : Fragment(R.layout.fragment_timeline) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTimelineBinding.inflate(inflater, container, false)
        val view = binding.root
        return view


    }

    override fun onStart() {
        val prgBar = binding.prgBar

        binding.prgBar.max = 1000
        val currentProgress = 450

        ObjectAnimator.ofInt(prgBar, "progress", currentProgress)
            .setDuration(2000).start()
        binding.txvProgress.setText("45% complete")

        super.onStart()

    }
}