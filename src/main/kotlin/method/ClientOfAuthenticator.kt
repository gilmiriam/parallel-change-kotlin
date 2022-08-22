package method

class ClientOfAuthenticator {
    private var authenticationService: AuthenticationService? = null

    fun main(args: Array<String>) {
        ClientOfAuthenticator(AuthenticationService())
    }

    fun ClientOfAuthenticator(authenticationService: AuthenticationService?) {
        this.authenticationService = authenticationService
    }

    fun run() {
        val authenticated = authenticationService!!.isAuthenticated(33)
        println("33 is authenticated = $authenticated")
    }
}