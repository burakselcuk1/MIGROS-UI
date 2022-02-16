package com.example.migros_ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.migros_ui.MainPageContentTabLayoutFragments.MoneyKampanyalariFragment
import com.example.migros_ui.MainPageContentTabLayoutFragments.SaglikliYasamFragment
import com.example.migros_ui.MainPageContentTabLayoutFragments.TamBanaGoreFragment

class ViewPagerAdapterForMainPageContent(fragment: Fragment):FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                TamBanaGoreFragment()
            }
            1->{
                MoneyKampanyalariFragment()
            }
            2->{
                SaglikliYasamFragment()
            }
            else->{
                Fragment()
            }
        }
    }

}