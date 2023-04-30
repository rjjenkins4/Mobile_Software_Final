package com.google.codelabs.mdc.kotlin.shrine

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_module_one_content_fragment.view.*
import kotlinx.android.synthetic.main.shr_module_six_content_fragment.view.*

class ModuleSixContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_module_six_content_fragment, container, false)


        view.Module6Button1.setOnClickListener {
            val uri: Uri = Uri.parse("https://docs.google.com/presentation/d/1QWLSLfkodgmd3nns8RRNXBCRL45p_0_249lSXiLE2rU/edit#slide=id.gb8b9b28be0_0_397")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.Module6Button2.setOnClickListener {
            val uri: Uri = Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-6")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.BackButton7.setOnClickListener {
            (activity as NavigationHost).navigateTo(
                CourseContentFragment(),
                true
            ) // Navigate to the next Fragment
        }
        return view
    }
}