package seleccionFutbol

import javax.swing.JOptionPane

class Xogador : Seleccion {
    var dorsal :Int = 0
    var demarcacion: String =""


    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    constructor(id: Int, nome: String, apelido: String, edade: Int) : super(id, nome, apelido, edade)


    override fun concentrarse(): String {
        println("Introduce el tiempo de concentración")
        val tempo = readLine()!!
        println("Concentrarse a seleccion durante $tempo horas")
        return tempo
    }

    override fun viaxa(): String {
        println("Pais destino")
        val paisDestino = readLine()!!
        println("Viaxan os xogadores $paisDestino")
        return paisDestino
    }
    fun xogarPartido(){
        println("O xogador $nome xoga")
    }
    fun entrenar(){
        println("O xogador $nome entrena")
    }

}