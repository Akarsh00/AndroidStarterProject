package com.example.androidstarterproject.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomSheetFragment<B : ViewDataBinding> : BottomSheetDialogFragment() {

    protected lateinit var bining: B
    fun String.toast() {
        Toast.makeText(requireContext(), this, Toast.LENGTH_LONG).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bining = DataBindingUtil.inflate(
            inflater, layout, container, false
        )
        return bining.root
    }

    abstract val layout: Int
}