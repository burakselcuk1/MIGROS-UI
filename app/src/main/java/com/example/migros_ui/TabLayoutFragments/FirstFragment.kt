package com.example.migros_ui.TabLayoutFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.migros_ui.R
import com.example.migros_ui.adapter.ViewPagerAdapterForMainPageContent
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterMainPage = ViewPagerAdapterForMainPageContent(this)
        viewPagerMainPageContent.adapter = adapterMainPage

        TabLayoutMediator(tabLayoutMainPageContent, viewPagerMainPageContent){tab,position->
            when(position){
                0->{
                    tab.text ="Tam Bana Göre"
                }
                1->{
                    tab.text="Money Kampanyaları"
                }
                2->{
                    tab.text="Sağlıklık Yaşam"
                }
            }
        }.attach()
    }
}