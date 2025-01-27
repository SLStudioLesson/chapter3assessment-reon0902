package com.recipeapp.model;

import java.util.ArrayList;
public class Recipe {
    private String Recipename;
    private ArrayList<Ingredient>ingredient;
    
    
    public Recipe(String Recipename,ArrayList<Ingredient> ingredient) {
        this.Recipename = Recipename;
        this.ingredient=ingredient;
    }

    public String getRecipeName() {
        return Recipename;
    }
    public void setRecipeName(String Recipename){
        this.Recipename = Recipename;
        
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