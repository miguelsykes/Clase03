package com.example.clase03.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clase03.R
import com.example.clase03.adapters.ElementoAdapter
import com.example.clase03.modelo.Elemento
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val adapter = ElementoAdapter()
        rvDatos.layoutManager = LinearLayoutManager(this)
        rvDatos.addItemDecoration(DividerItemDecoration(this, LinearLayout.VERTICAL))
        rvDatos.adapter=adapter

        val lista = ArrayList<Elemento>()
        lista.add(Elemento(1, "Crunchy", "Buttery"))
        lista.add(Elemento(2, "Crunchy 2", " ButteryButtery"))
        lista.add(Elemento(3, "Crunchy 3", "ButteryButteryButtery"))
        lista.add(Elemento(4, "Crunchy 4", "ButteryButteryButteryButtery"))
        lista.add(Elemento(5, "Crunchy 5", "ButteryButteryButteryButteryButtery"))
        adapter.agregarDatos(lista)
    }
}