package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public final class zzcjc {
    private final zzcja a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbl f14109b;

    public zzcjc(zzcja zzcjaVar, zzbbl zzbblVar) {
        this.a = zzcjaVar;
        this.f14109b = zzbblVar;
    }

    public final void a(zzczc<SQLiteDatabase, Void> zzczcVar) {
        zzbbl zzbblVar = this.f14109b;
        zzcja zzcjaVar = this.a;
        zzcjaVar.getClass();
        zzbar.f(zzbblVar.submit(xj.a(zzcjaVar)), new yj(this, zzczcVar), this.f14109b);
    }
}
