package sheridan.sharmupm.restmanagerapplication.presentation.login

/**
 * User details post authentication that is exposed to the UI
 */
data class LoggedInUserView(
    val username: String
    //... other data fields that may be accessible to the UI
)