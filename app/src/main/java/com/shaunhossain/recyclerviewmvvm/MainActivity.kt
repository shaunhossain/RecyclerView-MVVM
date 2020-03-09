package com.shaunhossain.recyclerviewmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.recyclerviewmvvm.viewmodel.CategoryViewModel

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.view_container)
        var categoryViewModelOne: CategoryViewModel = ViewModelProvider(this).get(CategoryViewModel::class.java)
        categoryViewModelOne.getArrayList().observe(this, Observer {

        })
    }
}
