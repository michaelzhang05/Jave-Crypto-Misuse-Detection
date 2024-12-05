package Y2;

import L5.p;
import c4.InterfaceC1925a;
import com.stripe.android.model.q;
import com.stripe.android.paymentsheet.u;
import e4.H0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l2.InterfaceC3167b;
import r3.AbstractC3687b;
import r3.C3686a;

/* loaded from: classes4.dex */
public interface h {

    /* loaded from: classes4.dex */
    public static final class b {
        public static boolean a(h hVar, Y2.b definition, List sharedDataSpecs) {
            Object obj;
            AbstractC3159y.i(definition, "definition");
            AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
            if (hVar instanceof d) {
                return true;
            }
            if (hVar instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((H0) obj).getType(), definition.getType().f24550a)) {
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

        public static List b(h hVar, Y2.b definition, Y2.d metadata, List sharedDataSpecs, a arguments) {
            Object obj;
            AbstractC3159y.i(definition, "definition");
            AbstractC3159y.i(metadata, "metadata");
            AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3159y.i(arguments, "arguments");
            if (hVar instanceof d) {
                return ((d) hVar).g(metadata, arguments);
            }
            if (hVar instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((H0) obj).getType(), definition.getType().f24550a)) {
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
                return ((c) hVar).c(metadata, h02, new X2.h(arguments));
            }
            throw new p();
        }

        public static W2.a c(h hVar, Y2.b definition, Y2.d metadata, List sharedDataSpecs, boolean z8) {
            Object obj;
            AbstractC3159y.i(definition, "definition");
            AbstractC3159y.i(metadata, "metadata");
            AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
            if (hVar instanceof d) {
                return ((d) hVar).b(z8);
            }
            if (hVar instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((H0) obj).getType(), definition.getType().f24550a)) {
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
                return ((c) hVar).a(h02);
            }
            throw new p();
        }

