package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcur implements zzcuz<Bundle> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14469b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14470c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14471d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f14472e;

    public zzcur(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.f14469b = str2;
        this.f14470c = str3;
        this.f14471d = str4;
        this.f14472e = l;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzcxz.e(bundle2, "gmp_app_id", this.a);
        zzcxz.e(bundle2, "fbs_aiid", this.f14469b);
        zzcxz.e(bundle2, "fbs_aeid", this.f14470c);
        zzcxz.e(bundle2, "apm_id_origin", this.f14471d);
        Long l = this.f14472e;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
