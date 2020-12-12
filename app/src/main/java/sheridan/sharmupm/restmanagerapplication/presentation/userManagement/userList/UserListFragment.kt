package sheridan.sharmupm.restmanagerapplication.presentation.userManagement.userList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import sheridan.sharmupm.restmanagerapplication.R
import sheridan.sharmupm.restmanagerapplication.application.userList.UserListViewModel
import sheridan.sharmupm.restmanagerapplication.application.userList.UserListViewModelFactory


/**
 * A simple [Fragment] subclass.
 * Use the [UserListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserListFragment : Fragment() {

    private lateinit var userListViewModel: UserListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        userListViewModel = ViewModelProvider(this, UserListViewModelFactory())
//            .get(UserListViewModel::class.java)
    }


    companion object {

    }
}