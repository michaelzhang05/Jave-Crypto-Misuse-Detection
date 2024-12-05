package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbsm;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzcoe<AdT, AdapterT, ListenerT extends zzbsm> implements zzcjv<AdT> {
    private final zzcjz<AdapterT, ListenerT> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcka<AdT, AdapterT, ListenerT> f14279b;

    /* renamed from: c, reason: collision with root package name */
    private final zzczt f14280c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbbl f14281d;

    public zzcoe(zzczt zzcztVar, zzbbl zzbblVar, zzcjz<AdapterT, ListenerT> zzcjzVar, zzcka<AdT, AdapterT, ListenerT> zzckaVar) {
        this.f14280c = zzcztVar;
        this.f14281d = zzbblVar;
        this.f14279b = zzckaVar;
        this.a = zzcjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final zzbbh<AdT> a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        final zzcjy<AdapterT, ListenerT> zzcjyVar;
        Iterator<String> it = zzcxmVar.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcjyVar = null;
                break;
            }
            try {
                zzcjyVar = this.a.a(it.next(), zzcxmVar.s);
                break;
            } catch (Throwable unused) {
            }
        }
        if (zzcjyVar == null) {
            return zzbar.l(new zzcmk("unable to instantiate mediation adapter class"));
        }
        zzbbr zzbbrVar = new zzbbr();
        zzcjyVar.f14137c.F6(new km(this, zzbbrVar, zzcjyVar));
        if (zzcxmVar.E) {
            Bundle bundle = zzcxuVar.a.a.f14573d.r;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f14280c.g(zzczs.ADAPTER_LOAD_AD_SYN).a(new zzczd(this, zzcxuVar, zzcxmVar, zzcjyVar) { // from class: com.google.android.gms.internal.ads.im
            private final zzcoe a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcxu f11610b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxm f11611c;

            /* renamed from: d, reason: collision with root package name */
            private final zzcjy f11612d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11610b = zzcxuVar;
                this.f11611c = zzcxmVar;
                this.f11612d = zzcjyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzczd
            public final void run() {
                this.a.d(this.f11610b, this.f11611c, this.f11612d);
            }
        }, this.f14281d).j(zzczs.ADAPTER_LOAD_AD_ACK).g(zzbbrVar).j(zzczs.ADAPTER_WRAP_ADAPTER).h(new zzczc(this, zzcxuVar, zzcxmVar, zzcjyVar) { // from class: com.google.android.gms.internal.ads.jm
            private final zzcoe a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcxu f11656b;

            /* renamed from: c, reason: collision with root package name */
            private final zzcxm f11657c;

            /* renamed from: d, reason: collision with root package name */
            private final zzcjy f11658d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11656b = zzcxuVar;
                this.f11657c = zzcxmVar;
                this.f11658d = zzcjyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzczc
            public final Object a(Object obj) {
                return this.a.c(this.f11656b, this.f11657c, this.f11658d, (Void) obj);
            }
        }).f();
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    public final boolean b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return !zzcxmVar.q.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object c(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar, Void r4) throws Exception {
        return this.f14279b.a(zzcxuVar, zzcxmVar, zzcjyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) throws Exception {
        this.f14279b.b(zzcxuVar, zzcxmVar, zzcjyVar);
    }
}
