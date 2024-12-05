package f3;

import P5.AbstractC1378t;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.stripe.android.model.o;
import e3.EnumC2791e;
import g3.AbstractC2878a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class v implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final e f31933b = new e(null);

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0736a f31934b = new C0736a(null);

        /* renamed from: f3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0736a {
            private C0736a() {
            }

            public /* synthetic */ C0736a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.c a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.c(y2.e.l(json, "bsb_number"), y2.e.l(json, "fingerprint"), y2.e.l(json, "last4"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31935b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.d a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.d(y2.e.l(json, "fingerprint"), y2.e.l(json, "last4"), y2.e.l(json, "sort_code"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31936b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.e a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3255y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject != null) {
                aVar = new C2826b().a(optJSONObject);
            } else {
                aVar = null;
            }
            return new o.e(aVar, y2.e.l(json, NotificationCompat.CATEGORY_EMAIL), y2.e.l(json, "name"), y2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final b f31937b = new b(null);

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC4225a {

            /* renamed from: b, reason: collision with root package name */
            private static final C0737a f31938b = new C0737a(null);

            /* renamed from: f3.v$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0737a {
                private C0737a() {
                }

                public /* synthetic */ C0737a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            @Override // z2.InterfaceC4225a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.a a(JSONObject json) {
                AbstractC3255y.i(json, "json");
                return new o.g.a(y2.e.l(json, "address_line1_check"), y2.e.l(json, "address_postal_code_check"), y2.e.l(json, "cvc_check"));
            }
        }

        /* loaded from: classes4.dex */
        private static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC4225a {

            /* renamed from: b, reason: collision with root package name */
            private static final a f31939b = new a(null);

            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            @Override // z2.InterfaceC4225a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.c a(JSONObject json) {
                AbstractC3255y.i(json, "json");
                List a8 = y2.e.f40920a.a(json.optJSONArray("available"));
                if (a8 == null) {
                    a8 = AbstractC1378t.m();
                }
                List list = a8;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return new o.g.c(AbstractC1378t.b1(arrayList), y2.e.f40920a.f(json, "selection_mandatory"), y2.e.l(json, "preferred"));
            }
        }

        /* renamed from: f3.v$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0738d implements InterfaceC4225a {

            /* renamed from: b, reason: collision with root package name */
            private static final a f31940b = new a(null);

            /* renamed from: f3.v$d$d$a */
            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            @Override // z2.InterfaceC4225a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.d a(JSONObject json) {
                AbstractC3255y.i(json, "json");
                return new o.g.d(y2.e.f40920a.f(json, "supported"));
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.g a(JSONObject json) {
            o.g.a aVar;
            o.g.d dVar;
            AbstractC2878a abstractC2878a;
            o.g.c cVar;
            AbstractC3255y.i(json, "json");
            EnumC2791e b8 = EnumC2791e.f31442m.b(y2.e.l(json, "brand"));
            JSONObject optJSONObject = json.optJSONObject("checks");
            if (optJSONObject != null) {
                aVar = new a().a(optJSONObject);
            } else {
                aVar = null;
            }
            String l8 = y2.e.l(json, "country");
            y2.e eVar = y2.e.f40920a;
            Integer i8 = eVar.i(json, "exp_month");
            Integer i9 = eVar.i(json, "exp_year");
            String l9 = y2.e.l(json, "fingerprint");
            String l10 = y2.e.l(json, "funding");
            String l11 = y2.e.l(json, "last4");
            JSONObject optJSONObject2 = json.optJSONObject("three_d_secure_usage");
            if (optJSONObject2 != null) {
                dVar = new C0738d().a(optJSONObject2);
            } else {
                dVar = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject("wallet");
            if (optJSONObject3 != null) {
                abstractC2878a = new C2823F().a(optJSONObject3);
            } else {
                abstractC2878a = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("networks");
            if (optJSONObject4 != null) {
                cVar = new c().a(optJSONObject4);
            } else {
                cVar = null;
            }
            return new o.g(b8, aVar, l8, i8, i9, l9, l10, l11, dVar, abstractC2878a, cVar, y2.e.l(json, "display_brand"));
        }
    }

    /* loaded from: classes4.dex */
    private static final class e {
        private e() {
        }

        public /* synthetic */ e(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31941b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.k a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.k(y2.e.l(json, "bank"), y2.e.l(json, "account_holder_type"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31942b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.l a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.l(y2.e.l(json, "bank"), y2.e.l(json, "bic"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31943b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.m a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.m(y2.e.l(json, "bank"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31944b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.n a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.n(y2.e.l(json, "bank_code"), y2.e.l(json, "branch_code"), y2.e.l(json, "country"), y2.e.l(json, "fingerprint"), y2.e.l(json, "last4"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31945b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.C0516o a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.C0516o(y2.e.l(json, "country"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31946b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.r a(JSONObject json) {
            JSONArray jSONArray;
            Object obj;
            Object obj2;
            o.r.c cVar;
            o.r.d dVar;
            AbstractC3255y.i(json, "json");
            Iterator<E> it = o.r.b.b().iterator();
            while (true) {
                jSONArray = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3255y.d(y2.e.l(json, "account_holder_type"), ((o.r.b) obj).g())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            o.r.b bVar = (o.r.b) obj;
            if (bVar == null) {
                bVar = o.r.b.f25620b;
            }
            o.r.b bVar2 = bVar;
            Iterator<E> it2 = o.r.c.b().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (AbstractC3255y.d(y2.e.l(json, "account_type"), ((o.r.c) obj2).g())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            o.r.c cVar2 = (o.r.c) obj2;
            if (cVar2 == null) {
                cVar = o.r.c.f25626b;
            } else {
                cVar = cVar2;
            }
            String l8 = y2.e.l(json, "bank_name");
            String l9 = y2.e.l(json, "fingerprint");
            String l10 = y2.e.l(json, "last4");
            String l11 = y2.e.l(json, "financial_connections_account");
            if (json.has("networks")) {
                String l12 = y2.e.l(json.optJSONObject("networks"), "preferred");
                y2.e eVar = y2.e.f40920a;
                JSONObject optJSONObject = json.optJSONObject("networks");
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.getJSONArray("supported");
                }
                List a8 = eVar.a(jSONArray);
                if (a8 == null) {
                    a8 = AbstractC1378t.m();
                }
                List list = a8;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().toString());
                }
                dVar = new o.r.d(l12, arrayList);
            } else {
                dVar = null;
            }
            return new o.r(bVar2, cVar, l8, l9, l10, l11, dVar, y2.e.l(json, "routing_number"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31947b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.s a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new o.s(y2.e.l(json, "vpa"));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31948a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25587i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25588j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25590l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.p.f25589k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.p.f25591m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.p.f25592n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o.p.f25593o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o.p.f25594p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o.p.f25595q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o.p.f25563A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[o.p.f25577O.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f31948a = iArr;
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.o a(JSONObject json) {
        o.e eVar;
        o.b bVar;
        int i8;
        Object obj;
        AbstractC3255y.i(json, "json");
        String l8 = y2.e.l(json, "type");
        o.p a8 = o.p.f25585g.a(l8);
        o.f i9 = new o.f().l(y2.e.l(json, "id")).r(a8).h(l8).i(y2.e.f40920a.j(json, "created"));
        JSONObject optJSONObject = json.optJSONObject("billing_details");
        o.g gVar = null;
        o.r rVar = null;
        o.m mVar = null;
        o.s sVar = null;
        o.C0516o c0516o = null;
        o.d dVar = null;
        o.c cVar = null;
        o.n nVar = null;
        o.k kVar = null;
        o.l lVar = null;
        if (optJSONObject != null) {
            eVar = new c().a(optJSONObject);
        } else {
            eVar = null;
        }
        o.f e8 = i9.e(eVar);
        String l9 = y2.e.l(json, "allow_redisplay");
        if (l9 != null) {
            Iterator<E> it = o.b.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3255y.d(l9, ((o.b) obj).g())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            bVar = (o.b) obj;
        } else {
            bVar = null;
        }
        o.f n8 = e8.b(bVar).j(y2.e.l(json, "customer")).n(json.optBoolean("livemode"));
        if (a8 == null) {
            i8 = -1;
        } else {
            i8 = m.f31948a[a8.ordinal()];
        }
        switch (i8) {
            case 1:
                JSONObject optJSONObject2 = json.optJSONObject(a8.f25605a);
                if (optJSONObject2 != null) {
                    gVar = new d().a(optJSONObject2);
                }
                n8.f(gVar);
                break;
            case 2:
                n8.g(o.h.f25549b.a());
                break;
            case 3:
                JSONObject optJSONObject3 = json.optJSONObject(a8.f25605a);
                if (optJSONObject3 != null) {
                    lVar = new g().a(optJSONObject3);
                }
                n8.m(lVar);
                break;
            case 4:
                JSONObject optJSONObject4 = json.optJSONObject(a8.f25605a);
                if (optJSONObject4 != null) {
                    kVar = new f().a(optJSONObject4);
                }
                n8.k(kVar);
                break;
            case 5:
                JSONObject optJSONObject5 = json.optJSONObject(a8.f25605a);
                if (optJSONObject5 != null) {
                    nVar = new i().a(optJSONObject5);
                }
                n8.p(nVar);
                break;
            case 6:
                JSONObject optJSONObject6 = json.optJSONObject(a8.f25605a);
                if (optJSONObject6 != null) {
                    cVar = new a().a(optJSONObject6);
                }
                n8.c(cVar);
                break;
            case 7:
                JSONObject optJSONObject7 = json.optJSONObject(a8.f25605a);
                if (optJSONObject7 != null) {
                    dVar = new b().a(optJSONObject7);
                }
                n8.d(dVar);
                break;
            case 8:
                JSONObject optJSONObject8 = json.optJSONObject(a8.f25605a);
                if (optJSONObject8 != null) {
                    c0516o = new j().a(optJSONObject8);
                }
                n8.q(c0516o);
                break;
            case 9:
                JSONObject optJSONObject9 = json.optJSONObject(a8.f25605a);
                if (optJSONObject9 != null) {
                    sVar = new l().a(optJSONObject9);
                }
                n8.t(sVar);
                break;
            case 10:
                JSONObject optJSONObject10 = json.optJSONObject(a8.f25605a);
                if (optJSONObject10 != null) {
                    mVar = new h().a(optJSONObject10);
                }
                n8.o(mVar);
                break;
            case 11:
                JSONObject optJSONObject11 = json.optJSONObject(a8.f25605a);
                if (optJSONObject11 != null) {
                    rVar = new k().a(optJSONObject11);
                }
                n8.s(rVar);
                break;
        }
        return n8.a();
    }
}
