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
/* renamed from: h4.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2948p0 extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32714a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32715b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f32716c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32713d = p4.G.f37099d;
    public static final Parcelable.Creator<C2948p0> CREATOR = new c();

    /* renamed from: h4.p0$a */
    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32717a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32718b;

        static {
            a aVar = new a();
            f32717a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.KlarnaMandateTextSpec", aVar, 2);
            c0985e0.k("api_path", true);
            c0985e0.k("stringResId", true);
            f32718b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32718b;
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
        public C2948p0 b(z6.e decoder) {
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
            return new C2948p0(i9, g8, i8, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C2948p0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C2948p0.l(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: h4.p0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32717a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: h4.p0$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2948p0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2948p0((p4.G) parcel.readParcelable(C2948p0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2948p0[] newArray(int i8) {
            return new C2948p0[i8];
        }
    }

    public /* synthetic */ C2948p0(int i8, p4.G g8, int i9, A6.n0 n0Var) {
        super(null);
        this.f32714a = (i8 & 1) == 0 ? p4.G.Companion.a("klarna_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f32715b = e4.n.f31690A;
        } else {
            this.f32715b = i9;
        }
        this.f32716c = new u0(h(), this.f32715b);
    }

    public static final /* synthetic */ void l(C2948p0 c2948p0, z6.d dVar, y6.f fVar) {
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(c2948p0.h(), p4.G.Companion.a("klarna_mandate"))) {
            dVar.C(fVar, 0, G.a.f37125a, c2948p0.h());
        }
        if (dVar.p(fVar, 1) || c2948p0.f32715b != e4.n.f31690A) {
            dVar.q(fVar, 1, c2948p0.f32715b);
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
        if (!(obj instanceof C2948p0)) {
            return false;
        }
        C2948p0 c2948p0 = (C2948p0) obj;
        if (AbstractC3255y.d(this.f32714a, c2948p0.f32714a) && this.f32715b == c2948p0.f32715b) {
            return true;
        }
        return false;
    }

    public p4.G h() {
        return this.f32714a;
    }

    public int hashCode() {
        return (this.f32714a.hashCode() * 31) + this.f32715b;
    }

    public final p4.D i(String merchantName) {
        AbstractC3255y.i(merchantName, "merchantName");
        return this.f32716c.i(merchantName, merchantName);
    }

    public String toString() {
        return "KlarnaMandateTextSpec(apiPath=" + this.f32714a + ", stringResId=" + this.f32715b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32714a, i8);
        out.writeInt(this.f32715b);
    }

    public /* synthetic */ C2948p0(p4.G g8, int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? p4.G.Companion.a("klarna_mandate") : g8, (i9 & 2) != 0 ? e4.n.f31690A : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2948p0(p4.G apiPath, int i8) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        this.f32714a = apiPath;
        this.f32715b = i8;
        this.f32716c = new u0(h(), i8);
    }
}
