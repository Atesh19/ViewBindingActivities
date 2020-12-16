package com.atesh19.viewbindingactivities.adap

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atesh19.viewbindingactivities.model.RVModel

class Adapter(
    val adapterDataList: List<RVModel>
) : RecyclerView.Adapter<Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder = Holder(parent)

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(adapterDataList[position])
    }

    override fun getItemCount(): Int = adapterDataList.size
}