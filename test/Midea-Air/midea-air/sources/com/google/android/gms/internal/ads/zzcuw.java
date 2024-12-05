package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcuw implements zzcva<zzcuv> {
    private final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14482b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbai f14483c;

    public zzcuw(zzbbl zzbblVar, Context context, zzbai zzbaiVar) {
        this.a = zzbblVar;
        this.f14482b = context;
        this.f14483c = zzbaiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcuv a() throws Exception {
        boolean f2 = Wrappers.a(this.f14482b).f();
        zzk.zzlg();
        boolean E = zzaxi.E(this.f14482b);
        String str = this.f14483c.f13150f;
        zzk.zzli();
        boolean u = zzaxo.u();
        zzk.zzlg();
        return new zzcuv(f2, E, str, u, zzaxi.B(this.f14482b), DynamiteModule.c(this.f14482b, ModuleDescriptor.MODULE_ID));
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcuv> b() {
        return this.a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.yo

            /* renamed from: f, reason: collision with root package name */
            private final zzcuw f12477f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12477f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12477f.a();
            }
        });
    }
}
