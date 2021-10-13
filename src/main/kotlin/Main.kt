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

    println("")
    Lucie.deletesFriend(Matthieu)
    println("Amis de Lucie : ")
    for(User in Lucie.friends){
        println(User.name)
    }

    println("")
    val post1 = Post(Lucie, "Coucou")
    post1.publishMessage()

    println("")
    val groupECM = Group("ECM")
    groupECM.joined(Marie)
    groupECM.joined(Lucie)
    println("Membres du groupe ECM : ")
    for(User in groupECM.members){
        println(User.name)
    }
    println("Groupes dont Marie fait partie : ")
    for(group in Marie.groups){
        println(group)
    }


    println("")
    groupECM.quited(Lucie)
    println("Membres du groupe ECM : ")
    for(User in groupECM.members){
        println(User.name)
    }

    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")
}