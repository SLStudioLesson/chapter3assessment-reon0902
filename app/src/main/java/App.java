import com.recipeapp.datahandler.CSVDataHandler;
import com.recipeapp.datahandler.DataHandler;
import com.recipeapp.datahandler.JSONDataHandler;
import com.recipeapp.ui.RecipeUI;
import java.io.*;

public class App {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose the file format:");
            System.out.println("1. CSV");
            System.out.println("2. JSON");
            System.out.print("Select (1/2): ");
            String choice = reader.readLine();
            
            if(choice.equals(1)){
                CSVDataHandle csv=new CSVDataHandler();
                RecipeUI ui = new RecipeUI();
                    ui.displayMenu(csv);
                }else if(choice.equals(2)){
                    JSonDatahandler JSON=new JSonDatahandler();
                    RecipeUI ui = new RecipeUI();
                    ui.displayMenu(JSON);
                }else{
                    CSVDataHandle csv=new CSVDataHandler();
                    RecipeUI ui = new RecipeUI();
                    ui.displayMenu(csv);
                }
            
                
                
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    
    
    
    }

// ユーザーの選択に応じて、CSVDataHandlerまたはJSONDataHandlerのインスタンスを生成する
// 「1」を選択した場合、CSVDataHandlerインスタンスを生成する
// 引数が0個のコンストラクタを実行するものとする
// 「2」を選択した場合、JSONDataHandlerインスタンスを生成する
// 不正な入力（「1」「2」以外）が与えられた場合、CSVDataHandlerインスタンスを生成する
// 選択されたデータハンドラーをcom/recipeappパッケージのRecipeUIに渡し、displayMenuメソッドを呼び出してメインメニューを表示します。