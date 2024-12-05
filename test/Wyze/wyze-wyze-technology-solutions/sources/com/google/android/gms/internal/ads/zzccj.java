package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzccj {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.zza f13884b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbhf f13885c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f13886d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13887e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdh f13888f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbai f13889g;

    /* renamed from: i, reason: collision with root package name */
    private zzbbh<zzbgz> f13891i;
    private final ph a = new ph(null);

    /* renamed from: h, reason: collision with root package name */
    private final zzahu f13890h = new zzahu();

    public zzccj(Context context, Executor executor, zzdh zzdhVar, zzbai zzbaiVar, com.google.android.gms.ads.internal.zza zzaVar, zzbhf zzbhfVar) {
        this.f13886d = context;
        this.f13887e = executor;
        this.f13888f = zzdhVar;
        this.f13889g = zzbaiVar;
        this.f13884b = zzaVar;
        this.f13885c = zzbhfVar;
    }

    public final synchronized void a() {
        zzbbh<zzbgz> zzbbhVar = this.f13891i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.f(zzbbhVar, new lh(this), this.f13887e);
        this.f13891i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh b(String str, JSONObject jSONObject, zzbgz zzbgzVar) throws Exception {
        return this.f13890h.b(zzbgzVar, str, jSONObject);
    }

    public final synchronized void d(String str, zzaho<Object> zzahoVar) {
        zzbbh<zzbgz> zzbbhVar = this.f13891i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.f(zzbbhVar, new mh(this, str, zzahoVar), this.f13887e);
    }

    public final synchronized void e(String str, Map<String, ?> map) {
        zzbbh<zzbgz> zzbbhVar = this.f13891i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.f(zzbbhVar, new oh(this, str, map), this.f13887e);
    }

    public final <T> void f(WeakReference<T> weakReference, String str, zzaho<T> zzahoVar) {
        d(str, new rh(this, weakReference, str, zzahoVar, null));
    }

    public final synchronized void g() {
        zzbbh<zzbgz> d2 = zzbar.d(zzbhf.a(this.f13886d, this.f13889g, (String) zzyt.e().c(zzacu.H2), this.f13888f, this.f13884b), new zzbam(this) { // from class: com.google.android.gms.internal.ads.jh
            private final zzccj a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj) {
                return this.a.j((zzbgz) obj);
            }
        }, this.f13887e);
        this.f13891i = d2;
        zzbao.a(d2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void h(String str, zzaho<Object> zzahoVar) {
        zzbbh<zzbgz> zzbbhVar = this.f13891i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.f(zzbbhVar, new nh(this, str, zzahoVar), this.f13887e);
    }

    public final synchronized zzbbh<JSONObject> i(final String str, final JSONObject jSONObject) {
        zzbbh<zzbgz> zzbbhVar = this.f13891i;
        if (zzbbhVar == null) {
            return zzbar.o(null);
        }
        return zzbar.c(zzbbhVar, new zzbal(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.kh
            private final zzccj a;

            /* renamed from: b, reason: collision with root package name */
            private final String f11721b;

            /* renamed from: c, reason: collision with root package name */
            private final JSONObject f11722c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11721b = str;
                this.f11722c = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.b(this.f11721b, this.f11722c, (zzbgz) obj);
            }
        }, this.f13887e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbgz j(zzbgz zzbgzVar) {
        zzbgzVar.f("/result", this.f13890h);
        zzbii p = zzbgzVar.p();
        ph phVar = this.a;
        p.c(null, phVar, phVar, phVar, phVar, false, null, new com.google.android.gms.ads.internal.zzb(this.f13886d, null, null), null, null);
        return zzbgzVar;
    }
}
