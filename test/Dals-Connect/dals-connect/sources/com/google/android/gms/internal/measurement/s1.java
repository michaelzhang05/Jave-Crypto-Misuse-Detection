package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class s1 {
    private static final q1 a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final q1 f16028b = new r1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q1 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q1 b() {
        return f16028b;
    }

    private static q1 c() {
        try {
            return (q1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
