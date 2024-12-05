package u1;

import t1.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f9378a;

    /* renamed from: b, reason: collision with root package name */
    private final t1.a f9379b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f9380c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9381d;

    private b(t1.a aVar, a.d dVar, String str) {
        this.f9379b = aVar;
        this.f9380c = dVar;
        this.f9381d = str;
        this.f9378a = v1.m.b(aVar, dVar, str);
    }

    public static b a(t1.a aVar, a.d dVar, String str) {
        return new b(aVar, dVar, str);
    }

    public final String b() {
        return this.f9379b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v1.m.a(this.f9379b, bVar.f9379b) && v1.m.a(this.f9380c, bVar.f9380c) && v1.m.a(this.f9381d, bVar.f9381d);
    }

    public final int hashCode() {
        return this.f9378a;
    }
}
