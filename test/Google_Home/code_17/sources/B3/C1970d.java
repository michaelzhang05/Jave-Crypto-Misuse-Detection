package b3;

import B3.f;
import O5.p;
import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import a3.C1625g;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1973g;
import b3.InterfaceC1974h;
import c3.C2017D;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import e4.C2801b;
import f4.InterfaceC2835a;
import h4.C2920b0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r3.C3917a;
import u3.C4059a;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1970d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f15318a;

    /* renamed from: b, reason: collision with root package name */
    private final u.d f15319b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15320c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15321d;

    /* renamed from: e, reason: collision with root package name */
    private final List f15322e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2835a f15323f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15324g;

    /* renamed from: h, reason: collision with root package name */
    private final u.c f15325h;

    /* renamed from: i, reason: collision with root package name */
    private final C4059a f15326i;

    /* renamed from: j, reason: collision with root package name */
    private final List f15327j;

    /* renamed from: k, reason: collision with root package name */
    private final List f15328k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f15329l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15330m;

    /* renamed from: n, reason: collision with root package name */
    private final d3.b f15331n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1973g f15332o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f15333p;

    /* renamed from: q, reason: collision with root package name */
    public static final a f15316q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f15317r = 8;
    public static final Parcelable.Creator<C1970d> CREATOR = new b();

    /* renamed from: b3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C1970d a(j elementsSession, E2.a configuration, List sharedDataSpecs, boolean z8, r3.d isFinancialConnectionsAvailable) {
            AbstractC3255y.i(elementsSession, "elementsSession");
            AbstractC3255y.i(configuration, "configuration");
            AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            StripeIntent v8 = elementsSession.v();
            u.d g8 = configuration.g();
            List s8 = configuration.s();
            InterfaceC2835a a8 = InterfaceC2835a.f31955l0.a(elementsSession.w(), configuration.u());
            String p8 = configuration.p();
            u.c h8 = configuration.h();
            boolean invoke = isFinancialConnectionsAvailable.invoke();
            return new C1970d(v8, g8, true, false, s8, a8, p8, h8, null, sharedDataSpecs, AbstractC1378t.m(), true, z8, null, InterfaceC1973g.c.f15342a, invoke);
        }

        public final C1970d b(j elementsSession, u.g configuration, List sharedDataSpecs, List externalPaymentMethodSpecs, boolean z8, d3.b bVar) {
            boolean z9;
            AbstractC3255y.i(elementsSession, "elementsSession");
            AbstractC3255y.i(configuration, "configuration");
            AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3255y.i(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
            StripeIntent v8 = elementsSession.v();
            u.d i8 = configuration.i();
            boolean a8 = configuration.a();
            boolean b8 = configuration.b();
            List x8 = configuration.x();
            InterfaceC2835a a9 = InterfaceC2835a.f31955l0.a(elementsSession.w(), configuration.y());
            String v9 = configuration.v();
            u.c p8 = configuration.p();
            C4059a q8 = configuration.q();
            if (configuration.l() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new C1970d(v8, i8, a8, b8, x8, a9, v9, p8, q8, sharedDataSpecs, externalPaymentMethodSpecs, z9, z8, bVar, AbstractC1971e.a(elementsSession), false, 32768, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: b3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1970d createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            u.c createFromParcel;
            C4059a createFromParcel2;
            boolean z10;
            boolean z11;
            d3.b createFromParcel3;
            boolean z12;
            AbstractC3255y.i(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(C1970d.class.getClassLoader());
            u.d createFromParcel4 = u.d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            InterfaceC2835a interfaceC2835a = (InterfaceC2835a) parcel.readParcelable(C1970d.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = u.c.CREATOR.createFromParcel(parcel);
            }
            u.c cVar = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = C4059a.CREATOR.createFromParcel(parcel);
            }
            C4059a c4059a = createFromParcel2;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(C1970d.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                arrayList2.add(parcel.readParcelable(C1970d.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel3 = null;
            } else {
                createFromParcel3 = d3.b.CREATOR.createFromParcel(parcel);
            }
            d3.b bVar = createFromParcel3;
            InterfaceC1973g interfaceC1973g = (InterfaceC1973g) parcel.readParcelable(C1970d.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            return new C1970d(stripeIntent, createFromParcel4, z8, z9, createStringArrayList, interfaceC2835a, readString, cVar, c4059a, arrayList, arrayList2, z10, z11, bVar, interfaceC1973g, z12);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1970d[] newArray(int i8) {
            return new C1970d[i8];
        }
    }

    /* renamed from: b3.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f15334a;

        public c(Map map) {
            this.f15334a = map;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a((Integer) this.f15334a.get((String) obj), (Integer) this.f15334a.get((String) obj2));
        }
    }

    public C1970d(StripeIntent stripeIntent, u.d billingDetailsCollectionConfiguration, boolean z8, boolean z9, List paymentMethodOrder, InterfaceC2835a cbcEligibility, String merchantName, u.c cVar, C4059a c4059a, List sharedDataSpecs, List externalPaymentMethodSpecs, boolean z10, boolean z11, d3.b bVar, InterfaceC1973g paymentMethodSaveConsentBehavior, boolean z12) {
        AbstractC3255y.i(stripeIntent, "stripeIntent");
        AbstractC3255y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC3255y.i(paymentMethodOrder, "paymentMethodOrder");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
        AbstractC3255y.i(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
        AbstractC3255y.i(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        this.f15318a = stripeIntent;
        this.f15319b = billingDetailsCollectionConfiguration;
        this.f15320c = z8;
        this.f15321d = z9;
        this.f15322e = paymentMethodOrder;
        this.f15323f = cbcEligibility;
        this.f15324g = merchantName;
        this.f15325h = cVar;
        this.f15326i = c4059a;
        this.f15327j = sharedDataSpecs;
        this.f15328k = externalPaymentMethodSpecs;
        this.f15329l = z10;
        this.f15330m = z11;
        this.f15331n = bVar;
        this.f15332o = paymentMethodSaveConsentBehavior;
        this.f15333p = z12;
    }

    private final InterfaceC1974h.d X(String str) {
        Object obj;
        Iterator it = this.f15328k.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((C2920b0) obj).getType(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C2920b0 c2920b0 = (C2920b0) obj;
        if (c2920b0 == null) {
            return null;
        }
        return new C2017D(c2920b0);
    }

    private final o.b b(f.a aVar) {
        InterfaceC1973g interfaceC1973g = this.f15332o;
        if (interfaceC1973g instanceof InterfaceC1973g.c) {
            return o.b.f25489b;
        }
        if (interfaceC1973g instanceof InterfaceC1973g.a) {
            return o.b.f25489b;
        }
        if (interfaceC1973g instanceof InterfaceC1973g.b) {
            if (aVar == f.a.f808b) {
                return o.b.f25491d;
            }
            return o.b.f25489b;
        }
        throw new p();
    }

    private final Map b0(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list2, 10));
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            arrayList.add(x.a((String) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        return Q.w(arrayList);
    }

    private final List c0() {
        List Z02 = AbstractC1378t.Z0(AbstractC1378t.G0(this.f15318a.e(), i()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.f15322e) {
            if (Z02.contains(str)) {
                arrayList.add(str);
                Z02.remove(str);
            }
        }
        arrayList.addAll(Z02);
        return arrayList;
    }

    private final List f0() {
        List e8 = this.f15318a.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = e8.iterator();
        while (it.hasNext()) {
            InterfaceC1968b interfaceC1968b = (InterfaceC1968b) C1972f.f15335a.b().get((String) it.next());
            if (interfaceC1968b != null) {
                arrayList.add(interfaceC1968b);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC1969c.a((InterfaceC1968b) obj, this)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            InterfaceC1968b interfaceC1968b2 = (InterfaceC1968b) obj2;
            if (!this.f15318a.c() || !this.f15318a.F().contains(interfaceC1968b2.getType().f25605a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            InterfaceC1968b interfaceC1968b3 = (InterfaceC1968b) obj3;
            if (interfaceC1968b3.b().d(interfaceC1968b3, this.f15327j)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    private final o.b g(f.a aVar) {
        InterfaceC1973g interfaceC1973g = this.f15332o;
        if (interfaceC1973g instanceof InterfaceC1973g.c) {
            return o.b.f25489b;
        }
        if (interfaceC1973g instanceof InterfaceC1973g.a) {
            o.b a8 = ((InterfaceC1973g.a) interfaceC1973g).a();
            if (a8 == null) {
                return o.b.f25490c;
            }
            return a8;
        }
        if (interfaceC1973g instanceof InterfaceC1973g.b) {
            if (aVar == f.a.f808b) {
                return o.b.f25491d;
            }
            return o.b.f25490c;
        }
        throw new p();
    }

    private final List i() {
        List list = this.f15328k;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2920b0) it.next()).getType());
        }
        return arrayList;
    }

    public final d3.b H() {
        return this.f15331n;
    }

    public final String J() {
        return this.f15324g;
    }

    public final InterfaceC1973g U() {
        return this.f15332o;
    }

    public final StripeIntent W() {
        return this.f15318a;
    }

    public final boolean Y() {
        StripeIntent stripeIntent = this.f15318a;
        if (stripeIntent instanceof n) {
            if (((n) stripeIntent).G() != null) {
                return true;
            }
            return false;
        }
        if (stripeIntent instanceof com.stripe.android.model.u) {
            return true;
        }
        throw new p();
    }

    public final boolean Z(String code) {
        AbstractC3255y.i(code, "code");
        return i().contains(code);
    }

    public final o.b a(f.a customerRequestedSave) {
        AbstractC3255y.i(customerRequestedSave, "customerRequestedSave");
        if (Y()) {
            return g(customerRequestedSave);
        }
        return b(customerRequestedSave);
    }

    public final boolean a0() {
        return this.f15330m;
    }

    public final boolean d0(String paymentMethodCode) {
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        InterfaceC1968b interfaceC1968b = (InterfaceC1968b) C1972f.f15335a.b().get(paymentMethodCode);
        if (interfaceC1968b != null) {
            return interfaceC1968b.c(this);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List e0() {
        List h02 = h0();
        ArrayList arrayList = new ArrayList();
        Iterator it = h02.iterator();
        while (it.hasNext()) {
            C1625g g02 = g0((String) it.next());
            if (g02 != null) {
                arrayList.add(g02);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1970d)) {
            return false;
        }
        C1970d c1970d = (C1970d) obj;
        if (AbstractC3255y.d(this.f15318a, c1970d.f15318a) && AbstractC3255y.d(this.f15319b, c1970d.f15319b) && this.f15320c == c1970d.f15320c && this.f15321d == c1970d.f15321d && AbstractC3255y.d(this.f15322e, c1970d.f15322e) && AbstractC3255y.d(this.f15323f, c1970d.f15323f) && AbstractC3255y.d(this.f15324g, c1970d.f15324g) && AbstractC3255y.d(this.f15325h, c1970d.f15325h) && AbstractC3255y.d(this.f15326i, c1970d.f15326i) && AbstractC3255y.d(this.f15327j, c1970d.f15327j) && AbstractC3255y.d(this.f15328k, c1970d.f15328k) && this.f15329l == c1970d.f15329l && this.f15330m == c1970d.f15330m && AbstractC3255y.d(this.f15331n, c1970d.f15331n) && AbstractC3255y.d(this.f15332o, c1970d.f15332o) && this.f15333p == c1970d.f15333p) {
            return true;
        }
        return false;
    }

    public final C1625g g0(String code) {
        Object obj;
        AbstractC3255y.i(code, "code");
        if (Z(code)) {
            InterfaceC1974h.d X7 = X(code);
            if (X7 == null) {
                return null;
            }
            return X7.j();
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((InterfaceC1968b) obj).getType().f25605a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC1968b interfaceC1968b = (InterfaceC1968b) obj;
        if (interfaceC1968b == null) {
            return null;
        }
        return interfaceC1968b.b().h(interfaceC1968b, this.f15327j);
    }

    public final C2801b h() {
        if (this.f15318a instanceof n) {
            Long g8 = ((n) this.f15318a).g();
            if (g8 != null) {
                long longValue = g8.longValue();
                String M8 = ((n) this.f15318a).M();
                if (M8 != null) {
                    return new C2801b(longValue, M8);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return null;
    }

    public final List h0() {
        List f02 = f0();
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(f02, 10));
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1968b) it.next()).getType().f25605a);
        }
        List G02 = AbstractC1378t.G0(arrayList, i());
        if (!this.f15322e.isEmpty()) {
            return AbstractC1378t.P0(G02, new c(b0(c0())));
        }
        return G02;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((((this.f15318a.hashCode() * 31) + this.f15319b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f15320c)) * 31) + androidx.compose.foundation.a.a(this.f15321d)) * 31) + this.f15322e.hashCode()) * 31) + this.f15323f.hashCode()) * 31) + this.f15324g.hashCode()) * 31;
        u.c cVar = this.f15325h;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        C4059a c4059a = this.f15326i;
        if (c4059a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c4059a.hashCode();
        }
        int hashCode4 = (((((((((i9 + hashCode2) * 31) + this.f15327j.hashCode()) * 31) + this.f15328k.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f15329l)) * 31) + androidx.compose.foundation.a.a(this.f15330m)) * 31;
        d3.b bVar = this.f15331n;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((((hashCode4 + i8) * 31) + this.f15332o.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f15333p);
    }

    public final List i0() {
        List f02 = f0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f02) {
            if (((InterfaceC1968b) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC1968b) it.next()).getType());
        }
        return arrayList2;
    }

    public final List l(String code, InterfaceC1974h.a.InterfaceC0359a uiDefinitionFactoryArgumentsFactory) {
        Object obj;
        AbstractC3255y.i(code, "code");
        AbstractC3255y.i(uiDefinitionFactoryArgumentsFactory, "uiDefinitionFactoryArgumentsFactory");
        if (Z(code)) {
            InterfaceC1974h.d X7 = X(code);
            if (X7 == null) {
                return null;
            }
            return X7.g(this, uiDefinitionFactoryArgumentsFactory.a(this, false));
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((InterfaceC1968b) obj).getType().f25605a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC1968b interfaceC1968b = (InterfaceC1968b) obj;
        if (interfaceC1968b == null) {
            return null;
        }
        return interfaceC1968b.b().a(interfaceC1968b, this, this.f15327j, uiDefinitionFactoryArgumentsFactory.a(this, interfaceC1968b.c(this)));
    }

    public final Z2.a p(String code, boolean z8) {
        Object obj;
        AbstractC3255y.i(code, "code");
        if (Z(code)) {
            InterfaceC1974h.d X7 = X(code);
            if (X7 == null) {
                return null;
            }
            return X7.b(z8);
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((InterfaceC1968b) obj).getType().f25605a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC1968b interfaceC1968b = (InterfaceC1968b) obj;
        if (interfaceC1968b == null) {
            return null;
        }
        return interfaceC1968b.b().e(interfaceC1968b, this, this.f15327j, z8);
    }

    public final C4059a q() {
        return this.f15326i;
    }

    public final boolean s() {
        return this.f15320c;
    }

    public String toString() {
        return "PaymentMethodMetadata(stripeIntent=" + this.f15318a + ", billingDetailsCollectionConfiguration=" + this.f15319b + ", allowsDelayedPaymentMethods=" + this.f15320c + ", allowsPaymentMethodsRequiringShippingAddress=" + this.f15321d + ", paymentMethodOrder=" + this.f15322e + ", cbcEligibility=" + this.f15323f + ", merchantName=" + this.f15324g + ", defaultBillingDetails=" + this.f15325h + ", shippingDetails=" + this.f15326i + ", sharedDataSpecs=" + this.f15327j + ", externalPaymentMethodSpecs=" + this.f15328k + ", hasCustomerConfiguration=" + this.f15329l + ", isGooglePayReady=" + this.f15330m + ", linkInlineConfiguration=" + this.f15331n + ", paymentMethodSaveConsentBehavior=" + this.f15332o + ", financialConnectionsAvailable=" + this.f15333p + ")";
    }

    public final boolean u() {
        return this.f15321d;
    }

    public final u.d v() {
        return this.f15319b;
    }

    public final InterfaceC2835a w() {
        return this.f15323f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f15318a, i8);
        this.f15319b.writeToParcel(out, i8);
        out.writeInt(this.f15320c ? 1 : 0);
        out.writeInt(this.f15321d ? 1 : 0);
        out.writeStringList(this.f15322e);
        out.writeParcelable(this.f15323f, i8);
        out.writeString(this.f15324g);
        u.c cVar = this.f15325h;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        C4059a c4059a = this.f15326i;
        if (c4059a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c4059a.writeToParcel(out, i8);
        }
        List list = this.f15327j;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        List list2 = this.f15328k;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeParcelable((Parcelable) it2.next(), i8);
        }
        out.writeInt(this.f15329l ? 1 : 0);
        out.writeInt(this.f15330m ? 1 : 0);
        d3.b bVar = this.f15331n;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
        out.writeParcelable(this.f15332o, i8);
        out.writeInt(this.f15333p ? 1 : 0);
    }

    public final u.c x() {
        return this.f15325h;
    }

    public final boolean y() {
        return this.f15333p;
    }

    public final boolean z() {
        return this.f15329l;
    }

    public /* synthetic */ C1970d(StripeIntent stripeIntent, u.d dVar, boolean z8, boolean z9, List list, InterfaceC2835a interfaceC2835a, String str, u.c cVar, C4059a c4059a, List list2, List list3, boolean z10, boolean z11, d3.b bVar, InterfaceC1973g interfaceC1973g, boolean z12, int i8, AbstractC3247p abstractC3247p) {
        this(stripeIntent, dVar, z8, z9, list, interfaceC2835a, str, cVar, c4059a, list2, list3, z10, z11, bVar, interfaceC1973g, (i8 & 32768) != 0 ? C3917a.f38584a.invoke() : z12);
    }
}
