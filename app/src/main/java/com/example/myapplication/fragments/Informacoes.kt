package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.Classes.CadastroViewModel

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_informacoes.*

            /**
             * A simple [Fragment] subclass.
             */
            class Informacoes : Fragment() {

                private lateinit var cadastroViewModel: CadastroViewModel

                override fun onCreateView(
                    inflater: LayoutInflater, container: ViewGroup?,
                    savedInstanceState: Bundle?
                ): View? {
                    // Inflate the layout for this fragment
                    activity?.let { act ->
                        cadastroViewModel = ViewModelProviders.of(act)
                            .get(CadastroViewModel::class.java)}

                    return inflater.inflate(R.layout.fragment_informacoes, container, false)
                }

                override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                    super.onViewCreated(view, savedInstanceState)

                    cadastroViewModel.nome.observe(viewLifecycleOwner, Observer {
                        nomeinfoTxt.text = it
        })



    }
}
