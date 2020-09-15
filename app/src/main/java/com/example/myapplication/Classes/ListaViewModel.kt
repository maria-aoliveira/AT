package com.example.myapplication.Classes

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.lista_elementos.view.*

class agenciasInfo (
    var ag : String,
    var end : String,
    var tel : String
)

class listaAdapter (val agenciasInfo : List<agenciasInfo>)
    : RecyclerView.Adapter<listaAdapter.listaViewHolder>(){

    class listaViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val ag = view.ag
        val end = view.end
        val tel = view.tel
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : listaViewHolder {
        val v = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.lista_elementos,
                parent, false
            )
        val listaViewHolder = listaViewHolder(v)
    return listaViewHolder
    }

    override fun getItemCount(): Int = agenciasInfo.size

    override fun onBindViewHolder(holder: listaViewHolder, position: Int) {
        val agenciasInfo = agenciasInfo[position]
        holder.ag.text = agenciasInfo.ag
        holder.end.text = agenciasInfo.end
        holder.tel.text = agenciasInfo.tel
//        var mColors =
//            arrayOf("#3F51B5", "#FF9800", "#009688", "#673AB7")
//        holder.itemView.setBackgroundColor(Color.parseColor(mColors[position % 4])) // 4 can be replaced by mColors.length
        }

    }


