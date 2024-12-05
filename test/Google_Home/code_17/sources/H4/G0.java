package h4;

import A6.C;
import A6.C0985e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class G0 extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32284a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32285b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f32286c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32283d = p4.G.f37099d;
    public static final Parcelable.Creator<G0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32287a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32288b;

        static {
            a aVar = new a();
            f32287a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.SepaMandateTextSpec", aVar, 2);
            c0985e0.k("api_path", true);
            c0985e0.k("stringResId", true);
            f32288b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32288b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{G.a.f37125a, A6.H.f513a};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public G0 b(z6.e decoder) {
            p4.G g8;
            int i8;
            int i9;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            A6.n0 n0Var = null;
            if (d8.w()) {
                g8 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
                i8 = d8.p(a8, 1);
                i9 = 3;
            } else {
                g8 = null;
                int i10 = 0;
                int i11 = 0;
                boolean z8 = true;
                while (z8) {
                    int g9 = d8.g(a8);
                    if (g9 != -1) {
                        if (g9 != 0) {
                            if (g9 == 1) {
                                i10 = d8.p(a8, 1);
                                i11 |= 2;
                            } else {
                                throw new w6.l(g9);
                            }
                        } else {
                            g8 = (p4.G) d8.x(a8, 0, G.a.f37125a, g8);
                            i11 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i10;
                i9 = i11;
            }
            d8.b(a8);
            return new G0(i9, g8, i8, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, G0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            G0.l(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32287a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new G0((p4.G) parcel.readParcelable(G0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G0[] newArray(int i8) {
            return new G0[i8];
        }
    }

    public /* synthetic */ G0(int i8, p4.G g8, int i9, A6.n0 n0Var) {
        super(null);
        this.f32284a = (i8 & 1) == 0 ? p4.G.Companion.a("sepa_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f32285b = e4.n.f31693B0;
        } else {
            this.f32285b = i9;
        }
        this.f32286c = new u0(h(), this.f32285b);
    }

    public static final /* synthetic */ void l(G0 g02, z6.d dVar, y6.f fVar) {
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(g02.h(), p4.G.Companion.a("sepa_mandate"))) {
            dVar.C(fVar, 0, G.a.f37125a, g02.h());
        }
        if (dVar.p(fVar, 1) || g02.f32285b != e4.n.f31693B0) {
            dVar.q(fVar, 1, g02.f32285b);
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
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        if (AbstractC3255y.d(this.f32284a, g02.f32284a) && this.f32285b == g02.f32285b) {
            return true;
        }
        return false;
    }

    public p4.G h() {
        return this.f32284a;
    }

    public int hashCode() {
        return (this.f32284a.hashCode() * 31) + this.f32285b;
    }

    public final p4.D i(String merchantName) {
        AbstractC3255y.i(merchantName, "merchantName");
        return this.f32286c.i(merchantName);
    }

    public String toString() {
        return "SepaMandateTextSpec(apiPath=" + this.f32284a + ", stringResId=" + this.f32285b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32284a, i8);
        out.writeInt(this.f32285b);
    }

    public /* synthetic */ G0(p4.G g8, int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? p4.G.Companion.a("sepa_mandate") : g8, (i9 & 2) != 0 ? e4.n.f31693B0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(p4.G apiPath, int i8) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        this.f32284a = apiPath;
        this.f32285b = i8;
        this.f32286c = new u0(h(), i8);
    }
}
