package br.com.androidintro.financeiro.models

import br.com.androidintro.financeiro.interfaces.FinanceiroInterface

object FinancDatabase {

    private val FinancList = listOf(
        FinanceiroInterface(1, "PETR4", "Petrobras", 12.34, 1.2, 120800),
        FinanceiroInterface(2, "VALE3", "Vale", 45.50, -0.5, 808750),
        FinanceiroInterface(3, "ITUB4", "Itaú Unibanco", 28.80, 0.8, 450600),
        FinanceiroInterface(4, "BBDC4", "Bradesco", 22.90, -0.2, 321500),
        FinanceiroInterface(5, "BBAS3", "Banco do Brasil", 35.40, 0.9, 540300),
        FinanceiroInterface(6, "ABEV3", "Ambev", 16.20, 1.5, 250900),
        FinanceiroInterface(7, "ELET3", "Eletrobras", 40.15, 0.4, 187500),
        FinanceiroInterface(8, "CSNA3", "CSN", 10.30, -1.0, 98000),
        FinanceiroInterface(9, "SUZB3", "Suzano", 56.90, 2.1, 334400),
        FinanceiroInterface(10, "JBSS3", "JBS", 23.45, 0.3, 210500),
        FinanceiroInterface(11, "RAIL3", "Rumo", 15.85, 1.7, 109000),
        FinanceiroInterface(12, "WEGE3", "Weg", 32.70, -0.6, 440600),
        FinanceiroInterface(13, "GGBR4", "Gerdau", 22.15, 0.5, 210700),
        FinanceiroInterface(14, "VVAR3", "Via Varejo", 6.70, -1.2, 135600),
        FinanceiroInterface(15, "MGLU3", "Magazine Luiza", 3.55, 2.4, 840500)
    )

    fun findAll() = FinancList

    fun findById(id:Int) = FinancList.find { it.id == id }

    fun findBySymbol(symbol: String) = FinancList.find { it.symbol == symbol }
}
