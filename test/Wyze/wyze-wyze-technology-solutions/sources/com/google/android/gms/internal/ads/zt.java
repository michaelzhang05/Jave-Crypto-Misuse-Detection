package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zt {
    private static final Class<?> a = c("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f12540b;

    static {
        f12540b = c("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return (a == null || f12540b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return a;
    }

    private static <T> Class<T> c(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
