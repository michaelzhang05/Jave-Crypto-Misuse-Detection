package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
abstract class lv {
    private static final lv a;

    /* renamed from: b, reason: collision with root package name */
    private static final lv f11779b;

    static {
        mv mvVar = null;
        a = new nv();
        f11779b = new ov();
    }

    private lv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lv c() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lv d() {
        return f11779b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> a(Object obj, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void b(Object obj, Object obj2, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(Object obj, long j2);
}
