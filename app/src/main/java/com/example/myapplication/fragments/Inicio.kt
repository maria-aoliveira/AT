package com.example.myapplication.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.myapplication.Classes.CadastroViewModel
import com.example.myapplication.Perguntas

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_inicio.*

/**
 * A simple [Fragment] subclass.
 */
class Inicio : Fragment() {

    private lateinit var cadastroViewModel: CadastroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        activity?.let {
            cadastroViewModel = ViewModelProviders.of(it).get(CadastroViewModel::class.java)
        }
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iniciar.setOnClickListener{
            val nome = nomeTxt.text.toString()
            if(nome.trim().length>0){
                Toast.makeText(getActivity(), "Vamos começar $nome", Toast.LENGTH_SHORT).show()
                var intent = Intent (activity, Perguntas::class.java)
             //   intent.putExtra("nome", cadastroViewModel.nome.value)
                intent.putExtra("nome", nome)
                startActivity(intent)
            }else{
                Toast.makeText(getActivity(), "Por favor, informe seu nome", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
