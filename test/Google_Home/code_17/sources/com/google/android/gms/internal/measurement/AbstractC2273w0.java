package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2273w0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f16876a = new C2300z0();

    public static SharedPreferences a(Context context, String str, int i8, AbstractC2228r0 abstractC2228r0) {
        SharedPreferencesC2264v0 sharedPreferencesC2264v0;
        if (AbstractC2166k0.a().a(str, abstractC2228r0, EnumC2202o0.SHARED_PREFS_TYPE).equals("")) {
            sharedPreferencesC2264v0 = new SharedPreferencesC2264v0();
        } else {
            sharedPreferencesC2264v0 = null;
        }
        if (sharedPreferencesC2264v0 != null) {
            return sharedPreferencesC2264v0;
        }
        ThreadLocal threadLocal = f16876a;
        w0.h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f16876a.set(Boolean.TRUE);
            throw th;
        }
    }
}
