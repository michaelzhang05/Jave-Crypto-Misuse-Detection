package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmy implements zzue {

    /* renamed from: f, reason: collision with root package name */
    private zzbgz f13397f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f13398g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbml f13399h;

    /* renamed from: i, reason: collision with root package name */
    private final Clock f13400i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13401j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13402k = false;
    private zzbmp l = new zzbmp();

    public zzbmy(Executor executor, zzbml zzbmlVar, Clock clock) {
        this.f13398g = executor;
        this.f13399h = zzbmlVar;
        this.f13400i = clock;
    }

    private final void q() {
        try {
            final JSONObject b2 = this.f13399h.b(this.l);
            if (this.f13397f != null) {
                this.f13398g.execute(new Runnable(this, b2) { // from class: com.google.android.gms.internal.ads.wc

                    /* renamed from: f, reason: collision with root package name */
                    private final zzbmy f12329f;

                    /* renamed from: g, reason: collision with root package name */
                    private final JSONObject f12330g;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f12329f = this;
                        this.f12330g = b2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12329f.y(this.f12330g);
                    }
                });
            }
        } catch (JSONException e2) {
            zzawz.l("Failed to call video active view js", e2);
        }
    }

    public final void j() {
        this.f13401j = false;
    }

    public final void k() {
        this.f13401j = true;
        q();
    }

    public final void r(boolean z) {
        this.f13402k = z;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void r0(zzud zzudVar) {
        zzbmp zzbmpVar = this.l;
        zzbmpVar.a = this.f13402k ? false : zzudVar.m;
        zzbmpVar.f13377d = this.f13400i.b();
        this.l.f13379f = zzudVar;
        if (this.f13401j) {
            q();
        }
    }

    public final void u(zzbgz zzbgzVar) {
        this.f13397f = zzbgzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void y(JSONObject jSONObject) {
        this.f13397f.Y("AFMA_updateActiveView", jSONObject);
    }
}
