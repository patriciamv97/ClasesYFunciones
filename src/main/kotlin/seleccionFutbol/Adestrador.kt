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
}