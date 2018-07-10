package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = "pets";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

    private PetContract(){}

    public static final class PetEntry implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);


        public static final String TABLE_NAME = "pets";
        //unique id INTEGER
        public static final String _ID = BaseColumns._ID;

        //pet name TEXT
        public static final String COLUMN_PET_NAME = "name";

        //breed of the pet TEXT
        public static final String COLUMN_PET_BREED = "breed";

        //pets gender TEXT
        public static final String COLUMN_PET_GENDER = "gender";

        //weight of the pet INTEGER
        public static final String COLUMN_PET_WEIGHT = "weight";

        //possible values for gender of the pet
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}
