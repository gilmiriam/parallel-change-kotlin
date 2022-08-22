package method

import org.junit.jupiter.api.Test
import kotlin.test.*

class AuthenticationServiceTest {
    @Test
    @Throws(Exception::class)
    fun administratorIsAlwaysAuthenticated() {
        val service = AuthenticationService()
        val adminId = 12345
        assertTrue(service.isAuthenticated(adminId))
    }

    @Test
    @Throws(Exception::class)
    fun normalUserIsNotAuthenticatedInitially() {
        val service = AuthenticationService()
        val normalUserId = 11111
        assertFalse(service.isAuthenticated(normalUserId))
    }
}