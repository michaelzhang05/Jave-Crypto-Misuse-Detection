package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
final class kj implements zzbtk {

    /* renamed from: f, reason: collision with root package name */
    private final Context f11725f;

    /* renamed from: g, reason: collision with root package name */
    private final zzavg f11726g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kj(Context context, zzavg zzavgVar) {
        this.f11725f = context;
        this.f11726g = zzavgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void P(zzarx zzarxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void q(zzcxu zzcxuVar) {
        if (TextUtils.isEmpty(zzcxuVar.f14570b.f14567b.f14561d)) {
            return;
        }
        this.f11726g.w(this.f11725f, zzcxuVar.f14570b.f14567b.f14561d);
    }
}
