package com.example.esqueletoejercicioapi

import android.view.Display
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AdapterString : RecyclerView.Adapter<AdapterString.FilmsViewHolder>()  {

    private var datos : String? = null

    class FilmsViewHolder(root: View) : RecyclerView.ViewHolder(root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    suspend fun setData(string : String){
        datos = string
        withContext(Dispatchers.Main){
            notifyDataSetChanged()
        }
    }

}