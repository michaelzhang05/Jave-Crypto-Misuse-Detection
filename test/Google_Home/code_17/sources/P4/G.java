package p4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
import A6.C0989h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.P;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class G implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private static final G f37093A;

    /* renamed from: B, reason: collision with root package name */
    private static final G f37094B;

    /* renamed from: C, reason: collision with root package name */
    private static final G f37095C;

    /* renamed from: D, reason: collision with root package name */
    private static final G f37096D;

    /* renamed from: E, reason: collision with root package name */
    private static final G f37097E;

    /* renamed from: F, reason: collision with root package name */
    private static final G f37098F;

    /* renamed from: h, reason: collision with root package name */
    private static final G f37103h;

    /* renamed from: i, reason: collision with root package name */
    private static final G f37104i;

    /* renamed from: j, reason: collision with root package name */
    private static final G f37105j;

    /* renamed from: k, reason: collision with root package name */
    private static final G f37106k;

    /* renamed from: l, reason: collision with root package name */
    private static final G f37107l;

    /* renamed from: m, reason: collision with root package name */
    private static final G f37108m;

    /* renamed from: n, reason: collision with root package name */
    private static final G f37109n;

    /* renamed from: o, reason: collision with root package name */
    private static final G f37110o;

    /* renamed from: p, reason: collision with root package name */
    private static final G f37111p;

    /* renamed from: q, reason: collision with root package name */
    private static final G f37112q;

    /* renamed from: r, reason: collision with root package name */
    private static final G f37113r;

    /* renamed from: s, reason: collision with root package name */
    private static final G f37114s;

    /* renamed from: t, reason: collision with root package name */
    private static final G f37115t;

    /* renamed from: u, reason: collision with root package name */
    private static final G f37116u;

    /* renamed from: v, reason: collision with root package name */
    private static final G f37117v;

    /* renamed from: w, reason: collision with root package name */
    private static final G f37118w;

    /* renamed from: x, reason: collision with root package name */
    private static final G f37119x;

    /* renamed from: y, reason: collision with root package name */
    private static final G f37120y;

    /* renamed from: z, reason: collision with root package name */
    private static final G f37121z;

    /* renamed from: a, reason: collision with root package name */
    private final String f37122a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37123b;

    /* renamed from: c, reason: collision with root package name */
    private final P f37124c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f37099d = 8;
    public static final Parcelable.Creator<G> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final w6.b[] f37100e = {null, null, new w6.e(kotlin.jvm.internal.U.b(P.class), new Annotation[0])};

    /* renamed from: f, reason: collision with root package name */
    private static final G f37101f = new G("billing_details[name]", false, (P) null, 6, (AbstractC3247p) null);

    /* renamed from: g, reason: collision with root package name */
    private static final G f37102g = new G("card[brand]", false, (P) null, 6, (AbstractC3247p) null);

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37125a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f37126b;

        static {
            a aVar = new a();
            f37125a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.uicore.elements.IdentifierSpec", aVar, 3);
            c0985e0.k("v1", false);
            c0985e0.k("ignoreField", true);
            c0985e0.k("destination", true);
            f37126b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f37126b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{A6.r0.f595a, C0989h.f567a, G.f37100e[2]};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public G b(z6.e decoder) {
            int i8;
            boolean z8;
            String str;
            P p8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = G.f37100e;
            if (d8.w()) {
                String e8 = d8.e(a8, 0);
                boolean f8 = d8.f(a8, 1);
                p8 = (P) d8.x(a8, 2, bVarArr[2], null);
                str = e8;
                z8 = f8;
                i8 = 7;
            } else {
                String str2 = null;
                P p9 = null;
                int i9 = 0;
                boolean z9 = false;
                boolean z10 = true;
                while (z10) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 == 2) {
                                    p9 = (P) d8.x(a8, 2, bVarArr[2], p9);
                                    i9 |= 4;
                                } else {
                                    throw new w6.l(g8);
                                }
                            } else {
                                z9 = d8.f(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str2 = d8.e(a8, 0);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                i8 = i9;
                z8 = z9;
                str = str2;
                p8 = p9;
            }
            d8.b(a8);
            return new G(i8, str, z8, p8, (A6.n0) null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, G value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            G.k0(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final G A() {
            return G.f37094B;
        }

        public final G a(String _value) {
            AbstractC3255y.i(_value, "_value");
            return new G(_value, false, (P) null, 6, (AbstractC3247p) null);
        }

        public final G b(String value) {
            AbstractC3255y.i(value, "value");
            if (AbstractC3255y.d(value, f().j0())) {
                return f();
            }
            if (AbstractC3255y.d(value, j().j0())) {
                return j();
            }
            if (AbstractC3255y.d(value, g().j0())) {
                return g();
            }
            if (AbstractC3255y.d(value, k().j0())) {
                return k();
            }
            if (AbstractC3255y.d(value, l().j0())) {
                return l();
            }
            if (AbstractC3255y.d(value, n().j0())) {
                return n();
            }
            if (AbstractC3255y.d(value, p().j0())) {
                return p();
            }
            if (AbstractC3255y.d(value, q().j0())) {
                return q();
            }
            if (AbstractC3255y.d(value, r().j0())) {
                return r();
            }
            if (AbstractC3255y.d(value, t().j0())) {
                return t();
            }
            if (AbstractC3255y.d(value, u().j0())) {
                return u();
            }
            if (AbstractC3255y.d(value, x().j0())) {
                return x();
            }
            if (AbstractC3255y.d(value, z().j0())) {
                return z();
            }
            if (AbstractC3255y.d(value, s().j0())) {
                return s();
            }
            return a(value);
        }

        public final G c() {
            return G.f37098F;
        }

        public final G d() {
            return G.f37108m;
        }

        public final G e() {
            return G.f37096D;
        }

        public final G f() {
            return G.f37102g;
        }

        public final G g() {
            return G.f37105j;
        }

        public final G h() {
            return G.f37106k;
        }

        public final G i() {
            return G.f37107l;
        }

        public final G j() {
            return G.f37104i;
        }

        public final G k() {
            return G.f37113r;
        }

        public final G l() {
            return G.f37118w;
        }

        public final G m() {
            return G.f37114s;
        }

        public final G n() {
            return G.f37109n;
        }

        public final G o() {
            return G.f37097E;
        }

        public final G p() {
            return G.f37111p;
        }

        public final G q() {
            return G.f37112q;
        }

        public final G r() {
            return G.f37101f;
        }

        public final G s() {
            return G.f37120y;
        }

        public final w6.b serializer() {
            return a.f37125a;
        }

        public final G t() {
            return G.f37110o;
        }

        public final G u() {
            return G.f37115t;
        }

        public final G v() {
            return G.f37103h;
        }

        public final G w() {
            return G.f37121z;
        }

        public final G x() {
            return G.f37119x;
        }

        public final G y() {
            return G.f37116u;
        }

        public final G z() {
            return G.f37117v;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new G(readString, z8, (P) parcel.readParcelable(G.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G[] newArray(int i8) {
            return new G[i8];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i8 = 6;
        boolean z8 = false;
        P p8 = null;
        f37103h = new G("card[networks][preferred]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        int i9 = 6;
        boolean z9 = false;
        P p9 = null;
        f37104i = new G("card[number]", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37105j = new G("card[cvc]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37106k = new G("card[exp_month]", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37107l = new G("card[exp_year]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37108m = new G("billing_details[address]", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37109n = new G("billing_details[email]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37110o = new G("billing_details[phone]", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37111p = new G("billing_details[address][line1]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37112q = new G("billing_details[address][line2]", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37113r = new G("billing_details[address][city]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37114s = new G("", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37115t = new G("billing_details[address][postal_code]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37116u = new G("", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37117v = new G("billing_details[address][state]", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37118w = new G("billing_details[address][country]", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37119x = new G("save_for_future_use", z8, p8, i8, (AbstractC3247p) (0 == true ? 1 : 0));
        f37120y = new G("address", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        f37121z = new G("same_as_shipping", true, p8, 4, (AbstractC3247p) (0 == true ? 1 : 0));
        f37093A = new G("upi", z9, p9, i9, (AbstractC3247p) (0 == true ? 1 : 0));
        boolean z10 = false;
        f37094B = new G("upi[vpa]", z10, p8, 6, (AbstractC3247p) (0 == true ? 1 : 0));
        P.a aVar = P.a.f37214b;
        int i10 = 2;
        f37095C = new G("blik", z9, (P) aVar, i10, (AbstractC3247p) (0 == true ? 1 : 0));
        int i11 = 2;
        f37096D = new G("blik[code]", z10, (P) aVar, i11, (AbstractC3247p) (0 == true ? 1 : 0));
        f37097E = new G("konbini[confirmation_number]", z10, (P) aVar, i11, (AbstractC3247p) (0 == true ? 1 : 0));
        f37098F = new G("bacs_debit[confirmed]", z9, (P) P.b.f37217a, i10, (AbstractC3247p) (0 == true ? 1 : 0));
    }

    public /* synthetic */ G(int i8, String str, boolean z8, P p8, A6.n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC0983d0.a(i8, 1, a.f37125a.a());
        }
        this.f37122a = str;
        if ((i8 & 2) == 0) {
            this.f37123b = false;
        } else {
            this.f37123b = z8;
        }
        if ((i8 & 4) == 0) {
            this.f37124c = P.a.f37213a;
        } else {
            this.f37124c = p8;
        }
    }

    public static /* synthetic */ G g0(G g8, String str, boolean z8, P p8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = g8.f37122a;
        }
        if ((i8 & 2) != 0) {
            z8 = g8.f37123b;
        }
        if ((i8 & 4) != 0) {
            p8 = g8.f37124c;
        }
        return g8.f0(str, z8, p8);
    }

    public static final /* synthetic */ void k0(G g8, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f37100e;
        dVar.e(fVar, 0, g8.f37122a);
        if (dVar.p(fVar, 1) || g8.f37123b) {
            dVar.s(fVar, 1, g8.f37123b);
        }
        if (dVar.p(fVar, 2) || g8.f37124c != P.a.f37213a) {
            dVar.C(fVar, 2, bVarArr[2], g8.f37124c);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (AbstractC3255y.d(this.f37122a, g8.f37122a) && this.f37123b == g8.f37123b && AbstractC3255y.d(this.f37124c, g8.f37124c)) {
            return true;
        }
        return false;
    }

    public final G f0(String v12, boolean z8, P destination) {
        AbstractC3255y.i(v12, "v1");
        AbstractC3255y.i(destination, "destination");
        return new G(v12, z8, destination);
    }

    public final P h0() {
        return this.f37124c;
    }

    public int hashCode() {
        return (((this.f37122a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f37123b)) * 31) + this.f37124c.hashCode();
    }

    public final boolean i0() {
        return this.f37123b;
    }

    public final String j0() {
        return this.f37122a;
    }

    public String toString() {
        return "IdentifierSpec(v1=" + this.f37122a + ", ignoreField=" + this.f37123b + ", destination=" + this.f37124c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f37122a);
        out.writeInt(this.f37123b ? 1 : 0);
        out.writeParcelable(this.f37124c, i8);
    }

    public G(String v12, boolean z8, P destination) {
        AbstractC3255y.i(v12, "v1");
        AbstractC3255y.i(destination, "destination");
        this.f37122a = v12;
        this.f37123b = z8;
        this.f37124c = destination;
    }

    public /* synthetic */ G(String str, boolean z8, P p8, int i8, AbstractC3247p abstractC3247p) {
        this(str, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? P.a.f37213a : p8);
    }

    public G() {
        this("", false, (P) null, 6, (AbstractC3247p) null);
    }
}
