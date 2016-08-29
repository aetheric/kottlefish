package nz.co.aetheric.kottlefish.ext

/**
 * Generates a resource path by converting the class package into a directory structure.
 * @returns The converted package name surrounded by '/' characters.
 */
object ClassExt {

	fun Class<*>.getResourcePath(): String {
		return "/${this.`package`.name.replace('.', '/')}/";
	}

	fun Class<*>.isAssignableTo(cls: Class<*>): Boolean {
		return cls.isAssignableFrom(this);
	}

}
