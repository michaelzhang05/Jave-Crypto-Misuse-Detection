package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public class zzvc {
    private static final zzub a = zzub.b();

    /* renamed from: b, reason: collision with root package name */
    private zzte f16148b;

    /* renamed from: c, reason: collision with root package name */
    private volatile zzvv f16149c;

    /* renamed from: d, reason: collision with root package name */
    private volatile zzte f16150d;

    private final zzvv a(zzvv zzvvVar) {
        if (this.f16149c == null) {
            synchronized (this) {
                if (this.f16149c == null) {
                    try {
                        this.f16149c = zzvvVar;
                        this.f16150d = zzte.f16104f;
                    } catch (zzuv unused) {
                        this.f16149c = zzvvVar;
                        this.f16150d = zzte.f16104f;
                    }
                }
            }
        }
        return this.f16149c;
    }

    public final zzvv b(zzvv zzvvVar) {
        zzvv zzvvVar2 = this.f16149c;
        this.f16148b = null;
        this.f16150d = null;
        this.f16149c = zzvvVar;
        return zzvvVar2;
    }

    public final zzte c() {
        if (this.f16150d != null) {
            return this.f16150d;
        }
        synchronized (this) {
            if (this.f16150d != null) {
                return this.f16150d;
            }
            if (this.f16149c == null) {
                this.f16150d = zzte.f16104f;
            } else {
                this.f16150d = this.f16149c.d();
            }
            return this.f16150d;
        }
    }

    public final int d() {
        if (this.f16150d != null) {
            return this.f16150d.size();
        }
        if (this.f16149c != null) {
            return this.f16149c.j();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvc)) {
            return false;
        }
        zzvc zzvcVar = (zzvc) obj;
        zzvv zzvvVar = this.f16149c;
        zzvv zzvvVar2 = zzvcVar.f16149c;
        if (zzvvVar == null && zzvvVar2 == null) {
            return c().equals(zzvcVar.c());
        }
        if (zzvvVar != null && zzvvVar2 != null) {
            return zzvvVar.equals(zzvvVar2);
        }
        if (zzvvVar != null) {
            return zzvvVar.equals(zzvcVar.a(zzvvVar.e()));
        }
        return a(zzvvVar2.e()).equals(zzvvVar2);
    }

    public int hashCode() {
        return 1;
    }
}
