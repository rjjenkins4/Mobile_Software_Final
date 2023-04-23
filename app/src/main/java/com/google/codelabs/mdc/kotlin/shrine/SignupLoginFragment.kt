package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_signup_login_fragment.view.*



class SignupLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_signup_login_fragment, container, false)


        view.SignUpButton.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                SignupFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.LoginButton.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                SignupFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}







