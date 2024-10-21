package dev.campi.architecturelayers.data


// aquí pondriamos la anotación @Serializable, @Parcelize o @JsonClass para serializar la clase
data class CustomerDTO(
    val id: Int,
    val name: String,
    val email: String,
    val age: Int,
    val address: String,
    val phone: String
)
