package com.example.recyclerviewttt

class BookModel{
    var code:Int = 0

    var title:String = ""

    var author:String = ""

    var price:Double = 0.0

    var picture:Int = 0

    constructor(code:Int,title:String,author:String,price:Double,picture:Int){
        this.code = code
        this.title = title
        this.author = author
        this.price  = price
        this.picture = picture
    }
    constructor()

    override fun toString(): String {
        return "$code+$title+$author+$price+$picture"
    }


}