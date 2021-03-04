package com.example.ktmessenger.ui.fragments

import androidx.fragment.app.Fragment
import com.example.ktmessenger.R
import com.example.ktmessenger.utilites.replaceFragment
import com.example.ktmessenger.utilites.showToast
import kotlinx.android.synthetic.main.fragment_enter_phone_number.*

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {

    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener { sendCode() }
    }

    private fun sendCode() {
        if (register_input_phone_number.text.toString().isEmpty()){
            showToast(getString(R.string.register_toast_enter_phone))
        } else {
            replaceFragment(EnterCodeFragment())
        }
    }

}