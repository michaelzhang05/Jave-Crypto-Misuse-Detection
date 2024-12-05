package com.google.android.gms.internal.ads;

import android.content.Context;

@zzard
/* loaded from: classes2.dex */
public final class zzalk {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f12776b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private zzalr f12777c;

    /* renamed from: d, reason: collision with root package name */
    private zzalr f12778d;

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzalr a(Context context, zzbai zzbaiVar) {
        zzalr zzalrVar;
        synchronized (this.f12776b) {
            if (this.f12778d == null) {
                this.f12778d = new zzalr(c(context), zzbaiVar, (String) zzyt.e().c(zzacu.f12622b));
            }
            zzalrVar = this.f12778d;
        }
        return zzalrVar;
    }

    public final zzalr b(Context context, zzbai zzbaiVar) {
        zzalr zzalrVar;
        synchronized (this.a) {
            if (this.f12777c == null) {
                this.f12777c = new zzalr(c(context), zzbaiVar, (String) zzyt.e().c(zzacu.f12623c));
            }
            zzalrVar = this.f12777c;
        }
        return zzalrVar;
    }
}
