package com.example.smartlightcontroller.adapter

import android.view.LayoutInflater
import android.view.*
import android.widget.*
import androidx.constraintlayout.motion.widget.KeyPosition
import androidx.recyclerview.widget.RecyclerView
import com.example.smartlightcontroller.R
import com.example.smartlightcontroller.model.SmartLightUI

class LightAdapter(

    private val items: List<SmartLightUI>,
    private val onCardClick: (SmartLightUI) -> Unit,
    private val onPowerClick: (SmartLightUI) -> Unit
) : RecyclerView.Adapter<LightAdapter.VH>() {

    inner class VH(v: View) : RecyclerView.ViewHolder(v){

        val name: TextView = v.findViewById(R.id.lightName)
        val room: TextView = v.findViewById(R.id.txtRoom)
        val power: ImageButton = v.findViewById(R.id.powerButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.light_card, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        holder.name.text = item.name
        holder.room.text = item.room ?: ""
        holder.itemView.setOnClickListener { onCardClick(item) }
        holder.power.setOnClickListener { onPowerClick(item) }



    }

    override fun getItemCount() = items.size


}