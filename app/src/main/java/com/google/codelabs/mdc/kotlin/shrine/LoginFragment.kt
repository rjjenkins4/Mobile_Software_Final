package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_login_fragment.view.*
import kotlinx.android.synthetic.main.shr_signup_fragment.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_login_fragment, container, false)

        // Set an error if the password is less than 8 characters.
        view.button3.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                HomeFragment(),
                true
            ) // Navigate to the next Fragment
        }

        view.BackButton1.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                SignupLoginFragment(),
                true
            ) // Navigate to the next Fragment
        }

        return view
    }
}