package sheridan.sharmupm.restmanagerapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import sheridan.sharmupm.restmanagerapplication.R
import sheridan.sharmupm.restmanagerapplication.model.Menu

class MenuListFragment : Fragment(){
    private lateinit var colorList: List<Menu>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_menu_list, container, false)

        colorList = listOf(
            Menu("Channa Masala"), Menu("Paneer"), Menu("Paranthi"),
            Menu("Naan"), Menu("Samosa"), Menu("Alloo Tikki")

        )

        val recyclerView: RecyclerView = view.findViewById(R.id.color_recycler_view)
//        val adapter = ColorAdapter(colorList, ColorAdapter.OnClickListener { colorName ->
//            view.findNavController().navigate(
//                ColorListFragmentDirections.actionColorListFragmentToColorDetailFragment(colorName)
//            )
//        })
        //recyclerView.adapter = adapter

        return view
    }
}