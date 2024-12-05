package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.C3429t;
import m4.C3430u;
import m4.C3434y;
import m4.G;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class O extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30465a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f30466b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f30463c = 8;
    public static final Parcelable.Creator<O> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final t6.b[] f30464d = {null, new x6.M(x6.r0.f39600a)};

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30467a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30468b;

        static {
            a aVar = new a();
            f30467a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.CountrySpec", aVar, 2);
            c3944e0.k("api_path", true);
            c3944e0.k("allowed_country_codes", true);
            f30468b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30468b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{G.a.f35099a, O.f30464d[1]};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public O c(w6.e decoder) {
            Set set;
            m4.G g8;
            int i8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = O.f30464d;
            x6.n0 n0Var = null;
            if (d8.z()) {
                g8 = (m4.G) d8.r(a8, 0, G.a.f35099a, null);
                set = (Set) d8.r(a8, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                Set set2 = null;
                m4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                set2 = (Set) d8.r(a8, 1, bVarArr[1], set2);
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
                set = set2;
                g8 = g9;
                i8 = i9;
            }
            d8.a(a8);
            return new O(i8, g8, set, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, O value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            O.k(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30467a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            m4.G g8 = (m4.G) parcel.readParcelable(O.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            return new O(g8, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final O[] newArray(int i8) {
            return new O[i8];
        }
    }

    public /* synthetic */ O(int i8, m4.G g8, Set set, x6.n0 n0Var) {
        super(null);
        this.f30465a = (i8 & 1) == 0 ? m4.G.Companion.l() : g8;
        if ((i8 & 2) == 0) {
            this.f30466b = v2.d.f38784a.h();
        } else {
            this.f30466b = set;
        }
    }

    public static final /* synthetic */ void k(O o8, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f30464d;
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(o8.i(), m4.G.Companion.l())) {
            dVar.A(fVar, 0, G.a.f35099a, o8.i());
        }
        if (dVar.i(fVar, 1) || !AbstractC3159y.d(o8.f30466b, v2.d.f38784a.h())) {
            dVar.A(fVar, 1, bVarArr[1], o8.f30466b);
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
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        if (AbstractC3159y.d(this.f30465a, o8.f30465a) && AbstractC3159y.d(this.f30466b, o8.f30466b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30465a.hashCode() * 31) + this.f30466b.hashCode();
    }

    public m4.G i() {
        return this.f30465a;
    }

    public final m4.h0 j(Map initialValues) {
        AbstractC3159y.i(initialValues, "initialValues");
        return AbstractC2608f0.e(this, new C3430u(i(), new C3434y(new C3429t(this.f30466b, null, false, false, null, null, 62, null), (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "CountrySpec(apiPath=" + this.f30465a + ", allowedCountryCodes=" + this.f30466b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30465a, i8);
        Set set = this.f30466b;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(m4.G apiPath, Set allowedCountryCodes) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
        this.f30465a = apiPath;
        this.f30466b = allowedCountryCodes;
    }
}
