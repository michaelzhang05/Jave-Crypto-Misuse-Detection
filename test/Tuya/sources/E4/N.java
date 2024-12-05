package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class N extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30455a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30456b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f30457c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f30454d = m4.G.f35073d;
    public static final Parcelable.Creator<N> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30458a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30459b;

        static {
            a aVar = new a();
            f30458a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.CashAppPayMandateTextSpec", aVar, 2);
            c3944e0.k("api_path", true);
            c3944e0.k("stringResId", true);
            f30459b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30459b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{G.a.f35099a, x6.H.f39518a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public N c(w6.e decoder) {
            m4.G g8;
            int i8;
            int i9;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            x6.n0 n0Var = null;
            if (d8.z()) {
                g8 = (m4.G) d8.r(a8, 0, G.a.f35099a, null);
                i8 = d8.u(a8, 1);
                i9 = 3;
            } else {
                g8 = null;
                int i10 = 0;
                int i11 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                i10 = d8.u(a8, 1);
                                i11 |= 2;
                            } else {
                                throw new t6.l(p8);
                            }
                        } else {
                            g8 = (m4.G) d8.r(a8, 0, G.a.f35099a, g8);
                            i11 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i10;
                i9 = i11;
            }
            d8.a(a8);
            return new N(i9, g8, i8, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, N value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            N.j(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30458a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new N((m4.G) parcel.readParcelable(N.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final N[] newArray(int i8) {
            return new N[i8];
        }
    }

    public /* synthetic */ N(int i8, m4.G g8, int i9, x6.n0 n0Var) {
        super(null);
        this.f30455a = (i8 & 1) == 0 ? m4.G.Companion.a("cashapp_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f30456b = b4.n.f14738m;
        } else {
            this.f30456b = i9;
        }
        this.f30457c = new u0(f(), this.f30456b);
    }

    public static final /* synthetic */ void j(N n8, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(n8.f(), m4.G.Companion.a("cashapp_mandate"))) {
            dVar.A(fVar, 0, G.a.f35099a, n8.f());
        }
        if (dVar.i(fVar, 1) || n8.f30456b != b4.n.f14738m) {
            dVar.v(fVar, 1, n8.f30456b);
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
        if (AbstractC3159y.d(this.f30455a, n8.f30455a) && this.f30456b == n8.f30456b) {
            return true;
        }
        return false;
    }

    public m4.G f() {
        return this.f30455a;
    }

    public int hashCode() {
        return (this.f30455a.hashCode() * 31) + this.f30456b;
    }

    public final m4.D i(String merchantName) {
        AbstractC3159y.i(merchantName, "merchantName");
        return this.f30457c.i(merchantName, merchantName);
    }

    public String toString() {
        return "CashAppPayMandateTextSpec(apiPath=" + this.f30455a + ", stringResId=" + this.f30456b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30455a, i8);
        out.writeInt(this.f30456b);
    }

    public /* synthetic */ N(m4.G g8, int i8, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? m4.G.Companion.a("cashapp_mandate") : g8, (i9 & 2) != 0 ? b4.n.f14738m : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(m4.G apiPath, int i8) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        this.f30455a = apiPath;
        this.f30456b = i8;
        this.f30457c = new u0(f(), i8);
    }
}
