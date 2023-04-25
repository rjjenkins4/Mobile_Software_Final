package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_home_fragment.view.*
import kotlinx.android.synthetic.main.shr_start_here_fragment.view.*

class StartHereFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment with the ProductGrid theme
        val view = inflater.inflate(R.layout.shr_start_here_fragment, container, false)

        // Set up the RecyclerView
        view.button4.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CoursePage(),
                true
            ) // Navigate to the next Fragment
        }

        return view;
    }

    override fun onCreateOptionsMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.shr_toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, menuInflater)
    }
}
