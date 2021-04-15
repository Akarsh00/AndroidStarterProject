package com.example.androidstarterproject.ui.customdialog

import android.os.Bundle
import android.view.View
import com.example.androidstarterproject.R
import com.example.androidstarterproject.base.BaseDialogFragment
import com.example.androidstarterproject.databinding.ExampleCustomDialogLayoutBinding

class ExampleCustomDialog : BaseDialogFragment<ExampleCustomDialogLayoutBinding>() {
    override val layout: Int = R.layout.example_custom_dialog_layout
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bining.btnSubmit.setOnClickListener {
            "Button Clicked".toast()
        }

    }
}