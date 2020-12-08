package chapter3

import chapter1.Payment

fun combine(payment1: Payment, payment2: Payment): Payment =
    if (payment1.creditCard == payment2.creditCard)
        Payment(payment1.creditCard, payment1.amount + payment2.amount)
    else
        throw IllegalStateException("Cards don't match")
