package b3;

import O5.p;
import a3.C1621c;
import a3.C1625g;
import a3.C1626h;
import com.stripe.android.model.q;
import com.stripe.android.paymentsheet.u;
import f4.InterfaceC2835a;
import h4.H0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o2.InterfaceC3515b;
import u3.AbstractC4060b;
import u3.C4059a;

/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1974h {

    /* renamed from: b3.h$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static boolean a(InterfaceC1974h interfaceC1974h, InterfaceC1968b definition, List sharedDataSpecs) {
            Object obj;
            AbstractC3255y.i(definition, "definition");
            AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
            if (interfaceC1974h instanceof d) {
                return true;
            }
            if (interfaceC1974h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((H0) obj).getType(), definition.getType().f25605a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    return true;
                }
                return false;
            }
            throw new p();
        }

        public static List b(InterfaceC1974h interfaceC1974h, InterfaceC1968b definition, C1970d metadata, List sharedDataSpecs, a arguments) {
            Object obj;
            AbstractC3255y.i(definition, "definition");
            AbstractC3255y.i(metadata, "metadata");
            AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3255y.i(arguments, "arguments");
            if (interfaceC1974h instanceof d) {
                return ((d) interfaceC1974h).g(metadata, arguments);
            }
            if (interfaceC1974h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((H0) obj).getType(), definition.getType().f25605a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                H0 h02 = (H0) obj;
                if (h02 == null) {
                    return null;
                }
                return ((c) interfaceC1974h).f(metadata, h02, new C1626h(arguments));
            }
            throw new p();
        }

        public static Z2.a c(InterfaceC1974h interfaceC1974h, InterfaceC1968b definition, C1970d metadata, List sharedDataSpecs, boolean z8) {
            Object obj;
            AbstractC3255y.i(definition, "definition");
            AbstractC3255y.i(metadata, "metadata");
            AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
            if (interfaceC1974h instanceof d) {
                return ((d) interfaceC1974h).b(z8);
            }
            if (interfaceC1974h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((H0) obj).getType(), definition.getType().f25605a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                H0 h02 = (H0) obj;
                if (h02 == null) {
                    return null;
                }
                return ((c) interfaceC1974h).c(h02);
            }
            throw new p();
        }

        public static C1625g d(InterfaceC1974h interfaceC1974h, InterfaceC1968b definition, List sharedDataSpecs) {
            Object obj;
            AbstractC3255y.i(definition, "definition");
            AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
            if (interfaceC1974h instanceof d) {
                return ((d) interfaceC1974h).j();
            }
            if (interfaceC1974h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((H0) obj).getType(), definition.getType().f25605a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                H0 h02 = (H0) obj;
                if (h02 == null) {
                    return null;
                }
                return ((c) interfaceC1974h).i(h02);
            }
            throw new p();
        }
    }

    /* renamed from: b3.h$c */
    /* loaded from: classes4.dex */
    public interface c extends InterfaceC1974h {

        /* renamed from: b3.h$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            public static boolean a(c cVar, InterfaceC1968b definition, List sharedDataSpecs) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.a(cVar, definition, sharedDataSpecs);
            }

            public static List b(c cVar, C1970d metadata, H0 sharedDataSpec, C1626h transformSpecToElements) {
                AbstractC3255y.i(metadata, "metadata");
                AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
                AbstractC3255y.i(transformSpecToElements, "transformSpecToElements");
                return C1626h.b(transformSpecToElements, sharedDataSpec.b(), null, 2, null);
            }

            public static Z2.a c(c cVar, H0 sharedDataSpec) {
                AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
                return cVar.i(sharedDataSpec).c();
            }

            public static List d(c cVar, InterfaceC1968b definition, C1970d metadata, List sharedDataSpecs, a arguments) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(metadata, "metadata");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                AbstractC3255y.i(arguments, "arguments");
                return b.b(cVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static Z2.a e(c cVar, InterfaceC1968b definition, C1970d metadata, List sharedDataSpecs, boolean z8) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(metadata, "metadata");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.c(cVar, definition, metadata, sharedDataSpecs, z8);
            }

            public static C1625g f(c cVar, InterfaceC1968b definition, List sharedDataSpecs) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.d(cVar, definition, sharedDataSpecs);
            }
        }

        Z2.a c(H0 h02);

        List f(C1970d c1970d, H0 h02, C1626h c1626h);

        C1625g i(H0 h02);
    }

    /* renamed from: b3.h$d */
    /* loaded from: classes4.dex */
    public interface d extends InterfaceC1974h {

        /* renamed from: b3.h$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            public static boolean a(d dVar, InterfaceC1968b definition, List sharedDataSpecs) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.a(dVar, definition, sharedDataSpecs);
            }

            public static Z2.a b(d dVar, boolean z8) {
                return dVar.j().c();
            }

            public static List c(d dVar, InterfaceC1968b definition, C1970d metadata, List sharedDataSpecs, a arguments) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(metadata, "metadata");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                AbstractC3255y.i(arguments, "arguments");
                return b.b(dVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static Z2.a d(d dVar, InterfaceC1968b definition, C1970d metadata, List sharedDataSpecs, boolean z8) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(metadata, "metadata");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.c(dVar, definition, metadata, sharedDataSpecs, z8);
            }

            public static C1625g e(d dVar, InterfaceC1968b definition, List sharedDataSpecs) {
                AbstractC3255y.i(definition, "definition");
                AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.d(dVar, definition, sharedDataSpecs);
            }
        }

        Z2.a b(boolean z8);

        List g(C1970d c1970d, a aVar);

        C1625g j();
    }

    List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, a aVar);

    boolean d(InterfaceC1968b interfaceC1968b, List list);

    Z2.a e(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, boolean z8);

    C1625g h(InterfaceC1968b interfaceC1968b, List list);

    /* renamed from: b3.h$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3515b.a f15343a;

        /* renamed from: b, reason: collision with root package name */
        private final N2.e f15344b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f15345c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f15346d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f15347e;

        /* renamed from: f, reason: collision with root package name */
        private final String f15348f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC2835a f15349g;

        /* renamed from: h, reason: collision with root package name */
        private final u.d f15350h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f15351i;

        /* renamed from: j, reason: collision with root package name */
        private final Function1 f15352j;

        public a(InterfaceC3515b.a cardAccountRangeRepositoryFactory, N2.e eVar, Map initialValues, Map map, boolean z8, String merchantName, InterfaceC2835a cbcEligibility, u.d billingDetailsCollectionConfiguration, boolean z9, Function1 onLinkInlineSignupStateChanged) {
            AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
            AbstractC3255y.i(initialValues, "initialValues");
            AbstractC3255y.i(merchantName, "merchantName");
            AbstractC3255y.i(cbcEligibility, "cbcEligibility");
            AbstractC3255y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3255y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
            this.f15343a = cardAccountRangeRepositoryFactory;
            this.f15344b = eVar;
            this.f15345c = initialValues;
            this.f15346d = map;
            this.f15347e = z8;
            this.f15348f = merchantName;
            this.f15349g = cbcEligibility;
            this.f15350h = billingDetailsCollectionConfiguration;
            this.f15351i = z9;
            this.f15352j = onLinkInlineSignupStateChanged;
        }

        public final u.d a() {
            return this.f15350h;
        }

        public final InterfaceC3515b.a b() {
            return this.f15343a;
        }

        public final InterfaceC2835a c() {
            return this.f15349g;
        }

        public final Map d() {
            return this.f15345c;
        }

        public final N2.e e() {
            return this.f15344b;
        }

        public final String f() {
            return this.f15348f;
        }

        public final Function1 g() {
            return this.f15352j;
        }

        public final boolean h() {
            return this.f15351i;
        }

        public final boolean i() {
            return this.f15347e;
        }

        public final Map j() {
            return this.f15346d;
        }

        /* renamed from: b3.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public interface InterfaceC0359a {
            a a(C1970d c1970d, boolean z8);

            /* renamed from: b3.h$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0360a implements InterfaceC0359a {

                /* renamed from: a, reason: collision with root package name */
                private final InterfaceC3515b.a f15353a;

                /* renamed from: b, reason: collision with root package name */
                private final N2.e f15354b;

                /* renamed from: c, reason: collision with root package name */
                private final Function1 f15355c;

                /* renamed from: d, reason: collision with root package name */
                private final com.stripe.android.model.p f15356d;

                /* renamed from: e, reason: collision with root package name */
                private final q f15357e;

                public C0360a(InterfaceC3515b.a cardAccountRangeRepositoryFactory, N2.e eVar, Function1 onLinkInlineSignupStateChanged, com.stripe.android.model.p pVar, q qVar) {
                    AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
                    AbstractC3255y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
                    this.f15353a = cardAccountRangeRepositoryFactory;
                    this.f15354b = eVar;
                    this.f15355c = onLinkInlineSignupStateChanged;
                    this.f15356d = pVar;
                    this.f15357e = qVar;
                }

                @Override // b3.InterfaceC1974h.a.InterfaceC0359a
                public a a(C1970d metadata, boolean z8) {
                    Map map;
                    AbstractC3255y.i(metadata, "metadata");
                    InterfaceC3515b.a aVar = this.f15353a;
                    N2.e eVar = this.f15354b;
                    String J8 = metadata.J();
                    InterfaceC2835a w8 = metadata.w();
                    Map a8 = C1621c.f13843a.a(metadata.x(), this.f15356d, this.f15357e);
                    C4059a q8 = metadata.q();
                    if (q8 != null) {
                        map = AbstractC4060b.b(q8, metadata.x());
                    } else {
                        map = null;
                    }
                    return new a(aVar, eVar, a8, map, false, J8, w8, metadata.v(), z8, this.f15355c);
                }

                public /* synthetic */ C0360a(InterfaceC3515b.a aVar, N2.e eVar, Function1 function1, com.stripe.android.model.p pVar, q qVar, int i8, AbstractC3247p abstractC3247p) {
                    this(aVar, eVar, function1, (i8 & 8) != 0 ? null : pVar, (i8 & 16) != 0 ? null : qVar);
                }
            }
        }
    }
}
