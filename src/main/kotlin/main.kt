import seleccionFutbol.Adestrador
import seleccionFutbol.Xogador

fun main(args: Array<String>) {


    //Instanciar un objeto de cada clase

     val xogador= Xogador(10,"Pepe","Villuela",26,26,"delantero")
     val adestrador= Adestrador(444,"Andres","Peludo",44,"nose")


    //Los metodos de acceso getters y setters son autogenerados para nosotros por el compilador Kotlin.


    /*Llamar al metodo concentrase desde los distintos objetos,
      los metodos devuelven la misma frase (por que le puse la misma frase) pero no son los mismos
      ya que cada metodo hace referencia al objeto que lo llama por eso son  diferentes
     */


    xogador.concentrarse()
    adestrador.concentrarse()

    //Invocar o metodo viaxar

    xogador.viaxa()
    adestrador.viaxa()

    /*A saida é distinta en uno aparece o xogador viaxa... en el otro o adestrador viaxa...
    Os metodos son distintos en funcion do obxeto que lo llama
    */

    //Se puede invocar un metodo de la superclase desde una subclase
    xogador.metodoSueprclase()



}