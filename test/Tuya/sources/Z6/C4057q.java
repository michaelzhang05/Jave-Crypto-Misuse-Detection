package z6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4057q extends C4048h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057q(InterfaceC4061v writer, boolean z8) {
        super(writer);
        AbstractC3159y.i(writer, "writer");
        this.f40564c = z8;
    }

    @Override // z6.C4048h
    public void d(byte b8) {
        boolean z8 = this.f40564c;
        String e8 = L5.y.e(L5.y.b(b8));
        if (z8) {
            m(e8);
        } else {
            j(e8);
        }
    }

    @Override // z6.C4048h
    public void h(int i8) {
        boolean z8 = this.f40564c;
        int b8 = L5.A.b(i8);
        if (z8) {
            m(AbstractC4052l.a(b8));
        } else {
            j(AbstractC4053m.a(b8));
        }
    }

    @Override // z6.C4048h
    public void i(long j8) {
        String a8;
        String a9;
        boolean z8 = this.f40564c;
        long b8 = L5.C.b(j8);
        if (z8) {
            a9 = AbstractC4055o.a(b8, 10);
            m(a9);
        } else {
            a8 = AbstractC4056p.a(b8, 10);
            j(a8);
        }
    }

    @Override // z6.C4048h
    public void k(short s8) {
        boolean z8 = this.f40564c;
        String e8 = L5.F.e(L5.F.b(s8));
        if (z8) {
            m(e8);
        } else {
            j(e8);
        }
    }
}
