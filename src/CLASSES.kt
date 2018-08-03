

fun main(args: Array<String>) {
    //Primary constructor
//Inheritance
//Properties with assessors
//Data classes
//val declares a read-only property, var a mutable one


    val mike = Person("Mike", 23)
    //Modifier data adds:
    /*1.toString that displays all primary constructor
            properties*/
    print(mike.toString()) // Person(name=Mike, age=23)

    /*2.equals that compares all primary constructor
            properties*/
    print(mike == Person("Mike", 23)) // True
    print(mike == Person("Mike", 21)) // False
    /*3.hashCode that is based on all primary
    constructor properties*/
    val hash = mike.hashCode()
    print(hash == Person("Mike", 23).hashCode()) // True
    print(hash == Person("Mike", 21).hashCode()) // False
    /*4.component1, component2 etc. that allows
    deconstruction*/
    val (name, age) = mike
    print("$name $age") // Mike 23
    /*5.copy that returns copy of object with concrete
    properties changed*/
    val jake = mike.copy(name = "Jake")

    /*partition - splits into pair of lists*/
    val l = arrayOf(1,2,3)

    val (even, odd) = l.partition { it % 2 == 0 }
    print(even) // [2, 4]
    print(odd) // [1, 3]
    /*min / max / minBy / maxBy*/
    l.min() // 1, possible because we can compare Int
    l.minBy { -it } // 4
    l.max() // 4, possible because we can compare Int
    l.maxBy { -it } // 1
    //first / firstBy
    l.first() // 1
    l.first { it % 2 == 0 } // 2 (first even number)
    //count - count elements matched by predicate
    l.count { it % 2 == 0 } // 2
    //sorted / sortedBy - returns sorted collection
    listOf(2, 3, 1, 4).sorted() // [1, 2, 3, 4]
    l.sortedBy { it % 2 } // [2, 4, 1, 3]
    //groupBy - group elements on collection by key
            l.groupBy { it % 2 } // Map: {1=[1, 3], 0=[2, 4]}
    ///distinct / distinctBy - returns only unique elements
            listOf(1, 1, 2, 2).distinct() // [1, 2]
    //Mutable vs immutable
    //collection processing functions
    val list = mutableListOf(3, 4, 2, 1)
    val sortedResult = list.sorted() // Returns sorted
    println(sortedResult) // [1, 2, 3, 4]
    println(list) // [3, 4, 2, 1]
    val sortResult = list.sort() // Sorts mutable collection
    println(sortResult) // kotlin.Unit
    println(list) // [1, 2, 3, 4]

}


class Person(val name: String, var age: Int)

// name is read-only, age is mutable
/*open class Person(val name: String) {
    open fun hello() = "Hello, I am $name"
    // Final by default so we need open
}*/

/*class PolishPerson(name: String) : Person(name) {
    override fun hello() = "Dzień dobry, jestem $name"
}*/

/*class Person(var name: String, var surname: String) {
    var fullName: String
        get() = "$name $surname"
        set(value) {
            val (first, rest) = value.split(" ", limit = 2)
            name = first
            surname = rest
        }
}*/

//data class Person(val name: String, var age: Int)