package seleccionFutbol

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
}