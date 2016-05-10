package at.htldornbirn.a3cwi.ufw_ratingapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by david on 29.04.2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final int VERSION = 2;

    public DBHelper(Context context) { super(context, "Classes", null, VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table classes (id integer primary key autoincrement, name varchar(50), kvName varchar(50),image string)");
        db.execSQL("insert into classes(name, kvName, image) values ('3cWI', 'Klausmeier', 'icon')");
        // db.execSQL("insert into rockbands (name) values ('The Beatles', 4, 'England', 5)");
        // db.execSQL("insert into rockbands (name) values ('The Who', 2, 'Germany', 2)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Classes");
        onCreate(db);
    }
}
