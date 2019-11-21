package kz.photographerfinder.data

data class Photographer(
    val id: Long,
    val avatarUrl: String,
    val nikName: String,
    val FirstName: String,
    val LastName: String,
    val contact: List<String>,
    val liks: Long,
    val rating: Long
)