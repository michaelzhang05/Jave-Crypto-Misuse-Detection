package P;

import O.a;
import Q.AbstractC1398n;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1357b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8639a;

    /* renamed from: b, reason: collision with root package name */
    private final O.a f8640b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f8641c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8642d;

    private C1357b(O.a aVar, a.d dVar, String str) {
        this.f8640b = aVar;
        this.f8641c = dVar;
        this.f8642d = str;
        this.f8639a = AbstractC1398n.b(aVar, dVar, str);
    }

    public static C1357b a(O.a aVar, a.d dVar, String str) {
        return new C1357b(aVar, dVar, str);
    }

    public final String b() {
        return this.f8640b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1357b)) {
            return false;
        }
        C1357b c1357b = (C1357b) obj;
        if (!AbstractC1398n.a(this.f8640b, c1357b.f8640b) || !AbstractC1398n.a(this.f8641c, c1357b.f8641c) || !AbstractC1398n.a(this.f8642d, c1357b.f8642d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8639a;
    }
}
