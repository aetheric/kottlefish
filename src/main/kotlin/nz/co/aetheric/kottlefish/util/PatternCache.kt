package nz.co.aetheric.kottlefish.util

import java.util.regex.Pattern

/**
 * Handles matching strings against regex patterns directly, but includes caching.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
object PatternCache {

	val cache: MutableMap<String, Pattern> = mutableMapOf();

	fun String.matches(pattern: String, flags: Int = 0): Boolean {

		if (!cache.contains(pattern)) {
			cache[pattern] = Pattern.compile(pattern, flags);
		}

		return this.matches(cache[pattern]!!.toRegex());

	}

}
