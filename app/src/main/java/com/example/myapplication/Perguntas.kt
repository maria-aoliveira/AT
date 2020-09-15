package com.example.myapplication

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
import com.example.myapplication.Classes.CadastroViewModel
import kotlinx.android.synthetic.main.fragment_pergunta1.*

class Perguntas : AppCompatActivity() {
    private lateinit var questionarioViewModel: CadastroViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        questionarioViewModel = ViewModelProviders.of(this)
            .get(CadastroViewModel::class.java)

        val nome = intent.getStringExtra("nome")
        questionarioViewModel.nome.value = nome




    }
}
