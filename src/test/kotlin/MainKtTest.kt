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
    fun `test getSumOfFee 5000 empty empty`() {
        val res = getSumOfFee(5000)
        assertEquals(0, res)
    }

    @Test
    fun `test getSumOfFee 5000 empty "Visa"`() {
        val res = getSumOfFee(5000, typeOfCard = "Visa")
        assertEquals(5000, res)
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


    @Test
    fun `test getSumOfFee Mir kirilitsey`() {
        val res = getSumOfFee(6000,1000 , "Мир" )
        assertEquals(6000, res)
    }

    @Test
    fun `test getSumOfFee Month lim more 7500000`() {
        val res = getSumOfFee(6000000,7500000 , "Мир" )
        assertEquals(6045000, res)
    }

    @Test
    fun `test getSumOfFee sum ones Vk Pay more 1500000`() {
        val res = getSumOfFee(7500001,1000 , "Мир" )
        assertEquals(7556251, res)
    }

    @Test
    fun `test getSumOfFee sum Vk Pay month 4000000`() {
        val res = getSumOfFee(4000001,1000 , "Vk Pay" )
        assertEquals(-1, res)
    }

    @Test
    fun `test getSumOfFee sum Vk Pay ones more 15000000`() {
        val res = getSumOfFee(15000001,0 , "Vk Pay" )
        assertEquals(-1, res)
    }

    @Test
    fun `test getSumOfFee sum Vk Pay month more 60000000`() {
        val res = getSumOfFee(60000000,1000 , "Vk Pay" )
        assertEquals(-1, res)
    }




}