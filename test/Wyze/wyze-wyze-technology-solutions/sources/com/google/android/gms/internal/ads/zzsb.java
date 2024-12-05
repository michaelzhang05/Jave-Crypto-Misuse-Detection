package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzsb extends IOException {

    /* renamed from: f, reason: collision with root package name */
    private final int f15530f;

    /* renamed from: g, reason: collision with root package name */
    private final zzry f15531g;

    public zzsb(String str, zzry zzryVar, int i2) {
        super(str);
        this.f15531g = zzryVar;
        this.f15530f = 1;
    }

    public zzsb(IOException iOException, zzry zzryVar, int i2) {
        super(iOException);
        this.f15531g = zzryVar;
        this.f15530f = i2;
    }

    public zzsb(String str, IOException iOException, zzry zzryVar, int i2) {
        super(str, iOException);
        this.f15531g = zzryVar;
        this.f15530f = 1;
    }
}
