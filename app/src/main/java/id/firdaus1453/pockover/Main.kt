package id.firdaus1453.pockover

class Main {
    fun helloWorld(): String = "Hello ${world()}!"

    fun greet(s: String) = "Hello $s"

    inline fun world() = "world"
}