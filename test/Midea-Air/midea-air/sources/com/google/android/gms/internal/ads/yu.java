package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class yu {
    private static final wu<?> a = new xu();

    /* renamed from: b, reason: collision with root package name */
    private static final wu<?> f12479b = a();

    private static wu<?> a() {
        try {
            return (wu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wu<?> b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wu<?> c() {
        wu<?> wuVar = f12479b;
        if (wuVar != null) {
            return wuVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
