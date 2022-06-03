package sg.edu.rp.c36.id21028831.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText inputTask;
    TextView textAdd;
    ListView lvTasks;
    TextView textClear;

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

        alTasks=new ArrayList<>();


        aaTasks=new ArrayAdapter<>(this, R.layout.row,alTasks);
        lvTasks.setAdapter(aaTasks);

        textAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String addTask=inputTask.getText().toString();
                alTasks.add(addTask);
                aaTasks.notifyDataSetChanged();
            }
        });

        textClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alTasks.clear();
                aaTasks.notifyDataSetChanged();
            }
        });
    }
}