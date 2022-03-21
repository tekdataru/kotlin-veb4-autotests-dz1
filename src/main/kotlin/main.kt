fun main(){
    val sumNow = 250 * 100   //сумма оплаты в копейках
    val sumPast = 1000 * 100
    var typeOfCard = "Visa"
    typeOfCard = "Vk Pay"
    //typeOfCard = "Visa"
    //typeOfCard = "MasterCard"

    val sumFee = getSumOfFee(sumNow, sumPast, typeOfCard)
    if (sumFee < 0) {
        println("Превышены лимиты переводов")
        return
    }

    println("Сумма оплаты: ${sumNow/100} ₽, сумма прошлых платежей: ${sumPast/100} ₽, сумма комиссии: ${sumFee/100} ₽")
}

fun getSumOfFee(sumNow:Int, sumPast:Int = 0, typeOfCard:String = "Vk Pay"):Int{

    var sumFee = 0;
    val sumMonth = sumNow + sumPast

    when {
        typeOfCard == "Vk Pay" -> {
            sumFee = 0
        }
        typeOfCard == "Visa" || typeOfCard == "Мир" -> {
            sumFee = sumNow + sumNow / 10000 * 75
            if (sumFee < 3500) sumFee = 3500
        }
        else -> {
            if (sumMonth > 30000 && sumMonth <= 7500000) {
                sumFee = 0;
            } else {
                sumFee = sumNow / 1000 * 6 + 20 * 100
            }

        }
    }

    if (typeOfCard == "Vk Pay"){
        if (sumNow > 1500000) sumFee = -1
        if (sumMonth > 4000000) sumFee = -1
    } else {
        if (sumNow > 15000000) sumFee = -1
        if (sumMonth > 60000000) sumFee = -1
    }

    return sumFee
}