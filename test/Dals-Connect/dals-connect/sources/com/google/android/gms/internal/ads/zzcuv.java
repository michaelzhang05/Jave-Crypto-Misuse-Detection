package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcuv implements zzcuz<Bundle> {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14477b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14478c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14479d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14480e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14481f;

    public zzcuv(boolean z, boolean z2, String str, boolean z3, int i2, int i3) {
        this.a = z;
        this.f14477b = z2;
        this.f14478c = str;
        this.f14479d = z3;
        this.f14480e = i2;
        this.f14481f = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f14478c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) zzyt.e().c(zzacu.C2));
        bundle2.putInt("target_api", this.f14480e);
        bundle2.putInt("dv", this.f14481f);
        Bundle a = zzcxz.a(bundle2, "sdk_env");
        a.putBoolean("mf", ((Boolean) zzyt.e().c(zzacu.E2)).booleanValue());
        a.putBoolean("instant_app", this.a);
        a.putBoolean("lite", this.f14477b);
        a.putBoolean("is_privileged_process", this.f14479d);
        bundle2.putBundle("sdk_env", a);
        Bundle a2 = zzcxz.a(a, "build_meta");
        a2.putString("cl", "248613007");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
