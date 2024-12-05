package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2049m4 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2033k4 f15764a = new C2041l4();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2033k4 f15765b;

    static {
        AbstractC2033k4 abstractC2033k4 = null;
        try {
            abstractC2033k4 = (AbstractC2033k4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15765b = abstractC2033k4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2033k4 a() {
        AbstractC2033k4 abstractC2033k4 = f15765b;
        if (abstractC2033k4 != null) {
            return abstractC2033k4;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2033k4 b() {
        return f15764a;
    }
}
