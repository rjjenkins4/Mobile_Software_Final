package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_course_content_fragment.view.*

class CourseContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_course_content_fragment, container, false)

        // Set an error if the password is less than 8 characters.
        view.button.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleOneContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button11.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleTwoContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button12.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleThreeContentFragment(),
                true
            ) // Navigate to the next Fragment
        }

        view.button13.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleFourContentFragment(),
                true
            ) // Navigate to the next Fragment
        }

        view.button14.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleFiveContentFragment(),
                true
            ) // Navigate to the next Fragment
        }

        view.button15.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleSixContentFragment(),
                true
            ) // Navigate to the next Fragment
        }

        view.button16.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleSevenContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button17.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleEightContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button18.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleNineContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button19.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleTenContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button20.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleElevenContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button21.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleTwelveContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button22.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                ModuleThirteenContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.BackButton15.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CoursePageFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}