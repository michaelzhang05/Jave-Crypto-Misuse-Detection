package e4;

import M5.AbstractC1246t;
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
import m4.AbstractC3419i;
import m4.C3410b;
import m4.C3429t;
import m4.C3430u;
import m4.C3434y;
import m4.G;
import x6.C;
import x6.C3944e0;
import x6.C3948h;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2597a extends AbstractC2608f0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30634a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f30635b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f30636c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30637d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3419i f30638e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30639f;
    public static final b Companion = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f30632g = 8;
    public static final Parcelable.Creator<C2597a> CREATOR = new c();

    /* renamed from: h, reason: collision with root package name */
    private static final t6.b[] f30633h = {null, new x6.M(x6.r0.f39600a), new x6.M(U.Companion.serializer()), null};

    /* renamed from: e4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0734a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0734a f30640a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30641b;

        static {
            C0734a c0734a = new C0734a();
            f30640a = c0734a;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.AddressSpec", c0734a, 4);
            c3944e0.k("api_path", true);
            c3944e0.k("allowed_country_codes", true);
            c3944e0.k("display_fields", true);
            c3944e0.k("show_label", true);
            f30641b = c3944e0;
        }

        private C0734a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30641b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b[] bVarArr = C2597a.f30633h;
            return new t6.b[]{G.a.f35099a, bVarArr[1], bVarArr[2], C3948h.f39572a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2597a c(w6.e decoder) {
            boolean z8;
            int i8;
            m4.G g8;
            Set set;
            Set set2;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = C2597a.f30633h;
            if (d8.z()) {
                m4.G g9 = (m4.G) d8.r(a8, 0, G.a.f35099a, null);
                Set set3 = (Set) d8.r(a8, 1, bVarArr[1], null);
                set2 = (Set) d8.r(a8, 2, bVarArr[2], null);
                g8 = g9;
                z8 = d8.j(a8, 3);
                set = set3;
                i8 = 15;
            } else {
                m4.G g10 = null;
                Set set4 = null;
                Set set5 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 != 2) {
                                    if (p8 == 3) {
                                        z9 = d8.j(a8, 3);
                                        i9 |= 8;
                                    } else {
                                        throw new t6.l(p8);
                                    }
                                } else {
                                    set5 = (Set) d8.r(a8, 2, bVarArr[2], set5);
                                    i9 |= 4;
                                }
                            } else {
                                set4 = (Set) d8.r(a8, 1, bVarArr[1], set4);
                                i9 |= 2;
                            }
                        } else {
                            g10 = (m4.G) d8.r(a8, 0, G.a.f35099a, g10);
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
            d8.a(a8);
            return new C2597a(i8, g8, set, set2, z8, (x6.n0) null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C2597a value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C2597a.o(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: e4.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return C0734a.f30640a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2597a createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            AbstractC3159y.i(parcel, "parcel");
            m4.G g8 = (m4.G) parcel.readParcelable(C2597a.class.getClassLoader());
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
            AbstractC3419i abstractC3419i = (AbstractC3419i) parcel.readParcelable(C2597a.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new C2597a(g8, linkedHashSet, linkedHashSet2, z8, abstractC3419i, z9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2597a[] newArray(int i8) {
            return new C2597a[i8];
        }
    }

    public /* synthetic */ C2597a(int i8, m4.G g8, Set set, Set set2, boolean z8, x6.n0 n0Var) {
        super(null);
        this.f30634a = (i8 & 1) == 0 ? m4.G.Companion.a("billing_details[address]") : g8;
        if ((i8 & 2) == 0) {
            this.f30635b = v2.d.f38784a.h();
        } else {
            this.f30635b = set;
        }
        if ((i8 & 4) == 0) {
            this.f30636c = M5.a0.f();
        } else {
            this.f30636c = set2;
        }
        if ((i8 & 8) == 0) {
            this.f30637d = true;
        } else {
            this.f30637d = z8;
        }
        this.f30638e = new AbstractC3419i.a(null, 1, null);
        this.f30639f = false;
    }

    public static /* synthetic */ C2597a j(C2597a c2597a, m4.G g8, Set set, Set set2, boolean z8, AbstractC3419i abstractC3419i, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            g8 = c2597a.f30634a;
        }
        if ((i8 & 2) != 0) {
            set = c2597a.f30635b;
        }
        Set set3 = set;
        if ((i8 & 4) != 0) {
            set2 = c2597a.f30636c;
        }
        Set set4 = set2;
        if ((i8 & 8) != 0) {
            z8 = c2597a.f30637d;
        }
        boolean z10 = z8;
        if ((i8 & 16) != 0) {
            abstractC3419i = c2597a.f30638e;
        }
        AbstractC3419i abstractC3419i2 = abstractC3419i;
        if ((i8 & 32) != 0) {
            z9 = c2597a.f30639f;
        }
        return c2597a.i(g8, set3, set4, z10, abstractC3419i2, z9);
    }

    public static final /* synthetic */ void o(C2597a c2597a, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f30633h;
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(c2597a.k(), m4.G.Companion.a("billing_details[address]"))) {
            dVar.A(fVar, 0, G.a.f35099a, c2597a.k());
        }
        if (dVar.i(fVar, 1) || !AbstractC3159y.d(c2597a.f30635b, v2.d.f38784a.h())) {
            dVar.A(fVar, 1, bVarArr[1], c2597a.f30635b);
        }
        if (dVar.i(fVar, 2) || !AbstractC3159y.d(c2597a.f30636c, M5.a0.f())) {
            dVar.A(fVar, 2, bVarArr[2], c2597a.f30636c);
        }
        if (dVar.i(fVar, 3) || !c2597a.f30637d) {
            dVar.o(fVar, 3, c2597a.f30637d);
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
        if (!(obj instanceof C2597a)) {
            return false;
        }
        C2597a c2597a = (C2597a) obj;
        if (AbstractC3159y.d(this.f30634a, c2597a.f30634a) && AbstractC3159y.d(this.f30635b, c2597a.f30635b) && AbstractC3159y.d(this.f30636c, c2597a.f30636c) && this.f30637d == c2597a.f30637d && AbstractC3159y.d(this.f30638e, c2597a.f30638e) && this.f30639f == c2597a.f30639f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f30634a.hashCode() * 31) + this.f30635b.hashCode()) * 31) + this.f30636c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f30637d)) * 31) + this.f30638e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f30639f);
    }

    public final C2597a i(m4.G apiPath, Set allowedCountryCodes, Set displayFields, boolean z8, AbstractC3419i type, boolean z9) {
        AbstractC3159y.i(apiPath, "apiPath");
        AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
        AbstractC3159y.i(displayFields, "displayFields");
        AbstractC3159y.i(type, "type");
        return new C2597a(apiPath, allowedCountryCodes, displayFields, z8, type, z9);
    }

    public m4.G k() {
        return this.f30634a;
    }

    public final m4.h0 n(Map initialValues, Map map) {
        Integer num;
        m4.e0 e0Var;
        Boolean L02;
        AbstractC3159y.i(initialValues, "initialValues");
        if (this.f30637d) {
            num = Integer.valueOf(b4.n.f14732j);
        } else {
            num = null;
        }
        if (this.f30636c.size() == 1 && AbstractC1246t.l0(this.f30636c) == U.f30604b) {
            m4.h0 c8 = c(new C3430u(m4.G.Companion.a("billing_details[address][country]"), new C3434y(new C3429t(this.f30635b, null, false, false, null, null, 62, null), (String) initialValues.get(k()))), num);
            if (this.f30639f) {
                return null;
            }
            return c8;
        }
        if (map != null) {
            G.b bVar = m4.G.Companion;
            String str = (String) map.get(bVar.w());
            if (str != null && (L02 = g6.n.L0(str)) != null) {
                e0Var = new m4.e0(bVar.w(), new m4.d0(L02.booleanValue()));
                return b(AbstractC1246t.r(new C3410b(k(), initialValues, this.f30638e, this.f30635b, null, e0Var, map, null, this.f30639f, 144, null), e0Var), num);
            }
        }
        e0Var = null;
        return b(AbstractC1246t.r(new C3410b(k(), initialValues, this.f30638e, this.f30635b, null, e0Var, map, null, this.f30639f, 144, null), e0Var), num);
    }

    public String toString() {
        return "AddressSpec(apiPath=" + this.f30634a + ", allowedCountryCodes=" + this.f30635b + ", displayFields=" + this.f30636c + ", showLabel=" + this.f30637d + ", type=" + this.f30638e + ", hideCountry=" + this.f30639f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30634a, i8);
        Set set = this.f30635b;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        Set set2 = this.f30636c;
        out.writeInt(set2.size());
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            out.writeString(((U) it2.next()).name());
        }
        out.writeInt(this.f30637d ? 1 : 0);
        out.writeParcelable(this.f30638e, i8);
        out.writeInt(this.f30639f ? 1 : 0);
    }

    public /* synthetic */ C2597a(m4.G g8, Set set, Set set2, boolean z8, AbstractC3419i abstractC3419i, boolean z9, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? m4.G.Companion.a("billing_details[address]") : g8, (i8 & 2) != 0 ? v2.d.f38784a.h() : set, (i8 & 4) != 0 ? M5.a0.f() : set2, (i8 & 8) != 0 ? true : z8, (i8 & 16) != 0 ? new AbstractC3419i.a(null, 1, null) : abstractC3419i, (i8 & 32) != 0 ? false : z9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597a(m4.G apiPath, Set allowedCountryCodes, Set displayFields, boolean z8, AbstractC3419i type, boolean z9) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
        AbstractC3159y.i(displayFields, "displayFields");
        AbstractC3159y.i(type, "type");
        this.f30634a = apiPath;
        this.f30635b = allowedCountryCodes;
        this.f30636c = displayFields;
        this.f30637d = z8;
        this.f30638e = type;
        this.f30639f = z9;
    }
}
