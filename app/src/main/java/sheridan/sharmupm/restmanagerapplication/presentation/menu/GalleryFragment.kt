package sheridan.sharmupm.restmanagerapplication.presentation.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import sheridan.sharmupm.restmanagerapplication.R
import sheridan.sharmupm.restmanagerapplication.application.models.MenuItem

//class GalleryFragment : Fragment() {
//
//    private lateinit var galleryViewModel: GalleryViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        galleryViewModel =
//                ViewModelProvider(this).get(GalleryViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
//        val textView: TextView = root.findViewById(R.id.text_gallery)
//        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
//}

class GalleryFragment : Fragment() {

    private lateinit var colorList: List<MenuItem>

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_gallery, container, false)

        colorList = listOf(
                MenuItem(false, "Spicy Channa Masala", "Channa Masala", 12.99, false),
                MenuItem(false, "Paneer", "Paneer", 10.99, false),
                MenuItem(false, "Paranthi", "Paranthi", 5.99, false),
                MenuItem(false, "Naan","Naan", 5.99, false),
                MenuItem(false, "Samosa", "Samosa", 5.99, false),
                MenuItem(false, "Alloo Tikki","Alloo Tikki", 5.99, false)

        )

        val recyclerView: RecyclerView = view.findViewById(R.id.color_recycler_view)
        val adapter = MenuAdapter(colorList, MenuAdapter.OnClickListener { colorName ->
//            view.findNavController().navigate(
//                            GalleryFragmentDirections.actionNavGalleryToMenuDetailFragment(colorName)
//
//            )
        })
        recyclerView.adapter = adapter

        return view
    }

}