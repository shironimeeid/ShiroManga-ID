package org.koitharu.kotatsu.sync.domain

data class SyncAuthResult(
	val host: String,
	val email: String,
	val password: String,
	val token: String,
)
