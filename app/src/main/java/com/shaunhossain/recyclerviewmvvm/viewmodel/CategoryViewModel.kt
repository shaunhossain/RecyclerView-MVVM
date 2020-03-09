package com.shaunhossain.recyclerviewmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shaunhossain.recyclerviewmvvm.model.Category

class CategoryViewModel: ViewModel {
    var id: String = ""
    var title: String = ""
    var description: String = ""
    var imagePath: String = ""
    constructor() : super()

    constructor(category: Category) : super() {
        this.id = category.id
        this.title = category.title
        this.description = category.description
        this.imagePath = category.imagePath
    }

    var mutablelivedata = MutableLiveData<ArrayList<CategoryViewModel>>()
    var arrayList = ArrayList<CategoryViewModel>()

    fun getImageUrl(): String{
        return imagePath
    }
    fun getArrayList(): MutableLiveData<ArrayList<CategoryViewModel>>{

        val catagoryOne = Category("1","this is title one","the description of the title","image.png")
        val categoryTwo = Category("2","this is title two","the description of the title","image.png")
        val categoryThree = Category("2","this is title two","the description of the title","image.png")
        val categoryFour = Category("2","this is title two","the description of the title","image.png")

        val categoryViewModelOne: CategoryViewModel = CategoryViewModel(catagoryOne)
        val categoryViewModelTwo: CategoryViewModel = CategoryViewModel(categoryTwo)
        val categoryViewModelThree: CategoryViewModel = CategoryViewModel(categoryThree)
        val categoryViewModelFour: CategoryViewModel = CategoryViewModel(categoryFour)

        arrayList!!.add(categoryViewModelOne)
        arrayList!!.add(categoryViewModelTwo)
        arrayList!!.add(categoryViewModelThree)
        arrayList!!.add(categoryViewModelFour)

        mutablelivedata.value = arrayList

        return mutablelivedata
    }



}
