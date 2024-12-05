package c3;

import android.net.Uri;
import b3.M;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.stripe.android.model.StripeIntent;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class t implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final d f14944b = new d(null);

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0369a f14945b = new C0369a(null);

        /* renamed from: c3.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0369a {
            private C0369a() {
            }

            public /* synthetic */ C0369a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.C0480a a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            String string = json.getString("native_data");
            AbstractC3159y.h(string, "getString(...)");
            String string2 = json.getString("url");
            AbstractC3159y.h(string2, "getString(...)");
            return new StripeIntent.a.C0480a(string, string2, v2.e.l(json, "return_url"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3845a {
        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.b a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return StripeIntent.a.b.f24172a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3845a {
        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.c a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            String optString = json.optString("mobile_auth_url");
            AbstractC3159y.h(optString, "optString(...)");
            return new StripeIntent.a.c(optString);
        }
    }

    /* loaded from: classes4.dex */
    private static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14946b = new a(null);

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
        public StripeIntent.a.d a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new StripeIntent.a.d(v2.e.l(json, "hosted_voucher_url"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14947b = new a(null);

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
        public StripeIntent.a.e a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new StripeIntent.a.e(v2.e.l(json, "hosted_voucher_url"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14948b = new a(null);

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
        public StripeIntent.a.f a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new StripeIntent.a.f(v2.e.l(json, "hosted_voucher_url"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14949b = new a(null);

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
        public StripeIntent.a.g a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new StripeIntent.a.g(json.optInt("expires_after"), v2.e.l(json, "number"), v2.e.l(json, "hosted_voucher_url"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14950b = new a(null);

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
        public StripeIntent.a.i a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            if (json.has("url")) {
                Uri parse = Uri.parse(json.getString("url"));
                AbstractC3159y.h(parse, "parse(...)");
                return new StripeIntent.a.i(parse, json.optString("return_url"));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14951b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (r1 != null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.stripe.android.model.StripeIntent.a.j.b.C0492b c(org.json.JSONObject r6) {
            /*
                r5 = this;
                v2.e r0 = v2.e.f38789a
                java.lang.String r1 = "root_certificate_authorities"
                org.json.JSONArray r1 = r6.optJSONArray(r1)
                java.util.List r0 = r0.a(r1)
                if (r0 == 0) goto L30
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r1 = M5.AbstractC1246t.m()
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r0.next()
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L18
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.List r1 = M5.AbstractC1246t.H0(r1, r2)
                goto L18
            L2d:
                if (r1 == 0) goto L30
                goto L34
            L30:
                java.util.List r1 = M5.AbstractC1246t.m()
            L34:
                com.stripe.android.model.StripeIntent$a$j$b$b r0 = new com.stripe.android.model.StripeIntent$a$j$b$b
                java.lang.String r2 = "directory_server_id"
                java.lang.String r2 = r6.optString(r2)
                java.lang.String r3 = "optString(...)"
                kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
                java.lang.String r4 = "certificate"
                java.lang.String r4 = r6.optString(r4)
                kotlin.jvm.internal.AbstractC3159y.h(r4, r3)
                java.lang.String r3 = "key_id"
                java.lang.String r6 = r6.optString(r3)
                r0.<init>(r2, r4, r1, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c3.t.j.c(org.json.JSONObject):com.stripe.android.model.StripeIntent$a$j$b$b");
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.j a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            String l8 = v2.e.l(json, "type");
            if (AbstractC3159y.d(l8, "three_d_secure_redirect")) {
                String optString = json.optString("stripe_js");
                AbstractC3159y.h(optString, "optString(...)");
                return new StripeIntent.a.j.C0489a(optString);
            }
            if (AbstractC3159y.d(l8, "stripe_3ds2_fingerprint")) {
                String optString2 = json.optString("three_d_secure_2_source");
                AbstractC3159y.h(optString2, "optString(...)");
                String optString3 = json.optString("directory_server_name");
                AbstractC3159y.h(optString3, "optString(...)");
                String optString4 = json.optString("server_transaction_id");
                AbstractC3159y.h(optString4, "optString(...)");
                JSONObject optJSONObject = json.optJSONObject("directory_server_encryption");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                return new StripeIntent.a.j.b(optString2, optString3, optString4, c(optJSONObject), v2.e.l(json, "three_d_secure_2_intent"), v2.e.l(json, "publishable_key"));
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC3845a {
        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.k a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            String optString = json.optString("mobile_auth_url");
            AbstractC3159y.h(optString, "optString(...)");
            return new StripeIntent.a.k(optString);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC3845a {
        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.l a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return StripeIntent.a.l.f24194a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14952b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        private final b3.z c(JSONObject jSONObject) {
            Object obj;
            Iterator<E> it = b3.z.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3159y.d(((b3.z) obj).c(), jSONObject.optString("microdeposit_type"))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b3.z zVar = (b3.z) obj;
            if (zVar == null) {
                return b3.z.f14603d;
            }
            return zVar;
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.m a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            long optLong = json.optLong("arrival_date");
            String optString = json.optString("hosted_verification_url");
            AbstractC3159y.h(optString, "optString(...)");
            return new StripeIntent.a.m(optLong, optString, c(json));
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14953b = new a(null);

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
        public StripeIntent.a.n a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new StripeIntent.a.n(new M(null, json.optString(MBridgeConstans.APP_ID), json.optString("nonce_str"), json.optString("package"), json.optString("partner_id"), json.optString("prepay_id"), json.optString("sign"), json.optString(CampaignEx.JSON_KEY_TIMESTAMP), null, 257, null));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class o {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14954a;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr[StripeIntent.NextActionType.f24134e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24141l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24142m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24143n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24132c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24133d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24135f.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24136g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24137h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24138i.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24139j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24140k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StripeIntent.NextActionType.f24144o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f14954a = iArr;
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public StripeIntent.a a(JSONObject json) {
        int i8;
        InterfaceC3845a hVar;
        AbstractC3159y.i(json, "json");
        StripeIntent.NextActionType a8 = StripeIntent.NextActionType.f24131b.a(json.optString("type"));
        if (a8 == null) {
            i8 = -1;
        } else {
            i8 = o.f14954a[a8.ordinal()];
        }
        switch (i8) {
            case -1:
                return null;
            case 0:
            default:
                throw new L5.p();
            case 1:
                hVar = new h();
                break;
            case 2:
                hVar = new e();
                break;
            case 3:
                hVar = new f();
                break;
            case 4:
                hVar = new g();
                break;
            case 5:
                hVar = new i();
                break;
            case 6:
                hVar = new j();
                break;
            case 7:
                hVar = new a();
                break;
            case 8:
                hVar = new b();
                break;
            case 9:
                hVar = new n();
                break;
            case 10:
                hVar = new m();
                break;
            case 11:
                hVar = new l();
                break;
            case 12:
                hVar = new c();
                break;
            case 13:
                hVar = new k();
                break;
        }
        JSONObject optJSONObject = json.optJSONObject(a8.b());
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return (StripeIntent.a) hVar.a(optJSONObject);
    }
}
