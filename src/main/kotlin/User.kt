open class User (val email: String, val name: String, val age: Int) {
    val friends = mutableListOf<User>()
    val groups = mutableListOf<String>()

    infix fun becomesFriend(other: User) { friends.add(other) }
    infix fun deletesFriend(other: User) { friends.remove(other) }

}