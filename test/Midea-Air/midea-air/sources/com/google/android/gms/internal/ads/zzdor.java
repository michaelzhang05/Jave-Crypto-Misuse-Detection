package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzdor {
    private static final zzdno a = zzdno.d();

    /* renamed from: b, reason: collision with root package name */
    private zzdmr f14866b;

    /* renamed from: c, reason: collision with root package name */
    private volatile zzdpk f14867c;

    /* renamed from: d, reason: collision with root package name */
    private volatile zzdmr f14868d;

    private final zzdpk c(zzdpk zzdpkVar) {
        if (this.f14867c == null) {
            synchronized (this) {
                if (this.f14867c == null) {
                    try {
                        this.f14867c = zzdpkVar;
                        this.f14868d = zzdmr.f14805f;
                    } catch (zzdok unused) {
                        this.f14867c = zzdpkVar;
                        this.f14868d = zzdmr.f14805f;
                    }
                }
            }
        }
        return this.f14867c;
    }

    public final zzdmr a() {
        if (this.f14868d != null) {
            return this.f14868d;
        }
        synchronized (this) {
            if (this.f14868d != null) {
                return this.f14868d;
            }
            if (this.f14867c == null) {
                this.f14868d = zzdmr.f14805f;
            } else {
                this.f14868d = this.f14867c.d();
            }
            return this.f14868d;
        }
    }

    public final int b() {
        if (this.f14868d != null) {
            return this.f14868d.size();
        }
        if (this.f14867c != null) {
            return this.f14867c.i();
        }
        return 0;
    }

    public final zzdpk d(zzdpk zzdpkVar) {
        zzdpk zzdpkVar2 = this.f14867c;
        this.f14866b = null;
        this.f14868d = null;
        this.f14867c = zzdpkVar;
        return zzdpkVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdor)) {
            return false;
        }
        zzdor zzdorVar = (zzdor) obj;
        zzdpk zzdpkVar = this.f14867c;
        zzdpk zzdpkVar2 = zzdorVar.f14867c;
        if (zzdpkVar == null && zzdpkVar2 == null) {
            return a().equals(zzdorVar.a());
        }
        if (zzdpkVar != null && zzdpkVar2 != null) {
            return zzdpkVar.equals(zzdpkVar2);
        }
        if (zzdpkVar != null) {
            return zzdpkVar.equals(zzdorVar.c(zzdpkVar.e()));
        }
        return c(zzdpkVar2.e()).equals(zzdpkVar2);
    }

    public int hashCode() {
        return 1;
    }
}
