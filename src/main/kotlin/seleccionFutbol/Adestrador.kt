package seleccionFutbol

class Adestrador : Seleccion {
    var idFederacion : String=""


    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.idFederacion = idFederacion
    }

    override fun concentrarse(): String ="Concentrase a seleccion e o tempo de concentracion"

    override fun viaxa(): String {
        println("Pais destino")
        val paisDestino = readLine()!!
        println("Viaxa o adestrador a $paisDestino")
        return paisDestino
    }

    fun dirixirPartido(){
        println("O adestrador $nome dirixe o partido")

    }
    fun dirixirAdestramento(){
        println("O adestradir $nome  adestra")

    }

}