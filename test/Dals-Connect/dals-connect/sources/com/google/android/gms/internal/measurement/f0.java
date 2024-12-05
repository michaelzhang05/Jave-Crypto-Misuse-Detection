package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class f0 {
    private static final Class<?> a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f15954b;

    static {
        f15954b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return (a == null || f15954b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> c() {
        return a;
    }
}
