package com.facebook.t.u;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: SourceApplicationInfo.java */
/* loaded from: classes.dex */
class l {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9644b;

    private l(String str, boolean z) {
        this.a = str;
        this.f9644b = z;
    }

    public static void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    public static l b() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e());
        if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return new l(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
        }
        return null;
    }

    public void c() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f9644b);
        edit.apply();
    }

    public String toString() {
        String str = this.f9644b ? "Applink" : "Unclassified";
        if (this.a == null) {
            return str;
        }
        return str + "(" + this.a + ")";
    }
}
