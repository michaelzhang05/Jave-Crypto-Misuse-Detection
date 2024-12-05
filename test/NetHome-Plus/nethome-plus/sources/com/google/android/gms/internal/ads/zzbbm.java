package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

@zzard
/* loaded from: classes2.dex */
public final class zzbbm {
    public static final Executor a;

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f13155b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzbbl f13156c;

    /* renamed from: d, reason: collision with root package name */
    private static final zzbbl f13157d;

    static {
        f7 f7Var = new f7();
        a = f7Var;
        g7 g7Var = new g7();
        f13155b = g7Var;
        f13156c = a(f7Var);
        f13157d = a(g7Var);
    }

    public static zzbbl a(Executor executor) {
        return new h7(executor, null);
    }
}
