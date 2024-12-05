package z6;

import A6.W;
import kotlin.jvm.internal.AbstractC3255y;
import w6.i;
import z6.d;
import z6.f;

/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4234b implements f, d {
    @Override // z6.d
    public final void A(y6.f descriptor, int i8, long j8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            D(j8);
        }
    }

    @Override // z6.d
    public final void B(y6.f descriptor, int i8, char c8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            t(c8);
        }
    }

    @Override // z6.d
    public void C(y6.f descriptor, int i8, i serializer, Object obj) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(serializer, "serializer");
        if (G(descriptor, i8)) {
            g(serializer, obj);
        }
    }

    @Override // z6.f
    public abstract void D(long j8);

    @Override // z6.f
    public abstract void E(String str);

    @Override // z6.d
    public final void F(y6.f descriptor, int i8, short s8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            i(s8);
        }
    }

    public boolean G(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return true;
    }

    public void H(i iVar, Object obj) {
        f.a.c(this, iVar, obj);
    }

    public void b(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
    }

    @Override // z6.f
    public d d(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        return this;
    }

    @Override // z6.d
    public final void e(y6.f descriptor, int i8, String value) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(value, "value");
        if (G(descriptor, i8)) {
            E(value);
        }
    }

    @Override // z6.f
    public void g(i iVar, Object obj) {
        f.a.d(this, iVar, obj);
    }

    @Override // z6.f
    public abstract void h(double d8);

    @Override // z6.f
    public abstract void i(short s8);

    @Override // z6.f
    public d j(y6.f fVar, int i8) {
        return f.a.a(this, fVar, i8);
    }

    @Override // z6.f
    public f l(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        return this;
    }

    @Override // z6.f
    public abstract void m(byte b8);

    @Override // z6.f
    public abstract void n(boolean z8);

    @Override // z6.d
    public final void o(y6.f descriptor, int i8, double d8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            h(d8);
        }
    }

    public boolean p(y6.f fVar, int i8) {
        return d.a.a(this, fVar, i8);
    }

    @Override // z6.d
    public final void q(y6.f descriptor, int i8, int i9) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            z(i9);
        }
    }

    @Override // z6.f
    public abstract void r(float f8);

    @Override // z6.d
    public final void s(y6.f descriptor, int i8, boolean z8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            n(z8);
        }
    }

    @Override // z6.f
    public abstract void t(char c8);

    @Override // z6.f
    public void u() {
        f.a.b(this);
    }

    @Override // z6.d
    public final f v(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            return l(descriptor.h(i8));
        }
        return W.f530a;
    }

    @Override // z6.d
    public final void w(y6.f descriptor, int i8, float f8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            r(f8);
        }
    }

    public void x(y6.f descriptor, int i8, i serializer, Object obj) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(serializer, "serializer");
        if (G(descriptor, i8)) {
            H(serializer, obj);
        }
    }

    @Override // z6.d
    public final void y(y6.f descriptor, int i8, byte b8) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            m(b8);
        }
    }

    @Override // z6.f
    public abstract void z(int i8);
}
