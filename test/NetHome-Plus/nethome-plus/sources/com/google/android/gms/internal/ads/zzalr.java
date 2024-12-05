package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzalr {

    @VisibleForTesting
    private static final zzayp<zzajw> a = new e2();

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    private static final zzayp<zzajw> f12781b = new f2();

    /* renamed from: c, reason: collision with root package name */
    private final zzakh f12782c;

    public zzalr(Context context, zzbai zzbaiVar, String str) {
        this.f12782c = new zzakh(context, zzbaiVar, str, a, f12781b);
    }

    public final <I, O> zzalj<I, O> a(String str, zzalm<I> zzalmVar, zzall<O> zzallVar) {
        return new zzalu(this.f12782c, str, zzalmVar, zzallVar);
    }

    public final zzaly b() {
        return new zzaly(this.f12782c);
    }
}
