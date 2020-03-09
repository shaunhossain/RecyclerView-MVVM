package com.shaunhossain.recyclerviewmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.recyclerviewmvvm.adapter.CustomAdapter
import com.shaunhossain.recyclerviewmvvm.viewmodel.CategoryViewModel

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.view_container)
        var categoryViewModel: CategoryViewModel = ViewModelProvider(this).get(CategoryViewModel::class.java)
        categoryViewModel.getArrayList().observe(this, Observer { categoryViewModels ->
            customAdapter = CustomAdapter(categoryViewModels!!)
            recyclerView!!.layoutManager = LinearLayoutManager(this)
            recyclerView!!.adapter = customAdapter

        })
    }
}
