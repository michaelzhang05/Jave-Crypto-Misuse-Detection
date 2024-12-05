package w6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import t6.InterfaceC3796a;
import t6.h;
import w6.c;
import w6.e;

/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3853a implements e, c {
    @Override // w6.c
    public e A(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return k(descriptor.h(i8));
    }

    @Override // w6.c
    public final double B(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return H();
    }

    @Override // w6.e
    public abstract byte C();

    @Override // w6.e
    public abstract short D();

    @Override // w6.e
    public float E() {
        Object J8 = J();
        AbstractC3159y.g(J8, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J8).floatValue();
    }

    @Override // w6.c
    public int F(v6.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // w6.c
    public final short G(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return D();
    }

    @Override // w6.e
    public double H() {
        Object J8 = J();
        AbstractC3159y.g(J8, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J8).doubleValue();
    }

    public Object I(InterfaceC3796a deserializer, Object obj) {
        AbstractC3159y.i(deserializer, "deserializer");
        return e(deserializer);
    }

    public Object J() {
        throw new h(U.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // w6.c
    public void a(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
    }

    @Override // w6.e
    public c d(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        return this;
    }

    @Override // w6.e
    public Object e(InterfaceC3796a interfaceC3796a) {
        return e.a.a(this, interfaceC3796a);
    }

    @Override // w6.c
    public final float f(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return E();
    }

    @Override // w6.e
    public boolean g() {
        Object J8 = J();
        AbstractC3159y.g(J8, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J8).booleanValue();
    }

    @Override // w6.e
    public char h() {
        Object J8 = J();
        AbstractC3159y.g(J8, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J8).charValue();
    }

    @Override // w6.c
    public final char i(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return h();
    }

    @Override // w6.c
    public final boolean j(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return g();
    }

    @Override // w6.e
    public e k(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        return this;
    }

    @Override // w6.e
    public int l(v6.f enumDescriptor) {
        AbstractC3159y.i(enumDescriptor, "enumDescriptor");
        Object J8 = J();
        AbstractC3159y.g(J8, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J8).intValue();
    }

    @Override // w6.c
    public final byte m(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return C();
    }

    @Override // w6.e
    public abstract int o();

    @Override // w6.c
    public final String q(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return t();
    }

    @Override // w6.c
    public Object r(v6.f descriptor, int i8, InterfaceC3796a deserializer, Object obj) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // w6.e
    public Void s() {
        return null;
    }

    @Override // w6.e
    public String t() {
        Object J8 = J();
        AbstractC3159y.g(J8, "null cannot be cast to non-null type kotlin.String");
        return (String) J8;
    }

    @Override // w6.c
    public final int u(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return o();
    }

    @Override // w6.e
    public abstract long v();

    @Override // w6.e
    public boolean w() {
        return true;
    }

    @Override // w6.c
    public final long x(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return v();
    }

    @Override // w6.c
    public final Object y(v6.f descriptor, int i8, InterfaceC3796a deserializer, Object obj) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(deserializer, "deserializer");
        if (!deserializer.a().c() && !w()) {
            return s();
        }
        return I(deserializer, obj);
    }

    @Override // w6.c
    public boolean z() {
        return c.a.b(this);
    }
}
