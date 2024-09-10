package br.com.androidintro.financeiro.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.androidintro.financeiro.R
import br.com.androidintro.financeiro.interfaces.FinanceiroInterface

class FinanceiroAdapter(private val financList: List<FinanceiroInterface>)
    : Adapter<FinanceiroAdapter.FinancViewHolder>() {

        class FinancViewHolder(view: View) : ViewHolder(view) {
            val context: Context = view.context
            val symbol:TextView = view.findViewById(R.id.item_financ_symbol)
            val name:TextView = view.findViewById(R.id.item_financ_name)
            val price: TextView = view.findViewById(R.id.item_financ_price)
            val variation: TextView = view.findViewById(R.id.item_financ_variation)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FinancViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_financeiro, parent, false)
        return FinancViewHolder(view)
    }

    override fun getItemCount(): Int = financList.size

    override fun onBindViewHolder(holder: FinancViewHolder, position: Int) {
        holder.symbol.text = financList[position].symbol
        holder.name.text = financList[position].name
        holder.price.text = financList[position].price.toString()
        holder.variation.text = financList[position].variation.toString()

        if(financList[position].variation>=0) {
            holder.variation.setTextColor(holder.context.getColor(R.color.positivo_variation))
        } else {
            holder.variation.setTextColor(holder.context.getColor(R.color.negativo_variation))
        }
    }
}