        public static X2.g d(h hVar, Y2.b definition, List sharedDataSpecs) {
            Object obj;
            AbstractC3159y.i(definition, "definition");
            AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
            if (hVar instanceof d) {
                return ((d) hVar).j();
            }
            if (hVar instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((H0) obj).getType(), definition.getType().f24550a)) {
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
                return ((c) hVar).d(h02);
            }
            throw new p();
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends h {

        /* loaded from: classes4.dex */
        public static final class a {
            public static boolean a(c cVar, Y2.b definition, List sharedDataSpecs) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.a(cVar, definition, sharedDataSpecs);
            }

            public static List b(c cVar, Y2.d metadata, H0 sharedDataSpec, X2.h transformSpecToElements) {
                AbstractC3159y.i(metadata, "metadata");
                AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
                AbstractC3159y.i(transformSpecToElements, "transformSpecToElements");
                return X2.h.b(transformSpecToElements, sharedDataSpec.c(), null, 2, null);
            }

            public static W2.a c(c cVar, H0 sharedDataSpec) {
                AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
                return cVar.d(sharedDataSpec).c();
            }

            public static List d(c cVar, Y2.b definition, Y2.d metadata, List sharedDataSpecs, a arguments) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(metadata, "metadata");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                AbstractC3159y.i(arguments, "arguments");
                return b.b(cVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static W2.a e(c cVar, Y2.b definition, Y2.d metadata, List sharedDataSpecs, boolean z8) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(metadata, "metadata");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.c(cVar, definition, metadata, sharedDataSpecs, z8);
            }

            public static X2.g f(c cVar, Y2.b definition, List sharedDataSpecs) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.d(cVar, definition, sharedDataSpecs);
            }
        }

        W2.a a(H0 h02);

        List c(Y2.d dVar, H0 h02, X2.h hVar);

        X2.g d(H0 h02);
    }

    /* loaded from: classes4.dex */
    public interface d extends h {

        /* loaded from: classes4.dex */
        public static final class a {
            public static boolean a(d dVar, Y2.b definition, List sharedDataSpecs) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.a(dVar, definition, sharedDataSpecs);
            }

            public static W2.a b(d dVar, boolean z8) {
                return dVar.j().c();
            }

            public static List c(d dVar, Y2.b definition, Y2.d metadata, List sharedDataSpecs, a arguments) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(metadata, "metadata");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                AbstractC3159y.i(arguments, "arguments");
                return b.b(dVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static W2.a d(d dVar, Y2.b definition, Y2.d metadata, List sharedDataSpecs, boolean z8) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(metadata, "metadata");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.c(dVar, definition, metadata, sharedDataSpecs, z8);
            }

            public static X2.g e(d dVar, Y2.b definition, List sharedDataSpecs) {
                AbstractC3159y.i(definition, "definition");
                AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.d(dVar, definition, sharedDataSpecs);
            }
        }

        W2.a b(boolean z8);

        List g(Y2.d dVar, a aVar);

        X2.g j();
    }

    W2.a e(Y2.b bVar, Y2.d dVar, List list, boolean z8);

    X2.g f(Y2.b bVar, List list);

    boolean h(Y2.b bVar, List list);

    List i(Y2.b bVar, Y2.d dVar, List list, a aVar);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3167b.a f13058a;

        /* renamed from: b, reason: collision with root package name */
        private final K2.e f13059b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f13060c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f13061d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f13062e;

        /* renamed from: f, reason: collision with root package name */
        private final String f13063f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC1925a f13064g;

        /* renamed from: h, reason: collision with root package name */
        private final u.d f13065h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f13066i;

        /* renamed from: j, reason: collision with root package name */
        private final Function1 f13067j;

        public a(InterfaceC3167b.a cardAccountRangeRepositoryFactory, K2.e eVar, Map initialValues, Map map, boolean z8, String merchantName, InterfaceC1925a cbcEligibility, u.d billingDetailsCollectionConfiguration, boolean z9, Function1 onLinkInlineSignupStateChanged) {
            AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
            AbstractC3159y.i(initialValues, "initialValues");
            AbstractC3159y.i(merchantName, "merchantName");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3159y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
            this.f13058a = cardAccountRangeRepositoryFactory;
            this.f13059b = eVar;
            this.f13060c = initialValues;
            this.f13061d = map;
            this.f13062e = z8;
            this.f13063f = merchantName;
            this.f13064g = cbcEligibility;
            this.f13065h = billingDetailsCollectionConfiguration;
            this.f13066i = z9;
            this.f13067j = onLinkInlineSignupStateChanged;
        }

        public final u.d a() {
            return this.f13065h;
        }

        public final InterfaceC3167b.a b() {
            return this.f13058a;
        }

        public final InterfaceC1925a c() {
            return this.f13064g;
        }

        public final Map d() {
            return this.f13060c;
        }

        public final K2.e e() {
            return this.f13059b;
        }

        public final String f() {
            return this.f13063f;
        }

        public final Function1 g() {
            return this.f13067j;
        }

        public final boolean h() {
            return this.f13066i;
        }

        public final boolean i() {
            return this.f13062e;
        }

        public final Map j() {
            return this.f13061d;
        }

        /* renamed from: Y2.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public interface InterfaceC0245a {
            a a(Y2.d dVar, boolean z8);

            /* renamed from: Y2.h$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0246a implements InterfaceC0245a {

                /* renamed from: a, reason: collision with root package name */
                private final InterfaceC3167b.a f13068a;

                /* renamed from: b, reason: collision with root package name */
                private final K2.e f13069b;

                /* renamed from: c, reason: collision with root package name */
                private final Function1 f13070c;

                /* renamed from: d, reason: collision with root package name */
                private final com.stripe.android.model.p f13071d;

                /* renamed from: e, reason: collision with root package name */
                private final q f13072e;

                public C0246a(InterfaceC3167b.a cardAccountRangeRepositoryFactory, K2.e eVar, Function1 onLinkInlineSignupStateChanged, com.stripe.android.model.p pVar, q qVar) {
                    AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
                    AbstractC3159y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
                    this.f13068a = cardAccountRangeRepositoryFactory;
                    this.f13069b = eVar;
                    this.f13070c = onLinkInlineSignupStateChanged;
                    this.f13071d = pVar;
                    this.f13072e = qVar;
                }

                @Override // Y2.h.a.InterfaceC0245a
                public a a(Y2.d metadata, boolean z8) {
                    Map map;
                    AbstractC3159y.i(metadata, "metadata");
                    InterfaceC3167b.a aVar = this.f13068a;
                    K2.e eVar = this.f13069b;
                    String Q8 = metadata.Q();
                    InterfaceC1925a u8 = metadata.u();
                    Map a8 = X2.c.f12222a.a(metadata.z(), this.f13071d, this.f13072e);
                    C3686a t8 = metadata.t();
                    if (t8 != null) {
                        map = AbstractC3687b.b(t8, metadata.z());
                    } else {
                        map = null;
                    }
                    return new a(aVar, eVar, a8, map, false, Q8, u8, metadata.s(), z8, this.f13070c);
                }

                public /* synthetic */ C0246a(InterfaceC3167b.a aVar, K2.e eVar, Function1 function1, com.stripe.android.model.p pVar, q qVar, int i8, AbstractC3151p abstractC3151p) {
                    this(aVar, eVar, function1, (i8 & 8) != 0 ? null : pVar, (i8 & 16) != 0 ? null : qVar);
                }
            }
        }
    }
}
