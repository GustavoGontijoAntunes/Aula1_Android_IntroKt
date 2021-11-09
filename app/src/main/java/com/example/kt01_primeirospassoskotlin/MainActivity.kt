package com.example.kt01_primeirospassoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kt01_primeirospassoskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*lateinit var editNome : EditText
    lateinit var btnSend : Button
    lateinit var txtRelatorio : TextView*/

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*
        editNome = findViewById(R.id.editNome)
        btnSend = findViewById(R.id.btnSend)
        txtRelatorio = findViewById(R.id.txtRelatorio)
        */

        binding.btnSend.setOnClickListener(){
           //Toast.makeText(this, "Toast funcionando", Toast.LENGTH_SHORT).show()

            var pessoa = Pessoa("Gustavo", 22)

            binding.txtRelatorio.text = gerarRelatorio(pessoa.retornarPais())
        }
    }

    fun gerarRelatorio(nome: String) : String{
        return nome
    }
}