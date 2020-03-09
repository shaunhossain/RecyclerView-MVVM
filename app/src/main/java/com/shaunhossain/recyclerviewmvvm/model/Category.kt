package com.shaunhossain.recyclerviewmvvm.model

class Category {
    var id: String = ""
    var title: String = ""
    var description: String = ""
    var imagePath: String = ""

    constructor(id: String, title: String, description: String, imagePath: String) {
        this.id = id
        this.title = title
        this.description = description
        this.imagePath = imagePath
    }
}