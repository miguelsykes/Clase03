package com.example.clase03.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.example.clase03.R
import com.example.clase03.modelo.Elemento
import kotlinx.android.synthetic.main.item_elemento.view.*

class ElementoAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val lista=  ArrayList<Elemento>()

    fun agregarDatos (datos:ArrayList<Elemento>){
        lista.addAll(datos)
        notifyDataSetChanged()
    }

    inner class ElementoViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        fun cargarDiseno(modelo: Elemento) {
            itemView.tvTitulo.text=modelo.titulo
            itemView.tvDescripcion.text=modelo.descripcion
            itemView.tvCodigo.text=modelo.codigo.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_elemento,parent,false)
        return ElementoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is ElementoViewHolder){
            holder.cargarDiseno(lista[position])
        }
    }
}