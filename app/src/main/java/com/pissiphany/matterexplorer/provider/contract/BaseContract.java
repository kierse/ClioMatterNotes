package com.pissiphany.matterexplorer.provider.contract;

import android.net.Uri;

/**
 * Created by kierse on 15-08-23.
 */
public class BaseContract {
    public static final String AUTHORITY = "com.pissiphany.cliomatternotes";

    public static final Uri.Builder BASE_CONTENT_URI = new Uri.Builder().authority(AUTHORITY);

    public static final String BASE_CONTENT_TYPE = "vnd.android.cursor.dir/vnd.pissiphany.";
    public static final String BASE_CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.pissiphany.";

    public static class Columns {
        public static final String _ID = "_ID";
        public static final String ID = "id";
        public static final String CREATED_AT = "created_at";
        public static final String UPDATED_AT = "updated_at";
    }
}
