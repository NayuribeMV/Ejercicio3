package classes

import abstract.Empleados


class Comercial (nombre : String,  edad : Int ,  salario : Double,PLUS: Int = 300,var comision: Double) :Empleados(nombre, edad , salario,PLUS) {

    override fun plus(): Boolean {
            if (edad >= 30 && comision > 200.0 ){
                return true
            }
            return false
        }

}




