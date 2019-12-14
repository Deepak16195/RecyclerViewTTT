package com.example.recyclerviewttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.OvershootInterpolator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import jp.wasabeef.recyclerview.animators.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var lists = ArrayList<BookModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        for (i in 1..5){
            lists.add(BookModel(5,"Java programming","Jame",120.00,R.drawable.java))
            lists.add(BookModel(6,"Python programming","Joe Heart",130.00,R.drawable.python))
            lists.add(BookModel(7,"Microsoft ","Team Soft",220.00,R.drawable.microsot))
            lists.add(BookModel(1,"Java programming","Jame",120.00,R.drawable.java))
            lists.add(BookModel(2,"Python programming","Joe Heart",130.00,R.drawable.python))
            lists.add(BookModel(3,"Microsoft ","Team Soft",220.00,R.drawable.microsot))
            lists.add(BookModel(4,"Python programming","Joe Heart",130.00,R.drawable.python))
            lists.add(BookModel(5,"Java programming","Jame",120.00,R.drawable.java))
            lists.add(BookModel(6,"Python programming","Joe Heart",130.00,R.drawable.python))
            lists.add(BookModel(7,"Microsoft ","Team Soft",220.00,R.drawable.microsot))
            lists.add(BookModel(3,"Microsoft ","Team Soft",220.00,R.drawable.microsot))
            lists.add(BookModel(4,"Python programming","Joe Heart",130.00,R.drawable.python))
            lists.add(BookModel(5,"Java programming","Jame",120.00,R.drawable.java))
            lists.add(BookModel(6,"Python programming","Joe Heart",130.00,R.drawable.python))
            lists.add(BookModel(5,"Java programming","Jame",120.00,R.drawable.java))
            lists.add(BookModel(7,"Microsoft ","Team Soft",220.00,R.drawable.microsot))
        }


        var linearLayoutManager = LinearLayoutManager(this)
            linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        var gridLayoutManager = GridLayoutManager(this,2)
            recycler.layoutManager = gridLayoutManager

        recycler.itemAnimator = SlideInUpAnimator(OvershootInterpolator(1f))

        var adapter = BookAdapter(this,lists)
            recycler.adapter = adapter


        //adapter.setOnItemClickListener(this)

    }

//    override fun onItemClickListener(position: Int) {
//       var intent = Intent(this,Detail::class.java)
//        var book = lists.get(position)
//        intent.putExtra("K_Title",book.title)
//        intent.putExtra("K_Picture",book.picture)
//        startActivity(intent)
//    }
//
    fun getIndexRecyclerView(adapterPosition: Int) {
//    var intent = Intent(this,Detail::class.java)
//        var book = lists.get(adapterPosition)
//        intent.putExtra("K_Title",book.title)
//        intent.putExtra("K_Picture",book.picture)
//        startActivity(intent)
    }

}
