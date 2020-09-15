package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Classes.agenciasInfo
import com.example.myapplication.Classes.listaAdapter

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_lista.*

/**
 * A simple [Fragment] subclass.
 */
class lista : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var agenciasInfo = mutableListOf(
            agenciasInfo("Agência 001", "Rua Boa Vista, 254", "(11)3101-6433"),
            agenciasInfo("Agência 002", "Av. Prof. João Fiúsa, 1901", "(11)3081-2468"),
            agenciasInfo("Agência 003", "Rua Padre João Manuel, 450", "(11)3620-7184"),
            agenciasInfo("Agência 004", "Av. Brg. Faria Lima, 1355", "(11)3299-2000"),
            agenciasInfo("Agência 005", "Rua Duque dos Campos, 90,","(11)2340-9801"),
            agenciasInfo("Agência 006", "Rua Marcio Peçanha, 194", "(11)3405-9103"),
            agenciasInfo("Agência 007","Av. Bragança Mendes, 1230", "(11)2412-0921")
        )

        var listaAdapter = listaAdapter(agenciasInfo)
        listaInfo.adapter = listaAdapter
        listaInfo.layoutManager = LinearLayoutManager(context)

    }

}
