package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final j0 f5544a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final j0 f5545b = new k0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 a() {
        return f5544a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 b() {
        return f5545b;
    }

    private static j0 c() {
        try {
            return (j0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
