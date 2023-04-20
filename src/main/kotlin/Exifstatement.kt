fun main(args: Array<String>) {

    println("Enter your age")
    var age= readln()!!.toInt()
    if (age>=18)
    {
        println("You are admitted to the club")
    }
    else
    {
        println("Can not admit under age")
    }
}