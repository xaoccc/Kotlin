fun main() {
    var x = 9;
    var y = 3;
    val z = if(x + y == 10) "x + y is 10" else "x + y is not 10";

    if (x < y) 
        println("x is less than y");
    // Here we need {} because we execute more than 1 line of code 
    else if (x > y) {
        println("x is greater than y");
        println(z);
    } else 
        println("x is equal to y");   

    
}
