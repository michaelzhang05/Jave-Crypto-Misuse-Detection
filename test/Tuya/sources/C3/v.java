package c3;

import M5.AbstractC1246t;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import b3.EnumC1870e;
import com.stripe.android.model.o;
import d3.AbstractC2554a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class v implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final e f14958b = new e(null);

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0370a f14959b = new C0370a(null);

        /* renamed from: c3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0370a {
            private C0370a() {
            }

            public /* synthetic */ C0370a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.c a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.c(v2.e.l(json, "bsb_number"), v2.e.l(json, "fingerprint"), v2.e.l(json, "last4"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14960b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.d a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.d(v2.e.l(json, "fingerprint"), v2.e.l(json, "last4"), v2.e.l(json, "sort_code"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14961b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.e a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3159y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject != null) {
                aVar = new C1916b().a(optJSONObject);
            } else {
                aVar = null;
            }
            return new o.e(aVar, v2.e.l(json, NotificationCompat.CATEGORY_EMAIL), v2.e.l(json, "name"), v2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final b f14962b = new b(null);

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3845a {

            /* renamed from: b, reason: collision with root package name */
            private static final C0371a f14963b = new C0371a(null);

            /* renamed from: c3.v$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0371a {
                private C0371a() {
                }

                public /* synthetic */ C0371a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            @Override // w2.InterfaceC3845a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.a a(JSONObject json) {
                AbstractC3159y.i(json, "json");
                return new o.g.a(v2.e.l(json, "address_line1_check"), v2.e.l(json, "address_postal_code_check"), v2.e.l(json, "cvc_check"));
            }
        }

        /* loaded from: classes4.dex */
        private static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC3845a {

            /* renamed from: b, reason: collision with root package name */
            private static final a f14964b = new a(null);

            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            @Override // w2.InterfaceC3845a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.c a(JSONObject json) {
                AbstractC3159y.i(json, "json");
                List a8 = v2.e.f38789a.a(json.optJSONArray("available"));
                if (a8 == null) {
                    a8 = AbstractC1246t.m();
                }
                List list = a8;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return new o.g.c(AbstractC1246t.b1(arrayList), v2.e.f38789a.f(json, "selection_mandatory"), v2.e.l(json, "preferred"));
            }
        }

        /* renamed from: c3.v$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0372d implements InterfaceC3845a {

            /* renamed from: b, reason: collision with root package name */
            private static final a f14965b = new a(null);

            /* renamed from: c3.v$d$d$a */
            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            @Override // w2.InterfaceC3845a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.d a(JSONObject json) {
                AbstractC3159y.i(json, "json");
                return new o.g.d(v2.e.f38789a.f(json, "supported"));
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.g a(JSONObject json) {
            o.g.a aVar;
            o.g.d dVar;
            AbstractC2554a abstractC2554a;
            o.g.c cVar;
            AbstractC3159y.i(json, "json");
            EnumC1870e b8 = EnumC1870e.f14436m.b(v2.e.l(json, "brand"));
            JSONObject optJSONObject = json.optJSONObject("checks");
            if (optJSONObject != null) {
                aVar = new a().a(optJSONObject);
            } else {
                aVar = null;
            }
            String l8 = v2.e.l(json, "country");
            v2.e eVar = v2.e.f38789a;
            Integer i8 = eVar.i(json, "exp_month");
            Integer i9 = eVar.i(json, "exp_year");
            String l9 = v2.e.l(json, "fingerprint");
            String l10 = v2.e.l(json, "funding");
            String l11 = v2.e.l(json, "last4");
            JSONObject optJSONObject2 = json.optJSONObject("three_d_secure_usage");
            if (optJSONObject2 != null) {
                dVar = new C0372d().a(optJSONObject2);
            } else {
                dVar = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject("wallet");
            if (optJSONObject3 != null) {
                abstractC2554a = new C1913F().a(optJSONObject3);
            } else {
                abstractC2554a = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("networks");
            if (optJSONObject4 != null) {
                cVar = new c().a(optJSONObject4);
            } else {
                cVar = null;
            }
            return new o.g(b8, aVar, l8, i8, i9, l9, l10, l11, dVar, abstractC2554a, cVar, v2.e.l(json, "display_brand"));
        }
    }

    /* loaded from: classes4.dex */
    private static final class e {
        private e() {
        }

        public /* synthetic */ e(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14966b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.k a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.k(v2.e.l(json, "bank"), v2.e.l(json, "account_holder_type"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14967b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.l a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.l(v2.e.l(json, "bank"), v2.e.l(json, "bic"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14968b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.m a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.m(v2.e.l(json, "bank"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14969b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.n a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.n(v2.e.l(json, "bank_code"), v2.e.l(json, "branch_code"), v2.e.l(json, "country"), v2.e.l(json, "fingerprint"), v2.e.l(json, "last4"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14970b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.C0520o a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.C0520o(v2.e.l(json, "country"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14971b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.r a(JSONObject json) {
            JSONArray jSONArray;
            Object obj;
            Object obj2;
            o.r.c cVar;
            o.r.d dVar;
            AbstractC3159y.i(json, "json");
            Iterator<E> it = o.r.b.c().iterator();
            while (true) {
                jSONArray = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3159y.d(v2.e.l(json, "account_holder_type"), ((o.r.b) obj).e())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            o.r.b bVar = (o.r.b) obj;
            if (bVar == null) {
                bVar = o.r.b.f24565b;
            }
            o.r.b bVar2 = bVar;
            Iterator<E> it2 = o.r.c.c().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (AbstractC3159y.d(v2.e.l(json, "account_type"), ((o.r.c) obj2).e())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            o.r.c cVar2 = (o.r.c) obj2;
            if (cVar2 == null) {
                cVar = o.r.c.f24571b;
            } else {
                cVar = cVar2;
            }
            String l8 = v2.e.l(json, "bank_name");
            String l9 = v2.e.l(json, "fingerprint");
            String l10 = v2.e.l(json, "last4");
            String l11 = v2.e.l(json, "financial_connections_account");
            if (json.has("networks")) {
                String l12 = v2.e.l(json.optJSONObject("networks"), "preferred");
                v2.e eVar = v2.e.f38789a;
                JSONObject optJSONObject = json.optJSONObject("networks");
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.getJSONArray("supported");
                }
                List a8 = eVar.a(jSONArray);
                if (a8 == null) {
                    a8 = AbstractC1246t.m();
                }
                List list = a8;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().toString());
                }
                dVar = new o.r.d(l12, arrayList);
            } else {
                dVar = null;
            }
            return new o.r(bVar2, cVar, l8, l9, l10, l11, dVar, v2.e.l(json, "routing_number"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14972b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.s a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new o.s(v2.e.l(json, "vpa"));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14973a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f24532i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f24533j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f24535l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.p.f24534k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.p.f24536m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.p.f24537n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o.p.f24538o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o.p.f24539p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o.p.f24540q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o.p.f24508A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[o.p.f24522O.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f14973a = iArr;
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.o a(JSONObject json) {
        o.e eVar;
        o.b bVar;
        int i8;
        Object obj;
        AbstractC3159y.i(json, "json");
        String l8 = v2.e.l(json, "type");
        o.p a8 = o.p.f24530g.a(l8);
        o.f i9 = new o.f().l(v2.e.l(json, "id")).r(a8).h(l8).i(v2.e.f38789a.j(json, "created"));
        JSONObject optJSONObject = json.optJSONObject("billing_details");
        o.g gVar = null;
        o.r rVar = null;
        o.m mVar = null;
        o.s sVar = null;
        o.C0520o c0520o = null;
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
        String l9 = v2.e.l(json, "allow_redisplay");
        if (l9 != null) {
            Iterator<E> it = o.b.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3159y.d(l9, ((o.b) obj).e())) {
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
        o.f n8 = e8.b(bVar).j(v2.e.l(json, "customer")).n(json.optBoolean("livemode"));
        if (a8 == null) {
            i8 = -1;
        } else {
            i8 = m.f14973a[a8.ordinal()];
        }
        switch (i8) {
            case 1:
                JSONObject optJSONObject2 = json.optJSONObject(a8.f24550a);
                if (optJSONObject2 != null) {
                    gVar = new d().a(optJSONObject2);
                }
                n8.f(gVar);
                break;
            case 2:
                n8.g(o.h.f24494b.a());
                break;
            case 3:
                JSONObject optJSONObject3 = json.optJSONObject(a8.f24550a);
                if (optJSONObject3 != null) {
                    lVar = new g().a(optJSONObject3);
                }
                n8.m(lVar);
                break;
            case 4:
                JSONObject optJSONObject4 = json.optJSONObject(a8.f24550a);
                if (optJSONObject4 != null) {
                    kVar = new f().a(optJSONObject4);
                }
                n8.k(kVar);
                break;
            case 5:
                JSONObject optJSONObject5 = json.optJSONObject(a8.f24550a);
                if (optJSONObject5 != null) {
                    nVar = new i().a(optJSONObject5);
                }
                n8.p(nVar);
                break;
            case 6:
                JSONObject optJSONObject6 = json.optJSONObject(a8.f24550a);
                if (optJSONObject6 != null) {
                    cVar = new a().a(optJSONObject6);
                }
                n8.c(cVar);
                break;
            case 7:
                JSONObject optJSONObject7 = json.optJSONObject(a8.f24550a);
                if (optJSONObject7 != null) {
                    dVar = new b().a(optJSONObject7);
                }
                n8.d(dVar);
                break;
            case 8:
                JSONObject optJSONObject8 = json.optJSONObject(a8.f24550a);
                if (optJSONObject8 != null) {
                    c0520o = new j().a(optJSONObject8);
                }
                n8.q(c0520o);
                break;
            case 9:
                JSONObject optJSONObject9 = json.optJSONObject(a8.f24550a);
                if (optJSONObject9 != null) {
                    sVar = new l().a(optJSONObject9);
                }
                n8.t(sVar);
                break;
            case 10:
                JSONObject optJSONObject10 = json.optJSONObject(a8.f24550a);
                if (optJSONObject10 != null) {
                    mVar = new h().a(optJSONObject10);
                }
                n8.o(mVar);
                break;
            case 11:
                JSONObject optJSONObject11 = json.optJSONObject(a8.f24550a);
                if (optJSONObject11 != null) {
                    rVar = new k().a(optJSONObject11);
                }
                n8.s(rVar);
                break;
        }
        return n8.a();
    }
}
