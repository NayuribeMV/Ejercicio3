package classes

import abstract.Empleados


class Repartidor (nombre : String,  edad : Int ,  salario : Double,PLUS: Int = 300, var zona :String) :Empleados(nombre, edad ,  salario,PLUS ) {


    override fun plus(): Boolean{
        if(edad < 25 && zona == "zona 3"){
            return true
        }
        return false
    }
}