package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public abstract class zzacj<T> {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12612b;

    /* renamed from: c, reason: collision with root package name */
    private final T f12613c;

    private zzacj(int i2, String str, T t) {
        this.a = i2;
        this.f12612b = str;
        this.f12613c = t;
        zzyt.d().b(this);
    }

    public static zzacj<Float> c(int i2, String str, float f2) {
        return new o(i2, str, Float.valueOf(f2));
    }

    public static zzacj<Integer> d(int i2, String str, int i3) {
        return new m(i2, str, Integer.valueOf(i3));
    }

    public static zzacj<Long> e(int i2, String str, long j2) {
        return new n(i2, str, Long.valueOf(j2));
    }

    public static zzacj<Boolean> f(int i2, String str, Boolean bool) {
        return new l(i2, str, bool);
    }

    public static zzacj<String> g(int i2, String str, String str2) {
        return new p(i2, str, str2);
    }

    public static zzacj<String> l(int i2, String str) {
        zzacj<String> g2 = g(i2, str, null);
        zzyt.d().c(g2);
        return g2;
    }

    public static zzacj<String> m(int i2, String str) {
        zzacj<String> g2 = g(i2, str, null);
        zzyt.d().d(g2);
        return g2;
    }

    public final String a() {
        return this.f12612b;
    }

    public final int b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T h(SharedPreferences sharedPreferences);

    public abstract T i(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T j(JSONObject jSONObject);

    public abstract void k(SharedPreferences.Editor editor, T t);

    public final T n() {
        return this.f12613c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzacj(int i2, String str, Object obj, l lVar) {
        this(i2, str, obj);
    }
}
