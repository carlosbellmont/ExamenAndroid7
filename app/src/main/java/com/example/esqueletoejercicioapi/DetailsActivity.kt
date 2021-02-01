package com.example.esqueletoejercicioapi

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.esqueletoejercicioapi.databinding.ActivityDetailsBinding
import com.example.esqueletoejercicioapi.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private lateinit var model : DetailsActivityViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        model = ViewModelProvider(this).get(DetailsActivityViewModel::class.java)

        binding.bBuscar.setOnClickListener {
            GlobalScope.launch (Dispatchers.IO) {
                val resultado = model.getSingleItem(binding.etDetails.text.toString())
                withContext(Dispatchers.Main){
                    binding.tvResultados.text = resultado
                }
            }
        }
    }

    companion object {

        fun createDetailsActivity(context : Context) {
            val intent = Intent(context, DetailsActivity::class.java)
            context.startActivity(intent)
        }
    }
}