package com.example.recyclerviewttt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.custom_book_activity.view.*
import kotlin.math.log

class BookAdapter(var context: Context, var lists: ArrayList<BookModel>): RecyclerView.Adapter<BookAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_book_activity,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val b:BookModel = lists[position]
        holder.setData(b,context)
    }

   inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bookModel :BookModel? = null
        var context :Context? =null
        init {
            itemView.setOnClickListener {
                //Toast.makeText(context,adapterPosition.toString(),Toast.LENGTH_LONG).show()
//                if(mListener !=null){
//                    var pos:Int = adapterPosition
//                    if(pos != RecyclerView.NO_POSITION){
//                        mListener!!.onItemClickListener(pos)
//                    }
//                }
                current_position = adapterPosition
                if(context is MainActivity){
                    var mainActivity:MainActivity = context as MainActivity
                    mainActivity.getIndexRecyclerView(adapterPosition)
                }

                removeItem(adapterPosition)
                //selectedItem(adapterPosition)
            }

        }
        fun setData(boo:BookModel,context: Context){
                itemView.book_title.text = boo.title
                itemView.book_author.text = boo.author
                itemView.book_price.text = "${boo.price} $"
                Picasso.with(context)
                    .load(boo.picture)
                    .fit()
                    .into(itemView.book_pic)

            this.context = context
            this.bookModel = boo



        }


    }

    interface ItemClickListener{
        fun onItemClickListener(position:Int)
    }

    var mListener:ItemClickListener? = null
    var current_position:Int = 0


    fun setOnItemClickListener(listner:ItemClickListener){
        this.mListener = listner
    }

    fun removeItem(position:Int){
        Toast.makeText(context,lists[position].title,Toast.LENGTH_LONG).show()
        lists.removeAt(position)
        notifyItemRemoved(position)

    }

    fun selectedItem(position: Int){



    }


}