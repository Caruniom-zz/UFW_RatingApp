package at.htldornbirn.a3cwi.ufw_ratingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import at.htldornbirn.a3cwi.ufw_ratingapp.R;
import at.htldornbirn.a3cwi.ufw_ratingapp.adapter.ClassesAdapter;

/**
 * Created by David on 20.04.2016.
 */
public class Launcher extends AppCompatActivity {
    ListView lvClasses;
    ClassesAdapter cla;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ts_main);

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);

        lvClasses = (ListView) findViewById(R.id.listView);
        cla = new ClassesAdapter(this);
        lvClasses.setAdapter(cla);


    }

}