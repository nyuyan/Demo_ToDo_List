package sg.edu.rp.c346.id22015056.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    ListView lvlist;
    ArrayList<ToDoItem>ListTodo;
    //ArrayAdapter<String>aaList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvlist=findViewById(R.id.listViewlist);
        ListTodo= new ArrayList<>();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020, Calendar.AUGUST, 1);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, Calendar.AUGUST, 2);

        ToDoItem item1 = new ToDoItem("Go for Movie", cal1);
        ToDoItem item2 = new ToDoItem("Go for Haircut", cal2);
        ListTodo.add(item1);
        ListTodo.add(item2);

        adapter= new CustomAdapter(this, R.layout.row,ListTodo);
        lvlist.setAdapter(adapter);
    }
}