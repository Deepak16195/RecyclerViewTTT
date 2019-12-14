package com.example.recyclerviewttt

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var d_title = intent.getStringExtra("K_Title")
        var d_picture = intent.getIntExtra("K_Picture",0)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = d_title

        textView_detail.text = d_title
        Picasso.with(this)
            .load(d_picture)
            .fit()
            .into(imageView_detail)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
