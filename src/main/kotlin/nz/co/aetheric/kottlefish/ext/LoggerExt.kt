package nz.co.aetheric.kottlefish.ext

import nz.co.aetheric.kottlefish.ext.LoggerExt.Level.*
import org.slf4j.Logger

/**
 * Provides additional logging functionality to [Logger].
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
object LoggerExt {

	enum class Level {
		ERROR,
		WARN,
		INFO,
		DEBUG,
		TRACE
	}

	inline fun Logger.log(level: Level, getMessage: () -> String): Unit = when (level) {
		TRACE -> if (isTraceEnabled) trace(getMessage()) else {}
		DEBUG -> if (isDebugEnabled) debug(getMessage()) else {}
		INFO  -> if (isInfoEnabled)  info(getMessage())  else {}
		WARN  -> if (isWarnEnabled)  warn(getMessage())  else {}
		ERROR -> if (isErrorEnabled) error(getMessage()) else {}
	}

}
