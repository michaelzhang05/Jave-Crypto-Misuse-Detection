package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmn implements com.google.android.gms.ads.internal.overlay.zzo, zzbrw, zzbrx, zzue {

    /* renamed from: f, reason: collision with root package name */
    private final zzbmg f13369f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbml f13370g;

    /* renamed from: i, reason: collision with root package name */
    private final zzamd<JSONObject, JSONObject> f13372i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f13373j;

    /* renamed from: k, reason: collision with root package name */
    private final Clock f13374k;

    /* renamed from: h, reason: collision with root package name */
    private final Set<zzbgz> f13371h = new HashSet();
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final zzbmp m = new zzbmp();
    private boolean n = false;
    private WeakReference<Object> o = new WeakReference<>(this);

    public zzbmn(zzaly zzalyVar, zzbml zzbmlVar, Executor executor, zzbmg zzbmgVar, Clock clock) {
        this.f13369f = zzbmgVar;
        zzaln<JSONObject> zzalnVar = zzalo.f12779b;
        this.f13372i = zzalyVar.a("google.afma.activeView.handleUpdate", zzalnVar, zzalnVar);
        this.f13370g = zzbmlVar;
        this.f13373j = executor;
        this.f13374k = clock;
    }

    private final void u() {
        Iterator<zzbgz> it = this.f13371h.iterator();
        while (it.hasNext()) {
            this.f13369f.g(it.next());
        }
        this.f13369f.d();
    }

    public final synchronized void B(zzbgz zzbgzVar) {
        this.f13371h.add(zzbgzVar);
        this.f13369f.f(zzbgzVar);
    }

    public final void E(Object obj) {
        this.o = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final synchronized void j(Context context) {
        this.m.f13378e = "u";
        q();
        u();
        this.n = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final synchronized void k(Context context) {
        this.m.f13375b = false;
        q();
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        if (this.l.compareAndSet(false, true)) {
            this.f13369f.b(this);
            q();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        this.m.f13375b = true;
        q();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        this.m.f13375b = false;
        q();
    }

    public final synchronized void q() {
        if (!(this.o.get() != null)) {
            y();
            return;
        }
        if (!this.n && this.l.get()) {
            try {
                this.m.f13377d = this.f13374k.b();
                final JSONObject b2 = this.f13370g.b(this.m);
                for (final zzbgz zzbgzVar : this.f13371h) {
                    this.f13373j.execute(new Runnable(zzbgzVar, b2) { // from class: com.google.android.gms.internal.ads.vc

                        /* renamed from: f, reason: collision with root package name */
                        private final zzbgz f12283f;

                        /* renamed from: g, reason: collision with root package name */
                        private final JSONObject f12284g;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.f12283f = zzbgzVar;
                            this.f12284g = b2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12283f.Y("AFMA_updateActiveView", this.f12284g);
                        }
                    });
                }
                zzbao.b(this.f13372i.zzf(b2), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e2) {
                zzawz.l("Failed to call ActiveViewJS", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final synchronized void r(Context context) {
        this.m.f13375b = true;
        q();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final synchronized void r0(zzud zzudVar) {
        zzbmp zzbmpVar = this.m;
        zzbmpVar.a = zzudVar.m;
        zzbmpVar.f13379f = zzudVar;
        q();
    }

    public final synchronized void y() {
        u();
        this.n = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
    }
}
