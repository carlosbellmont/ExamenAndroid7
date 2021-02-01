package com.example.esqueletoejercicioapi

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AdapterString : RecyclerView.Adapter<AdapterString.StringViewHolder>()  {

    private var datos : List<String>? = null

    class StringViewHolder(root: View) : RecyclerView.ViewHolder(root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    suspend fun setData(string : List<String>){
        datos = string
        withContext(Dispatchers.Main){
            notifyDataSetChanged()
        }
    }

}