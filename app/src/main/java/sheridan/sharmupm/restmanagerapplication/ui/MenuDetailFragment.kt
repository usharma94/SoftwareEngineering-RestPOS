package sheridan.sharmupm.restmanagerapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import sheridan.sharmupm.restmanagerapplication.R
import sheridan.sharmupm.restmanagerapplication.model.Menu

class MenuDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_menu_detail, container, false)

//        val colorNameTextView: TextView = view.findViewById(R.id.color_name_detail_text_vew)
//        val color: Menu = MenuDetailFragmentArgs.fromBundle(arguments!!).colorDetailFragmentArgs
//        colorNameTextView.text = color.menuName

        return view
    }


}