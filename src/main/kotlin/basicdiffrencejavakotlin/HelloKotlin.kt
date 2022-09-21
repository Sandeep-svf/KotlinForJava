import basicdiffrencejavakotlin.javacode.Dummy
import java.lang.StringBuilder

fun main() {
    println("Om shree sadguru dev bhgvaan ki jay")

    // Initializing variable

    // val can be assign once like final keywords in java
    val number = 25
    val number2 : Int
    number2 = 30
    val number3 : Int = 25  // not a good idea giving information twice to compiler
    println(number+number2+number3)


    // var can be reassign
    // var varable have underline , it means you can change it's value...
    var price : Int
    price= 30
    price = 40

    val employee = Employee("aarav",20)
    // can reassign name or id
    employee.name = ("Aarav Maurya")


    // can not assign val class
    // it will throw error
    // employee = Employee("sam",27)

    // in some case compiler assign once even it looks assign more than one
    val proceObj : Price
    val stockProce = 50

    if(stockProce>number){
        proceObj = Price("25.00","35.24")
    }else{
        proceObj = Price("255.00","356.24")
    }


    /*// Type Alliases
    StringBuilder*/

    var myDouble = 65.325
    println(myDouble is Double)
    println("default data type is ${myDouble is Double}")

    var myFloat = 25.3256f  // now it will work as Float
    println("This is float ${myFloat is Float}")

    // Char
    var myChar = "a"
    //var myChar2 : Char = 25  // throw
    var myCharInt = 65
    println(myCharInt.toChar())

    // Boolean
    var myBoolean : Boolean = true

    // Calling java class

    var vacationTime = false
    val onVacation = Dummy.isVacationTime(vacationTime)
    println(onVacation)


}

class Employee (var name: String, val Id : Int){

}

class Price (var startPrice : String , val endPrice : String){

}