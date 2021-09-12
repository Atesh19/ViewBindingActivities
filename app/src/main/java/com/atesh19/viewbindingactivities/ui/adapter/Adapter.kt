package com.atesh19.viewbindingactivities.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atesh19.viewbindingactivities.data.model.RVModel
import java.util.*

class Adapter(
    val adapterDataList: List<RVModel>,
    val meneToxun: (String)->Unit
) : RecyclerView.Adapter<Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder = Holder(parent)

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(adapterDataList[position],meneToxun)
    }

    override fun getItemCount(): Int = adapterDataList.size
}