package h4;

import A6.C;
import A6.C0985e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class w0 extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32790a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f32791b;

    /* renamed from: c, reason: collision with root package name */
    private final L0 f32792c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32788d = p4.G.f37099d;
    public static final Parcelable.Creator<w0> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final w6.b[] f32789e = {null, P0.Companion.serializer()};

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32793a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32794b;

        static {
            a aVar = new a();
            f32793a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.NameSpec", aVar, 2);
            c0985e0.k("api_path", true);
            c0985e0.k("translation_id", true);
            f32794b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32794b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{G.a.f37125a, w0.f32789e[1]};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public w0 b(z6.e decoder) {
            P0 p02;
            p4.G g8;
            int i8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = w0.f32789e;
            A6.n0 n0Var = null;
            if (d8.w()) {
                g8 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
                p02 = (P0) d8.x(a8, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                P0 p03 = null;
                p4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g10 = d8.g(a8);
                    if (g10 != -1) {
                        if (g10 != 0) {
                            if (g10 == 1) {
                                p03 = (P0) d8.x(a8, 1, bVarArr[1], p03);
                                i9 |= 2;
                            } else {
                                throw new w6.l(g10);
                            }
                        } else {
                            g9 = (p4.G) d8.x(a8, 0, G.a.f37125a, g9);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                p02 = p03;
                g8 = g9;
                i8 = i9;
            }
            d8.b(a8);
            return new w0(i8, g8, p02, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, w0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            w0.p(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32793a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new w0((p4.G) parcel.readParcelable(w0.class.getClassLoader()), P0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w0[] newArray(int i8) {
            return new w0[i8];
        }
    }

    public /* synthetic */ w0(int i8, p4.G g8, P0 p02, A6.n0 n0Var) {
        super(null);
        this.f32790a = (i8 & 1) == 0 ? p4.G.Companion.r() : g8;
        if ((i8 & 2) == 0) {
            this.f32791b = P0.f32405g;
        } else {
            this.f32791b = p02;
        }
        this.f32792c = new L0(i(), this.f32791b.c(), EnumC2959z.f32809d, EnumC2944n0.f32685b, false, 16, (AbstractC3247p) null);
    }

    public static final /* synthetic */ void p(w0 w0Var, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f32789e;
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(w0Var.i(), p4.G.Companion.r())) {
            dVar.C(fVar, 0, G.a.f37125a, w0Var.i());
        }
        if (dVar.p(fVar, 1) || w0Var.f32791b != P0.f32405g) {
            dVar.C(fVar, 1, bVarArr[1], w0Var.f32791b);
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
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (AbstractC3255y.d(this.f32790a, w0Var.f32790a) && this.f32791b == w0Var.f32791b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32790a.hashCode() * 31) + this.f32791b.hashCode();
    }

    public p4.G i() {
        return this.f32790a;
    }

    public final p4.h0 l(Map initialValues) {
        AbstractC3255y.i(initialValues, "initialValues");
        return this.f32792c.l(initialValues);
    }

    public String toString() {
        return "NameSpec(apiPath=" + this.f32790a + ", labelTranslationId=" + this.f32791b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32790a, i8);
        out.writeString(this.f32791b.name());
    }

    public /* synthetic */ w0(p4.G g8, P0 p02, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? p4.G.Companion.r() : g8, (i8 & 2) != 0 ? P0.f32405g : p02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p4.G apiPath, P0 labelTranslationId) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        AbstractC3255y.i(labelTranslationId, "labelTranslationId");
        this.f32790a = apiPath;
        this.f32791b = labelTranslationId;
        this.f32792c = new L0(i(), labelTranslationId.c(), EnumC2959z.f32809d, EnumC2944n0.f32685b, false, 16, (AbstractC3247p) null);
    }
}
