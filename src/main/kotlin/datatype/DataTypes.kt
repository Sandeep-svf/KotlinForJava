package datatype

fun main(args : Array<String>) {

    val myInt = 10
    var myLong = 22L    // if remove L from here .. we will get int ... bcoz not initialized.
    val myLong2 : Long = 22   // Now it is long

    myLong = myInt.toLong()    // This function convert value to long ....


    val myByte : Byte = 111
    var myShort : Short

    myShort = myByte.toShort()





}