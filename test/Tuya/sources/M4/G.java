package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.P;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;
import x6.C3948h;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class G implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private static final G f35067A;

    /* renamed from: B, reason: collision with root package name */
    private static final G f35068B;

    /* renamed from: C, reason: collision with root package name */
    private static final G f35069C;

    /* renamed from: D, reason: collision with root package name */
    private static final G f35070D;

    /* renamed from: E, reason: collision with root package name */
    private static final G f35071E;

    /* renamed from: F, reason: collision with root package name */
    private static final G f35072F;

    /* renamed from: h, reason: collision with root package name */
    private static final G f35077h;

    /* renamed from: i, reason: collision with root package name */
    private static final G f35078i;

    /* renamed from: j, reason: collision with root package name */
    private static final G f35079j;

    /* renamed from: k, reason: collision with root package name */
    private static final G f35080k;

    /* renamed from: l, reason: collision with root package name */
    private static final G f35081l;

    /* renamed from: m, reason: collision with root package name */
    private static final G f35082m;

    /* renamed from: n, reason: collision with root package name */
    private static final G f35083n;

    /* renamed from: o, reason: collision with root package name */
    private static final G f35084o;

    /* renamed from: p, reason: collision with root package name */
    private static final G f35085p;

    /* renamed from: q, reason: collision with root package name */
    private static final G f35086q;

    /* renamed from: r, reason: collision with root package name */
    private static final G f35087r;

    /* renamed from: s, reason: collision with root package name */
    private static final G f35088s;

    /* renamed from: t, reason: collision with root package name */
    private static final G f35089t;

    /* renamed from: u, reason: collision with root package name */
    private static final G f35090u;

    /* renamed from: v, reason: collision with root package name */
    private static final G f35091v;

    /* renamed from: w, reason: collision with root package name */
    private static final G f35092w;

    /* renamed from: x, reason: collision with root package name */
    private static final G f35093x;

    /* renamed from: y, reason: collision with root package name */
    private static final G f35094y;

    /* renamed from: z, reason: collision with root package name */
    private static final G f35095z;

    /* renamed from: a, reason: collision with root package name */
    private final String f35096a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35097b;

    /* renamed from: c, reason: collision with root package name */
    private final P f35098c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f35073d = 8;
    public static final Parcelable.Creator<G> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final t6.b[] f35074e = {null, null, new t6.e(kotlin.jvm.internal.U.b(P.class), new Annotation[0])};

    /* renamed from: f, reason: collision with root package name */
    private static final G f35075f = new G("billing_details[name]", false, (P) null, 6, (AbstractC3151p) null);

    /* renamed from: g, reason: collision with root package name */
    private static final G f35076g = new G("card[brand]", false, (P) null, 6, (AbstractC3151p) null);

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35099a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f35100b;

        static {
            a aVar = new a();
            f35099a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.uicore.elements.IdentifierSpec", aVar, 3);
            c3944e0.k("v1", false);
            c3944e0.k("ignoreField", true);
            c3944e0.k("destination", true);
            f35100b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f35100b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{x6.r0.f39600a, C3948h.f39572a, G.f35074e[2]};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public G c(w6.e decoder) {
            int i8;
            boolean z8;
            String str;
            P p8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = G.f35074e;
            if (d8.z()) {
                String q8 = d8.q(a8, 0);
                boolean j8 = d8.j(a8, 1);
                p8 = (P) d8.r(a8, 2, bVarArr[2], null);
                str = q8;
                z8 = j8;
                i8 = 7;
            } else {
                String str2 = null;
                P p9 = null;
                int i9 = 0;
                boolean z9 = false;
                boolean z10 = true;
                while (z10) {
                    int p10 = d8.p(a8);
                    if (p10 != -1) {
                        if (p10 != 0) {
                            if (p10 != 1) {
                                if (p10 == 2) {
                                    p9 = (P) d8.r(a8, 2, bVarArr[2], p9);
                                    i9 |= 4;
                                } else {
                                    throw new t6.l(p10);
                                }
                            } else {
                                z9 = d8.j(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str2 = d8.q(a8, 0);
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
            d8.a(a8);
            return new G(i8, str, z8, p8, (x6.n0) null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, G value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            G.k0(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final G A() {
            return G.f35068B;
        }

        public final G a(String _value) {
            AbstractC3159y.i(_value, "_value");
            return new G(_value, false, (P) null, 6, (AbstractC3151p) null);
        }

        public final G b(String value) {
            AbstractC3159y.i(value, "value");
            if (AbstractC3159y.d(value, f().j0())) {
                return f();
            }
            if (AbstractC3159y.d(value, j().j0())) {
                return j();
            }
            if (AbstractC3159y.d(value, g().j0())) {
                return g();
            }
            if (AbstractC3159y.d(value, k().j0())) {
                return k();
            }
            if (AbstractC3159y.d(value, l().j0())) {
                return l();
            }
            if (AbstractC3159y.d(value, n().j0())) {
                return n();
            }
            if (AbstractC3159y.d(value, p().j0())) {
                return p();
            }
            if (AbstractC3159y.d(value, q().j0())) {
                return q();
            }
            if (AbstractC3159y.d(value, r().j0())) {
                return r();
            }
            if (AbstractC3159y.d(value, t().j0())) {
                return t();
            }
            if (AbstractC3159y.d(value, u().j0())) {
                return u();
            }
            if (AbstractC3159y.d(value, x().j0())) {
                return x();
            }
            if (AbstractC3159y.d(value, z().j0())) {
                return z();
            }
            if (AbstractC3159y.d(value, s().j0())) {
                return s();
            }
            return a(value);
        }

        public final G c() {
            return G.f35072F;
        }

        public final G d() {
            return G.f35082m;
        }

        public final G e() {
            return G.f35070D;
        }

        public final G f() {
            return G.f35076g;
        }

        public final G g() {
            return G.f35079j;
        }

        public final G h() {
            return G.f35080k;
        }

        public final G i() {
            return G.f35081l;
        }

        public final G j() {
            return G.f35078i;
        }

        public final G k() {
            return G.f35087r;
        }

        public final G l() {
            return G.f35092w;
        }

        public final G m() {
            return G.f35088s;
        }

        public final G n() {
            return G.f35083n;
        }

        public final G o() {
            return G.f35071E;
        }

        public final G p() {
            return G.f35085p;
        }

        public final G q() {
            return G.f35086q;
        }

        public final G r() {
            return G.f35075f;
        }

        public final G s() {
            return G.f35094y;
        }

        public final t6.b serializer() {
            return a.f35099a;
        }

        public final G t() {
            return G.f35084o;
        }

        public final G u() {
            return G.f35089t;
        }

        public final G v() {
            return G.f35077h;
        }

        public final G w() {
            return G.f35095z;
        }

        public final G x() {
            return G.f35093x;
        }

        public final G y() {
            return G.f35090u;
        }

        public final G z() {
            return G.f35091v;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3159y.i(parcel, "parcel");
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
        f35077h = new G("card[networks][preferred]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        int i9 = 6;
        boolean z9 = false;
        P p9 = null;
        f35078i = new G("card[number]", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35079j = new G("card[cvc]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35080k = new G("card[exp_month]", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35081l = new G("card[exp_year]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35082m = new G("billing_details[address]", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35083n = new G("billing_details[email]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35084o = new G("billing_details[phone]", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35085p = new G("billing_details[address][line1]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35086q = new G("billing_details[address][line2]", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35087r = new G("billing_details[address][city]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35088s = new G("", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35089t = new G("billing_details[address][postal_code]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35090u = new G("", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35091v = new G("billing_details[address][state]", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35092w = new G("billing_details[address][country]", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35093x = new G("save_for_future_use", z8, p8, i8, (AbstractC3151p) (0 == true ? 1 : 0));
        f35094y = new G("address", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        f35095z = new G("same_as_shipping", true, p8, 4, (AbstractC3151p) (0 == true ? 1 : 0));
        f35067A = new G("upi", z9, p9, i9, (AbstractC3151p) (0 == true ? 1 : 0));
        boolean z10 = false;
        f35068B = new G("upi[vpa]", z10, p8, 6, (AbstractC3151p) (0 == true ? 1 : 0));
        P.a aVar = P.a.f35188b;
        int i10 = 2;
        f35069C = new G("blik", z9, (P) aVar, i10, (AbstractC3151p) (0 == true ? 1 : 0));
        int i11 = 2;
        f35070D = new G("blik[code]", z10, (P) aVar, i11, (AbstractC3151p) (0 == true ? 1 : 0));
        f35071E = new G("konbini[confirmation_number]", z10, (P) aVar, i11, (AbstractC3151p) (0 == true ? 1 : 0));
        f35072F = new G("bacs_debit[confirmed]", z9, (P) P.b.f35191a, i10, (AbstractC3151p) (0 == true ? 1 : 0));
    }

    public /* synthetic */ G(int i8, String str, boolean z8, P p8, x6.n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC3942d0.a(i8, 1, a.f35099a.a());
        }
        this.f35096a = str;
        if ((i8 & 2) == 0) {
            this.f35097b = false;
        } else {
            this.f35097b = z8;
        }
        if ((i8 & 4) == 0) {
            this.f35098c = P.a.f35187a;
        } else {
            this.f35098c = p8;
        }
    }

    public static /* synthetic */ G g0(G g8, String str, boolean z8, P p8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = g8.f35096a;
        }
        if ((i8 & 2) != 0) {
            z8 = g8.f35097b;
        }
        if ((i8 & 4) != 0) {
            p8 = g8.f35098c;
        }
        return g8.f0(str, z8, p8);
    }

    public static final /* synthetic */ void k0(G g8, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f35074e;
        dVar.y(fVar, 0, g8.f35096a);
        if (dVar.i(fVar, 1) || g8.f35097b) {
            dVar.o(fVar, 1, g8.f35097b);
        }
        if (dVar.i(fVar, 2) || g8.f35098c != P.a.f35187a) {
            dVar.A(fVar, 2, bVarArr[2], g8.f35098c);
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
        if (AbstractC3159y.d(this.f35096a, g8.f35096a) && this.f35097b == g8.f35097b && AbstractC3159y.d(this.f35098c, g8.f35098c)) {
            return true;
        }
        return false;
    }

    public final G f0(String v12, boolean z8, P destination) {
        AbstractC3159y.i(v12, "v1");
        AbstractC3159y.i(destination, "destination");
        return new G(v12, z8, destination);
    }

    public final P h0() {
        return this.f35098c;
    }

    public int hashCode() {
        return (((this.f35096a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f35097b)) * 31) + this.f35098c.hashCode();
    }

    public final boolean i0() {
        return this.f35097b;
    }

    public final String j0() {
        return this.f35096a;
    }

    public String toString() {
        return "IdentifierSpec(v1=" + this.f35096a + ", ignoreField=" + this.f35097b + ", destination=" + this.f35098c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f35096a);
        out.writeInt(this.f35097b ? 1 : 0);
        out.writeParcelable(this.f35098c, i8);
    }

    public G(String v12, boolean z8, P destination) {
        AbstractC3159y.i(v12, "v1");
        AbstractC3159y.i(destination, "destination");
        this.f35096a = v12;
        this.f35097b = z8;
        this.f35098c = destination;
    }

    public /* synthetic */ G(String str, boolean z8, P p8, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? P.a.f35187a : p8);
    }

    public G() {
        this("", false, (P) null, 6, (AbstractC3151p) null);
    }
}
