package com.example.migros_ui.TabLayoutFragments

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.migros_ui.HomeFragment

class ViewPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                FirstFragment()
            }
            1->{
                SecondFragment()
            }
            2->{
                ThirdFragment()
            }
            else->{
                Fragment()
            }
        }
    }
}