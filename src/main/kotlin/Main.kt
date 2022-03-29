import abstract.Empleados
import classes.Comercial
import classes.Repartidor

fun main(args: Array<String>) {

    var repartidor = Repartidor("Jose",22, 360000.0,300,"zona 3")
    var comercial = Comercial("Alejandra",35, 380000.0,300,500.0)

    println("Calculo empleado comercial")
    if(comercial.plus()){
        var resultado = comercial.PLUS +comercial.salario
       println("Salario total = $resultado")
    }

    println("_____________________________________")

    println("Calculo empleado repartidor")
    print(repartidor.plus())



}