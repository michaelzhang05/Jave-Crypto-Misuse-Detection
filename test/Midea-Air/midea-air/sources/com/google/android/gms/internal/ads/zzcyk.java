package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcyk {
    private final Map<String, zzcym> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f14598b;

    /* renamed from: c, reason: collision with root package name */
    private final zzawm f14599c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbai f14600d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdh f14601e;

    public zzcyk(Context context, zzbai zzbaiVar, zzawm zzawmVar) {
        this.f14598b = context;
        this.f14600d = zzbaiVar;
        this.f14599c = zzawmVar;
        this.f14601e = new zzdh(new com.google.android.gms.ads.internal.zzg(context, zzbaiVar));
    }

    private final zzcym a() {
        return new zzcym(this.f14598b, this.f14599c.r(), this.f14599c.t(), this.f14601e);
    }

    private final zzcym c(String str) {
        zzasq e2 = zzasq.e(this.f14598b);
        try {
            e2.a(str);
            zzaxc zzaxcVar = new zzaxc();
            zzaxcVar.a(this.f14598b, str, false);
            zzaxf zzaxfVar = new zzaxf(this.f14599c.r(), zzaxcVar);
            return new zzcym(e2, zzaxfVar, new zzawu(zzazt.x(), zzaxfVar), new zzdh(new com.google.android.gms.ads.internal.zzg(this.f14598b, this.f14600d)));
        } catch (PackageManager.NameNotFoundException unused) {
            return a();
        }
    }

    public final zzcym b(String str) {
        if (str == null) {
            return a();
        }
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        zzcym c2 = c(str);
        this.a.put(str, c2);
        return c2;
    }
}
