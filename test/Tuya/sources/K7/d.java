package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* loaded from: classes5.dex */
public class d extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final int f33650a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33651b;

    /* renamed from: c, reason: collision with root package name */
    private final D7.a f33652c;

    public d(int i8, int i9, D7.a aVar) {
        this.f33650a = i8;
        this.f33651b = i9;
        this.f33652c = new D7.a(aVar);
    }

    public static d p(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(this.f33650a));
        c1337e.a(new C1344k(this.f33651b));
        c1337e.a(new C1330a0(this.f33652c.c()));
        return new C1338e0(c1337e);
    }

    public D7.a m() {
        return new D7.a(this.f33652c);
    }

    public int q() {
        return this.f33650a;
    }

    public int r() {
        return this.f33651b;
    }

    private d(AbstractC1353u abstractC1353u) {
        this.f33650a = ((C1344k) abstractC1353u.x(0)).B();
        this.f33651b = ((C1344k) abstractC1353u.x(1)).B();
        this.f33652c = new D7.a(((AbstractC1348o) abstractC1353u.x(2)).y());
    }
}
