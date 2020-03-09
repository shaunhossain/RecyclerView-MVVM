package com.shaunhossain.recyclerviewmvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.recyclerviewmvvm.R
import com.shaunhossain.recyclerviewmvvm.databinding.CategoryBinding
import com.shaunhossain.recyclerviewmvvm.viewmodel.CategoryViewModel

class CustomAdapter(private val arrayList: ArrayList<CategoryViewModel>): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val categoryBinding: CategoryBinding = DataBindingUtil.inflate(layoutInflater,R.layout.inner_item,parent,false)
        return CustomViewHolder(categoryBinding)
    }

    override fun getItemCount(): Int {
       return arrayList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val categoryViewModel = arrayList[position]
        holder.bind(categoryViewModel)
    }

    class CustomViewHolder(val categoryBinding: CategoryBinding): RecyclerView.ViewHolder(categoryBinding.root){
        fun bind(categoryViewModel: CategoryViewModel){
            this.categoryBinding.catagorymodel = categoryViewModel
            categoryBinding.executePendingBindings()
        }

    }
}