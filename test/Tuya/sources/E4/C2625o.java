package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.C3423m;
import m4.C3424n;
import m4.G;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: e4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2625o extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30776a;
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f30775b = m4.G.f35073d;
    public static final Parcelable.Creator<C2625o> CREATOR = new c();

    /* renamed from: e4.o$a */
    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30777a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30778b;

        static {
            a aVar = new a();
            f30777a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.BacsDebitConfirmSpec", aVar, 1);
            c3944e0.k("apiPath", true);
            f30778b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30778b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{G.a.f35099a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2625o c(w6.e decoder) {
            m4.G g8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            int i8 = 1;
            x6.n0 n0Var = null;
            if (d8.z()) {
                g8 = (m4.G) d8.r(a8, 0, G.a.f35099a, null);
            } else {
                g8 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 == 0) {
                            g8 = (m4.G) d8.r(a8, 0, G.a.f35099a, g8);
                            i9 = 1;
                        } else {
                            throw new t6.l(p8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
            }
            d8.a(a8);
            return new C2625o(i8, g8, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C2625o value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C2625o.j(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: e4.o$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30777a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e4.o$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2625o createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            parcel.readInt();
            return new C2625o();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2625o[] newArray(int i8) {
            return new C2625o[i8];
        }
    }

    public /* synthetic */ C2625o(int i8, m4.G g8, x6.n0 n0Var) {
        super(null);
        if ((i8 & 1) == 0) {
            this.f30776a = m4.G.Companion.c();
        } else {
            this.f30776a = g8;
        }
    }

    public static final /* synthetic */ void j(C2625o c2625o, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(c2625o.f(), m4.G.Companion.c())) {
            dVar.A(fVar, 0, G.a.f35099a, c2625o.f());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public m4.G f() {
        return this.f30776a;
    }

    public final C3424n i(String merchantName, Map initialValues) {
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(initialValues, "initialValues");
        return new C3424n(f(), new C3423m(new C3423m.b(b4.n.f14726g, merchantName), "BACS_MANDATE_CHECKBOX", Boolean.parseBoolean((String) initialValues.get(f()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(1);
    }

    public C2625o() {
        super(null);
        this.f30776a = m4.G.Companion.c();
    }
}
