package kz.photographerfinder.presentation.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.photographerfinder.R
import kz.photographerfinder.data.Photographer

class PhotographerAdapter(private val listPhotographer: List<Photographer>): RecyclerView.Adapter<PhotographerAdapter.ViewHolder>() {

    override fun getItemCount() = listPhotographer.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_top_photographer, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}