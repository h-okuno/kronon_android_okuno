package com.example.kronon_android_okuno.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.kronon_android_okuno.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_calendar, container, false)
        val textView: TextView = root.findViewById(R.id.text_calendar)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val button: ImageButton = root.findViewById(R.id.imageButton5)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_calendar_to_inputschedule)
        }
        return root
    }

}