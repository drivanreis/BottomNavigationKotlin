package br.com.androidintro.financeiro.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.androidintro.financeiro.R
import br.com.androidintro.financeiro.adapters.FinanceiroAdapter
import br.com.androidintro.financeiro.models.FinancDatabase


class FinanceiroFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_financeiro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.news_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    override fun onStart() {
        super.onStart()
        val finacList = FinancDatabase.findAll()
        val financAdapter = FinanceiroAdapter(finacList)
        recyclerView.adapter = financAdapter
    }

}