package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzjx extends IOException {

    /* renamed from: f, reason: collision with root package name */
    private final zzjq f15207f;

    public zzjx(String str, zzjq zzjqVar) {
        super(str);
        this.f15207f = zzjqVar;
    }

    public zzjx(IOException iOException, zzjq zzjqVar) {
        super(iOException);
        this.f15207f = zzjqVar;
    }

    public zzjx(String str, IOException iOException, zzjq zzjqVar) {
        super(str, iOException);
        this.f15207f = zzjqVar;
    }
}
