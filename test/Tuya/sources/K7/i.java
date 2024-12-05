package k7;

import R6.AbstractC1346m;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* loaded from: classes5.dex */
public class i extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final C1344k f33720a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33721b;

    /* renamed from: c, reason: collision with root package name */
    private final X6.a f33722c;

    public i(int i8, X6.a aVar) {
        this.f33720a = new C1344k(0L);
        this.f33721b = i8;
        this.f33722c = aVar;
    }

    public static i p(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(this.f33720a);
        c1337e.a(new C1344k(this.f33721b));
        c1337e.a(this.f33722c);
        return new C1338e0(c1337e);
    }

    public int m() {
        return this.f33721b;
    }

    public X6.a q() {
        return this.f33722c;
    }

    private i(AbstractC1353u abstractC1353u) {
        this.f33720a = C1344k.x(abstractC1353u.x(0));
        this.f33721b = C1344k.x(abstractC1353u.x(1)).B();
        this.f33722c = X6.a.p(abstractC1353u.x(2));
    }
}
