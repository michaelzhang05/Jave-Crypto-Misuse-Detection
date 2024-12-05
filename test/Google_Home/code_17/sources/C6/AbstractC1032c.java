package C6;

import O5.C1352h;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;
import y6.j;
import y6.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: C6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1032c extends A6.V implements B6.h {

    /* renamed from: c, reason: collision with root package name */
    private final B6.a f1669c;

    /* renamed from: d, reason: collision with root package name */
    private final B6.i f1670d;

    /* renamed from: e, reason: collision with root package name */
    protected final B6.f f1671e;

    public /* synthetic */ AbstractC1032c(B6.a aVar, B6.i iVar, AbstractC3247p abstractC3247p) {
        this(aVar, iVar);
    }

    private final B6.p d0(B6.x xVar, String str) {
        B6.p pVar;
        if (xVar instanceof B6.p) {
            pVar = (B6.p) xVar;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            return pVar;
        }
        throw B.d(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    private final Void t0(String str) {
        throw B.e(-1, "Failed to parse literal as '" + str + "' value", f0().toString());
    }

    @Override // A6.V
    protected String Z(String parentName, String childName) {
        AbstractC3255y.i(parentName, "parentName");
        AbstractC3255y.i(childName, "childName");
        return childName;
    }

    @Override // z6.c
    public D6.b a() {
        return c().e();
    }

    public void b(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
    }

    @Override // B6.h
    public B6.a c() {
        return this.f1669c;
    }

    @Override // z6.e
    public z6.c d(y6.f descriptor) {
        boolean z8;
        AbstractC3255y.i(descriptor, "descriptor");
        B6.i f02 = f0();
        y6.j kind = descriptor.getKind();
        if (AbstractC3255y.d(kind, k.b.f41058a)) {
            z8 = true;
        } else {
            z8 = kind instanceof y6.d;
        }
        if (z8) {
            B6.a c8 = c();
            if (f02 instanceof B6.b) {
                return new I(c8, (B6.b) f02);
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(B6.b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        if (AbstractC3255y.d(kind, k.c.f41059a)) {
            B6.a c9 = c();
            y6.f a8 = V.a(descriptor.h(0), c9.e());
            y6.j kind2 = a8.getKind();
            if (!(kind2 instanceof y6.e) && !AbstractC3255y.d(kind2, j.b.f41056a)) {
                if (c9.d().b()) {
                    B6.a c10 = c();
                    if (f02 instanceof B6.b) {
                        return new I(c10, (B6.b) f02);
                    }
                    throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(B6.b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
                }
                throw B.c(a8);
            }
            B6.a c11 = c();
            if (f02 instanceof B6.v) {
                return new J(c11, (B6.v) f02);
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(B6.v.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        B6.a c12 = c();
        if (f02 instanceof B6.v) {
            return new H(c12, (B6.v) f02, null, null, 12, null);
        }
        throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(B6.v.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
    }

    protected abstract B6.i e0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final B6.i f0() {
        B6.i e02;
        String str = (String) U();
        if (str == null || (e02 = e0(str)) == null) {
            return s0();
        }
        return e02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String tag) {
        AbstractC3255y.i(tag, "tag");
        try {
            Boolean c8 = B6.j.c(r0(tag));
            if (c8 != null) {
                return c8.booleanValue();
            }
            t0(TypedValues.Custom.S_BOOLEAN);
            throw new C1352h();
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_BOOLEAN);
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String tag) {
        Byte b8;
        AbstractC3255y.i(tag, "tag");
        try {
            int g8 = B6.j.g(r0(tag));
            if (-128 <= g8 && g8 <= 127) {
                b8 = Byte.valueOf((byte) g8);
            } else {
                b8 = null;
            }
            if (b8 != null) {
                return b8.byteValue();
            }
            t0("byte");
            throw new C1352h();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new C1352h();
        }
    }

    @Override // A6.s0, z6.e
    public z6.e i(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (U() != null) {
            return super.i(descriptor);
        }
        return new E(c(), s0()).i(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String tag) {
        AbstractC3255y.i(tag, "tag");
        try {
            return j6.n.S0(r0(tag).c());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String tag) {
        AbstractC3255y.i(tag, "tag");
        try {
            double e8 = B6.j.e(r0(tag));
            if (!c().d().a() && (Double.isInfinite(e8) || Double.isNaN(e8))) {
                throw B.a(Double.valueOf(e8), tag, f0().toString());
            }
            return e8;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String tag, y6.f enumDescriptor) {
        AbstractC3255y.i(tag, "tag");
        AbstractC3255y.i(enumDescriptor, "enumDescriptor");
        return C.j(enumDescriptor, c(), r0(tag).c(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String tag) {
        AbstractC3255y.i(tag, "tag");
        try {
            float f8 = B6.j.f(r0(tag));
            if (!c().d().a() && (Float.isInfinite(f8) || Float.isNaN(f8))) {
                throw B.a(Float.valueOf(f8), tag, f0().toString());
            }
            return f8;
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_FLOAT);
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public z6.e P(String tag, y6.f inlineDescriptor) {
        AbstractC3255y.i(tag, "tag");
        AbstractC3255y.i(inlineDescriptor, "inlineDescriptor");
        if (P.b(inlineDescriptor)) {
            return new w(new Q(r0(tag).c()), c());
        }
        return super.P(tag, inlineDescriptor);
    }

    @Override // B6.h
    public B6.i n() {
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String tag) {
        AbstractC3255y.i(tag, "tag");
        try {
            return B6.j.g(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String tag) {
        AbstractC3255y.i(tag, "tag");
        try {
            return B6.j.k(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String tag) {
        Short sh;
        AbstractC3255y.i(tag, "tag");
        try {
            int g8 = B6.j.g(r0(tag));
            if (-32768 <= g8 && g8 <= 32767) {
                sh = Short.valueOf((short) g8);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            t0("short");
            throw new C1352h();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new C1352h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String tag) {
        AbstractC3255y.i(tag, "tag");
        B6.x r02 = r0(tag);
        if (!c().d().o() && !d0(r02, TypedValues.Custom.S_STRING).f()) {
            throw B.e(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", f0().toString());
        }
        if (!(r02 instanceof B6.t)) {
            return r02.c();
        }
        throw B.e(-1, "Unexpected 'null' value instead of string literal", f0().toString());
    }

    protected final B6.x r0(String tag) {
        B6.x xVar;
        AbstractC3255y.i(tag, "tag");
        B6.i e02 = e0(tag);
        if (e02 instanceof B6.x) {
            xVar = (B6.x) e02;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        throw B.e(-1, "Expected JsonPrimitive at " + tag + ", found " + e02, f0().toString());
    }

    @Override // A6.s0, z6.e
    public Object s(InterfaceC4150a deserializer) {
        AbstractC3255y.i(deserializer, "deserializer");
        return L.d(this, deserializer);
    }

    public abstract B6.i s0();

    @Override // z6.e
    public boolean v() {
        return !(f0() instanceof B6.t);
    }

    private AbstractC1032c(B6.a aVar, B6.i iVar) {
        this.f1669c = aVar;
        this.f1670d = iVar;
        this.f1671e = c().d();
    }
}
