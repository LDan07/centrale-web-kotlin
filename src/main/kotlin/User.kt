class User (val email: String, val name: String, val age: Int) {
    val friends = mutableListOf<User>()

    infix fun becomesFriend(other: User) { friends.add(other) }
}