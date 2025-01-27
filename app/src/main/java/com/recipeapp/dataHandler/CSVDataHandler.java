package com.recipeapp.datahandler;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.recipeapp.model.Ingredient;
import com.recipeapp.model.Recipe;

public class CSVDataHandler implements DataHandler {
    public String Filepass;

    public CSVDataHandler() {
        this.Filepass = "app/src/main/resources/recipes.csv";

    }

    public CSVDataHandler(String Filepass) {
        this.Filepass = Filepass;
    }

    @Override
    public String getMode() {
        return "csv";
    }

    @Override
    public ArrayList<Recipe> readData()  {
        //recipe型のArrayListを作成
        ArrayList<Recipe> recipes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(Filepass))) { //ファイルの読み込み
            String line;
            while ((line = reader.readLine()) != null) {
                ArrayList<Ingredient> ingredients = new ArrayList<>();
                String[] pairs =line.split(",");
                for (int k=1;k<pairs.length;k++) {

                    Ingredient ingredient = new Ingredient(pairs[k]);
                    ingredients.add(ingredient);
                
                }
                Recipe recipe = new Recipe(pairs[0],ingredients);
                recipes.add(recipe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recipes;
        }
    // ### 前提
    
    // * シグネチャおよび返り値は `void writeData(Recipe recipe)`であることとする。
    @Override
    public void writeData(Recipe recipe)throws IOException{
        // ### 処理手順
        
        // 1. ファイルを読み込む
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("app/src/main/resources/recipes.csv",true))){
            // 2. recipeの名前を書き込む
            writer.write(recipe.getRecipeName());
            // 3. recipeより材料情報(以下、ingredients)を取得する
            ArrayList<Ingredient> ingredients=recipe.getIngredient();
            // 4. ingredientsのデータ件数分繰り返し、次の処理を行う
            for(int i=0;i<recipe.getIngredient().size();i++){
                // 4-1. カンマを書き込む
                
                writer.write(",");
            
                // 4-2. 要素(以下、Ingredientオブジェクト)を1件取得する
                writer.write(ingredients.get(i).getName()); 
                
                
            
        }
    }
}
    @Override
    public ArrayList<Recipe> seachData(String keyword) {
        return null;
    }

}