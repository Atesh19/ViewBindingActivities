package com.atesh19.viewbindingactivities.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atesh19.viewbindingactivities.data.model.RVModel
import com.atesh19.viewbindingactivities.databinding.AdapterItemListBinding
import com.bumptech.glide.Glide

class Holder(
    val parent: ViewGroup,
    val binding: AdapterItemListBinding = AdapterItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    ) : RecyclerView.ViewHolder(
   binding.root
) {


    fun bind(rvModel: RVModel, meneToxun: (String) -> Unit) {

        with(binding) {
            txtComment.text = rvModel.textContent
            Glide.with(parent.context)
                .load(rvModel.imageUrl)
                .into(picImage)

            txtComment.setOnClickListener{
                meneToxun(rvModel.textContent)
            }
        }

    }
}
//// ViewHolder
//class ViewBindingExampleHolder(
//    private val binding: AdapterItemViewBindingExampleBinding
//) : RecyclerView.ViewHolder(binding.root) {

//    fun bind(item: String) {
//        with(binding){
//            btnItemSelection.text = item
//        }
//    }
//}
//// Adapter - onCreateViewHolder
//override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewBindingExampleHolder(
//    // Inflate generated item binding class
//    AdapterItemViewBindingExampleBinding.inflate(
//        LayoutInflater.from(parent.context), parent, false
//    )
//)