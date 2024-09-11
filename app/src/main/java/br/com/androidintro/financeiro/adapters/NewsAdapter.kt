package br.com.androidintro.financeiro.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.androidintro.financeiro.R
import br.com.androidintro.financeiro.interfaces.NewsInterface

class NewsAdapter (private val newsList: List<NewsInterface>)
    : Adapter<NewsAdapter.NewsViewHolder>(){
        class NewsViewHolder(view: View): ViewHolder(view) {
            val context: Context = view.context
            val title: TextView = view.findViewById(R.id.item_news_title)
            val summary: TextView = view.findViewById(R.id.item_news_summary)
            val category: TextView = view.findViewById(R.id.item_news_category)
            val categoriColor: View = view.findViewById(R.id.item_news_category_color)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news,parent,false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.title.text = newsList[position].title
        holder.summary.text = newsList[position].summary
        holder.category.text = newsList[position].category

        when(newsList[position].category){
            "Economia" -> holder.categoriColor.setBackgroundColor(holder.context.getColor(R.color.economy_color))
            "Política" -> holder.categoriColor.setBackgroundColor(holder.context.getColor(R.color.politic_color))
            "Esporte" -> holder.categoriColor.setBackgroundColor(holder.context.getColor(R.color.spect_color))
        }
    }
}