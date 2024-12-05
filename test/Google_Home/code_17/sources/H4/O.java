package h4;

import A6.C;
import A6.C0985e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.C3772t;
import p4.C3773u;
import p4.C3777y;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class O extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32386a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f32387b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32384c = 8;
    public static final Parcelable.Creator<O> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final w6.b[] f32385d = {null, new A6.M(A6.r0.f595a)};

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32388a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32389b;

        static {
            a aVar = new a();
            f32388a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.CountrySpec", aVar, 2);
            c0985e0.k("api_path", true);
            c0985e0.k("allowed_country_codes", true);
            f32389b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32389b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{G.a.f37125a, O.f32385d[1]};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public O b(z6.e decoder) {
            Set set;
            p4.G g8;
            int i8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = O.f32385d;
            A6.n0 n0Var = null;
            if (d8.w()) {
                g8 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
                set = (Set) d8.x(a8, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                Set set2 = null;
                p4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g10 = d8.g(a8);
                    if (g10 != -1) {
                        if (g10 != 0) {
                            if (g10 == 1) {
                                set2 = (Set) d8.x(a8, 1, bVarArr[1], set2);
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
                set = set2;
                g8 = g9;
                i8 = i9;
            }
            d8.b(a8);
            return new O(i8, g8, set, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, O value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            O.p(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32388a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            p4.G g8 = (p4.G) parcel.readParcelable(O.class.getClassLoader());
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

    public /* synthetic */ O(int i8, p4.G g8, Set set, A6.n0 n0Var) {
        super(null);
        this.f32386a = (i8 & 1) == 0 ? p4.G.Companion.l() : g8;
        if ((i8 & 2) == 0) {
            this.f32387b = y2.d.f40915a.h();
        } else {
            this.f32387b = set;
        }
    }

    public static final /* synthetic */ void p(O o8, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f32385d;
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(o8.i(), p4.G.Companion.l())) {
            dVar.C(fVar, 0, G.a.f37125a, o8.i());
        }
        if (dVar.p(fVar, 1) || !AbstractC3255y.d(o8.f32387b, y2.d.f40915a.h())) {
            dVar.C(fVar, 1, bVarArr[1], o8.f32387b);
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
        if (AbstractC3255y.d(this.f32386a, o8.f32386a) && AbstractC3255y.d(this.f32387b, o8.f32387b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32386a.hashCode() * 31) + this.f32387b.hashCode();
    }

    public p4.G i() {
        return this.f32386a;
    }

    public final p4.h0 l(Map initialValues) {
        AbstractC3255y.i(initialValues, "initialValues");
        return AbstractC2928f0.g(this, new C3773u(i(), new C3777y(new C3772t(this.f32387b, null, false, false, null, null, 62, null), (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "CountrySpec(apiPath=" + this.f32386a + ", allowedCountryCodes=" + this.f32387b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32386a, i8);
        Set set = this.f32387b;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(p4.G apiPath, Set allowedCountryCodes) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        AbstractC3255y.i(allowedCountryCodes, "allowedCountryCodes");
        this.f32386a = apiPath;
        this.f32387b = allowedCountryCodes;
    }
}
