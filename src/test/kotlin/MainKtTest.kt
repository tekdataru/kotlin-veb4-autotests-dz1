import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getSumOfFee() {
        val res = getSumOfFee(250, 100,  "Vk Pay")
        assertEquals(0, res)
    }

    @Test
    fun main() {
    }
}