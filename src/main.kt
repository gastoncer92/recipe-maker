fun main(){
    val mainText:String="""
        :: Bienvenido a Recipe Maker ::

        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    do {
        println(mainText)
        val response:String?= readLine()
        when(response){
            "1" -> {makeRecipe()}
            "2" -> {viewRecipe()}
            "3" -> println("¡Gracias por usar Recipe Maker!")
        }
    }while (response!="3")
}
fun makeRecipe(){
    val recipeText:String="""
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent()
    println(recipeText)
}
fun viewRecipe(){
    println("Ver mis recetas")
}