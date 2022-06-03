package sg.edu.rp.c36.id21028831.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText inputTask;
    TextView textAdd;
//    TextView displayInstruction;
//    TextView textRemove;
    ListView lvTasks;
    TextView textClear;
//    Spinner spinner;

    ArrayList<String> alTasks;
    ArrayAdapter<String> aaTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTask=findViewById(R.id.inputTask);
        textAdd=findViewById(R.id.textAdd);
        lvTasks=findViewById(R.id.lvTasks);
        textClear=findViewById(R.id.textClear);
//        spinner=findViewById(R.id.spinner);
//        displayInstruction=findViewById(R.id.displayInstruction);
//        textRemove=findViewById(R.id.textRemove);

        alTasks=new ArrayList<>();


        aaTasks=new ArrayAdapter<>(this, R.layout.row,alTasks);
        lvTasks.setAdapter(aaTasks);

//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
//
//                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
//                ((TextView) parent.getChildAt(0)).setTextSize(18);
//
//                switch(i){
//                    case 0:
//                        displayInstruction.setText("Enter task to add");
//                        textRemove.setEnabled(false);
//                        break;
//
//                    case 1:
//                        displayInstruction.setText("Enter index of task to remove");
//                        textAdd.setEnabled(false);
//                        break;
//                }
//            }

//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });

        textAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String addTask=inputTask.getText().toString();
                alTasks.add(addTask);
                aaTasks.notifyDataSetChanged();
            }
        });

//        textRemove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String index=inputTask.getText().toString();
//                int indexNum=Integer.parseInt(index);
//
//                alTasks.remove(indexNum);
//                aaTasks.notifyDataSetChanged();
//            }
//        });

        textClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alTasks.clear();
                aaTasks.notifyDataSetChanged();
            }
        });
    }
}