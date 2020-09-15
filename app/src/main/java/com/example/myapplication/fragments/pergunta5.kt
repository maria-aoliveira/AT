package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.myapplication.Classes.CadastroViewModel
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_pergunta2.*
import kotlinx.android.synthetic.main.fragment_pergunta3.*
import kotlinx.android.synthetic.main.fragment_pergunta5.*

/**
 * A simple [Fragment] subclass.
 */
class pergunta5 : Fragment() {

    private lateinit var cadastroViewModel: CadastroViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.let {
            cadastroViewModel = ViewModelProviders.of(it).get(CadastroViewModel::class.java)
        }


        prox5.setOnClickListener {

            if (a5.isChecked) {
                cadastroViewModel.addPontos(0)
            }
            if (b5.isChecked) {
                cadastroViewModel.addPontos(2)
            }
            if (c5.isChecked) {
                cadastroViewModel.addPontos(4)
            }

            var id: Int = radioGroup5.checkedRadioButtonId
            if (id != -1) {
                // Pega o ID de qualquer opçao
                val radioButton: RadioButton = view!!.findViewById(id)
                Toast.makeText(
                    getActivity(), "Selecionou : ${radioButton.text}",
                    Toast.LENGTH_SHORT
                ).show()

                findNavController()
                    .navigate(R.id.action_pergunta5_to_pergunta6)

            } else {
                // Se nenhuma opção for selecionada
                Toast.makeText(
                    getActivity(), "Por favor, selecione uma opção",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}
