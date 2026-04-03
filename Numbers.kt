
fun main() {
    // var x = 35 is also valid
    var x: Int = 35; 
    var y: Int = 56;
    println("The result of x + y is: ${x + y}");
    x+=10;
    println("The result of x + y is now: ${x + y}");

    println("We can now calculate the area of a circle")
    var r = 15.521712F;
    println("The area is ${Math.PI * Math.pow(r.toDouble(), 2.0)}")
    println("We can use float numbers as well:")
    println("The area is ${Math.PI * r * r}")

}

