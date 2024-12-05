package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.ads.zzdap;
import com.google.android.gms.internal.ads.zzdau;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzdan {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f14661b;

    public zzdan(Context context, Looper looper) {
        this.a = context;
        this.f14661b = looper;
    }

    public final void a(String str) {
        new sq(this.a, this.f14661b, (zzdau) ((zzdob) zzdau.D().x(this.a.getPackageName()).v(zzdau.zzb.BLOCKED_IMPRESSION).u(zzdap.B().v(str).u(zzdap.zza.BLOCKED_REASON_BACKGROUND)).J())).b();
    }
}
