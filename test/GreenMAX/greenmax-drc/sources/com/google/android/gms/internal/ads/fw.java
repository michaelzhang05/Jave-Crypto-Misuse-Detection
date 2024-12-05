package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class fw {
    private static final dw a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final dw f11438b = new ew();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dw a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dw b() {
        return f11438b;
    }

    private static dw c() {
        try {
            return (dw) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
