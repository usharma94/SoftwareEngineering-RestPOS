package sheridan.sharmupm.restmanagerapplication.application.userDetail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import sheridan.sharmupm.restmanagerapplication.application.models.User

class UserDetailViewModel( user: User, app: Application) : AndroidViewModel(app) {

    private val _selectedUser = MutableLiveData<User>()

    val selectedUser: LiveData<User>
        get() = _selectedUser

    init {
        _selectedUser.value = user
    }
}