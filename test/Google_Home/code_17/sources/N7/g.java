package n7;

import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import U6.C1456n;
import U6.InterfaceC1444d;
import t7.AbstractC4043a;

/* loaded from: classes5.dex */
public class g extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private C1453k f35704a;

    /* renamed from: b, reason: collision with root package name */
    private C1456n f35705b;

    /* renamed from: c, reason: collision with root package name */
    private C1453k f35706c;

    /* renamed from: d, reason: collision with root package name */
    private byte[][] f35707d;

    /* renamed from: e, reason: collision with root package name */
    private byte[][] f35708e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f35709f;

    public g(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f35704a = new C1453k(0L);
        this.f35706c = new C1453k(i8);
        this.f35707d = AbstractC4043a.c(sArr);
        this.f35708e = AbstractC4043a.c(sArr2);
        this.f35709f = AbstractC4043a.a(sArr3);
    }

    public static g p(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        InterfaceC1444d interfaceC1444d = this.f35704a;
        if (interfaceC1444d == null) {
            interfaceC1444d = this.f35705b;
        }
        c1446e.a(interfaceC1444d);
        c1446e.a(this.f35706c);
        C1446e c1446e2 = new C1446e();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[][] bArr = this.f35707d;
            if (i9 >= bArr.length) {
                break;
            }
            c1446e2.a(new C1439a0(bArr[i9]));
            i9++;
        }
        c1446e.a(new C1447e0(c1446e2));
        C1446e c1446e3 = new C1446e();
        while (true) {
            byte[][] bArr2 = this.f35708e;
            if (i8 < bArr2.length) {
                c1446e3.a(new C1439a0(bArr2[i8]));
                i8++;
            } else {
                c1446e.a(new C1447e0(c1446e3));
                C1446e c1446e4 = new C1446e();
                c1446e4.a(new C1439a0(this.f35709f));
                c1446e.a(new C1447e0(c1446e4));
                return new C1447e0(c1446e);
            }
        }
    }

    public short[][] l() {
        return AbstractC4043a.d(this.f35707d);
    }

    public short[] m() {
        return AbstractC4043a.b(this.f35709f);
    }

    public short[][] n() {
        return AbstractC4043a.d(this.f35708e);
    }

    public int o() {
        return this.f35706c.B();
    }

    private g(AbstractC1462u abstractC1462u) {
        if (abstractC1462u.v(0) instanceof C1453k) {
            this.f35704a = C1453k.v(abstractC1462u.v(0));
        } else {
            this.f35705b = C1456n.B(abstractC1462u.v(0));
        }
        this.f35706c = C1453k.v(abstractC1462u.v(1));
        AbstractC1462u u8 = AbstractC1462u.u(abstractC1462u.v(2));
        this.f35707d = new byte[u8.size()];
        for (int i8 = 0; i8 < u8.size(); i8++) {
            this.f35707d[i8] = AbstractC1457o.v(u8.v(i8)).y();
        }
        AbstractC1462u abstractC1462u2 = (AbstractC1462u) abstractC1462u.v(3);
        this.f35708e = new byte[abstractC1462u2.size()];
        for (int i9 = 0; i9 < abstractC1462u2.size(); i9++) {
            this.f35708e[i9] = AbstractC1457o.v(abstractC1462u2.v(i9)).y();
        }
        this.f35709f = AbstractC1457o.v(((AbstractC1462u) abstractC1462u.v(4)).v(0)).y();
    }
}
