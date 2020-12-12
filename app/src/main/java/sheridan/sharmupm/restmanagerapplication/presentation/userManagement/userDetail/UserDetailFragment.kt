package sheridan.sharmupm.restmanagerapplication.presentation.userManagement.userDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import sheridan.sharmupm.restmanagerapplication.R
import sheridan.sharmupm.restmanagerapplication.application.userDetail.UserDetailViewModel
import sheridan.sharmupm.restmanagerapplication.application.userDetail.UserDetailViewModelFactory

/**
 * A simple [Fragment] subclass.
 * Use the [UserManagementFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserDetailFragment : Fragment() {

    private lateinit var userDetailViewModel: UserDetailViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        userDetailViewModel = ViewModelProvider(this, UserDetailViewModelFactory())
//            .get(UserDetailViewModel::class.java)
    }


    companion object {

    }

}