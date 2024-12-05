package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzbfq extends zzawv {
    final zzbdf a;

    /* renamed from: b, reason: collision with root package name */
    final zzbft f13250b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13251c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f13252d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfq(zzbdf zzbdfVar, zzbft zzbftVar, String str, String[] strArr) {
        this.a = zzbdfVar;
        this.f13250b = zzbftVar;
        this.f13251c = str;
        this.f13252d = strArr;
        zzk.zzmc().a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        try {
            this.f13250b.x(this.f13251c, this.f13252d);
        } finally {
            zzaxi.a.post(new y9(this));
        }
    }
}
