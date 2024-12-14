fun main() {
    val brunoSong = Song("We Dont talk About Bruno", "Bruno Mars", 2024, 1_0)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}


data class Song(
    val title: String,
    val artists: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 100

    fun printDescription() {
        println("$title, performed by $artists, was released in  $yearPublished.")
    }

}