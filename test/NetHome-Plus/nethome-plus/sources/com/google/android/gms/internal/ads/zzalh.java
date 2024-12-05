package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzalh implements zzajq, zzalg {

    /* renamed from: f, reason: collision with root package name */
    private final zzalf f12774f;

    /* renamed from: g, reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, zzaho<? super zzalf>>> f12775g = new HashSet<>();

    public zzalh(zzalf zzalfVar) {
        this.f12774f = zzalfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final void E() {
        Iterator<AbstractMap.SimpleEntry<String, zzaho<? super zzalf>>> it = this.f12775g.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, zzaho<? super zzalf>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            zzawz.m(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f12774f.i(next.getKey(), next.getValue());
        }
        this.f12775g.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final void X(String str, String str2) {
        zzajr.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void Y(String str, JSONObject jSONObject) {
        zzajr.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final void f(String str, zzaho<? super zzalf> zzahoVar) {
        this.f12774f.f(str, zzahoVar);
        this.f12775g.add(new AbstractMap.SimpleEntry<>(str, zzahoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final void i(String str, zzaho<? super zzalf> zzahoVar) {
        this.f12774f.i(str, zzahoVar);
        this.f12775g.remove(new AbstractMap.SimpleEntry(str, zzahoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzaji
    public final void j(String str, JSONObject jSONObject) {
        zzajr.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    public final void k(String str) {
        this.f12774f.k(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void y(String str, Map map) {
        zzajr.b(this, str, map);
    }
}
