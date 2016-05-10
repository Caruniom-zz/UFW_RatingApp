package at.htldornbirn.a3cwi.ufw_ratingapp.adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import at.htldornbirn.a3cwi.ufw_ratingapp.R;
import at.htldornbirn.a3cwi.ufw_ratingapp.database.DBHelper;
import at.htldornbirn.a3cwi.ufw_ratingapp.vo.Class;

/**
 * Created by david on 10.05.2016.
 */
public class RatingsOverviewAdapter extends BaseAdapter {

    private Context context;
    private List<Class> classList;

    public RatingsOverviewAdapter(Context context) {
        this.context = context;
        this.classList = new ArrayList<>();
        DBHelper helper = new DBHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor c = db.rawQuery("Select * from classes", null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            Class cl = new Class(
                    c.getInt(c.getColumnIndex("id")),
                    c.getString(c.getColumnIndex("name")),
                    c.getString(c.getColumnIndex("kvName"))
            );
            this.classList.add(cl);
            c.moveToNext();
        }
    }

    public void addClass(Class cl) {

        this.classList.add(cl);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return classList.size();
    }

    @Override
    public Object getItem(int pos) {
        return classList.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return classList.get(pos).getId();
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        Class currentClass = classList.get(pos);
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = li.inflate(R.layout.class_lv, parent, false);

        TextView tvClassName = (TextView) v.findViewById(R.id.tvClass);
        tvClassName.setText(currentClass.getName());

        TextView tvKv = (TextView) v.findViewById(R.id.tvKV);
        tvKv.setText(currentClass.getKVname());

        ImageView imageView = (ImageView) v.findViewById(R.id.imgClass);
        try {
            int drawableResourceId = context.getResources().getIdentifier(currentClass.getImage(), "drawable", context.getPackageName());
            imageView.setImageResource(drawableResourceId);
        } catch (Exception e) {
            imageView.setImageResource(R.drawable.icon);
        }


        return v;
    }

}
