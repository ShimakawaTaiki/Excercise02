package com.example.excercise02.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.excercise02.R
import com.example.excercise02.databinding.FragmentNextBinding
import com.example.excercise02.viewmodel.UserViewModel

class NextFragment: Fragment() {
    private val userViewModel: UserViewModel by activityViewModels()
    private lateinit var binding: FragmentNextBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_next, container, false)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            user = userViewModel
        }

        return binding.root
    }
}