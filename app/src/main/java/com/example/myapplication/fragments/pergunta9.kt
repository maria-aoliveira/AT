package com.example.myapplication.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.Classes.CadastroViewModel

import com.example.myapplication.R
import com.example.myapplication.Resultado
import kotlinx.android.synthetic.main.fragment_pergunta1.*
import kotlinx.android.synthetic.main.fragment_pergunta8.*
import kotlinx.android.synthetic.main.fragment_pergunta9.*

/**
 * A simple [Fragment] subclass.
 */
class pergunta9 : Fragment() {

    private lateinit var cadastroViewModel: CadastroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta9, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.let {
            cadastroViewModel = ViewModelProviders.of(it).get(CadastroViewModel::class.java)
        }
        prox9.setOnClickListener {
            if (a9.isChecked) {
                cadastroViewModel.addPontos(0)
            }
            if (b9.isChecked) {
                cadastroViewModel.addPontos(1)
            }
            if (c9.isChecked) {
                cadastroViewModel.addPontos(2)
            }
            if (d9.isChecked) {
                cadastroViewModel.addPontos(4)
            }
            if (e9.isChecked) {
                cadastroViewModel.addPontos(5)
            }
            var id: Int = radioGroup9.checkedRadioButtonId
            if (id != -1) {
                // Pega o ID de qualquer opçao
                val radioButton: RadioButton = view!!.findViewById(id)
                Toast.makeText(
                    getActivity(), "Selecionou : ${radioButton.text}",
                    Toast.LENGTH_SHORT
                ).show()

                val intent = Intent(activity, Resultado::class.java)
                var resposta = cadastroViewModel.somarPontos()
                intent.putExtra("resposta", resposta)
                intent.putExtra("nome", cadastroViewModel.nome.value)
                startActivity(intent)

            }else{
                Toast.makeText(
                    getActivity(), "Por favor, selecione uma opção", Toast.LENGTH_SHORT)
                    .show()
            }

        }
    }
}
