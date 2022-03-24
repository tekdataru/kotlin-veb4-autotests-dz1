import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getSumOfFee() {
        val res = getSumOfFee(250, 100,  "Vk Pay")
        assertEquals(0, res)
    }

    @Test
    fun `test getSumOfFee Visa`() {
        val res = getSumOfFee(250, 100,  "Visa")
        assertEquals(3500, res)
    }

    @Test
    fun `test getSumOfFee Mastercard`() {
        val res = getSumOfFee(250, 100,  "Mastercard")
        assertEquals(2000, res)
    }

    @Test
    fun `test getSumOfFee month limit more than 100 k`() {
        val res = getSumOfFee(250, 100000,  "Mastercard")
        assertEquals(0, res)
    }


}