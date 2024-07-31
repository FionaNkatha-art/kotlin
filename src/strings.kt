fun main() {
    var firstname="Fiona"
    var lastname="Nkatha"

    println(firstname)

    //Accessing a character in a string
    println(firstname[3])

    //Modifying a string
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String concatination(Joining strings)
    println(firstname+lastname)
    println(firstname+" "+lastname)
    println(firstname.plus(lastname))

    //String Interpolation
    println("My firstname is " +firstname)
    println("My firstname is $firstname")

    var num1=34
    var num2=20
    println("The sum of $num1 and $num2 is " +(num1+num2))
    println("The sum of $num1 and $num2 is ${num1 +num2}" )
}