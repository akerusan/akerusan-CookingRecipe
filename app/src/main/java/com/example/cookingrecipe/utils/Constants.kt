package com.example.cookingrecipe.utils

class Constants {

    companion object {

        const val BASE_URL = "https://api.spoonacular.com"
        const val BASE_IMAGE_URL = "https://spoonacular.com/cdn/ingredients_100x100/"
        const val API_KEY = "d1ccb03f5cb043e5ad1998d7c014a510"

        const val RESULT_BUNDLE_KEY = "recipeBundle"

        // API queries
        const val QUERY_NUMBER = "number"
        const val QUERY_API_KEY = "apiKey"
        const val QUERY_TYPE = "type"
        const val QUERY_DIET = "diet"
        const val QUERY_ADD_RECIPE_INFORMATION = "addRecipeInformation"
        const val QUERY_FILL_INGREDIENTS = "fillIngredients"

        const val QUERY_SEARCH = "query"

        //DB
        const val DATABASE_NAME = "recipes_database"
        const val RECIPES_TABLE = "recipes_table"
        const val FAVORITE_RECIPES_TABLE = "favorite_recipes_table"

        // Bottom sheet preferences
        const val DEFAULT_RECIPES_NUMBER = "50"
        const val DEFAULT_MEAL_TYPE = "main course"
        const val DEFAULT_DIET_TYPE = "gluten free"

        const val PREFERENCES_NAME = "recipes_preferences"
        const val PREFERENCES_MEAL_TYPE = "mealType"
        const val PREFERENCES_MEAL_TYPE_ID = "mealTypeId"
        const val PREFERENCES_DIET_TYPE = "dietType"
        const val PREFERENCES_DIET_TYPE_ID = "dietTypeId"
        const val PREFERENCES_BACK_ONLINE = "back_online"
    }

}