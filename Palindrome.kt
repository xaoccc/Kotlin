fun main() {
    var word = "potOp ";
    // strip() is deprecated use trim()
    if (word.lowercase().trim() == word.lowercase().trim().reversed()) 
        println("The word is a palindrome")
    else 
        println("The word is not a palindrome")
    println(word[1])
    println(word.length)
}