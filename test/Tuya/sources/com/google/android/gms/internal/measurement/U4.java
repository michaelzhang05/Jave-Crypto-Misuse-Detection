package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class U4 {

    /* renamed from: a, reason: collision with root package name */
    private static final T4 f15583a;

    /* renamed from: b, reason: collision with root package name */
    private static final T4 f15584b;

    static {
        T4 t42 = null;
        try {
            t42 = (T4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15583a = t42;
        f15584b = new T4();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static T4 a() {
        return f15583a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static T4 b() {
        return f15584b;
    }
}
