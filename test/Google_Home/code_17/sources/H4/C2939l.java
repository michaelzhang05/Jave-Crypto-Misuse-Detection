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
/* renamed from: h4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2939l extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32658a;
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f32657b = p4.G.f37099d;
    public static final Parcelable.Creator<C2939l> CREATOR = new c();

    /* renamed from: h4.l$a */
    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32659a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32660b;

        static {
            a aVar = new a();
            f32659a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.AuBecsDebitMandateTextSpec", aVar, 1);
            c0985e0.k("api_path", true);
            f32660b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32660b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{G.a.f37125a};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2939l b(z6.e decoder) {
            p4.G g8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            int i8 = 1;
            A6.n0 n0Var = null;
            if (d8.w()) {
                g8 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
            } else {
                g8 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int g9 = d8.g(a8);
                    if (g9 != -1) {
                        if (g9 == 0) {
                            g8 = (p4.G) d8.x(a8, 0, G.a.f37125a, g8);
                            i9 = 1;
                        } else {
                            throw new w6.l(g9);
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
            }
            d8.b(a8);
            return new C2939l(i8, g8, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C2939l value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C2939l.l(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: h4.l$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32659a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: h4.l$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2939l createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2939l((p4.G) parcel.readParcelable(C2939l.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2939l[] newArray(int i8) {
            return new C2939l[i8];
        }
    }

    public /* synthetic */ C2939l(int i8, p4.G g8, A6.n0 n0Var) {
        super(null);
        if ((i8 & 1) == 0) {
            this.f32658a = p4.G.Companion.a("au_becs_mandate");
        } else {
            this.f32658a = g8;
        }
    }

    public static final /* synthetic */ void l(C2939l c2939l, z6.d dVar, y6.f fVar) {
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(c2939l.h(), p4.G.Companion.a("au_becs_mandate"))) {
            dVar.C(fVar, 0, G.a.f37125a, c2939l.h());
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
        if ((obj instanceof C2939l) && AbstractC3255y.d(this.f32658a, ((C2939l) obj).f32658a)) {
            return true;
        }
        return false;
    }

    public p4.G h() {
        return this.f32658a;
    }

    public int hashCode() {
        return this.f32658a.hashCode();
    }

    public final p4.D i(String merchantName) {
        AbstractC3255y.i(merchantName, "merchantName");
        return new C2937k(h(), merchantName, null, 4, null);
    }

    public String toString() {
        return "AuBecsDebitMandateTextSpec(apiPath=" + this.f32658a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32658a, i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2939l(p4.G apiPath) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        this.f32658a = apiPath;
    }
}