package com.example.myapplication.Classes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView




class CadastroViewModel: ViewModel() {
   var nome = MutableLiveData<String>().apply { value = "" }
    var listaPontos = mutableListOf<Int>()
    var valor : String = ""

    fun addPontos (pontos: Int) {
        listaPontos.add(pontos)
    }

    fun somarPontos():Int{
        var pontos = listaPontos.sum()
        return pontos
    }

 }
