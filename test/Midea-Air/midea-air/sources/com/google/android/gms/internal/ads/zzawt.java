package com.google.android.gms.internal.ads;

import java.math.BigInteger;

@zzard
/* loaded from: classes2.dex */
public final class zzawt {
    private BigInteger a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f13060b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        this.f13060b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f13060b;
    }
}
