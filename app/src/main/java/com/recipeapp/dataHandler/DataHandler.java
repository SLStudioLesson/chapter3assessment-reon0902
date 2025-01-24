package main.java.com.recipeapp.dataHandler;
import java.io.IOException;
import java.util.ArrayList;
import com.recipeapp.model.Recipe;
import com.recipeapp.ui.recipeUI;
public interface DataHandler {
    public String getMode();
    public ArrayList<Recipe> readdata()throws IOException;
    public void writeData(Recipe recipe) throws IOException;
    public ArrayList<Recipe>seachData(String keyword)throws IOException;
    // DataHandler	getMode	String	なし	なし	現在のモードを返します。
    // readData	ArrayList<Recipe>	なし	IOException	レシピデータを読み込み、Recipeオブジェクトのリストとして返します。
    // writeData	void	Recipe recipe	IOException	指定されたRecipeオブジェクトを追加します。
    // searchData	ArrayList<Recipe>	String keyword	IOException	指定されたキーワードでレシピを検索し、一致するRecipeオブジェクトのリストを返します。

    
}
























