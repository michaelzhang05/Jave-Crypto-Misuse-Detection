package C6;

import A6.AbstractC0978b;
import O5.C1352h;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;
import y6.j;
import z6.AbstractC4233a;

/* loaded from: classes5.dex */
public class N extends AbstractC4233a implements B6.h {

    /* renamed from: a, reason: collision with root package name */
    private final B6.a f1634a;

    /* renamed from: b, reason: collision with root package name */
    private final U f1635b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1030a f1636c;

    /* renamed from: d, reason: collision with root package name */
    private final D6.b f1637d;

    /* renamed from: e, reason: collision with root package name */
    private int f1638e;

    /* renamed from: f, reason: collision with root package name */
    private a f1639f;

    /* renamed from: g, reason: collision with root package name */
    private final B6.f f1640g;

    /* renamed from: h, reason: collision with root package name */
    private final y f1641h;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f1642a;

        public a(String str) {
            this.f1642a = str;
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1643a;

        static {
            int[] iArr = new int[U.values().length];
            try {
                iArr[U.f1658d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U.f1659e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[U.f1660f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[U.f1657c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1643a = iArr;
        }
    }

    public N(B6.a json, U mode, AbstractC1030a lexer, y6.f descriptor, a aVar) {
        y yVar;
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(mode, "mode");
        AbstractC3255y.i(lexer, "lexer");
        AbstractC3255y.i(descriptor, "descriptor");
        this.f1634a = json;
        this.f1635b = mode;
        this.f1636c = lexer;
        this.f1637d = json.e();
        this.f1638e = -1;
        this.f1639f = aVar;
        B6.f d8 = json.d();
        this.f1640g = d8;
        if (d8.h()) {
            yVar = null;
        } else {
            yVar = new y(descriptor);
        }
        this.f1641h = yVar;
    }

    private final void K() {
        if (this.f1636c.F() != 4) {
            return;
        }
        AbstractC1030a.x(this.f1636c, "Unexpected leading comma", 0, null, 6, null);
        throw new C1352h();
    }

    private final boolean L(y6.f fVar, int i8) {
        String G8;
        B6.a aVar = this.f1634a;
        y6.f h8 = fVar.h(i8);
        if (!h8.c() && this.f1636c.N(true)) {
            return true;
        }
        if (!AbstractC3255y.d(h8.getKind(), j.b.f41056a) || ((h8.c() && this.f1636c.N(false)) || (G8 = this.f1636c.G(this.f1640g.o())) == null || C.h(h8, aVar, G8) != -3)) {
            return false;
        }
        this.f1636c.o();
        return true;
    }

    private final int M() {
        boolean M8 = this.f1636c.M();
        if (this.f1636c.e()) {
            int i8 = this.f1638e;
            if (i8 != -1 && !M8) {
                AbstractC1030a.x(this.f1636c, "Expected end of the array or comma", 0, null, 6, null);
                throw new C1352h();
            }
            int i9 = i8 + 1;
            this.f1638e = i9;
            return i9;
        }
        if (!M8 || this.f1634a.d().c()) {
            return -1;
        }
        B.g(this.f1636c, "array");
        throw new C1352h();
    }

    private final int N() {
        boolean z8;
        int i8 = this.f1638e;
        boolean z9 = false;
        if (i8 % 2 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (i8 != -1) {
                z9 = this.f1636c.M();
            }
        } else {
            this.f1636c.l(':');
        }
        if (this.f1636c.e()) {
            if (z8) {
                if (this.f1638e == -1) {
                    AbstractC1030a abstractC1030a = this.f1636c;
                    boolean z10 = !z9;
                    int i9 = abstractC1030a.f1665a;
                    if (!z10) {
                        AbstractC1030a.x(abstractC1030a, "Unexpected leading comma", i9, null, 4, null);
                        throw new C1352h();
                    }
                } else {
                    AbstractC1030a abstractC1030a2 = this.f1636c;
                    int i10 = abstractC1030a2.f1665a;
                    if (!z9) {
                        AbstractC1030a.x(abstractC1030a2, "Expected comma after the key-value pair", i10, null, 4, null);
                        throw new C1352h();
                    }
                }
            }
            int i11 = this.f1638e + 1;
            this.f1638e = i11;
            return i11;
        }
        if (!z9 || this.f1634a.d().c()) {
            return -1;
        }
        B.h(this.f1636c, null, 1, null);
        throw new C1352h();
    }

    private final int O(y6.f fVar) {
        int h8;
        boolean z8;
        boolean M8 = this.f1636c.M();
        while (true) {
            boolean z9 = true;
            if (this.f1636c.e()) {
                String P8 = P();
                this.f1636c.l(':');
                h8 = C.h(fVar, this.f1634a, P8);
                if (h8 != -3) {
                    if (!this.f1640g.e() || !L(fVar, h8)) {
                        break;
                    }
                    z8 = this.f1636c.M();
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
                if (M8 && !this.f1634a.d().c()) {
                    B.h(this.f1636c, null, 1, null);
                    throw new C1352h();
                }
                y yVar = this.f1641h;
                if (yVar != null) {
                    return yVar.d();
                }
                return -1;
            }
        }
        y yVar2 = this.f1641h;
        if (yVar2 != null) {
            yVar2.c(h8);
        }
        return h8;
    }

    private final String P() {
        if (this.f1640g.o()) {
            return this.f1636c.r();
        }
        return this.f1636c.i();
    }

    private final boolean Q(String str) {
        if (!this.f1640g.i() && !S(this.f1639f, str)) {
            this.f1636c.A(str);
        } else {
            this.f1636c.I(this.f1640g.o());
        }
        return this.f1636c.M();
    }

    private final void R(y6.f fVar) {
        do {
        } while (g(fVar) != -1);
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !AbstractC3255y.d(aVar.f1642a, str)) {
            return false;
        }
        aVar.f1642a = null;
        return true;
    }

    @Override // z6.AbstractC4233a, z6.e
    public byte C() {
        long m8 = this.f1636c.m();
        byte b8 = (byte) m8;
        if (m8 == b8) {
            return b8;
        }
        AbstractC1030a.x(this.f1636c, "Failed to parse byte for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1352h();
    }

    @Override // z6.AbstractC4233a, z6.e
    public short E() {
        long m8 = this.f1636c.m();
        short s8 = (short) m8;
        if (m8 == s8) {
            return s8;
        }
        AbstractC1030a.x(this.f1636c, "Failed to parse short for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1352h();
    }

    @Override // z6.AbstractC4233a, z6.e
    public float F() {
        AbstractC1030a abstractC1030a = this.f1636c;
        String q8 = abstractC1030a.q();
        try {
            float parseFloat = Float.parseFloat(q8);
            if (!this.f1634a.d().a() && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                B.k(this.f1636c, Float.valueOf(parseFloat));
                throw new C1352h();
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC1030a.x(abstractC1030a, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1352h();
        }
    }

    @Override // z6.AbstractC4233a, z6.e
    public double H() {
        AbstractC1030a abstractC1030a = this.f1636c;
        String q8 = abstractC1030a.q();
        try {
            double parseDouble = Double.parseDouble(q8);
            if (!this.f1634a.d().a() && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                B.k(this.f1636c, Double.valueOf(parseDouble));
                throw new C1352h();
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC1030a.x(abstractC1030a, "Failed to parse type 'double' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1352h();
        }
    }

    @Override // z6.c
    public D6.b a() {
        return this.f1637d;
    }

    @Override // z6.AbstractC4233a, z6.c
    public void b(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (this.f1634a.d().i() && descriptor.e() == 0) {
            R(descriptor);
        }
        if (this.f1636c.M() && !this.f1634a.d().c()) {
            B.g(this.f1636c, "");
            throw new C1352h();
        }
        this.f1636c.l(this.f1635b.f1664b);
        this.f1636c.f1666b.b();
    }

    @Override // B6.h
    public final B6.a c() {
        return this.f1634a;
    }

    @Override // z6.AbstractC4233a, z6.e
    public z6.c d(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        U b8 = V.b(this.f1634a, descriptor);
        this.f1636c.f1666b.c(descriptor);
        this.f1636c.l(b8.f1663a);
        K();
        int i8 = b.f1643a[b8.ordinal()];
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            if (this.f1635b == b8 && this.f1634a.d().h()) {
                return this;
            }
            return new N(this.f1634a, b8, this.f1636c, descriptor, this.f1639f);
        }
        return new N(this.f1634a, b8, this.f1636c, descriptor, this.f1639f);
    }

    @Override // z6.c
    public int g(y6.f descriptor) {
        int N8;
        AbstractC3255y.i(descriptor, "descriptor");
        int i8 = b.f1643a[this.f1635b.ordinal()];
        if (i8 != 2) {
            if (i8 != 4) {
                N8 = M();
            } else {
                N8 = O(descriptor);
            }
        } else {
            N8 = N();
        }
        if (this.f1635b != U.f1659e) {
            this.f1636c.f1666b.g(N8);
        }
        return N8;
    }

    @Override // z6.AbstractC4233a, z6.e
    public boolean h() {
        return this.f1636c.g();
    }

    @Override // z6.AbstractC4233a, z6.e
    public z6.e i(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (P.b(descriptor)) {
            return new w(this.f1636c, this.f1634a);
        }
        return super.i(descriptor);
    }

    @Override // z6.AbstractC4233a, z6.e
    public char j() {
        String q8 = this.f1636c.q();
        if (q8.length() == 1) {
            return q8.charAt(0);
        }
        AbstractC1030a.x(this.f1636c, "Expected single char, but got '" + q8 + '\'', 0, null, 6, null);
        throw new C1352h();
    }

    @Override // B6.h
    public B6.i n() {
        return new K(this.f1634a.d(), this.f1636c).e();
    }

    @Override // z6.AbstractC4233a, z6.e
    public int o() {
        long m8 = this.f1636c.m();
        int i8 = (int) m8;
        if (m8 == i8) {
            return i8;
        }
        AbstractC1030a.x(this.f1636c, "Failed to parse int for input '" + m8 + '\'', 0, null, 6, null);
        throw new C1352h();
    }

    @Override // z6.AbstractC4233a, z6.e
    public Void r() {
        return null;
    }

    @Override // z6.AbstractC4233a, z6.e
    public Object s(InterfaceC4150a deserializer) {
        AbstractC3255y.i(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC0978b) && !this.f1634a.d().n()) {
                String c8 = L.c(deserializer.a(), this.f1634a);
                String E8 = this.f1636c.E(c8, this.f1640g.o());
                if (E8 == null) {
                    return L.d(this, deserializer);
                }
                try {
                    InterfaceC4150a a8 = w6.f.a((AbstractC0978b) deserializer, this, E8);
                    AbstractC3255y.g(a8, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f1639f = new a(c8);
                    return a8.b(this);
                } catch (w6.h e8) {
                    String message = e8.getMessage();
                    AbstractC3255y.f(message);
                    String l02 = j6.n.l0(j6.n.J0(message, '\n', null, 2, null), ".");
                    String message2 = e8.getMessage();
                    AbstractC3255y.f(message2);
                    AbstractC1030a.x(this.f1636c, l02, 0, j6.n.B0(message2, '\n', ""), 2, null);
                    throw new C1352h();
                }
            }
            return deserializer.b(this);
        } catch (w6.c e9) {
            String message3 = e9.getMessage();
            AbstractC3255y.f(message3);
            if (j6.n.H(message3, "at path", false, 2, null)) {
                throw e9;
            }
            throw new w6.c(e9.a(), e9.getMessage() + " at path: " + this.f1636c.f1666b.a(), e9);
        }
    }

    @Override // z6.AbstractC4233a, z6.e
    public String t() {
        if (this.f1640g.o()) {
            return this.f1636c.r();
        }
        return this.f1636c.o();
    }

    @Override // z6.AbstractC4233a, z6.e
    public long u() {
        return this.f1636c.m();
    }

    @Override // z6.AbstractC4233a, z6.e
    public boolean v() {
        boolean z8;
        y yVar = this.f1641h;
        if (yVar != null) {
            z8 = yVar.b();
        } else {
            z8 = false;
        }
        if (z8 || AbstractC1030a.O(this.f1636c, false, 1, null)) {
            return false;
        }
        return true;
    }

    @Override // z6.AbstractC4233a, z6.c
    public Object x(y6.f descriptor, int i8, InterfaceC4150a deserializer, Object obj) {
        boolean z8;
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(deserializer, "deserializer");
        if (this.f1635b == U.f1659e && (i8 & 1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.f1636c.f1666b.d();
        }
        Object x8 = super.x(descriptor, i8, deserializer, obj);
        if (z8) {
            this.f1636c.f1666b.f(x8);
        }
        return x8;
    }

    @Override // z6.AbstractC4233a, z6.e
    public int z(y6.f enumDescriptor) {
        AbstractC3255y.i(enumDescriptor, "enumDescriptor");
        return C.i(enumDescriptor, this.f1634a, t(), " at path " + this.f1636c.f1666b.a());
    }
}
