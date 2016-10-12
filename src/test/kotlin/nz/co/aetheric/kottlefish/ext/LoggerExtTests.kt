package nz.co.aetheric.kottlefish.ext

import nz.co.aetheric.kottlefish.ext.LoggerExt.Level
import nz.co.aetheric.kottlefish.ext.LoggerExt.log
import org.junit.Assert
import org.junit.Assume
import org.junit.Test
import org.slf4j.LoggerFactory

/**
 * Tests for [LoggerExt]
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
class LoggerExtTests {

	@Test
	fun testTraceDoesntFireWhenDisabled() {
		val logger = LoggerFactory.getLogger("testLogger")

		Assume.assumeFalse("Trace should not be enabled for this test.", logger.isTraceEnabled)

		logger.log(Level.TRACE) {
			Assert.fail("This shouldn't be executed")
			throw IllegalStateException("The preceding statement should throw an exception in all cases if called.")
		}

	}

	@Test
	fun testInfoFiresWhenEnabled() {
		val logger = LoggerFactory.getLogger("testLogger")

		Assume.assumeTrue("Info should be enabled for this test.", logger.isInfoEnabled)
		var successful = false

		logger.log(Level.INFO) {
			successful = true
			"This should be printed!"
		}

		Assert.assertTrue("The closure should be thrown when logging enabled", successful)

	}

}
