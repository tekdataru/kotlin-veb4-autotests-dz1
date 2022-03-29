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

    @Test
    fun `test getSumOfFee 0 0`() {
        val res = getSumOfFee(0, 0)
        assertEquals(0, res)
    }

    @Test
    fun `test getSumOfFee 5000 3000 empty`() {
        val res = getSumOfFee(5000, 3000)
        assertEquals(0, res)
    }

    @Test
    fun `test getSumOfFee 1 0 mir`() {
        val res = getSumOfFee(1, 0,  "Mir")
        assertEquals(2000, res)
    }

    @Test
    fun `test getSumOfFee month 999 999 самый важный тест`() {
        val res = getSumOfFee(990, 990,  "Union pay")
        assertEquals(2000, res)
    }

    @Test
    fun `test getSumOfFee month 999 999 самый важный тест2`() {
        val res = getSumOfFee(0,0 , "adf" )
        assertEquals(2000, res)
    }




}