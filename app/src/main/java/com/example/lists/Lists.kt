package com.example.lists

fun main() {

    val months = listOf("Enero", "Febrero", "Marzo")
    val anyTypes = listOf(1, 2, 3, true, false, "String")

    //Podemos saber que cantidad de elementos tiene la lista
    println(anyTypes.size)

    //Acceder a un elemento en concreto de la lista
    println(months[1])

    //Imprimimos todos los valores de la lista
    for (month in months) {
        println(month)
    }

    //También podemos añadir elementos comvirtiendo la lista en mutable y también podemos combinarla con un array
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("Abril", "Mayo", "Junio")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("Julio")
    print(additionalMonths)

    //Si queremos crear un lista mutable de un tipo en particular
    val days= mutableListOf<String>("Lunes","Martes","Miércoles","Jueves","Viernes")
    print("\n" + days)

    //Si queremos añadir algún elemento
    days.add("Sábado")
    print("\n" + days)

    //Podemos cambiar el valor de un elemento
    days[2]="Domingo"
    print("\n" + days)

    //Podemos borrar un elemento de la lista
    days.removeAt(0)
    print("\n" + days)

    //Podemos borrar varios elementos de la lista
    val removeList= mutableListOf<String>("Martes","Jueves")
    days.removeAll(removeList)
    print("\n"+ days)

    //Podemos borrar todos los elementos de la lista
    days.removeAll(days)
    print("\n"+days)
}