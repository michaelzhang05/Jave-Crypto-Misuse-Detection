package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class xv {
    private static final vv a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final vv f12399b = new wv();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vv a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vv b() {
        return f12399b;
    }

    private static vv c() {
        try {
            return (vv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
