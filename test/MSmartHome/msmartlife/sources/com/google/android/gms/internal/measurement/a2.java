package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class a2 {
    private static final y1 a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final y1 f15926b = new z1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y1 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y1 b() {
        return f15926b;
    }

    private static y1 c() {
        try {
            return (y1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
