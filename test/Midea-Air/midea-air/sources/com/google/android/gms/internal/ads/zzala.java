package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzala extends zzbbw<zzajw> {

    /* renamed from: d, reason: collision with root package name */
    private zzayp<zzajw> f12771d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f12770c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f12772e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f12773f = 0;

    public zzala(zzayp<zzajw> zzaypVar) {
        this.f12771d = zzaypVar;
    }

    private final void j() {
        synchronized (this.f12770c) {
            Preconditions.l(this.f12773f >= 0);
            if (this.f12772e && this.f12773f == 0) {
                zzawz.m("No reference is left (including root). Cleaning up engine.");
                d(new a2(this), new zzbbu());
            } else {
                zzawz.m("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final zzakw g() {
        zzakw zzakwVar = new zzakw(this);
        synchronized (this.f12770c) {
            d(new y1(this, zzakwVar), new z1(this, zzakwVar));
            Preconditions.l(this.f12773f >= 0);
            this.f12773f++;
        }
        return zzakwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        synchronized (this.f12770c) {
            Preconditions.l(this.f12773f > 0);
            zzawz.m("Releasing 1 reference for JS Engine");
            this.f12773f--;
            j();
        }
    }

    public final void i() {
        synchronized (this.f12770c) {
            Preconditions.l(this.f12773f >= 0);
            zzawz.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f12772e = true;
            j();
        }
    }
}
