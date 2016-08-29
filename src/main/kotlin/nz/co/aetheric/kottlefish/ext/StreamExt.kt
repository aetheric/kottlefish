package nz.co.aetheric.kottlefish.ext

import java.util.stream.Stream

/**
 * Adds some useful extension methods to [Stream].
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
object StreamExt {

	fun <T> Stream<T>.toList(): List<T> = this.collect({
		mutableListOf()

	}, { list, item ->
		list.add(item)

	}, { list, otherList ->
		list.addAll(otherList)

	})

}
