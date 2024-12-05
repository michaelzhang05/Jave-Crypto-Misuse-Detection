package com.inmobi.cmp.data.storage;

import E6.h;
import N7.a;
import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inmobi.cmp.core.model.Vector;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public class SharedStorage {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f17845a;

    public SharedStorage(Application app) {
        AbstractC3159y.i(app, "app");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(app);
        AbstractC3159y.h(defaultSharedPreferences, "getDefaultSharedPreferences(app)");
        this.f17845a = defaultSharedPreferences;
    }

    public static void f(SharedStorage sharedStorage, int i8, h explicitNotice, h optOut, h coveredTransaction, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 1;
        }
        if ((i9 & 2) != 0) {
            explicitNotice = h.YES;
        }
        sharedStorage.getClass();
        AbstractC3159y.i(explicitNotice, "explicitNotice");
        AbstractC3159y.i(optOut, "optOut");
        AbstractC3159y.i(coveredTransaction, "coveredTransaction");
        String str = i8 + explicitNotice.f2386a + optOut.f2386a + coveredTransaction.f2386a;
        sharedStorage.e(a.PRIVACY_STRING, str);
        sharedStorage.e(a.SAVED_PRIVACY_STRING, str);
    }

    public final String a(int i8, int i9) {
        String j8 = j(a.SAVED_PRIVACY_STRING);
        if (j8.length() > 0) {
            String substring = j8.substring(i8, i9);
            AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    public final void b(a preferenceKey) {
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = this.f17845a.edit();
        AbstractC3159y.h(editor, "editor");
        editor.remove(preferenceKey.f7617a);
        editor.apply();
    }

    public final void c(a preferenceKey, int i8) {
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = this.f17845a.edit();
        AbstractC3159y.h(editor, "editor");
        editor.putInt(preferenceKey.f7617a, i8);
        editor.apply();
    }

    public final void d(a key, Vector list) {
        AbstractC3159y.i(key, "key");
        AbstractC3159y.i(list, "list");
        String json = new Gson().r(list);
        AbstractC3159y.h(json, "json");
        e(key, json);
    }

    public final void e(a preferenceKey, String value) {
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        AbstractC3159y.i(value, "value");
        SharedPreferences.Editor editor = this.f17845a.edit();
        AbstractC3159y.h(editor, "editor");
        editor.putString(preferenceKey.f7617a, value);
        editor.apply();
    }

    public final void g(String preferenceKey, String value) {
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        AbstractC3159y.i(value, "value");
        SharedPreferences.Editor editor = this.f17845a.edit();
        AbstractC3159y.h(editor, "editor");
        editor.putString(preferenceKey, value);
        editor.apply();
    }

    public final boolean h(a preferenceKey) {
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        return this.f17845a.getBoolean(preferenceKey.f7617a, false);
    }

    public final int i(a preferenceKey) {
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        return this.f17845a.getInt(preferenceKey.f7617a, 0);
    }

    public final String j(a preferenceKey) {
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        String string = this.f17845a.getString(preferenceKey.f7617a, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final Vector k(a key) {
        AbstractC3159y.i(key, "key");
        try {
            return (Vector) new Gson().i(j(key), new TypeToken<Vector>() { // from class: com.inmobi.cmp.data.storage.SharedStorage$getVectorPreference$type$1
            }.d());
        } catch (Exception unused) {
            return null;
        }
    }
}
