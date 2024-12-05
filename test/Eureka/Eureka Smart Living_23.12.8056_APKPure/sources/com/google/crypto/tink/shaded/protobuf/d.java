package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5468a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f5469b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f5470c;

    static {
        f5470c = (f5468a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class b() {
        return f5469b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f5468a || !(f5469b == null || f5470c);
    }
}
