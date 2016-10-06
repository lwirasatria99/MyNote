package db;

import android.provider.BaseColumns;

/**
 * Created by User Inarts on 19/08/2016.
 */
public class TaskContract {

    public static final String DB_NAME = "com.apps.userinarts.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "task" ;
        public static final String COL_TASK_TITLE = "title";
    }
}
