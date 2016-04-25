package pe.devpicon.android.miaplicacionkotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView


/**
 * Created by Armando on 25/04/2016.
 */
class MyAdapter(val items: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}