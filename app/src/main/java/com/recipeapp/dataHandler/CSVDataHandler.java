package main.java.com.recipeapp.dataHandler;
import java.util.ArrayList;
import com.recipeapp.model.Recipe;
import com.recipeapp.ui.recipeUI;

public class CSVDataHandler implements dataHandler{
    public String Filepass;
public CSVDataHandler(){
    this.Filepass=app/src/main/resources/recipes.csv;

}
public CSVDataHandler(String Filepass){
    this.Filepass=Filepass;
}
@Override
public String getmode(){
    return "csv";
}
@Override
 public ArrayList<Recipe> readData(){
    return null;
 }
@Override
public void writeData(Recipe recipe){
    }

    @Override
public ArrayList<Recipe>seachData(String keyword){
    return null;
}

}















}
