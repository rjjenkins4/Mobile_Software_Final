package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_signup_fragment.view.*
import kotlinx.android.synthetic.main.shr_signup_fragment.view.*
import kotlinx.android.synthetic.main.shr_signup_login_fragment.view.*

/**
 * Fragment representing the login screen for Shrine.
 */
class SignupFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_signup_fragment, container, false)

        // Set an error if the password is less than 8 characters.
        view.button2.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                LoginFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}
