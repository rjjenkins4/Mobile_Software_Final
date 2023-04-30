package com.google.codelabs.mdc.kotlin.shrine

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_module_one_content_fragment.view.*
import kotlinx.android.synthetic.main.shr_module_thirteen_content_fragment.view.*

class ModuleThirteenContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_module_thirteen_content_fragment, container, false)


        view.Module13Button1.setOnClickListener {
            val uri: Uri = Uri.parse("https://docs.google.com/presentation/d/1ANAfjVvrd8u58QY8_dCmyIc8NUC8AuktfThKMt0R3AI/edit#slide=id.gb9def153d9_0_464")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.Module13Button2.setOnClickListener {
            val uri: Uri = Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-13")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.BackButton14.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CourseContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}