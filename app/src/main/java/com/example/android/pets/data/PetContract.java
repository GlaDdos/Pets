package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    private PetContract(){

    }

    public static final class PetEntry implements BaseColumns {

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
