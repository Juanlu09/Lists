package com.example.lists

fun main(){

    val months= listOf("Enero", "Febrero","Marzo")
    val anyTypes = listOf(1,2,3,true,false,"String")

    //Podemos saber que cantidad de elementos tiene la lista
    print(anyTypes.size)

    //Acceder a un elemento en concreto de la lista
    print("\n" + months[1])



}