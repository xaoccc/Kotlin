fun main() {
    var firstName = "Simeon";
    var lastName = "Veliki";
    println(firstName + " " + lastName)
    println("${firstName + " " + lastName}")
    println("${firstName.plus(" ").plus(lastName)}")
    var result = String.format("%s %s", firstName, lastName)
    println(result);

    println(firstName.uppercase() + " " + lastName.uppercase())
    // lowercase all letters
    println(firstName.lowercase() + " " + lastName.lowercase())
    // capitalize first letter of each name
    println(firstName.lowercase().replaceFirstChar { it.uppercase() } + " " + lastName.lowercase().replaceFirstChar { it.uppercase() })
    // remove all 'a' characters from the string
    println("banana".filter { it != 'a' })
    // keep only 'a' characters from the string
    println("banana".filter { it == 'a' })
    println(firstName.uppercase().reversed() + " " + lastName.uppercase().reversed())
    println(firstName.length)
    println(firstName[2])

    // All methods are here in the left panel under kotlin.text:
    // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/

}
