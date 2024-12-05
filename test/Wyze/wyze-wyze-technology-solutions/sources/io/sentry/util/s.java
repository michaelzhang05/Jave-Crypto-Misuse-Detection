package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: Platform.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class s {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    static boolean f19291b;

    static {
        try {
            a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f19291b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f19291b = false;
            }
        } catch (Throwable unused2) {
            f19291b = false;
        }
    }

    public static boolean a() {
        return f19291b;
    }

    public static boolean b() {
        return !a;
    }
}
