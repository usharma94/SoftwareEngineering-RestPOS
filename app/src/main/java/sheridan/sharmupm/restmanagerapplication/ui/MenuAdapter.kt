package sheridan.sharmupm.restmanagerapplication.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import sheridan.sharmupm.restmanagerapplication.R
import sheridan.sharmupm.restmanagerapplication.model.Menu

class MenuAdapter(
    private val colorList: List<Menu>,
    private val onClickListener: OnClickListener
) :
    ListAdapter<Menu, MenuAdapter.ColorViewHolder>(
        DiffCallback
    ) {

    class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val colorNameTextView: TextView = itemView.findViewById(R.id.item_color_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        return ColorViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_color,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        val color: Menu = colorList[position]
        holder.colorNameTextView.text = color.menuName

        holder.itemView.setOnClickListener{
            onClickListener.onClick(color)
        }
    }

    override fun getItemCount() = colorList.size

    class OnClickListener(val clickListener: (color: Menu) -> Unit) {
        fun onClick(color: Menu) = clickListener(color)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Menu>() {
        override fun areItemsTheSame(oldItem: Menu, newItem: Menu): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Menu, newItem: Menu): Boolean {
            return oldItem.menuName == newItem.menuName
        }
    }
}