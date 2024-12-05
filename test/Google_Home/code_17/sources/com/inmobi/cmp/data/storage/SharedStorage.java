package com.inmobi.cmp.data.storage;

import H6.h;
import Q7.a;
import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inmobi.cmp.core.model.Vector;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public class SharedStorage {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f18900a;

    public SharedStorage(Application app) {
        AbstractC3255y.i(app, "app");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(app);
        AbstractC3255y.h(defaultSharedPreferences, "getDefaultSharedPreferences(app)");
        this.f18900a = defaultSharedPreferences;
    }

    public static void f(SharedStorage sharedStorage, int i8, h explicitNotice, h optOut, h coveredTransaction, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 1;
        }
        if ((i9 & 2) != 0) {
            explicitNotice = h.YES;
        }
        sharedStorage.getClass();
        AbstractC3255y.i(explicitNotice, "explicitNotice");
        AbstractC3255y.i(optOut, "optOut");
        AbstractC3255y.i(coveredTransaction, "coveredTransaction");
        String str = i8 + explicitNotice.f3936a + optOut.f3936a + coveredTransaction.f3936a;
        sharedStorage.e(a.PRIVACY_STRING, str);
        sharedStorage.e(a.SAVED_PRIVACY_STRING, str);
    }

    public final String a(int i8, int i9) {
        String j8 = j(a.SAVED_PRIVACY_STRING);
        if (j8.length() > 0) {
            String substring = j8.substring(i8, i9);
            AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    public final void b(a preferenceKey) {
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = this.f18900a.edit();
        AbstractC3255y.h(editor, "editor");
        editor.remove(preferenceKey.f9577a);
        editor.apply();
    }

    public final void c(a preferenceKey, int i8) {
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = this.f18900a.edit();
        AbstractC3255y.h(editor, "editor");
        editor.putInt(preferenceKey.f9577a, i8);
        editor.apply();
    }

    public final void d(a key, Vector list) {
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(list, "list");
        String json = new Gson().r(list);
        AbstractC3255y.h(json, "json");
        e(key, json);
    }

    public final void e(a preferenceKey, String value) {
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        AbstractC3255y.i(value, "value");
        SharedPreferences.Editor editor = this.f18900a.edit();
        AbstractC3255y.h(editor, "editor");
        editor.putString(preferenceKey.f9577a, value);
        editor.apply();
    }

    public final void g(String preferenceKey, String value) {
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        AbstractC3255y.i(value, "value");
        SharedPreferences.Editor editor = this.f18900a.edit();
        AbstractC3255y.h(editor, "editor");
        editor.putString(preferenceKey, value);
        editor.apply();
    }

    public final boolean h(a preferenceKey) {
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        return this.f18900a.getBoolean(preferenceKey.f9577a, false);
    }

    public final int i(a preferenceKey) {
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        return this.f18900a.getInt(preferenceKey.f9577a, 0);
    }

    public final String j(a preferenceKey) {
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        String string = this.f18900a.getString(preferenceKey.f9577a, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final Vector k(a key) {
        AbstractC3255y.i(key, "key");
        try {
            return (Vector) new Gson().i(j(key), new TypeToken<Vector>() { // from class: com.inmobi.cmp.data.storage.SharedStorage$getVectorPreference$type$1
            }.d());
        } catch (Exception unused) {
            return null;
        }
    }
}
