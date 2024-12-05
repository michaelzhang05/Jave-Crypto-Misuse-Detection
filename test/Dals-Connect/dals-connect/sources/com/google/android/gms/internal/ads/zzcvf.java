package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzcvf implements zzcuz<Bundle> {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14488b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14489c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14490d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14491e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14492f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14493g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14494h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14495i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14496j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f14497k;
    private final String l;

    public zzcvf(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, String str6) {
        this.a = z;
        this.f14488b = z2;
        this.f14489c = str;
        this.f14490d = z3;
        this.f14491e = z4;
        this.f14492f = z5;
        this.f14493g = str2;
        this.f14494h = str3;
        this.f14495i = str4;
        this.f14496j = str5;
        this.f14497k = z6;
        this.l = str6;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.a);
        bundle2.putBoolean("coh", this.f14488b);
        bundle2.putString("gl", this.f14489c);
        bundle2.putBoolean("simulator", this.f14490d);
        bundle2.putBoolean("is_latchsky", this.f14491e);
        bundle2.putBoolean("is_sidewinder", this.f14492f);
        bundle2.putString("hl", this.f14493g);
        bundle2.putString("mv", this.f14494h);
        bundle2.putString("submodel", this.l);
        Bundle a = zzcxz.a(bundle2, "device");
        bundle2.putBundle("device", a);
        a.putString("build", this.f14496j);
        Bundle a2 = zzcxz.a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.f14497k);
        if (TextUtils.isEmpty(this.f14495i)) {
            return;
        }
        Bundle a3 = zzcxz.a(a, "play_store");
        a.putBundle("play_store", a3);
        a3.putString("package_version", this.f14495i);
    }
}
