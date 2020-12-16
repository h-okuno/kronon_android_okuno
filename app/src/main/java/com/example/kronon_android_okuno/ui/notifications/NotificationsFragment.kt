package com.example.kronon_android_okuno.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.kronon_android_okuno.R

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProvider(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_account, container, false)
        val textView: TextView = root.findViewById(R.id.title_account)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val button: LinearLayout = root.findViewById(R.id.button_logout)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_account_to_login)
        }
        return root
    }
}