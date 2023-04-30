package com.google.codelabs.mdc.kotlin.shrine

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_module_five_content_fragment.view.*
import kotlinx.android.synthetic.main.shr_module_one_content_fragment.view.*

class ModuleFiveContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_module_five_content_fragment, container, false)


        view.Module5Button1.setOnClickListener {
            val uri: Uri = Uri.parse("https://docs.google.com/presentation/d/13pmWTJiISYksgdK0iB4VPEBLUuciupvlD0Cn0Sy-1WI/edit#slide=id.gb87eded92d_0_482")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.Module5Button2.setOnClickListener {
            val uri: Uri = Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-5")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.BackButton6.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CourseContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}