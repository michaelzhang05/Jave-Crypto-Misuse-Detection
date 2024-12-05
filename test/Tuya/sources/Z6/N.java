package z6;

import L5.C1224h;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3159y;
import t6.InterfaceC3796a;
import v6.j;
import w6.AbstractC3853a;
import x6.AbstractC3937b;
import y6.AbstractC3999a;
import y6.AbstractC4007i;
import y6.C4004f;
import y6.InterfaceC4006h;

/* loaded from: classes5.dex */
public class N extends AbstractC3853a implements InterfaceC4006h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3999a f40516a;

    /* renamed from: b, reason: collision with root package name */
    private final U f40517b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4041a f40518c;

    /* renamed from: d, reason: collision with root package name */
    private final A6.b f40519d;

    /* renamed from: e, reason: collision with root package name */
    private int f40520e;

    /* renamed from: f, reason: collision with root package name */
    private a f40521f;

    /* renamed from: g, reason: collision with root package name */
    private final C4004f f40522g;

    /* renamed from: h, reason: collision with root package name */
    private final y f40523h;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f40524a;

        public a(String str) {
            this.f40524a = str;
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40525a;

        static {
            int[] iArr = new int[U.values().length];
            try {
                iArr[U.f40540d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U.f40541e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[U.f40542f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[U.f40539c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40525a = iArr;
        }
    }

    public N(AbstractC3999a json, U mode, AbstractC4041a lexer, v6.f descriptor, a aVar) {
        y yVar;
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(mode, "mode");
        AbstractC3159y.i(lexer, "lexer");
        AbstractC3159y.i(descriptor, "descriptor");
        this.f40516a = json;
        this.f40517b = mode;
        this.f40518c = lexer;
        this.f40519d = json.e();
        this.f40520e = -1;
        this.f40521f = aVar;
        C4004f d8 = json.d();
        this.f40522g = d8;
        if (d8.h()) {
            yVar = null;
        } else {
            yVar = new y(descriptor);
        }
        this.f40523h = yVar;
    }

    private final void K() {
        if (this.f40518c.F() != 4) {
            return;
        }
        AbstractC4041a.x(this.f40518c, "Unexpected leading comma", 0, null, 6, null);
        throw new C1224h();
    }

    private final boolean L(v6.f fVar, int i8) {
        String G8;
        AbstractC3999a abstractC3999a = this.f40516a;
        v6.f h8 = fVar.h(i8);
        if (!h8.c() && this.f40518c.N(true)) {
            return true;
        }
        if (!AbstractC3159y.d(h8.getKind(), j.b.f38925a) || ((h8.c() && this.f40518c.N(false)) || (G8 = this.f40518c.G(this.f40522g.o())) == null || AbstractC4032C.h(h8, abstractC3999a, G8) != -3)) {
            return false;
        }
        this.f40518c.o();
        return true;
    }

    private final int M() {
        boolean M8 = this.f40518c.M();
        if (this.f40518c.e()) {
            int i8 = this.f40520e;
            if (i8 != -1 && !M8) {
                AbstractC4041a.x(this.f40518c, "Expected end of the array or comma", 0, null, 6, null);
                throw new C1224h();
            }
            int i9 = i8 + 1;
            this.f40520e = i9;
            return i9;
        }
        if (!M8 || this.f40516a.d().c()) {
            return -1;
        }
        AbstractC4031B.g(this.f40518c, "array");
        throw new C1224h();
    }

    private final int N() {
        boolean z8;
        int i8 = this.f40520e;
        boolean z9 = false;
        if (i8 % 2 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (i8 != -1) {
                z9 = this.f40518c.M();
            }
        } else {
            this.f40518c.l(':');
        }
        if (this.f40518c.e()) {
            if (z8) {
                if (this.f40520e == -1) {
                    AbstractC4041a abstractC4041a = this.f40518c;
                    boolean z10 = !z9;
                    int i9 = abstractC4041a.f40547a;
                    if (!z10) {
                        AbstractC4041a.x(abstractC4041a, "Unexpected leading comma", i9, null, 4, null);
                        throw new C1224h();
                    }
                } else {
                    AbstractC4041a abstractC4041a2 = this.f40518c;
                    int i10 = abstractC4041a2.f40547a;
                    if (!z9) {
                        AbstractC4041a.x(abstractC4041a2, "Expected comma after the key-value pair", i10, null, 4, null);
                        throw new C1224h();
                    }
                }
            }
            int i11 = this.f40520e + 1;
            this.f40520e = i11;
            return i11;
        }
        if (!z9 || this.f40516a.d().c()) {
            return -1;
        }
        AbstractC4031B.h(this.f40518c, null, 1, null);
        throw new C1224h();
    }

    private final int O(v6.f fVar) {
        int h8;
        boolean z8;
        boolean M8 = this.f40518c.M();
        while (true) {
            boolean z9 = true;
            if (this.f40518c.e()) {
                String P8 = P();
                this.f40518c.l(':');
                h8 = AbstractC4032C.h(fVar, this.f40516a, P8);
                if (h8 != -3) {
                    if (!this.f40522g.e() || !L(fVar, h8)) {
                        break;
                    }
                    z8 = this.f40518c.M();
                    z9 = false;
                } else {
                    z8 = false;
                }
                if (z9) {
                    M8 = Q(P8);
                } else {
                    M8 = z8;
                }
            } else {
                if (M8 && !this.f40516a.d().c()) {
                    AbstractC4031B.h(this.f40518c, null, 1, null);
                    throw new C1224h();
                }
                y yVar = this.f40523h;
                if (yVar != null) {
                    return yVar.d();
                }
                return -1;
            }
        }
        y yVar2 = this.f40523h;
        if (yVar2 != null) {
            yVar2.c(h8);
        }
        return h8;
    }

    private final String P() {
        if (this.f40522g.o()) {
            return this.f40518c.r();
        }
        return this.f40518c.i();
    }

    private final boolean Q(String str) {
        if (!this.f40522g.i() && !S(this.f40521f, str)) {
            this.f40518c.A(str);
        } else {
            this.f40518c.I(this.f40522g.o());
        }
        return this.f40518c.M();
    }

    private final void R(v6.f fVar) {
        do {
        } while (p(fVar) != -1);
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !AbstractC3159y.d(aVar.f40524a, str)) {
            return false;
        }
        aVar.f40524a = null;
        return true;
    }

    @Override // w6.AbstractC3853a, w6.e
    public byte C() {
        long m8 = this.f40518c.m();
        byte b8 = (byte) m8;
        if (m8 == b8) {
            return b8;
        }
        AbstractC4041a.x(this.f40518c, "Failed to parse byte for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1224h();
    }

    @Override // w6.AbstractC3853a, w6.e
    public short D() {
        long m8 = this.f40518c.m();
        short s8 = (short) m8;
        if (m8 == s8) {
            return s8;
        }
        AbstractC4041a.x(this.f40518c, "Failed to parse short for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1224h();
    }

    @Override // w6.AbstractC3853a, w6.e
    public float E() {
        AbstractC4041a abstractC4041a = this.f40518c;
        String q8 = abstractC4041a.q();
        try {
            float parseFloat = Float.parseFloat(q8);
            if (!this.f40516a.d().a() && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                AbstractC4031B.k(this.f40518c, Float.valueOf(parseFloat));
                throw new C1224h();
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC4041a.x(abstractC4041a, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1224h();
        }
    }

    @Override // w6.AbstractC3853a, w6.e
    public double H() {
        AbstractC4041a abstractC4041a = this.f40518c;
        String q8 = abstractC4041a.q();
        try {
            double parseDouble = Double.parseDouble(q8);
            if (!this.f40516a.d().a() && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                AbstractC4031B.k(this.f40518c, Double.valueOf(parseDouble));
                throw new C1224h();
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC4041a.x(abstractC4041a, "Failed to parse type 'double' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1224h();
        }
    }

    @Override // w6.AbstractC3853a, w6.c
    public void a(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (this.f40516a.d().i() && descriptor.e() == 0) {
            R(descriptor);
        }
        if (this.f40518c.M() && !this.f40516a.d().c()) {
            AbstractC4031B.g(this.f40518c, "");
            throw new C1224h();
        }
        this.f40518c.l(this.f40517b.f40546b);
        this.f40518c.f40548b.b();
    }

    @Override // w6.c
    public A6.b b() {
        return this.f40519d;
    }

    @Override // y6.InterfaceC4006h
    public final AbstractC3999a c() {
        return this.f40516a;
    }

    @Override // w6.AbstractC3853a, w6.e
    public w6.c d(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        U b8 = V.b(this.f40516a, descriptor);
        this.f40518c.f40548b.c(descriptor);
        this.f40518c.l(b8.f40545a);
        K();
        int i8 = b.f40525a[b8.ordinal()];
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            if (this.f40517b == b8 && this.f40516a.d().h()) {
                return this;
            }
            return new N(this.f40516a, b8, this.f40518c, descriptor, this.f40521f);
        }
        return new N(this.f40516a, b8, this.f40518c, descriptor, this.f40521f);
    }

    @Override // w6.AbstractC3853a, w6.e
    public Object e(InterfaceC3796a deserializer) {
        AbstractC3159y.i(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC3937b) && !this.f40516a.d().n()) {
                String c8 = L.c(deserializer.a(), this.f40516a);
                String E8 = this.f40518c.E(c8, this.f40522g.o());
                if (E8 == null) {
                    return L.d(this, deserializer);
                }
                try {
                    InterfaceC3796a a8 = t6.f.a((AbstractC3937b) deserializer, this, E8);
                    AbstractC3159y.g(a8, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f40521f = new a(c8);
                    return a8.c(this);
                } catch (t6.h e8) {
                    String message = e8.getMessage();
                    AbstractC3159y.f(message);
                    String l02 = g6.n.l0(g6.n.J0(message, '\n', null, 2, null), ".");
                    String message2 = e8.getMessage();
                    AbstractC3159y.f(message2);
                    AbstractC4041a.x(this.f40518c, l02, 0, g6.n.B0(message2, '\n', ""), 2, null);
                    throw new C1224h();
                }
            }
            return deserializer.c(this);
        } catch (t6.c e9) {
            String message3 = e9.getMessage();
            AbstractC3159y.f(message3);
            if (g6.n.H(message3, "at path", false, 2, null)) {
                throw e9;
            }
            throw new t6.c(e9.a(), e9.getMessage() + " at path: " + this.f40518c.f40548b.a(), e9);
        }
    }

    @Override // w6.AbstractC3853a, w6.e
    public boolean g() {
        return this.f40518c.g();
    }

    @Override // w6.AbstractC3853a, w6.e
    public char h() {
        String q8 = this.f40518c.q();
        if (q8.length() == 1) {
            return q8.charAt(0);
        }
        AbstractC4041a.x(this.f40518c, "Expected single char, but got '" + q8 + '\'', 0, null, 6, null);
        throw new C1224h();
    }

    @Override // w6.AbstractC3853a, w6.e
    public w6.e k(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (P.b(descriptor)) {
            return new w(this.f40518c, this.f40516a);
        }
        return super.k(descriptor);
    }

    @Override // w6.AbstractC3853a, w6.e
    public int l(v6.f enumDescriptor) {
        AbstractC3159y.i(enumDescriptor, "enumDescriptor");
        return AbstractC4032C.i(enumDescriptor, this.f40516a, t(), " at path " + this.f40518c.f40548b.a());
    }

    @Override // y6.InterfaceC4006h
    public AbstractC4007i n() {
        return new C4040K(this.f40516a.d(), this.f40518c).e();
    }

    @Override // w6.AbstractC3853a, w6.e
    public int o() {
        long m8 = this.f40518c.m();
        int i8 = (int) m8;
        if (m8 == i8) {
            return i8;
        }
        AbstractC4041a.x(this.f40518c, "Failed to parse int for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1224h();
    }

    @Override // w6.c
    public int p(v6.f descriptor) {
        int N8;
        AbstractC3159y.i(descriptor, "descriptor");
        int i8 = b.f40525a[this.f40517b.ordinal()];
        if (i8 != 2) {
            if (i8 != 4) {
                N8 = M();
            } else {
                N8 = O(descriptor);
            }
        } else {
            N8 = N();
        }
        if (this.f40517b != U.f40541e) {
            this.f40518c.f40548b.g(N8);
        }
        return N8;
    }

    @Override // w6.AbstractC3853a, w6.c
    public Object r(v6.f descriptor, int i8, InterfaceC3796a deserializer, Object obj) {
        boolean z8;
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(deserializer, "deserializer");
        if (this.f40517b == U.f40541e && (i8 & 1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.f40518c.f40548b.d();
        }
        Object r8 = super.r(descriptor, i8, deserializer, obj);
        if (z8) {
            this.f40518c.f40548b.f(r8);
        }
        return r8;
    }

    @Override // w6.AbstractC3853a, w6.e
    public Void s() {
        return null;
    }

    @Override // w6.AbstractC3853a, w6.e
    public String t() {
        if (this.f40522g.o()) {
            return this.f40518c.r();
        }
        return this.f40518c.o();
    }

    @Override // w6.AbstractC3853a, w6.e
    public long v() {
        return this.f40518c.m();
    }

    @Override // w6.AbstractC3853a, w6.e
    public boolean w() {
        boolean z8;
        y yVar = this.f40523h;
        if (yVar != null) {
            z8 = yVar.b();
        } else {
            z8 = false;
        }
        if (z8 || AbstractC4041a.O(this.f40518c, false, 1, null)) {
            return false;
        }
        return true;
    }
}
