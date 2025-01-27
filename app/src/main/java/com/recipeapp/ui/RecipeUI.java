package com.recipeapp.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import com.recipeapp.model.Ingredient;
import com.recipeapp.model.Recipe;
import com.recipeapp.datahandler.DataHandler;

public class RecipeUI {
    private BufferedReader reader;
    private DataHandler dataHandler;

    public RecipeUI(DataHandler dataHandler) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.dataHandler = dataHandler;
    }

    public void displayMenu() {

        System.out.println("Current mode: " + dataHandler.getMode());

        while (true) {
            try {
                System.out.println();
                System.out.println("Main Menu:");
                System.out.println("1: Display Recipes");
                System.out.println("2: Add New Recipe");
                System.out.println("3: Search Recipe");
                System.out.println("4: Exit Application");
                System.out.print("Please choose an option: ");

                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        displayRecipes();
                        break;
                    case "2":
                        addNewRecipe();
                        break;
                    case "3":
                        break;
                    case "4":
                        System.out.println("Exiting the application.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error reading input from user: " + e.getMessage());
            }
        }
    }

    private void displayRecipes() {
        try {
            ArrayList<Recipe> recipes = dataHandler.readData();
            if (recipes.isEmpty()) {
                System.out.println("No recipes available.");
            } else {
                System.out.println("Recipes :");
                // 書き直し
                System.out.println("-----------------------------------");

                // 書き直し
            }
            for (Recipe recipe : recipes) {
                System.out.println("Recipe Name: " + recipe.getRecipeName());
                ArrayList<Ingredient> listIngredients = recipe.getIngredient();
                System.out.print("Main Ingredients: ");
                for (int k = 0; k < listIngredients.size(); k++) {
                    System.out.print(listIngredients.get(k).getName());
                    if (k < listIngredients.size() - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println();
                System.out.println("-----------------------------------");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // ## RecipeUI.

    // ### 処理手順
    private void addNewRecipe() {
        try  {
            // 1. `Adding a new recipe.`と画面に出力する（改行アリ）
            System.out.println("\nAdding a new recipe.");
            // 2. `Enter recipe name: `と画面に出力する（改行ナシ）
            System.out.println("Enter recipe name: ");
            // 3. 文字入力処理を実行し、変数（以下、recipeName）に代入する
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String recipeName = reader.readLine();
            // 4. 後続処理で利用する変数の初期データを用意する
            int k = 0;
            // 4-1. 材料情報入力用の変数を用意する（以下、ingredientInput）
            String ingredientInput = "";
            // 4-2. 材料オブジェクトのリストを生成する（以下、ingredients）
            ArrayList<Ingredient> ingredients = new ArrayList<>();
            // 5. `Enter ingredients (type 'done' when finished):`と画面に出力する（改行アリ）
            System.out.println("Enter ingredients (type 'done' when finished): ");
            // 6. 以下の処理を繰り返す
            while (true) {
                // 6-1. `Ingredient: `と画面に出力する（改行ナシ）
                // 6-2. 文字入力処理を実行し、ingredientInputに代入する
                // 6-3. ingredientInputが `done`であった場合、次の処理をする
                // 6-3-1. 繰り返しを修了する
                System.out.println("Ingredient: ");
                ingredientInput = reader.readLine();
                if (ingredientInput.equals("done")) {
                    break;
                }
                Ingredient ingredient = new Ingredient(ingredientInput);
                ingredients.add(ingredient);
            }
            // 6-4. Ingredientオブジェクト（以下、ingredient）を生成する
            // 6-4-1. 材料名にはingredientInputを指定する

            // 6-5. ingredientをingredientsに追加する
            // 7. Recipeオブジェクト(以下、recipe)を生成する
            // 7-1. レシピ名は recipeName を指定する
            // 7-2. 材料リストは ingredientsを指定する
            Recipe recipe = new Recipe(recipeName, ingredients);
            // 8. writeDataに recipeを渡す ここで書き込み
            dataHandler.writeData(recipe);
            // 9. `Recipe added successfully.`を画面に出力する（改行アリ）
            System.out.println("\nRecipe added successfully.");
            // 10. 上記処理のいずれかの中でIOExceptionが発生した場合は次の処理を行う
        } catch (IOException e) {
            // 10-1. `Failed to add new recipe: `を画面に出力する（改行ナシ）
            System.out.print("Failed to add new recipe: ");
            // 10-2. 例外メッセージを出力する（改行アリ）
            System.out.println(e.getMessage());
            // -----------終了
            
        
        }

    }
}
