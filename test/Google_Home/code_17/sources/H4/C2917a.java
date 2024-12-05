package h4;

import A6.C;
import A6.C0985e0;
import A6.C0989h;
import P5.AbstractC1378t;
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
import p4.AbstractC3762i;
import p4.C3753b;
import p4.C3772t;
import p4.C3773u;
import p4.C3777y;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2917a extends AbstractC2928f0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32555a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f32556b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f32557c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32558d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3762i f32559e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f32560f;
    public static final b Companion = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f32553g = 8;
    public static final Parcelable.Creator<C2917a> CREATOR = new c();

    /* renamed from: h, reason: collision with root package name */
    private static final w6.b[] f32554h = {null, new A6.M(A6.r0.f595a), new A6.M(U.Companion.serializer()), null};

    /* renamed from: h4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0760a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0760a f32561a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32562b;

        static {
            C0760a c0760a = new C0760a();
            f32561a = c0760a;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.AddressSpec", c0760a, 4);
            c0985e0.k("api_path", true);
            c0985e0.k("allowed_country_codes", true);
            c0985e0.k("display_fields", true);
            c0985e0.k("show_label", true);
            f32562b = c0985e0;
        }

        private C0760a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32562b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b[] bVarArr = C2917a.f32554h;
            return new w6.b[]{G.a.f37125a, bVarArr[1], bVarArr[2], C0989h.f567a};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2917a b(z6.e decoder) {
            boolean z8;
            int i8;
            p4.G g8;
            Set set;
            Set set2;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = C2917a.f32554h;
            if (d8.w()) {
                p4.G g9 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
                Set set3 = (Set) d8.x(a8, 1, bVarArr[1], null);
                set2 = (Set) d8.x(a8, 2, bVarArr[2], null);
                g8 = g9;
                z8 = d8.f(a8, 3);
                set = set3;
                i8 = 15;
            } else {
                p4.G g10 = null;
                Set set4 = null;
                Set set5 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int g11 = d8.g(a8);
                    if (g11 != -1) {
                        if (g11 != 0) {
                            if (g11 != 1) {
                                if (g11 != 2) {
                                    if (g11 == 3) {
                                        z9 = d8.f(a8, 3);
                                        i9 |= 8;
                                    } else {
                                        throw new w6.l(g11);
                                    }
                                } else {
                                    set5 = (Set) d8.x(a8, 2, bVarArr[2], set5);
                                    i9 |= 4;
                                }
                            } else {
                                set4 = (Set) d8.x(a8, 1, bVarArr[1], set4);
                                i9 |= 2;
                            }
                        } else {
                            g10 = (p4.G) d8.x(a8, 0, G.a.f37125a, g10);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                g8 = g10;
                set = set4;
                set2 = set5;
            }
            d8.b(a8);
            return new C2917a(i8, g8, set, set2, z8, (A6.n0) null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C2917a value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C2917a.u(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: h4.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return C0760a.f32561a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: h4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2917a createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            AbstractC3255y.i(parcel, "parcel");
            p4.G g8 = (p4.G) parcel.readParcelable(C2917a.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(U.valueOf(parcel.readString()));
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC3762i abstractC3762i = (AbstractC3762i) parcel.readParcelable(C2917a.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new C2917a(g8, linkedHashSet, linkedHashSet2, z8, abstractC3762i, z9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2917a[] newArray(int i8) {
            return new C2917a[i8];
        }
    }

    public /* synthetic */ C2917a(int i8, p4.G g8, Set set, Set set2, boolean z8, A6.n0 n0Var) {
        super(null);
        this.f32555a = (i8 & 1) == 0 ? p4.G.Companion.a("billing_details[address]") : g8;
        if ((i8 & 2) == 0) {
            this.f32556b = y2.d.f40915a.h();
        } else {
            this.f32556b = set;
        }
        if ((i8 & 4) == 0) {
            this.f32557c = P5.a0.f();
        } else {
            this.f32557c = set2;
        }
        if ((i8 & 8) == 0) {
            this.f32558d = true;
        } else {
            this.f32558d = z8;
        }
        this.f32559e = new AbstractC3762i.a(null, 1, null);
        this.f32560f = false;
    }

    public static /* synthetic */ C2917a l(C2917a c2917a, p4.G g8, Set set, Set set2, boolean z8, AbstractC3762i abstractC3762i, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            g8 = c2917a.f32555a;
        }
        if ((i8 & 2) != 0) {
            set = c2917a.f32556b;
        }
        Set set3 = set;
        if ((i8 & 4) != 0) {
            set2 = c2917a.f32557c;
        }
        Set set4 = set2;
        if ((i8 & 8) != 0) {
            z8 = c2917a.f32558d;
        }
        boolean z10 = z8;
        if ((i8 & 16) != 0) {
            abstractC3762i = c2917a.f32559e;
        }
        AbstractC3762i abstractC3762i2 = abstractC3762i;
        if ((i8 & 32) != 0) {
            z9 = c2917a.f32560f;
        }
        return c2917a.i(g8, set3, set4, z10, abstractC3762i2, z9);
    }

    public static final /* synthetic */ void u(C2917a c2917a, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f32554h;
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(c2917a.p(), p4.G.Companion.a("billing_details[address]"))) {
            dVar.C(fVar, 0, G.a.f37125a, c2917a.p());
        }
        if (dVar.p(fVar, 1) || !AbstractC3255y.d(c2917a.f32556b, y2.d.f40915a.h())) {
            dVar.C(fVar, 1, bVarArr[1], c2917a.f32556b);
        }
        if (dVar.p(fVar, 2) || !AbstractC3255y.d(c2917a.f32557c, P5.a0.f())) {
            dVar.C(fVar, 2, bVarArr[2], c2917a.f32557c);
        }
        if (dVar.p(fVar, 3) || !c2917a.f32558d) {
            dVar.s(fVar, 3, c2917a.f32558d);
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
        if (!(obj instanceof C2917a)) {
            return false;
        }
        C2917a c2917a = (C2917a) obj;
        if (AbstractC3255y.d(this.f32555a, c2917a.f32555a) && AbstractC3255y.d(this.f32556b, c2917a.f32556b) && AbstractC3255y.d(this.f32557c, c2917a.f32557c) && this.f32558d == c2917a.f32558d && AbstractC3255y.d(this.f32559e, c2917a.f32559e) && this.f32560f == c2917a.f32560f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f32555a.hashCode() * 31) + this.f32556b.hashCode()) * 31) + this.f32557c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f32558d)) * 31) + this.f32559e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f32560f);
    }

    public final C2917a i(p4.G apiPath, Set allowedCountryCodes, Set displayFields, boolean z8, AbstractC3762i type, boolean z9) {
        AbstractC3255y.i(apiPath, "apiPath");
        AbstractC3255y.i(allowedCountryCodes, "allowedCountryCodes");
        AbstractC3255y.i(displayFields, "displayFields");
        AbstractC3255y.i(type, "type");
        return new C2917a(apiPath, allowedCountryCodes, displayFields, z8, type, z9);
    }

    public p4.G p() {
        return this.f32555a;
    }

    public final p4.h0 s(Map initialValues, Map map) {
        Integer num;
        p4.e0 e0Var;
        Boolean L02;
        AbstractC3255y.i(initialValues, "initialValues");
        if (this.f32558d) {
            num = Integer.valueOf(e4.n.f31738j);
        } else {
            num = null;
        }
        if (this.f32557c.size() == 1 && AbstractC1378t.l0(this.f32557c) == U.f32525b) {
            p4.h0 b8 = b(new C3773u(p4.G.Companion.a("billing_details[address][country]"), new C3777y(new C3772t(this.f32556b, null, false, false, null, null, 62, null), (String) initialValues.get(p()))), num);
            if (this.f32560f) {
                return null;
            }
            return b8;
        }
        if (map != null) {
            G.b bVar = p4.G.Companion;
            String str = (String) map.get(bVar.w());
            if (str != null && (L02 = j6.n.L0(str)) != null) {
                e0Var = new p4.e0(bVar.w(), new p4.d0(L02.booleanValue()));
                return a(AbstractC1378t.r(new C3753b(p(), initialValues, this.f32559e, this.f32556b, null, e0Var, map, null, this.f32560f, 144, null), e0Var), num);
            }
        }
        e0Var = null;
        return a(AbstractC1378t.r(new C3753b(p(), initialValues, this.f32559e, this.f32556b, null, e0Var, map, null, this.f32560f, 144, null), e0Var), num);
    }

    public String toString() {
        return "AddressSpec(apiPath=" + this.f32555a + ", allowedCountryCodes=" + this.f32556b + ", displayFields=" + this.f32557c + ", showLabel=" + this.f32558d + ", type=" + this.f32559e + ", hideCountry=" + this.f32560f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32555a, i8);
        Set set = this.f32556b;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        Set set2 = this.f32557c;
        out.writeInt(set2.size());
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            out.writeString(((U) it2.next()).name());
        }
        out.writeInt(this.f32558d ? 1 : 0);
        out.writeParcelable(this.f32559e, i8);
        out.writeInt(this.f32560f ? 1 : 0);
    }

    public /* synthetic */ C2917a(p4.G g8, Set set, Set set2, boolean z8, AbstractC3762i abstractC3762i, boolean z9, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? p4.G.Companion.a("billing_details[address]") : g8, (i8 & 2) != 0 ? y2.d.f40915a.h() : set, (i8 & 4) != 0 ? P5.a0.f() : set2, (i8 & 8) != 0 ? true : z8, (i8 & 16) != 0 ? new AbstractC3762i.a(null, 1, null) : abstractC3762i, (i8 & 32) != 0 ? false : z9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2917a(p4.G apiPath, Set allowedCountryCodes, Set displayFields, boolean z8, AbstractC3762i type, boolean z9) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        AbstractC3255y.i(allowedCountryCodes, "allowedCountryCodes");
        AbstractC3255y.i(displayFields, "displayFields");
        AbstractC3255y.i(type, "type");
        this.f32555a = apiPath;
        this.f32556b = allowedCountryCodes;
        this.f32557c = displayFields;
        this.f32558d = z8;
        this.f32559e = type;
        this.f32560f = z9;
    }
}
