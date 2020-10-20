package ch.tutteli.atrium.api.infix.en_GB.samples

import ch.tutteli.atrium.api.infix.en_GB.toThrow
import ch.tutteli.atrium.api.verbs.internal.expect

fun fails(b: () -> Unit) = expect(b).toThrow<AssertionError>()
