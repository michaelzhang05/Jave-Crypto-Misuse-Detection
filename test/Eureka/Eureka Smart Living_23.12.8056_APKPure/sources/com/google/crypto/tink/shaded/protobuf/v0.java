package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final t0 f5690a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final t0 f5691b = new u0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t0 a() {
        return f5690a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t0 b() {
        return f5691b;
    }

    private static t0 c() {
        try {
            return (t0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
