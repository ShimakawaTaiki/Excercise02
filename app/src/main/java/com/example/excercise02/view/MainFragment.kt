package com.example.excercise02.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.excercise02.R
import com.example.excercise02.databinding.FragmentMainBinding
import com.example.excercise02.viewmodel.UserViewModel

class MainFragment: Fragment() {
    private val userViewModel: UserViewModel by activityViewModels()
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main, container, false).apply {
            button.setOnClickListener {
                findNavController().navigate(R.id.action_to_next)
            }
            lifecycleOwner = viewLifecycleOwner
            user = userViewModel
        }
        return binding.root
    }
}