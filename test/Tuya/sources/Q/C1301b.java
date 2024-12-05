package Q;

import P.a;
import R.AbstractC1317n;

/* renamed from: Q.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8148a;

    /* renamed from: b, reason: collision with root package name */
    private final P.a f8149b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f8150c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8151d;

    private C1301b(P.a aVar, a.d dVar, String str) {
        this.f8149b = aVar;
        this.f8150c = dVar;
        this.f8151d = str;
        this.f8148a = AbstractC1317n.b(aVar, dVar, str);
    }

    public static C1301b a(P.a aVar, a.d dVar, String str) {
        return new C1301b(aVar, dVar, str);
    }

    public final String b() {
        return this.f8149b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1301b)) {
            return false;
        }
        C1301b c1301b = (C1301b) obj;
        if (!AbstractC1317n.a(this.f8149b, c1301b.f8149b) || !AbstractC1317n.a(this.f8150c, c1301b.f8150c) || !AbstractC1317n.a(this.f8151d, c1301b.f8151d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8148a;
    }
}
