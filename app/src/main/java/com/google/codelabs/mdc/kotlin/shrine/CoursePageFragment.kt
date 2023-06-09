package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_course_page_fragment.view.*

class CoursePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_course_page_fragment, container, false)

        // Set an error if the password is less than 8 characters.
        view.button9.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                StartHereFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button10.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CourseContentFragment(),
                true
            ) // Navigate to the next Fragment
        }

        view.BackButton16.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                HomeFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}