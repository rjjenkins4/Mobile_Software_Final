package com.google.codelabs.mdc.kotlin.shrine

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_module_nine_content_fragment.view.*
import kotlinx.android.synthetic.main.shr_module_one_content_fragment.view.*


class ModuleNineContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_module_nine_content_fragment, container, false)


        view.Module9Button1.setOnClickListener {
            val uri: Uri = Uri.parse("https://docs.google.com/presentation/d/1COEiWNknSmiI5RUgxumLrgscl9d-yvKoj6tjNF9jw5A/edit?pli=1#slide=id.g796a0b0491_0_404")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.Module9Button2.setOnClickListener {
            val uri: Uri = Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-9")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.BackButton10.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CourseContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}