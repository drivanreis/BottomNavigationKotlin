package br.com.androidintro.financeiro.interfaces

data class FinanceiroInterface(
    val id:Int,
    val symbol:String,
    val name: String,
    val price: Double,
    val variation: Double,
    val volume: Int
)
