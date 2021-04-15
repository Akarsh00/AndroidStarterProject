package com.example.androidstarterproject.ui.bottomsheet

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidstarterproject.R
import com.example.androidstarterproject.base.BaseBottomSheetFragment
import com.example.androidstarterproject.databinding.ExampleBottomSheetLayoutBinding

class ExampleBottomSheetFragment : BaseBottomSheetFragment<ExampleBottomSheetLayoutBinding>() {
    override val layout: Int = R.layout.example_bottom_sheet_layout
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bining.btnSubmit.setOnClickListener {
            "Button Clicked".toast()
        }

    }
}