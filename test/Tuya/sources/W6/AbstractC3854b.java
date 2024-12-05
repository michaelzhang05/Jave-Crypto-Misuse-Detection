package w6;

import kotlin.jvm.internal.AbstractC3159y;
import t6.i;
import w6.d;
import w6.f;
import x6.W;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3854b implements f, d {
    @Override // w6.d
    public void A(v6.f descriptor, int i8, i serializer, Object obj) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(serializer, "serializer");
        if (G(descriptor, i8)) {
            j(serializer, obj);
        }
    }

    @Override // w6.f
    public d B(v6.f fVar, int i8) {
        return f.a.a(this, fVar, i8);
    }

    @Override // w6.f
    public abstract void C(long j8);

    @Override // w6.d
    public final void D(v6.f descriptor, int i8, double d8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            g(d8);
        }
    }

    @Override // w6.f
    public abstract void E(String str);

    @Override // w6.f
    public f F(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        return this;
    }

    public boolean G(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return true;
    }

    public void H(i iVar, Object obj) {
        f.a.c(this, iVar, obj);
    }

    @Override // w6.d
    public void a(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
    }

    @Override // w6.f
    public d d(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        return this;
    }

    @Override // w6.f
    public abstract void g(double d8);

    @Override // w6.f
    public abstract void h(short s8);

    @Override // w6.d
    public boolean i(v6.f fVar, int i8) {
        return d.a.a(this, fVar, i8);
    }

    @Override // w6.f
    public void j(i iVar, Object obj) {
        f.a.d(this, iVar, obj);
    }

    @Override // w6.d
    public final void k(v6.f descriptor, int i8, char c8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            q(c8);
        }
    }

    @Override // w6.f
    public abstract void l(byte b8);

    @Override // w6.d
    public final void m(v6.f descriptor, int i8, short s8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            h(s8);
        }
    }

    @Override // w6.f
    public abstract void n(boolean z8);

    @Override // w6.d
    public final void o(v6.f descriptor, int i8, boolean z8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            n(z8);
        }
    }

    @Override // w6.f
    public abstract void p(float f8);

    @Override // w6.f
    public abstract void q(char c8);

    @Override // w6.f
    public void r() {
        f.a.b(this);
    }

    @Override // w6.d
    public final void s(v6.f descriptor, int i8, byte b8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            l(b8);
        }
    }

    @Override // w6.d
    public final void t(v6.f descriptor, int i8, float f8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            p(f8);
        }
    }

    @Override // w6.d
    public void u(v6.f descriptor, int i8, i serializer, Object obj) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(serializer, "serializer");
        if (G(descriptor, i8)) {
            H(serializer, obj);
        }
    }

    @Override // w6.d
    public final void v(v6.f descriptor, int i8, int i9) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            z(i9);
        }
    }

    @Override // w6.d
    public final void w(v6.f descriptor, int i8, long j8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            C(j8);
        }
    }

    @Override // w6.d
    public final f x(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            return F(descriptor.h(i8));
        }
        return W.f39535a;
    }

    @Override // w6.d
    public final void y(v6.f descriptor, int i8, String value) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(value, "value");
        if (G(descriptor, i8)) {
            E(value);
        }
    }

    @Override // w6.f
    public abstract void z(int i8);
}
