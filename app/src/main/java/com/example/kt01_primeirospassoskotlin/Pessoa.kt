package com.example.kt01_primeirospassoskotlin

class Pessoa(nome: String) : Residenciakt() {

    var nome: String = nome
        get() {
            if (field == "") {
                return "Vazio"
            } else {
                return field
            }
        }

        set(value) {
            if(value == "João"){
                field = "Acesso negado"
            } else {
                field = value
            }
        }

    var idade: Int = 0
        get()= field
        set(value) { field = value }

    var sexo: String = "F"
        get()= field
        set(value) { field = value }

    // Obriga passar nos setters
    init {
        this.nome = nome
    }

    constructor(nome: String, idade: Int) : this(nome){
        this.nome = nome
        this.idade = idade
    }

    override fun retornarPais() : String {
        return super.retornarPais() + "(BR)";
    }
}