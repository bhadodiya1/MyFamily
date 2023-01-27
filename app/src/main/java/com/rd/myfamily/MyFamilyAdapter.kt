package com.rd.myfamily

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyFamilyAdapter(val data: ArrayList<model>) : Adapter<MyFamilyAdapter.MyFamilyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyFamilyViewHolder {
       val view =LayoutInflater.from(parent.context).inflate(R.layout.singlerow,parent,false)
        return MyFamilyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyFamilyViewHolder, position: Int) {
       holder.name.text=data[position].name
    }

    override fun getItemCount(): Int {
       return data.size
    }
    class MyFamilyViewHolder(itemView: View) : ViewHolder(itemView) {

        val name=itemView.findViewById<TextView>(R.id.sos_text)



    }
}