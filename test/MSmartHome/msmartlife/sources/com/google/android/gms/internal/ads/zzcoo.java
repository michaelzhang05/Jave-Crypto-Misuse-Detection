package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcoo implements zzf {
    private final zzbri a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbrt f14295b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbvd f14296c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbva f14297d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbmn f14298e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f14299f = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcoo(zzbri zzbriVar, zzbrt zzbrtVar, zzbvd zzbvdVar, zzbva zzbvaVar, zzbmn zzbmnVar) {
        this.a = zzbriVar;
        this.f14295b = zzbrtVar;
        this.f14296c = zzbvdVar;
        this.f14297d = zzbvaVar;
        this.f14298e = zzbmnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzg(View view) {
        if (this.f14299f.compareAndSet(false, true)) {
            this.f14298e.onAdImpression();
            this.f14297d.Y(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzky() {
        if (this.f14299f.get()) {
            this.a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzkz() {
        if (this.f14299f.get()) {
            this.f14295b.Y();
            this.f14296c.Y();
        }
    }
}
