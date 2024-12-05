package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbrt extends zzbts<zzbrw> {

    /* renamed from: g, reason: collision with root package name */
    private boolean f13541g;

    public zzbrt(Set<zzbuz<zzbrw>> set) {
        super(set);
        this.f13541g = false;
    }

    public final synchronized void Y() {
        if (!this.f13541g) {
            T(td.a);
            this.f13541g = true;
        }
    }
}
