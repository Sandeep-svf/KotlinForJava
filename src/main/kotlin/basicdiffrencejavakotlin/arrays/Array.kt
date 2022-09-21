package basicdiffrencejavakotlin.arrays

fun main(args: Array<String>) {
    val name = arrayOf("aarav","sam","ram","krishna")   // No need to specify type . Compiler will do that
    // Array is actually collection
    val long = arrayOf(1L,2L,3L)
    val longs2 = arrayOf<Long>(1,3,4,5,6)

    val longs3 = arrayOf(1,2,3,4,5) // this is int type array

    // checking array type
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    // defining size of an array Array (size)
    // { i -> i*2} for every index i storing index * 2

    val evenNumber = Array(16) {i -> i*2}
    // printing evenNumber array
    for (number in evenNumber){
        print(number)
    }


     val lotsOfNumber = Array(100) { i -> i + 1}


}