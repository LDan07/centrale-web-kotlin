fun main(args: Array<String>) {
    println("Hello World!")

    val Marie = User("marie@test.fr", "Marie", 22)
    val Lucie = User("lucie@test.fr", "Lucie", 21)
    val Matthieu = User("matthieu@test.fr", "Matthieu", 21)
    Lucie.becomesFriend(Marie)
    Lucie.becomesFriend(Matthieu)
    println("Amis de Lucie : ")
    for(User in Lucie.friends){
        println(User.name)
    }
    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")
}