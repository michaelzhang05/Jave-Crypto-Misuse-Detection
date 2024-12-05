package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzcbg {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13834b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13835c;

    /* renamed from: d, reason: collision with root package name */
    public final zzadw f13836d;

    @VisibleForTesting
    public zzcbg(String str, String str2) {
        this.a = 1;
        this.f13834b = str;
        this.f13835c = str2;
        this.f13836d = null;
    }

    @VisibleForTesting
    public zzcbg(String str, zzadw zzadwVar) {
        this.a = 2;
        this.f13834b = str;
        this.f13835c = null;
        this.f13836d = zzadwVar;
    }
}
