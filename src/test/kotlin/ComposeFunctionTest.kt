import org.junit.jupiter.api.Test
import kotlin.math.pow
import kotlin.test.assertEquals

class ComposeFunctionTest {

    @Test
    fun `compose functions string, int and double`() {
        val f = { i: Int ->
            i * 2.3
        }
        val g = { i: String ->
            i.toInt()
        }
        val fog = f.compose(g)
        assertEquals(fog("20"), 46.0)
    }

    @Test
    fun `compose functions`() {
        val f = { i: Int ->
            30.0
        }
        val g = { i: String ->
            10
        }
        val fog = f.compose(g)
        assertEquals(fog("20"), 30.0)
    }

    @Test
    fun `compose generic functions`() {
        val f = { x: Double ->
            x.pow(2)
        }
        val g = { x: Double ->
            2 * x
        }
        val fog = f o g
        // we know that fog(x) = 4 * x^2
        assertEquals(fog(2.0), 16.0)
    }
}