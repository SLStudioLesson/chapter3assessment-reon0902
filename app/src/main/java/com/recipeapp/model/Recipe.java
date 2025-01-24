package main.java.com.recipeapp.model;

import java.utill.ArrayList;
public class Recipe {
    private String Recipename;
    private ArrayList<Ingredient>ingredient;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Ingredient> getIngredient() {
        return ingredient;
    }
    public void setIngredient(ArrayList<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }


}





// Recipe	name	String	レシピの名前
// ingredients	ArrayList<Ingredient>	レシピの材料リスト
// メソッド名	戻り値の型	引数	説明
// コンストラクタ		String name, ArrayList<Ingredient> ingredients	nameフィールドとingredientsフィールドそれぞれに、同名の引数を代入する
// getName	String	なし	nameフィールドを返す
// getIngredients	ArrayList<Ingredient>	なし	ingredientsフィールドを返す