package com.example.smartlightcontroller.ui.detail


import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.navArgs
import com.example.smartlightcontroller.R
import com.example.smartlightcontroller.databinding.FragmentDetailLightBinding



class LightDetailFragment : Fragment(R.layout.fragment_detail_light){
    private var _binding: FragmentDetailLightBinding? = null
    private val binding get() = _binding!!





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentDetailLightBinding.bind(view)

        val lightId = requireArguments().getString("lightId").orEmpty()

        binding.lightTitle.text = "Light $lightId"

        binding.materialSwitch.setOnCheckedChangeListener { _, isOn ->


            val status = if (isOn) "ON" else "OFF"
            val powerStatus = "Light is $status"
            Toast.makeText(requireContext(), powerStatus, Toast.LENGTH_SHORT).show()


        }

        binding.SeekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(SeekBar: SeekBar, progress: Int, fromUser: Boolean) {}
                override fun onStartTrackingTouch(SeekBar: SeekBar) {}
                override fun onStopTrackingTouch(SeekBar: SeekBar) {
                    val brightness = "Brightness: ${SeekBar?.progress}"
                    Toast.makeText(requireContext(), brightness, Toast.LENGTH_SHORT).show()
                }
            })
        binding.colorButton.setOnClickListener{ showHsvColorPicker() }

        private fun showHsvColorPicker() {
            val ctx = requireContext()
            val density = resources.displayMetrics.density
            val pad = (16 * density).toInt()

            val container = android.widget.LinearLayout(ctx).apply {
                orientation = android.widget.LinearLayout.VERTICAL
                setPadding(pad, pad, pad, pad)
            }
            val preview = View(ctx).apply {
                layoutParams = android.widget.LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, (56 * density).toInt()
                )
                setBackgroundColor(Color.RED)
            }
            container.addView(preview)

            fun labeledSeekBar(label: String, max: Int, initial: Int): SeekBar{
                val tv = android.widget.TextView(ctx).apply{
                    text =
                }
            }

        }

        binding.colorButton.setOnClickListener {

        }






    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

