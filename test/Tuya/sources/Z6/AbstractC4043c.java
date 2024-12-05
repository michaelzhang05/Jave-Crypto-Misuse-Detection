package z6;

import L5.C1224h;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.InterfaceC3796a;
import v6.j;
import v6.k;
import y6.AbstractC3999a;
import y6.AbstractC4007i;
import y6.C4000b;
import y6.C4004f;
import y6.InterfaceC4006h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4043c extends x6.V implements InterfaceC4006h {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3999a f40551c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4007i f40552d;

    /* renamed from: e, reason: collision with root package name */
    protected final C4004f f40553e;

    public /* synthetic */ AbstractC4043c(AbstractC3999a abstractC3999a, AbstractC4007i abstractC4007i, AbstractC3151p abstractC3151p) {
        this(abstractC3999a, abstractC4007i);
    }

    private final y6.p d0(y6.x xVar, String str) {
        y6.p pVar;
        if (xVar instanceof y6.p) {
            pVar = (y6.p) xVar;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            return pVar;
        }
        throw AbstractC4031B.d(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    private final Void t0(String str) {
        throw AbstractC4031B.e(-1, "Failed to parse literal as '" + str + "' value", f0().toString());
    }

    @Override // x6.V
    protected String Z(String parentName, String childName) {
        AbstractC3159y.i(parentName, "parentName");
        AbstractC3159y.i(childName, "childName");
        return childName;
    }

    public void a(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
    }

    @Override // w6.c
    public A6.b b() {
        return c().e();
    }

    @Override // y6.InterfaceC4006h
    public AbstractC3999a c() {
        return this.f40551c;
    }

    @Override // w6.e
    public w6.c d(v6.f descriptor) {
        boolean z8;
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC4007i f02 = f0();
        v6.j kind = descriptor.getKind();
        if (AbstractC3159y.d(kind, k.b.f38927a)) {
            z8 = true;
        } else {
            z8 = kind instanceof v6.d;
        }
        if (z8) {
            AbstractC3999a c8 = c();
            if (f02 instanceof C4000b) {
                return new C4038I(c8, (C4000b) f02);
            }
            throw AbstractC4031B.d(-1, "Expected " + kotlin.jvm.internal.U.b(C4000b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        if (AbstractC3159y.d(kind, k.c.f38928a)) {
            AbstractC3999a c9 = c();
            v6.f a8 = V.a(descriptor.h(0), c9.e());
            v6.j kind2 = a8.getKind();
            if (!(kind2 instanceof v6.e) && !AbstractC3159y.d(kind2, j.b.f38925a)) {
                if (c9.d().b()) {
                    AbstractC3999a c10 = c();
                    if (f02 instanceof C4000b) {
                        return new C4038I(c10, (C4000b) f02);
                    }
                    throw AbstractC4031B.d(-1, "Expected " + kotlin.jvm.internal.U.b(C4000b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
                }
                throw AbstractC4031B.c(a8);
            }
            AbstractC3999a c11 = c();
            if (f02 instanceof y6.v) {
                return new C4039J(c11, (y6.v) f02);
            }
            throw AbstractC4031B.d(-1, "Expected " + kotlin.jvm.internal.U.b(y6.v.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        AbstractC3999a c12 = c();
        if (f02 instanceof y6.v) {
            return new C4037H(c12, (y6.v) f02, null, null, 12, null);
        }
        throw AbstractC4031B.d(-1, "Expected " + kotlin.jvm.internal.U.b(y6.v.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
    }

    @Override // x6.s0, w6.e
    public Object e(InterfaceC3796a deserializer) {
        AbstractC3159y.i(deserializer, "deserializer");
        return L.d(this, deserializer);
    }

    protected abstract AbstractC4007i e0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC4007i f0() {
        AbstractC4007i e02;
        String str = (String) U();
        if (str == null || (e02 = e0(str)) == null) {
            return s0();
        }
        return e02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String tag) {
        AbstractC3159y.i(tag, "tag");
        try {
            Boolean c8 = y6.j.c(r0(tag));
            if (c8 != null) {
                return c8.booleanValue();
            }
            t0(TypedValues.Custom.S_BOOLEAN);
            throw new C1224h();
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_BOOLEAN);
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String tag) {
        Byte b8;
        AbstractC3159y.i(tag, "tag");
        try {
            int g8 = y6.j.g(r0(tag));
            if (-128 <= g8 && g8 <= 127) {
                b8 = Byte.valueOf((byte) g8);
            } else {
                b8 = null;
            }
            if (b8 != null) {
                return b8.byteValue();
            }
            t0("byte");
            throw new C1224h();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String tag) {
        AbstractC3159y.i(tag, "tag");
        try {
            return g6.n.S0(r0(tag).a());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String tag) {
        AbstractC3159y.i(tag, "tag");
        try {
            double e8 = y6.j.e(r0(tag));
            if (!c().d().a() && (Double.isInfinite(e8) || Double.isNaN(e8))) {
                throw AbstractC4031B.a(Double.valueOf(e8), tag, f0().toString());
            }
            return e8;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new C1224h();
        }
    }

    @Override // x6.s0, w6.e
    public w6.e k(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (U() != null) {
            return super.k(descriptor);
        }
        return new C4034E(c(), s0()).k(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String tag, v6.f enumDescriptor) {
        AbstractC3159y.i(tag, "tag");
        AbstractC3159y.i(enumDescriptor, "enumDescriptor");
        return AbstractC4032C.j(enumDescriptor, c(), r0(tag).a(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String tag) {
        AbstractC3159y.i(tag, "tag");
        try {
            float f8 = y6.j.f(r0(tag));
            if (!c().d().a() && (Float.isInfinite(f8) || Float.isNaN(f8))) {
                throw AbstractC4031B.a(Float.valueOf(f8), tag, f0().toString());
            }
            return f8;
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_FLOAT);
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public w6.e P(String tag, v6.f inlineDescriptor) {
        AbstractC3159y.i(tag, "tag");
        AbstractC3159y.i(inlineDescriptor, "inlineDescriptor");
        if (P.b(inlineDescriptor)) {
            return new w(new Q(r0(tag).a()), c());
        }
        return super.P(tag, inlineDescriptor);
    }

    @Override // y6.InterfaceC4006h
    public AbstractC4007i n() {
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String tag) {
        AbstractC3159y.i(tag, "tag");
        try {
            return y6.j.g(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String tag) {
        AbstractC3159y.i(tag, "tag");
        try {
            return y6.j.k(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String tag) {
        Short sh;
        AbstractC3159y.i(tag, "tag");
        try {
            int g8 = y6.j.g(r0(tag));
            if (-32768 <= g8 && g8 <= 32767) {
                sh = Short.valueOf((short) g8);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            t0("short");
            throw new C1224h();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.s0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String tag) {
        AbstractC3159y.i(tag, "tag");
        y6.x r02 = r0(tag);
        if (!c().d().o() && !d0(r02, TypedValues.Custom.S_STRING).h()) {
            throw AbstractC4031B.e(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", f0().toString());
        }
        if (!(r02 instanceof y6.t)) {
            return r02.a();
        }
        throw AbstractC4031B.e(-1, "Unexpected 'null' value instead of string literal", f0().toString());
    }

    protected final y6.x r0(String tag) {
        y6.x xVar;
        AbstractC3159y.i(tag, "tag");
        AbstractC4007i e02 = e0(tag);
        if (e02 instanceof y6.x) {
            xVar = (y6.x) e02;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        throw AbstractC4031B.e(-1, "Expected JsonPrimitive at " + tag + ", found " + e02, f0().toString());
    }

    public abstract AbstractC4007i s0();

    @Override // w6.e
    public boolean w() {
        return !(f0() instanceof y6.t);
    }

    private AbstractC4043c(AbstractC3999a abstractC3999a, AbstractC4007i abstractC4007i) {
        this.f40551c = abstractC3999a;
        this.f40552d = abstractC4007i;
        this.f40553e = c().d();
    }
}
