package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbgp extends zzbft implements zzbfi {

    /* renamed from: i, reason: collision with root package name */
    private zzbfa f13269i;

    /* renamed from: j, reason: collision with root package name */
    private String f13270j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13271k;
    private Exception l;
    private boolean m;

    public zzbgp(zzbdf zzbdfVar, zzbde zzbdeVar) {
        super(zzbdfVar);
        zzbfa zzbfaVar = new zzbfa(zzbdfVar.getContext(), zzbdeVar);
        this.f13269i = zzbfaVar;
        zzbfaVar.x(this);
    }

    private static String C(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void D(String str) {
        synchronized (this) {
            this.f13271k = true;
            notify();
            a();
        }
        String str2 = this.f13270j;
        if (str2 != null) {
            String z = z(str2);
            Exception exc = this.l;
            if (exc != null) {
                l(this.f13270j, z, "badUrl", C(str, exc));
            } else {
                l(this.f13270j, z, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbfa B() {
        synchronized (this) {
            this.m = true;
            notify();
        }
        this.f13269i.x(null);
        zzbfa zzbfaVar = this.f13269i;
        this.f13269i = null;
        return zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbft, com.google.android.gms.common.api.Releasable
    public final void a() {
        zzbfa zzbfaVar = this.f13269i;
        if (zzbfaVar != null) {
            zzbfaVar.x(null);
            this.f13269i.t();
        }
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void b(final boolean z, final long j2) {
        final zzbdf zzbdfVar = this.f13256h.get();
        if (zzbdfVar != null) {
            zzbbm.a.execute(new Runnable(zzbdfVar, z, j2) { // from class: com.google.android.gms.internal.ads.la

                /* renamed from: f, reason: collision with root package name */
                private final zzbdf f11755f;

                /* renamed from: g, reason: collision with root package name */
                private final boolean f11756g;

                /* renamed from: h, reason: collision with root package name */
                private final long f11757h;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11755f = zzbdfVar;
                    this.f11756g = z;
                    this.f11757h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11755f.R(this.f11756g, this.f11757h);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void c() {
        D(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void q(int i2) {
        this.f13269i.J().j(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void r(int i2) {
        this.f13269i.J().k(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void s(int i2) {
        this.f13269i.J().h(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void t(int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void u(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void v(String str, Exception exc) {
        this.l = exc;
        zzbad.d("Precache error", exc);
        D(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void w(int i2) {
        this.f13269i.J().i(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        return true;
     */
    @Override // com.google.android.gms.internal.ads.zzbft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(java.lang.String r34, java.lang.String[] r35) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgp.x(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean y(String str) {
        return x(str, new String[]{str});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbft
    public final String z(String str) {
        String valueOf = String.valueOf(super.z(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }
}
