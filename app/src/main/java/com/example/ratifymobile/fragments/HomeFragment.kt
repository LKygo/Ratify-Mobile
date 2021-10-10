package com.example.ratifymobile.fragments

import android.graphics.Insets.add
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.ratifymobile.R
import com.example.ratifymobile.adapters.SectionPageAdapter
import com.example.ratifymobile.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class HomeFragment : Fragment(R.layout.fragment_home) {


    private lateinit var myFragment: FragmentHomeBinding
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        myFragment = FragmentHomeBinding.inflate(inflater, container, false)
        val view = myFragment.root

        viewPager = myFragment.viewPagerHome
        tabLayout = myFragment.tabLayout

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager(viewPager)
        tabLayout.setupWithViewPager(viewPager)

    }

        private fun setUpViewPager(viewPager: ViewPager) {
            var adapter = SectionPageAdapter(childFragmentManager)

            adapter.addFragment(FavouritesFragment(), "Favourites")
            adapter.addFragment(RecentsFragment(), "Recents")
            adapter.addFragment(AllProjectsFragment(), "All")

            viewPager.adapter = adapter

    }
}



