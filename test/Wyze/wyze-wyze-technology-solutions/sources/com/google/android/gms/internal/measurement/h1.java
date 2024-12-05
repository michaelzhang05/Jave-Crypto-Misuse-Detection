package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
abstract class h1 {
    private static final h1 a;

    /* renamed from: b, reason: collision with root package name */
    private static final h1 f15967b;

    static {
        i1 i1Var = null;
        a = new j1();
        f15967b = new k1();
    }

    private h1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h1 c() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h1 d() {
        return f15967b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void a(Object obj, Object obj2, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Object obj, long j2);
}
