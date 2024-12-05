package com.google.zxing;

/* compiled from: Dimension.java */
/* loaded from: classes2.dex */
public final class b {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16995b;

    public int a() {
        return this.f16995b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.f16995b == bVar.f16995b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 32713) + this.f16995b;
    }

    public String toString() {
        return this.a + "x" + this.f16995b;
    }
}
