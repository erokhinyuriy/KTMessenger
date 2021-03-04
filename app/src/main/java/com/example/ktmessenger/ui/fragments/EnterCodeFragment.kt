package com.example.ktmessenger.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.ktmessenger.R
import com.example.ktmessenger.utilites.AppTextWatcher
import com.example.ktmessenger.utilites.showToast
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {
    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(AppTextWatcher{
            val string = register_input_code.text.toString()
            if (string.length == 6){
                verificateCode()
            }
        })
    }

    private fun verificateCode() {
        showToast("Ok!")
    }
}