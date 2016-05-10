package at.htldornbirn.a3cwi.ufw_ratingapp.layouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import at.htldornbirn.a3cwi.ufw_ratingapp.R;
import at.htldornbirn.a3cwi.ufw_ratingapp.adapter.RatingsOverviewAdapter;

/**
 * Created by david on 10.05.2016.
 */
public class RatingOverview extends AppCompatActivity {
    private RatingsOverviewAdapter ratingsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ts_main);

        ListView lvStudent = (ListView) findViewById(R.id.listView);
        ratingsAdapter = new RatingsOverviewAdapter(this);
        lvStudent.setAdapter(new RatingsOverviewAdapter(this));
    }
}