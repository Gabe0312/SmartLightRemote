package com.example.smartlightcontroller.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.smartlightcontroller.adapter.LightAdapter
import com.example.smartlightcontroller.databinding.FragmentHomeBinding
import com.example.smartlightcontroller.model.SmartLightUI

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.rvLights.layoutManager = GridLayoutManager(requireContext(), 2)

        val demo = listOf(
            SmartLightUI("govee-1", "RBGCW 29", "Driveway", true, 65),
            SmartLightUI("wiz-8", "RGBCW 12", "Driveway", false, 0),
            SmartLightUI("govee-2", "RGBCW LED 32", "Driveway", true, 40),
            SmartLightUI("wiz-9", "RGBCW 8", "Driveway", false, 0)
        )
        binding.rvLights.adapter = LightAdapter(
            items = demo,
            onCardClick = { light ->
                // TODO: navigate to lightDetail screen with light.id
            },
            onPowerClick = { light ->

                // TODO: toggle power (call Govee/WIZ later

            }
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}