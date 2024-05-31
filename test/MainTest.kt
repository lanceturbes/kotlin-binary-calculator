import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun isCalculatorAccurate() {
        assertEquals("011111111", toBinaryString(255u))
        assertEquals("0101000001", toBinaryString(321u))
        assertEquals("01000010110", toBinaryString(534u))
    }
}