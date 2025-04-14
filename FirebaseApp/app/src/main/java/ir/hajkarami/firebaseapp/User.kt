package ir.hajkarami.firebaseapp

data class User(
    val name : String,
    val email: String
) {
    constructor() : this("", "")
}



