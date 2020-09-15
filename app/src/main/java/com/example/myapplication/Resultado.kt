package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.Classes.CadastroViewModel
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {

    private lateinit var questionarioViewModel: CadastroViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        questionarioViewModel = ViewModelProviders.of(this)
            .get(CadastroViewModel::class.java)

        nav()
        dados()
    }

    private fun nav() {
        bottomNavView.setupWithNavController(
            findNavController(R.id.hostFrag)
        )
    }

    private fun dados() {

        val nome = intent.getStringExtra("nome")
        questionarioViewModel.nome.value = nome
//        txtNome.text = nome

        var resposta = intent.getIntExtra("resposta", 0)
        if (resposta <= 12) {
            var valor = "Perfi Conservador\n\n" + "O investidor com esse perfil busca a preservação dos recursos, " +
                    "com zero tolerância a perdas e busca alta liquidez. A classe que mais combina com esse perfil é a Renda Fixa"
            questionarioViewModel.valor = valor
            //   txtVw_perfil.text = valor
        } else {
            if (resposta in 13..29) {
                var valor = "Perfil Moderado\n\n" + "O perfil moderado tolera um pouco mais de riscos, a fim de conseguir uma rentabilidade " +
                        "maior."+ "Investidores desse tipo aproveitam os títulos de renda fixa, porém investem em certos títulos de renda variável"
                questionarioViewModel.valor = valor
//                txtVw_perfil.text = valor
            } else {
                var valor = "Perfil Arrojado\n\n"+ "Perfil agressivo, é o que mais assume riscos para obter o maior retorno possível" +
                        "Sua prioridade é o aumento de patrimônio a longo prazo"
                questionarioViewModel.valor = valor
//                txtVw_perfil.text = valor

            }
        }
    }
}




