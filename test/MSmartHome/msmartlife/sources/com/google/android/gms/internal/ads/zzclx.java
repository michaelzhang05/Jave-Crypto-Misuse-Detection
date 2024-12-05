package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzclx implements zzclw<zzbyn> {
    private final zzbxo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbl f14200b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcaq f14201c;

    public zzclx(zzbxo zzbxoVar, zzbbl zzbblVar, zzcaq zzcaqVar) {
        this.a = zzbxoVar;
        this.f14200b = zzbblVar;
        this.f14201c = zzcaqVar;
    }

    private final zzbbh<zzbyn> f(final zzcxu zzcxuVar, final zzcxm zzcxmVar, final JSONObject jSONObject) {
        final zzbbh<zzccj> b2 = this.a.f().b();
        final zzbbh<zzbyt> a = this.f14201c.a(zzcxuVar, zzcxmVar, jSONObject);
        return zzbar.a(b2, a).a(new Callable(this, a, b2, zzcxuVar, zzcxmVar, jSONObject) { // from class: com.google.android.gms.internal.ads.kl

            /* renamed from: f, reason: collision with root package name */
            private final zzclx f11727f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbbh f11728g;

            /* renamed from: h, reason: collision with root package name */
            private final zzbbh f11729h;

            /* renamed from: i, reason: collision with root package name */
            private final zzcxu f11730i;

            /* renamed from: j, reason: collision with root package name */
            private final zzcxm f11731j;

            /* renamed from: k, reason: collision with root package name */
            private final JSONObject f11732k;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11727f = this;
                this.f11728g = a;
                this.f11729h = b2;
                this.f11730i = zzcxuVar;
                this.f11731j = zzcxmVar;
                this.f11732k = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11727f.e(this.f11728g, this.f11729h, this.f11730i, this.f11731j, this.f11732k);
            }
        }, this.f14200b);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<List<zzbbh<zzbyn>>> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        zzbbh<zzccj> b2 = this.a.f().b();
        this.a.f().a(b2);
        return zzbar.c(zzbar.c(b2, new zzbal(this, zzcxmVar) { // from class: com.google.android.gms.internal.ads.fl
            private final zzclx a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcxm f11427b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11427b = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.c(this.f11427b, (zzccj) obj);
            }
        }, this.f14200b), new zzbal(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.gl
            private final zzclx a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcxu f11490b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxm f11491c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11490b = zzcxuVar;
                this.f11491c = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.d(this.f11490b, this.f11491c, (JSONArray) obj);
            }
        }, this.f14200b);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.p;
        return (zzcxqVar == null || zzcxqVar.f14565c == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh c(zzcxm zzcxmVar, zzccj zzccjVar) throws Exception {
        JSONObject d2 = zzazc.d("isNonagon", Boolean.TRUE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzcxmVar.p.f14565c);
        jSONObject.put("sdk_params", d2);
        return zzbar.c(zzccjVar.i("google.afma.nativeAds.preProcessJson", jSONObject), il.a, this.f14200b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh d(zzcxu zzcxuVar, zzcxm zzcxmVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzbar.l(new zzcgm(3));
        }
        if (zzcxuVar.a.a.l > 1) {
            int length = jSONArray.length();
            this.a.f().c(Math.min(length, zzcxuVar.a.a.l));
            ArrayList arrayList = new ArrayList(zzcxuVar.a.a.l);
            for (int i2 = 0; i2 < zzcxuVar.a.a.l; i2++) {
                if (i2 < length) {
                    arrayList.add(f(zzcxuVar, zzcxmVar, jSONArray.getJSONObject(i2)));
                } else {
                    arrayList.add(zzbar.l(new zzcgm(3)));
                }
            }
            return zzbar.o(arrayList);
        }
        return zzbar.d(f(zzcxuVar, zzcxmVar, jSONArray.getJSONObject(0)), jl.a, this.f14200b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzbyn e(zzbbh zzbbhVar, zzbbh zzbbhVar2, zzcxu zzcxuVar, zzcxm zzcxmVar, JSONObject jSONObject) throws Exception {
        zzbyt zzbytVar = (zzbyt) zzbbhVar.get();
        zzccj zzccjVar = (zzccj) zzbbhVar2.get();
        zzbyv a = this.a.a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbzf(zzbytVar), new zzbyc(jSONObject, zzccjVar));
        a.h().b();
        a.i().a(zzccjVar);
        a.j().c(zzbytVar.A());
        return a.g();
    }
}
