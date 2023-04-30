package com.google.codelabs.mdc.kotlin.shrine

import android.content.Intent
import android.graphics.pdf.PdfRenderer
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.shr_start_here_fragment.*
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
                CoursePageFragment(),
                true
            ) // Navigate to the next Fragment
        }
        view.button5.setOnClickListener {
            val uri: Uri = Uri.parse("https://acrobat.adobe.com/id/urn:aaid:sc:US:12a68807-7f83-432f-b26f-fe3e5b55bb61")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        }
        view.button6.setOnClickListener {
            val uri: Uri = Uri.parse("https://acrobat.adobe.com/id/urn:aaid:sc:US:5a22d6d0-2f31-4dea-97fb-66d7da05e230")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        view.button7.setOnClickListener {
            val uri: Uri = Uri.parse("https://acrobat.adobe.com/id/urn:aaid:sc:US:f6423c5e-e389-40b0-b80f-528b7019b22e")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        return view;
    }
    override fun onCreateOptionsMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.shr_toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, menuInflater)
    }
}
