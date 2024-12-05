package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzdcb<P> {
    private final P a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14686b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdgu f14687c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdhm f14688d;

    public zzdcb(P p, byte[] bArr, zzdgu zzdguVar, zzdhm zzdhmVar) {
        this.a = p;
        this.f14686b = Arrays.copyOf(bArr, bArr.length);
        this.f14687c = zzdguVar;
        this.f14688d = zzdhmVar;
    }

    public final P a() {
        return this.a;
    }

    public final zzdhm b() {
        return this.f14688d;
    }

    public final byte[] c() {
        byte[] bArr = this.f14686b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
