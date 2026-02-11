package com.pjasoft.lib


fun main() {

    // 1.
    val price: Double = 150.0
    val percentage: Double = 0.10
    val tip: Double = price * percentage
    val total: Double = price + tip
    println("El costo de la comida es: $$total")

    //El portero de la discoteca. Verifica que una persona pueda entrar en la disco.
    // Solo si es mayor de edad
    // 2.
    println("Pon una edad")
    val input = readlnOrNull()
    val age = input?.toIntOrNull()
//    if (age == null) {
//        println("El numero que pusiste pa, no es un numero entero, insertalo bien!!!")
//    }
//    else if(age > 18){
//        println("Eres mayor edad, pasale a la discoteca")
//    }
//    else{
//        println("No puedes pasa pai")
//    }

    //RANGOS!!!!!
    for (i in 1..10) {
        println(i)
    }
    //ciclo for al reves
    for (i in 10 downTo 2) {
        println(i)
    }

    for (i in 100 downTo 0 step 10) {
        println(i)
    }

    when (age) {
        null -> println("El numero que pusiste pa, no es un numero entero, insertalo bien!!!")
        in 0..17 -> println("No puedes pasa pai")
        else -> println("Eres mayor de edad, pasale a la discoteca")
    }
    println("La edad es $age")

    var counter: Int = 12
    while (counter < 20) {
        println("El contador es menor que 20")
        counter++
    }

    //DO-While --> Ejecuta primero el bloque de codigo y DESPUUES evalua la condicion
    //Operadores logicos: && ||
    //Operador aritmetico: + - * / %

    do {
        println("El contador vale menos que 30")
        counter++
    } while (counter < 30)

    //Determinar si un número ingresado por el usuario es un número primo
    println("Pon un numero")
    val numero = readlnOrNull()
    val numero2 = numero?   .toIntOrNull()


    do{
        numero2 =
    }

}
//Ctrl k Ctrl c para comentar todo
//Ctrl k Ctrl u para descomentar todo