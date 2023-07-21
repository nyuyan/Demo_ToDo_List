package sg.edu.rp.c346.id22015056.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class CustomAdapter extends ArrayAdapter<ToDoItem> {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> object) {
        super(context, resource, object);
        parent_context = context;
        layout_id = resource;
        versionList = object;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewVersion);

        ToDoItem currentVersion = versionList.get(position);

        tvName.setText(currentVersion.getTitle());
        String dateString = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                .format(currentVersion.getDate().getTime());
        tvVersion.setText(dateString);

        return rowView;
    }
}
