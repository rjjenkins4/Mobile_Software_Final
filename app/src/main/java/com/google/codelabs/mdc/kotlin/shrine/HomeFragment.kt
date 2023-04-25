package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_course_page_fragment.view.*
import kotlinx.android.synthetic.main.shr_home_fragment.view.*
import kotlinx.android.synthetic.main.shr_login_fragment.view.*
import kotlinx.android.synthetic.main.shr_start_here_fragment.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_home_fragment, container, false)

        // Set an error if the password is less than 8 characters.
        view.button8.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CoursePage(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}