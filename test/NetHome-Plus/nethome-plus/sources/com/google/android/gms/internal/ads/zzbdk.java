package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbdk {

    @VisibleForTesting
    private static int a;

    /* renamed from: b */
    @VisibleForTesting
    private static int f13212b;

    /* renamed from: c */
    private zzge f13213c;

    /* renamed from: d */
    private zzhd f13214d;

    /* renamed from: e */
    private zzgn f13215e;

    /* renamed from: f */
    private zzbdo f13216f;

    /* renamed from: g */
    private final j8 f13217g;

    /* renamed from: h */
    private final k8 f13218h;

    /* renamed from: i */
    private final i8 f13219i;

    public zzbdk() {
        j8 j8Var = new j8(this);
        this.f13217g = j8Var;
        this.f13218h = new k8(this);
        this.f13219i = new i8(this);
        Preconditions.f("ExoPlayer must be created on the main UI thread.");
        if (zzawz.n()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(valueOf.length() + 29);
            sb.append("AdExoPlayerHelper initialize ");
            sb.append(valueOf);
            zzawz.m(sb.toString());
        }
        a++;
        zzge a2 = zzgg.a(2);
        this.f13213c = a2;
        a2.i(j8Var);
    }

    public final synchronized void f(String str, String str2) {
        zzbdo zzbdoVar = this.f13216f;
        if (zzbdoVar != null) {
            zzbdoVar.h(str, str2);
        }
    }

    public static int g() {
        return a;
    }

    public static int h() {
        return f13212b;
    }

    public final synchronized void a() {
        this.f13216f = null;
    }

    public final synchronized void c(zzbdo zzbdoVar) {
        this.f13216f = zzbdoVar;
    }

    public final void d(zzgh zzghVar, zzhh zzhhVar, zzgq zzgqVar) {
        this.f13217g.a(zzghVar);
        this.f13218h.i(zzhhVar);
        this.f13219i.i(zzgqVar);
    }

    public final boolean e(zzhn zzhnVar) {
        if (this.f13213c == null) {
            return false;
        }
        Handler handler = zzaxi.a;
        this.f13214d = new zzhd(zzhnVar, 1, 0L, handler, this.f13218h, -1);
        zzgn zzgnVar = new zzgn(zzhnVar, handler, this.f13219i);
        this.f13215e = zzgnVar;
        this.f13213c.k(this.f13214d, zzgnVar);
        f13212b++;
        return true;
    }

    public final void finalize() throws Throwable {
        a--;
        if (zzawz.n()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("AdExoPlayerHelper finalize ");
            sb.append(valueOf);
            zzawz.m(sb.toString());
        }
    }

    public final void i() {
        zzge zzgeVar = this.f13213c;
        if (zzgeVar != null) {
            zzgeVar.a();
            this.f13213c = null;
            f13212b--;
        }
    }

    public final zzge j() {
        return this.f13213c;
    }

    public final zzhd k() {
        return this.f13214d;
    }

    public final zzgn l() {
        return this.f13215e;
    }
}
