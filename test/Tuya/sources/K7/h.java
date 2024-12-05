package k7;

import R6.AbstractC1346m;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* loaded from: classes5.dex */
public class h extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final C1344k f33718a;

    /* renamed from: b, reason: collision with root package name */
    private final X6.a f33719b;

    private h(AbstractC1353u abstractC1353u) {
        this.f33718a = C1344k.x(abstractC1353u.x(0));
        this.f33719b = X6.a.p(abstractC1353u.x(1));
    }

    public static final h m(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(this.f33718a);
        c1337e.a(this.f33719b);
        return new C1338e0(c1337e);
    }

    public X6.a p() {
        return this.f33719b;
    }

    public h(X6.a aVar) {
        this.f33718a = new C1344k(0L);
        this.f33719b = aVar;
    }
}
