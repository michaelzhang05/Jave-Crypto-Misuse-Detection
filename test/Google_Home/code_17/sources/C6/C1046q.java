package C6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: C6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1046q extends C1037h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046q(InterfaceC1050v writer, boolean z8) {
        super(writer);
        AbstractC3255y.i(writer, "writer");
        this.f1682c = z8;
    }

    @Override // C6.C1037h
    public void d(byte b8) {
        boolean z8 = this.f1682c;
        String e8 = O5.y.e(O5.y.b(b8));
        if (z8) {
            m(e8);
        } else {
            j(e8);
        }
    }

    @Override // C6.C1037h
    public void h(int i8) {
        boolean z8 = this.f1682c;
        int b8 = O5.A.b(i8);
        if (z8) {
            m(AbstractC1041l.a(b8));
        } else {
            j(AbstractC1042m.a(b8));
        }
    }

    @Override // C6.C1037h
    public void i(long j8) {
        String a8;
        String a9;
        boolean z8 = this.f1682c;
        long b8 = O5.C.b(j8);
        if (z8) {
            a9 = AbstractC1044o.a(b8, 10);
            m(a9);
        } else {
            a8 = AbstractC1045p.a(b8, 10);
            j(a8);
        }
    }

    @Override // C6.C1037h
    public void k(short s8) {
        boolean z8 = this.f1682c;
        String e8 = O5.F.e(O5.F.b(s8));
        if (z8) {
            m(e8);
        } else {
            j(e8);
        }
    }
}
