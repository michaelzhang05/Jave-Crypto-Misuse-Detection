package z6;

import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;
import w6.InterfaceC4150a;
import w6.h;
import z6.c;
import z6.e;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4233a implements e, c {
    @Override // z6.c
    public final double A(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return H();
    }

    @Override // z6.c
    public int B(y6.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // z6.e
    public abstract byte C();

    @Override // z6.c
    public e D(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return i(descriptor.h(i8));
    }

    @Override // z6.e
    public abstract short E();

    @Override // z6.e
    public float F() {
        Object J8 = J();
        AbstractC3255y.g(J8, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J8).floatValue();
    }

    @Override // z6.c
    public final float G(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return F();
    }

    @Override // z6.e
    public double H() {
        Object J8 = J();
        AbstractC3255y.g(J8, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J8).doubleValue();
    }

    public Object I(InterfaceC4150a deserializer, Object obj) {
        AbstractC3255y.i(deserializer, "deserializer");
        return s(deserializer);
    }

    public Object J() {
        throw new h(U.b(getClass()) + " can't retrieve untyped values");
    }

    public void b(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
    }

    @Override // z6.e
    public c d(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        return this;
    }

    @Override // z6.c
    public final String e(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return t();
    }

    @Override // z6.c
    public final boolean f(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return h();
    }

    @Override // z6.e
    public boolean h() {
        Object J8 = J();
        AbstractC3255y.g(J8, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J8).booleanValue();
    }

    @Override // z6.e
    public e i(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        return this;
    }

    @Override // z6.e
    public char j() {
        Object J8 = J();
        AbstractC3255y.g(J8, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J8).charValue();
    }

    @Override // z6.c
    public final byte k(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return C();
    }

    @Override // z6.c
    public final short l(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return E();
    }

    @Override // z6.c
    public final char m(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return j();
    }

    @Override // z6.e
    public abstract int o();

    @Override // z6.c
    public final int p(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return o();
    }

    @Override // z6.c
    public final Object q(y6.f descriptor, int i8, InterfaceC4150a deserializer, Object obj) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(deserializer, "deserializer");
        if (!deserializer.a().c() && !v()) {
            return r();
        }
        return I(deserializer, obj);
    }

    @Override // z6.e
    public Void r() {
        return null;
    }

    @Override // z6.e
    public Object s(InterfaceC4150a interfaceC4150a) {
        return e.a.a(this, interfaceC4150a);
    }

    @Override // z6.e
    public String t() {
        Object J8 = J();
        AbstractC3255y.g(J8, "null cannot be cast to non-null type kotlin.String");
        return (String) J8;
    }

    @Override // z6.e
    public abstract long u();

    @Override // z6.e
    public boolean v() {
        return true;
    }

    @Override // z6.c
    public boolean w() {
        return c.a.b(this);
    }

    public Object x(y6.f descriptor, int i8, InterfaceC4150a deserializer, Object obj) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // z6.c
    public final long y(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return u();
    }

    @Override // z6.e
    public int z(y6.f enumDescriptor) {
        AbstractC3255y.i(enumDescriptor, "enumDescriptor");
        Object J8 = J();
        AbstractC3255y.g(J8, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J8).intValue();
    }
}
