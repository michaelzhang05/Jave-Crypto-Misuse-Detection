package R6;

/* renamed from: R6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1341h extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    protected C1347n f8821a;

    /* renamed from: b, reason: collision with root package name */
    protected C1344k f8822b;

    /* renamed from: c, reason: collision with root package name */
    protected AbstractC1351s f8823c;

    /* renamed from: d, reason: collision with root package name */
    protected int f8824d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC1351s f8825e;

    public AbstractC1341h(C1337e c1337e) {
        int i8 = 0;
        AbstractC1351s w8 = w(c1337e, 0);
        if (w8 instanceof C1347n) {
            this.f8821a = (C1347n) w8;
            w8 = w(c1337e, 1);
            i8 = 1;
        }
        if (w8 instanceof C1344k) {
            this.f8822b = (C1344k) w8;
            i8++;
            w8 = w(c1337e, i8);
        }
        if (!(w8 instanceof AbstractC1358z)) {
            this.f8823c = w8;
            i8++;
            w8 = w(c1337e, i8);
        }
        if (c1337e.f() != i8 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(w8 instanceof AbstractC1358z)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        AbstractC1358z abstractC1358z = (AbstractC1358z) w8;
        z(abstractC1358z.y());
        this.f8825e = abstractC1358z.x();
    }

    private void A(AbstractC1351s abstractC1351s) {
        this.f8825e = abstractC1351s;
    }

    private void B(C1344k c1344k) {
        this.f8822b = c1344k;
    }

    private AbstractC1351s w(C1337e c1337e, int i8) {
        if (c1337e.f() > i8) {
            return c1337e.d(i8).d();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void x(AbstractC1351s abstractC1351s) {
        this.f8823c = abstractC1351s;
    }

    private void y(C1347n c1347n) {
        this.f8821a = c1347n;
    }

    private void z(int i8) {
        if (i8 >= 0 && i8 <= 2) {
            this.f8824d = i8;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i8);
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        int i8;
        C1347n c1347n = this.f8821a;
        if (c1347n != null) {
            i8 = c1347n.hashCode();
        } else {
            i8 = 0;
        }
        C1344k c1344k = this.f8822b;
        if (c1344k != null) {
            i8 ^= c1344k.hashCode();
        }
        AbstractC1351s abstractC1351s = this.f8823c;
        if (abstractC1351s != null) {
            i8 ^= abstractC1351s.hashCode();
        }
        return i8 ^ this.f8825e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        AbstractC1351s abstractC1351s2;
        C1344k c1344k;
        C1347n c1347n;
        if (!(abstractC1351s instanceof AbstractC1341h)) {
            return false;
        }
        if (this == abstractC1351s) {
            return true;
        }
        AbstractC1341h abstractC1341h = (AbstractC1341h) abstractC1351s;
        C1347n c1347n2 = this.f8821a;
        if (c1347n2 != null && ((c1347n = abstractC1341h.f8821a) == null || !c1347n.r(c1347n2))) {
            return false;
        }
        C1344k c1344k2 = this.f8822b;
        if (c1344k2 != null && ((c1344k = abstractC1341h.f8822b) == null || !c1344k.r(c1344k2))) {
            return false;
        }
        AbstractC1351s abstractC1351s3 = this.f8823c;
        if (abstractC1351s3 != null && ((abstractC1351s2 = abstractC1341h.f8823c) == null || !abstractC1351s2.r(abstractC1351s3))) {
            return false;
        }
        return this.f8825e.r(abstractC1341h.f8825e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean t() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s u() {
        return new S(this.f8821a, this.f8822b, this.f8823c, this.f8824d, this.f8825e);
    }

    public AbstractC1341h(C1347n c1347n, C1344k c1344k, AbstractC1351s abstractC1351s, int i8, AbstractC1351s abstractC1351s2) {
        y(c1347n);
        B(c1344k);
        x(abstractC1351s);
        z(i8);
        A(abstractC1351s2.d());
    }
}
