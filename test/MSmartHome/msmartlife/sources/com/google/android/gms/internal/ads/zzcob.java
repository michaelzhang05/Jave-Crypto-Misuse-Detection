package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcob implements zzdti<zzcnw> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f14277b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzcdf> f14278c;

    public zzcob(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzcdf> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f14277b = zzdtuVar2;
        this.f14278c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcnw(this.a.get(), this.f14277b.get(), this.f14278c.get());
    }
}
