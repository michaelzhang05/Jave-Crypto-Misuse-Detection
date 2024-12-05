package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzbcw {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbdf f13177b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f13178c;

    /* renamed from: d, reason: collision with root package name */
    private zzbcq f13179d;

    public zzbcw(Context context, ViewGroup viewGroup, zzbgz zzbgzVar) {
        this(context, viewGroup, zzbgzVar, null);
    }

    public final void a() {
        Preconditions.f("onDestroy must be called from the UI thread.");
        zzbcq zzbcqVar = this.f13179d;
        if (zzbcqVar != null) {
            zzbcqVar.b();
            this.f13178c.removeView(this.f13179d);
            this.f13179d = null;
        }
    }

    public final void b() {
        Preconditions.f("onPause must be called from the UI thread.");
        zzbcq zzbcqVar = this.f13179d;
        if (zzbcqVar != null) {
            zzbcqVar.c();
        }
    }

    public final void c(int i2, int i3, int i4, int i5, int i6, boolean z, zzbde zzbdeVar) {
        if (this.f13179d != null) {
            return;
        }
        zzadb.a(this.f13177b.n().c(), this.f13177b.P(), "vpr2");
        Context context = this.a;
        zzbdf zzbdfVar = this.f13177b;
        zzbcq zzbcqVar = new zzbcq(context, zzbdfVar, i6, z, zzbdfVar.n().c(), zzbdeVar);
        this.f13179d = zzbcqVar;
        this.f13178c.addView(zzbcqVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f13179d.w(i2, i3, i4, i5);
        this.f13177b.v0(false);
    }

    public final void d(int i2, int i3, int i4, int i5) {
        Preconditions.f("The underlay may only be modified from the UI thread.");
        zzbcq zzbcqVar = this.f13179d;
        if (zzbcqVar != null) {
            zzbcqVar.w(i2, i3, i4, i5);
        }
    }

    public final zzbcq e() {
        Preconditions.f("getAdVideoUnderlay must be called from the UI thread.");
        return this.f13179d;
    }

    @VisibleForTesting
    private zzbcw(Context context, ViewGroup viewGroup, zzbdf zzbdfVar, zzbcq zzbcqVar) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f13178c = viewGroup;
        this.f13177b = zzbdfVar;
        this.f13179d = null;
    }
}
