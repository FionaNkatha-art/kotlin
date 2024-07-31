//Parent class/super class/Base class
open class Animal{

    var gender ="male"
    var hasfeathers= true


    fun sound(){
        println("Animal is speaking")
    }
}

open class Eagle:Animal(){
    var hasscales = true
    var isBird = false
}
open class Ostrich:Eagle(){
    fun movement(){
        println("is walking")
    }
}

fun main() {
    var a = Animal()


    var e=Eagle()


    var o= Ostrich()
}