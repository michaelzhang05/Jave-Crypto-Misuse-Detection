package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class w0 extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30869a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f30870b;

    /* renamed from: c, reason: collision with root package name */
    private final L0 f30871c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f30867d = m4.G.f35073d;
    public static final Parcelable.Creator<w0> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final t6.b[] f30868e = {null, P0.Companion.serializer()};

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30872a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30873b;

        static {
            a aVar = new a();
            f30872a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.NameSpec", aVar, 2);
            c3944e0.k("api_path", true);
            c3944e0.k("translation_id", true);
            f30873b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30873b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{G.a.f35099a, w0.f30868e[1]};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public w0 c(w6.e decoder) {
            P0 p02;
            m4.G g8;
            int i8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = w0.f30868e;
            x6.n0 n0Var = null;
            if (d8.z()) {
                g8 = (m4.G) d8.r(a8, 0, G.a.f35099a, null);
                p02 = (P0) d8.r(a8, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                P0 p03 = null;
                m4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                p03 = (P0) d8.r(a8, 1, bVarArr[1], p03);
                                i9 |= 2;
                            } else {
                                throw new t6.l(p8);
                            }
                        } else {
                            g9 = (m4.G) d8.r(a8, 0, G.a.f35099a, g9);
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
            d8.a(a8);
            return new w0(i8, g8, p02, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, w0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            w0.k(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30872a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new w0((m4.G) parcel.readParcelable(w0.class.getClassLoader()), P0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w0[] newArray(int i8) {
            return new w0[i8];
        }
    }

    public /* synthetic */ w0(int i8, m4.G g8, P0 p02, x6.n0 n0Var) {
        super(null);
        this.f30869a = (i8 & 1) == 0 ? m4.G.Companion.r() : g8;
        if ((i8 & 2) == 0) {
            this.f30870b = P0.f30484g;
        } else {
            this.f30870b = p02;
        }
        this.f30871c = new L0(i(), this.f30870b.c(), EnumC2639z.f30888d, EnumC2624n0.f30764b, false, 16, (AbstractC3151p) null);
    }

    public static final /* synthetic */ void k(w0 w0Var, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f30868e;
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(w0Var.i(), m4.G.Companion.r())) {
            dVar.A(fVar, 0, G.a.f35099a, w0Var.i());
        }
        if (dVar.i(fVar, 1) || w0Var.f30870b != P0.f30484g) {
            dVar.A(fVar, 1, bVarArr[1], w0Var.f30870b);
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
        if (AbstractC3159y.d(this.f30869a, w0Var.f30869a) && this.f30870b == w0Var.f30870b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30869a.hashCode() * 31) + this.f30870b.hashCode();
    }

    public m4.G i() {
        return this.f30869a;
    }

    public final m4.h0 j(Map initialValues) {
        AbstractC3159y.i(initialValues, "initialValues");
        return this.f30871c.j(initialValues);
    }

    public String toString() {
        return "NameSpec(apiPath=" + this.f30869a + ", labelTranslationId=" + this.f30870b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30869a, i8);
        out.writeString(this.f30870b.name());
    }

    public /* synthetic */ w0(m4.G g8, P0 p02, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? m4.G.Companion.r() : g8, (i8 & 2) != 0 ? P0.f30484g : p02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(m4.G apiPath, P0 labelTranslationId) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        AbstractC3159y.i(labelTranslationId, "labelTranslationId");
        this.f30869a = apiPath;
        this.f30870b = labelTranslationId;
        this.f30871c = new L0(i(), labelTranslationId.c(), EnumC2639z.f30888d, EnumC2624n0.f30764b, false, 16, (AbstractC3151p) null);
    }
}
