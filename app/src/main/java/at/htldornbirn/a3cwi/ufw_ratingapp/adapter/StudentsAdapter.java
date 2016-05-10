package at.htldornbirn.a3cwi.ufw_ratingapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import at.htldornbirn.a3cwi.ufw_ratingapp.R;
import at.htldornbirn.a3cwi.ufw_ratingapp.vo.Student;

/**
 * Created by Patrick on 19.04.2016.
 */
public class StudentsAdapter extends BaseAdapter {

    private Context context;
    private List<Student> StudentList;

    public StudentsAdapter(Context context) {
        this.context = context;
        this.StudentList = new ArrayList<>();
        this.StudentList.add(new Student(1, "METZLER", "Patrick"));
    }

    public void addStudent(Student st) {

        this.StudentList.add(st);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return StudentList.size();
    }

    @Override
    public Object getItem(int pos) {
        return StudentList.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return StudentList.get(pos).getId();
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = li.inflate(R.layout.student_lv, parent, false);

        TextView tvStudent = (TextView) v.findViewById(R.id.tvNName);
        tvStudent.setText(this.StudentList.get(pos).getNName());

        TextView tvKV = (TextView) v.findViewById(R.id.tvVName);
        tvKV.setText(this.StudentList.get(pos).getVName());

        return v;
    }
}