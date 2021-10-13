class Group(val title: String) {
    val members = mutableListOf<User>()

    fun joined(newMember: User)
    {
        members.add(newMember)
        newMember.groups.add(title)
    }
    infix fun quited(lostMember: User) {members.remove(lostMember)}

}