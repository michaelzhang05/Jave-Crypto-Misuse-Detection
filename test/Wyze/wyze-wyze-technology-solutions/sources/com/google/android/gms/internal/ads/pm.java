package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* loaded from: classes2.dex */
final class pm implements zzf {
    private final /* synthetic */ zzbbr a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzcxu f12003b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzcxm f12004c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzcoz f12005d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzcor f12006e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pm(zzcor zzcorVar, zzbbr zzbbrVar, zzcxu zzcxuVar, zzcxm zzcxmVar, zzcoz zzcozVar) {
        this.f12006e = zzcorVar;
        this.a = zzbbrVar;
        this.f12003b = zzcxuVar;
        this.f12004c = zzcxmVar;
        this.f12005d = zzcozVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzg(View view) {
        zzcou zzcouVar;
        zzbbr zzbbrVar = this.a;
        zzcouVar = this.f12006e.f14306d;
        zzbbrVar.b(zzcouVar.a(this.f12003b, this.f12004c, view, this.f12005d));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzky() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzkz() {
    }
}
