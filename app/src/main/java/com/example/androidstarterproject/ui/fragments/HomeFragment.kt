package com.example.androidstarterproject.ui.fragments

import android.os.Bundle
import android.view.View
import com.example.androidstarterproject.R
import com.example.androidstarterproject.base.BaseFragment
import com.example.androidstarterproject.databinding.HomeFragmentBinding
import com.example.androidstarterproject.ui.bottomsheet.ExampleBottomSheetFragment
import com.example.androidstarterproject.ui.customdialog.ExampleCustomDialog

class HomeFragment:BaseFragment<HomeFragmentBinding>() {
    override val layout: Int
        get() = R.layout.home_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bining.showBottomSheet.setOnClickListener {
            ExampleBottomSheetFragment().show(childFragmentManager,"tag")
        }
        bining.showCustomDialog.setOnClickListener {
            ExampleCustomDialog().show(childFragmentManager,"tag")
        }
    }

}