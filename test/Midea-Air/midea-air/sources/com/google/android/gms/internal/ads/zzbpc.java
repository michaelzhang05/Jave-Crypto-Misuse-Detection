package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes2.dex */
public class zzbpc {
    protected zzcxu a;

    /* renamed from: b, reason: collision with root package name */
    protected zzcxm f13486b;

    /* renamed from: c, reason: collision with root package name */
    protected zzbry f13487c;

    /* renamed from: d, reason: collision with root package name */
    protected zzbso f13488d;

    /* renamed from: e, reason: collision with root package name */
    protected String f13489e;

    private static String e(zzcxm zzcxmVar) {
        try {
            return zzcxmVar.s.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    public void a() {
        this.f13487c.i0(null);
    }

    public final String b() {
        return this.f13489e;
    }

    public void c() {
        this.f13488d.onAdLoaded();
    }

    public final zzbry d() {
        return this.f13487c;
    }

    public final String f() {
        String e2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(this.f13489e) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(this.f13489e) ? e(this.f13486b) : null;
        return e2 == null ? this.f13489e : e2;
    }
}
