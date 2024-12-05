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
public final class N extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32376a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32377b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f32378c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32375d = p4.G.f37099d;
    public static final Parcelable.Creator<N> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32379a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32380b;

        static {
            a aVar = new a();
            f32379a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.CashAppPayMandateTextSpec", aVar, 2);
            c0985e0.k("api_path", true);
            c0985e0.k("stringResId", true);
            f32380b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32380b;
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
        public N b(z6.e decoder) {
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
            return new N(i9, g8, i8, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, N value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            N.l(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32379a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new N((p4.G) parcel.readParcelable(N.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final N[] newArray(int i8) {
            return new N[i8];
        }
    }

    public /* synthetic */ N(int i8, p4.G g8, int i9, A6.n0 n0Var) {
        super(null);
        this.f32376a = (i8 & 1) == 0 ? p4.G.Companion.a("cashapp_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f32377b = e4.n.f31744m;
        } else {
            this.f32377b = i9;
        }
        this.f32378c = new u0(h(), this.f32377b);
    }

    public static final /* synthetic */ void l(N n8, z6.d dVar, y6.f fVar) {
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(n8.h(), p4.G.Companion.a("cashapp_mandate"))) {
            dVar.C(fVar, 0, G.a.f37125a, n8.h());
        }
        if (dVar.p(fVar, 1) || n8.f32377b != e4.n.f31744m) {
            dVar.q(fVar, 1, n8.f32377b);
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
        if (!(obj instanceof N)) {
            return false;
        }
        N n8 = (N) obj;
        if (AbstractC3255y.d(this.f32376a, n8.f32376a) && this.f32377b == n8.f32377b) {
            return true;
        }
        return false;
    }

    public p4.G h() {
        return this.f32376a;
    }

    public int hashCode() {
        return (this.f32376a.hashCode() * 31) + this.f32377b;
    }

    public final p4.D i(String merchantName) {
        AbstractC3255y.i(merchantName, "merchantName");
        return this.f32378c.i(merchantName, merchantName);
    }

    public String toString() {
        return "CashAppPayMandateTextSpec(apiPath=" + this.f32376a + ", stringResId=" + this.f32377b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32376a, i8);
        out.writeInt(this.f32377b);
    }

    public /* synthetic */ N(p4.G g8, int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? p4.G.Companion.a("cashapp_mandate") : g8, (i9 & 2) != 0 ? e4.n.f31744m : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(p4.G apiPath, int i8) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        this.f32376a = apiPath;
        this.f32377b = i8;
        this.f32378c = new u0(h(), i8);
    }
}
