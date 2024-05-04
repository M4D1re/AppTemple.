package com.example.apptemple

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.apptemple.data.database.SchoolDb
import com.example.apptemple.databinding.FragmentProfileBinding
import com.example.apptemple.utils.*
import org.koin.android.ext.android.get

class profile : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        displayUserData()
        goSettings()
        return binding.root
    }
    private fun displayUserData() {
        val userName = requireActivity().intent.getStringExtra("userName")
        get<SchoolDb>().userDao().getAllData().find { it.username == userName }?.let {
            requireContext().displayMessage(it.toString())
        } ?: requireContext().displayMessage(Messages.USER_NOT_FOUND)
    }
    private fun goSettings() {
        binding.buttonSettings.setOnClickListener {
            requireContext().navigate(SettingsActivity::class.java)
        }
    }
}