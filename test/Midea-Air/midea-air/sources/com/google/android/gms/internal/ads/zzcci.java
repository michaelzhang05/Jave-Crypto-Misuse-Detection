package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcci implements zzaho<Object> {
    private final zzafo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzccj f13882b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdte<zzccd> f13883c;

    public zzcci(zzbzc zzbzcVar, zzbyt zzbytVar, zzccj zzccjVar, zzdte<zzccd> zzdteVar) {
        this.a = zzbzcVar.i(zzbytVar.e());
        this.f13882b = zzccjVar;
        this.f13883c = zzdteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.a.j0(this.f13883c.get(), str);
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzbad.d(sb.toString(), e2);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        this.f13882b.d("/nativeAdCustomClick", this);
    }
}
