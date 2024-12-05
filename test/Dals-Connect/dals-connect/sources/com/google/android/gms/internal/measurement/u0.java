package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class u0 {
    private static final Class<?> a = b();

    private static final zzub a(String str) throws Exception {
        return (zzub) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzub c() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzub.f16116b;
    }
}
