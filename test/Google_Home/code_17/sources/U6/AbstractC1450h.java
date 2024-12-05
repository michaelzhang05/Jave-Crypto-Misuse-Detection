package U6;

/* renamed from: U6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1450h extends AbstractC1460s {

    /* renamed from: a, reason: collision with root package name */
    protected C1456n f10447a;

    /* renamed from: b, reason: collision with root package name */
    protected C1453k f10448b;

    /* renamed from: c, reason: collision with root package name */
    protected AbstractC1460s f10449c;

    /* renamed from: d, reason: collision with root package name */
    protected int f10450d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC1460s f10451e;

    public AbstractC1450h(C1446e c1446e) {
        int i8 = 0;
        AbstractC1460s u8 = u(c1446e, 0);
        if (u8 instanceof C1456n) {
            this.f10447a = (C1456n) u8;
            u8 = u(c1446e, 1);
            i8 = 1;
        }
        if (u8 instanceof C1453k) {
            this.f10448b = (C1453k) u8;
            i8++;
            u8 = u(c1446e, i8);
        }
        if (!(u8 instanceof AbstractC1467z)) {
            this.f10449c = u8;
            i8++;
            u8 = u(c1446e, i8);
        }
        if (c1446e.f() != i8 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(u8 instanceof AbstractC1467z)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        AbstractC1467z abstractC1467z = (AbstractC1467z) u8;
        z(abstractC1467z.y());
        this.f10451e = abstractC1467z.v();
    }

    private void A(AbstractC1460s abstractC1460s) {
        this.f10451e = abstractC1460s;
    }

    private void B(C1453k c1453k) {
        this.f10448b = c1453k;
    }

    private AbstractC1460s u(C1446e c1446e, int i8) {
        if (c1446e.f() > i8) {
            return c1446e.d(i8).d();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void v(AbstractC1460s abstractC1460s) {
        this.f10449c = abstractC1460s;
    }

    private void y(C1456n c1456n) {
        this.f10447a = c1456n;
    }

    private void z(int i8) {
        if (i8 >= 0 && i8 <= 2) {
            this.f10450d = i8;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i8);
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        int i8;
        C1456n c1456n = this.f10447a;
        if (c1456n != null) {
            i8 = c1456n.hashCode();
        } else {
            i8 = 0;
        }
        C1453k c1453k = this.f10448b;
        if (c1453k != null) {
            i8 ^= c1453k.hashCode();
        }
        AbstractC1460s abstractC1460s = this.f10449c;
        if (abstractC1460s != null) {
            i8 ^= abstractC1460s.hashCode();
        }
        return i8 ^ this.f10451e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        AbstractC1460s abstractC1460s2;
        C1453k c1453k;
        C1456n c1456n;
        if (!(abstractC1460s instanceof AbstractC1450h)) {
            return false;
        }
        if (this == abstractC1460s) {
            return true;
        }
        AbstractC1450h abstractC1450h = (AbstractC1450h) abstractC1460s;
        C1456n c1456n2 = this.f10447a;
        if (c1456n2 != null && ((c1456n = abstractC1450h.f10447a) == null || !c1456n.o(c1456n2))) {
            return false;
        }
        C1453k c1453k2 = this.f10448b;
        if (c1453k2 != null && ((c1453k = abstractC1450h.f10448b) == null || !c1453k.o(c1453k2))) {
            return false;
        }
        AbstractC1460s abstractC1460s3 = this.f10449c;
        if (abstractC1460s3 != null && ((abstractC1460s2 = abstractC1450h.f10449c) == null || !abstractC1460s2.o(abstractC1460s3))) {
            return false;
        }
        return this.f10451e.o(abstractC1450h.f10451e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean q() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s r() {
        return new S(this.f10447a, this.f10448b, this.f10449c, this.f10450d, this.f10451e);
    }

    public AbstractC1450h(C1456n c1456n, C1453k c1453k, AbstractC1460s abstractC1460s, int i8, AbstractC1460s abstractC1460s2) {
        y(c1456n);
        B(c1453k);
        v(abstractC1460s);
        z(i8);
        A(abstractC1460s2.d());
    }
}
