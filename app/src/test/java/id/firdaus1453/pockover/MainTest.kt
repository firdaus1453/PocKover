package id.firdaus1453.pockover

import org.junit.Test

class MainTest {
    @Test
    fun testHello() {
        val m = Main()
        assert(m.greet(m.world()).contains("world"))
        assert(m.helloWorld() == "Hello world!")
    }
}