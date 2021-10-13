class Post (val auteur: User, val message: String) {
    fun publishMessage ()
    {
        println(auteur.name + " dit : " + message)
    }
}