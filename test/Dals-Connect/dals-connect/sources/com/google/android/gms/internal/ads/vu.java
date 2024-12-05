package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class vu {
    private static final Class<?> a = a();

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzdno b() {
        if (a != null) {
            try {
                return d("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzdno.f14832c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzdno c() {
        /*
            java.lang.Class<?> r0 = com.google.android.gms.internal.ads.vu.a
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.ads.zzdno r0 = d(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzdno r0 = com.google.android.gms.internal.ads.zzdno.b()
        L12:
            if (r0 != 0) goto L18
            com.google.android.gms.internal.ads.zzdno r0 = b()
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vu.c():com.google.android.gms.internal.ads.zzdno");
    }

    private static final zzdno d(String str) throws Exception {
        return (zzdno) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
