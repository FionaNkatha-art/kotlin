class Dog(var name:String,var breed:String,var color:String){

}

fun main() {
    var dog1 = Dog("Tom","Chuhuahua","white")
    println(dog1.name)

    var dog2= Dog("Chiku","German Shepherd","Black")
    println(dog2.name+" "+dog2.color)

    var dog3= Dog("Cookie","Siberian Husky","Black")
    println(dog3.name + " "+dog2.breed)
}