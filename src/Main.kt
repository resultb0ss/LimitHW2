fun main() {

    var array = arrayOf(1,2,3,4,5,6,7,8)
    println(GenericMethod().isItIncluded(1,array))
    println(GenericMethod().isItIncluded(10,array))
}

class GenericMethod(){

    fun <T:Comparable<T>> isItIncluded(ob: T, array: Array<T>) : Boolean {

        return array.contains(ob)
    }
}