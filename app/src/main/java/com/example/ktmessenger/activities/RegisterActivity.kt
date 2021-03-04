package com.example.ktmessenger.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.ktmessenger.R
import com.example.ktmessenger.databinding.ActivityRegisterBinding
import com.example.ktmessenger.ui.fragments.EnterPhoneNumberFragment
import com.example.ktmessenger.utilites.replaceFragment

class RegisterActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityRegisterBinding
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.registerToolbar
        setSupportActionBar(mToolbar)
        title = getString(R.string.register_title_your_phone)
        replaceFragment(EnterPhoneNumberFragment())
    }
}