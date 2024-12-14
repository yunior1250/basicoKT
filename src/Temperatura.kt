fun main() {
    // Celsius to Fahrenheit
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") {
        it * 9 / 5 + 32 }
    // Kelvin to Celsius
    printFinalTemperature(350.0,"Kelvin","Celsius"){
        it-273.15}
    // Fahrenheit to Kelvin
    printFinalTemperature(10.0 ,"Fahrenheit", "Kelvin"){(it-32)*5/9+273.15}

    }

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement =
        String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}