package com.pissiphany.cliomatternotes.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.pissiphany.cliomatternotes.annotation.AutoGson;

/**
 * Created by kierse on 15-09-08.
 */
public class AutoValueTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Class<? super T> rawType = type.getRawType();
        AutoGson annotation = rawType.getAnnotation(AutoGson.class);
        if (annotation == null) {
            return null;
        }

        return (TypeAdapter<T>) gson.getAdapter(annotation.autoValueClass());
    }
}
