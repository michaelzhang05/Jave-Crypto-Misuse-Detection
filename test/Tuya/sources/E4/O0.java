package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class O0 extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30470a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30471b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f30469c = m4.G.f35073d;
    public static final Parcelable.Creator<O0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30472a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30473b;

        static {
            a aVar = new a();
            f30472a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.StaticTextSpec", aVar, 2);
            c3944e0.k("api_path", true);
            c3944e0.k("stringResId", false);
            f30473b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30473b;
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
        public O0 c(w6.e decoder) {
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
            return new O0(i9, g8, i8, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, O0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            O0.j(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30472a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new O0((m4.G) parcel.readParcelable(O0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final O0[] newArray(int i8) {
            return new O0[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0(int i8, m4.G g8, int i9, x6.n0 n0Var) {
        super(null);
        if (2 != (i8 & 2)) {
            AbstractC3942d0.a(i8, 2, a.f30472a.a());
        }
        if ((i8 & 1) == 0) {
            this.f30470a = m4.G.Companion.a("static_text");
        } else {
            this.f30470a = g8;
        }
        this.f30471b = i9;
    }

    public static final /* synthetic */ void j(O0 o02, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(o02.f(), m4.G.Companion.a("static_text"))) {
            dVar.A(fVar, 0, G.a.f35099a, o02.f());
        }
        dVar.v(fVar, 1, o02.f30471b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        if (AbstractC3159y.d(this.f30470a, o02.f30470a) && this.f30471b == o02.f30471b) {
            return true;
        }
        return false;
    }

    public m4.G f() {
        return this.f30470a;
    }

    public int hashCode() {
        return (this.f30470a.hashCode() * 31) + this.f30471b;
    }

    public final m4.D i() {
        return new M0(f(), this.f30471b, null, 4, null);
    }

    public String toString() {
        return "StaticTextSpec(apiPath=" + this.f30470a + ", stringResId=" + this.f30471b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30470a, i8);
        out.writeInt(this.f30471b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(m4.G apiPath, int i8) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        this.f30470a = apiPath;
        this.f30471b = i8;
    }
}
