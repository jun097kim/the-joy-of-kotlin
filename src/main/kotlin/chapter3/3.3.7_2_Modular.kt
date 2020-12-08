package chapter3.modular

val taxRate = 0.09

val addTax = { taxRate: Double ->
    { price: Double ->
        price + price * taxRate
    }
}

fun addTaxFun(taxRate: Double): (Double) -> Double {
    return { price: Double ->
        price + price * taxRate
    }
}

fun main() {
    println(addTax(taxRate)(12.0))
}