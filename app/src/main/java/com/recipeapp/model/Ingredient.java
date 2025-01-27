package com.recipeapp.model;

import java.util.ArrayList;

public class Ingredient {
    private String name;
    public Ingredient(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Ingredient name String 材料の名前
    // メソッド名 戻り値の型 引数 説明
    // コンストラクタ String name nameフィールドに、同名の引数を代入する
    // getName String なし nameフィールドを返す

}
