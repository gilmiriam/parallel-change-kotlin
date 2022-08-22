package method

class AnotherClientOfAuthenticator {
    fun unusedClientCode() {
        try {
            AuthenticationService().isAuthenticated(3545)
        } catch (e: Exception) {
            // ignored
        }
    }
}