package ir.hajkarami.firestoreapp

data class Friend(
    val name: String,
    val email: String
) {
    constructor() : this("", "")
}
