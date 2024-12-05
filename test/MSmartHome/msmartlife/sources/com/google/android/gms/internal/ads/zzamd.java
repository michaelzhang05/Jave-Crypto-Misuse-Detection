package com.google.android.gms.internal.ads;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzamd<I, O> implements zzbal<I, O> {
    private final zzall<O> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzalm<I> f12787b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12788c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbbh<zzalf> f12789d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamd(zzbbh<zzalf> zzbbhVar, String str, zzalm<I> zzalmVar, zzall<O> zzallVar) {
        this.f12789d = zzbbhVar;
        this.f12788c = str;
        this.f12787b = zzalmVar;
        this.a = zzallVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh c(Object obj, zzalf zzalfVar) throws Exception {
        zzbbr zzbbrVar = new zzbbr();
        zzk.zzlg();
        String j0 = zzaxi.j0();
        zzagz.o.c(j0, new p2(this, zzbbrVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, j0);
        jSONObject.put("args", this.f12787b.b(obj));
        zzalfVar.Y(this.f12788c, jSONObject);
        return zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final zzbbh<O> zzf(final I i2) throws Exception {
        return zzbar.c(this.f12789d, new zzbal(this, i2) { // from class: com.google.android.gms.internal.ads.o2
            private final zzamd a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f11911b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11911b = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.c(this.f11911b, (zzalf) obj);
            }
        }, zzbbm.f13155b);
    }
}
