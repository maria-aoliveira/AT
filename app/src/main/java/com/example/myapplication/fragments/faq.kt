package com.example.myapplication.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_faq.*

/**
 * A simple [Fragment] subclass.
 */
class faq : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_faq, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configurarListeners()
    }

    fun configurarListeners() {
        btnLigar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                //Número da central de atendimento em SP
                data = Uri.parse("tel:$113299-2000")
            }
            //Só executa se houver app que atenda à ação
            if (intent.resolveActivity(activity!!.packageManager) != null) {
                startActivity(intent)

            }

        }

    }
}
