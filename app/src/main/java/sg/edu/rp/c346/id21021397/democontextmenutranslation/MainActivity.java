package sg.edu.rp.c346.id21021397.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<Mainmenu_mainActivity> extends AppCompatActivity {

    TextView tvTranslatedText;
    TextView tvTranslatedText2;
    String wordClicked = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);

        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);


    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v == tvTranslatedText){
            wordClicked = "Hello";
            menu.add(0,0,0,"English");
            menu.add(0,1,1,"Italian");
        }else if(v == tvTranslatedText2){
            wordClicked = "Bye";
            menu.add(1,0,0,"English");
            menu.add(1,1,1,"Italian");
        }

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getGroupId() == 0){
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText.setText("Hello");
                Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

                return true; //menu item successfully handled
            }else if(item.getItemId()==1){
                //code for action
                tvTranslatedText.setText("Ciao");
                Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

                return true; //menu item successfully handled
            }
        }else if(item.getGroupId() == 1){
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText2.setText("Bye");
                Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

                return true; //menu item successfully handled
            }else if(item.getItemId()==1){
                //code for action
                tvTranslatedText2.setText("Addio");
                Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

                return true; //menu item successfully handled
            }
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }




}