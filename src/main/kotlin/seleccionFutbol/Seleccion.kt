package seleccionFutbol

abstract class Seleccion  {

    var id :Int = 0
    var nome: String =""
    var apelido :String=""
    var edade :Int = 0


    constructor(id: Int, nome: String, apelido: String, edade: Int) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
    }

    override fun toString(): String {
        return "Seleccion(id=$id, nome='$nome', apelido='$apelido', edade=$edade)"
    }

     abstract fun concentrarse(): String

     open fun viaxa():String="Viaxa a Seleccion"

    fun metodoSueprclase(){
        println("Metodo da superclase para comprobar si lo puedo llamar desde una subclase")
    }

}