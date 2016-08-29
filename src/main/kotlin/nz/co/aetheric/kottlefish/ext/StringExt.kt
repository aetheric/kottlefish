package nz.co.aetheric.kottlefish.ext

import org.apache.commons.lang3.StringUtils

/**
 * Extensions for java.lang.String et al.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
object StringExt {

	fun String.containsAny(searchChars: String): Boolean
			= StringUtils.containsAny(this, searchChars);

	fun String.containsAny(matchList: Iterable<String>): Boolean
			= matchList.any { this.contains(it) };

}
