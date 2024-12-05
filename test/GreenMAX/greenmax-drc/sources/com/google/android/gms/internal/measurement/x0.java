package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class x0 {
    private static final v0<?> a = new w0();

    /* renamed from: b, reason: collision with root package name */
    private static final v0<?> f16049b = a();

    private static v0<?> a() {
        try {
            return (v0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0<?> b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0<?> c() {
        v0<?> v0Var = f16049b;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
