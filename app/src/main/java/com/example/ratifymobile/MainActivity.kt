package com.example.ratifymobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ratifymobile.fragments.HomeFragment
import com.example.ratifymobile.fragments.TasksFragment
import com.example.ratifymobile.fragments.TimelineFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val tasksFragment = TasksFragment()
        val timelineFragment = TimelineFragment()


        setCurrentFragment(homeFragment)

        findViewById<BottomNavigationView>(R.id.bottomNavigationView).setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuHome -> setCurrentFragment(homeFragment)
                R.id.menuTask -> setCurrentFragment(tasksFragment)
                R.id.menuTimeline -> setCurrentFragment(timelineFragment)
            }
            true
        }



//        findViewById<BottomNavigationView>(R.id.bottomNavigationView).getorCreateBadge(R.id.menuTask).apply {
//            number = 3
//            isVisible = true
//        }
    }

    private fun setCurrentFragment (fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}