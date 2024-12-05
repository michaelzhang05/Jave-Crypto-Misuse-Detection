package A2;

import A2.G;
import A2.j;
import P5.AbstractC1378t;
import P5.Q;
import android.os.Build;
import android.system.Os;
import com.mbridge.msdk.foundation.download.Command;
import j6.C3205d;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import u2.C4056c;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: b, reason: collision with root package name */
    public static final d f261b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f262c;

    /* renamed from: a, reason: collision with root package name */
    private Map f263a;

    /* loaded from: classes4.dex */
    public static final class a extends y {

        /* renamed from: d, reason: collision with root package name */
        public static final a f264d = new a();

        /* renamed from: e, reason: collision with root package name */
        private static final String f265e = y.f261b.b("AndroidBindings/20.49.0");

        /* renamed from: f, reason: collision with root package name */
        private static final Map f266f = Q.h();

        private a() {
            super(null);
        }

        @Override // A2.y
        protected Map e() {
            return f266f;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        @Override // A2.y
        protected String g() {
            return f265e;
        }

        @Override // A2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1378t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }

        public int hashCode() {
            return -334358835;
        }

        public String toString() {
            return "Analytics";
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends y {

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f269d;

        /* renamed from: e, reason: collision with root package name */
        private final C4056c f270e;

        /* renamed from: f, reason: collision with root package name */
        private final Locale f271f;

        /* renamed from: g, reason: collision with root package name */
        private final String f272g;

        /* renamed from: h, reason: collision with root package name */
        private final String f273h;

        /* renamed from: i, reason: collision with root package name */
        private final D f274i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0 optionsProvider, C4056c c4056c, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            AbstractC3255y.i(optionsProvider, "optionsProvider");
            AbstractC3255y.i(locale, "locale");
            AbstractC3255y.i(apiVersion, "apiVersion");
            AbstractC3255y.i(sdkVersion, "sdkVersion");
            this.f269d = optionsProvider;
            this.f270e = c4056c;
            this.f271f = locale;
            this.f272g = apiVersion;
            this.f273h = sdkVersion;
            this.f274i = new D(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        }

        private final String i() {
            String languageTag = this.f271f.toLanguageTag();
            AbstractC3255y.f(languageTag);
            if (!(!j6.n.u(languageTag)) || AbstractC3255y.d(languageTag, com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
                return null;
            }
            return languageTag;
        }

        @Override // A2.y
        protected Map e() {
            Map h8;
            Map map;
            Map map2;
            j.c cVar = (j.c) this.f269d.invoke();
            Map q8 = Q.q(Q.k(O5.x.a("Accept", "application/json"), O5.x.a("Stripe-Version", this.f272g), O5.x.a("Authorization", "Bearer " + cVar.g())), this.f274i.a(this.f270e));
            if (cVar.h()) {
                h8 = Q.e(O5.x.a("Stripe-Livemode", String.valueOf(true ^ AbstractC3255y.d(Os.getenv("Stripe-Livemode"), "false"))));
            } else {
                h8 = Q.h();
            }
            Map q9 = Q.q(q8, h8);
            String l8 = cVar.l();
            Map map3 = null;
            if (l8 != null) {
                map = Q.e(O5.x.a("Stripe-Account", l8));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q10 = Q.q(q9, map);
            String i8 = cVar.i();
            if (i8 != null) {
                map2 = Q.e(O5.x.a("Idempotency-Key", i8));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q11 = Q.q(q10, map2);
            String i9 = i();
            if (i9 != null) {
                map3 = Q.e(O5.x.a("Accept-Language", i9));
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            return Q.q(q11, map3);
        }

        @Override // A2.y
        protected String g() {
            String str;
            String b8 = y.f261b.b(this.f273h);
            C4056c c4056c = this.f270e;
            if (c4056c != null) {
                str = c4056c.g();
            } else {
                str = null;
            }
            return AbstractC1378t.w0(AbstractC1378t.r(b8, str), " ", null, null, 0, null, null, 62, null);
        }

        @Override // A2.y
        protected String h() {
            Map d8 = d();
            C4056c c4056c = this.f270e;
            if (c4056c != null) {
                d8.putAll(c4056c.b());
            }
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1378t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public static /* synthetic */ String c(d dVar, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = "AndroidBindings/20.49.0";
            }
            return dVar.b(str);
        }

        public final String a() {
            return y.f262c;
        }

        public final String b(String sdkVersion) {
            AbstractC3255y.i(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        public /* synthetic */ d(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends y {

        /* renamed from: g, reason: collision with root package name */
        public static final a f275g = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private final Map f276d;

        /* renamed from: e, reason: collision with root package name */
        private final String f277e;

        /* renamed from: f, reason: collision with root package name */
        private Map f278f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String guid) {
            super(null);
            AbstractC3255y.i(guid, "guid");
            this.f276d = Q.e(O5.x.a("Cookie", "m=" + guid));
            d dVar = y.f261b;
            this.f277e = dVar.b("AndroidBindings/20.49.0");
            this.f278f = Q.e(O5.x.a("Content-Type", G.b.f125d.b() + "; charset=" + dVar.a()));
        }

        @Override // A2.y
        protected Map e() {
            return this.f276d;
        }

        @Override // A2.y
        protected Map f() {
            return this.f278f;
        }

        @Override // A2.y
        protected String g() {
            return this.f277e;
        }

        @Override // A2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1378t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    static {
        String name = C3205d.f34020b.name();
        AbstractC3255y.h(name, "name(...)");
        f262c = name;
    }

    public /* synthetic */ y(AbstractC3247p abstractC3247p) {
        this();
    }

    public final Map b() {
        return Q.q(e(), Q.k(O5.x.a(Command.HTTP_HEADER_USER_AGENT, g()), O5.x.a("Accept-Charset", f262c), O5.x.a("X-Stripe-User-Agent", h())));
    }

    public final Map c() {
        return f();
    }

    protected final Map d() {
        O5.r a8 = O5.x.a("lang", "kotlin");
        O5.r a9 = O5.x.a("bindings_version", "20.49.0");
        O5.r a10 = O5.x.a("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return Q.m(a8, a9, a10, O5.x.a("type", str + "_" + str2 + "_" + str3), O5.x.a("model", str3));
    }

    protected abstract Map e();

    protected Map f() {
        return this.f263a;
    }

    protected abstract String g();

    protected abstract String h();

    private y() {
        this.f263a = Q.h();
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: j, reason: collision with root package name */
        private Map f267j;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j.c f268a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j.c cVar) {
                super(0);
                this.f268a = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j.c invoke() {
                return this.f268a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ b(A2.j.c r7, u2.C4056c r8, java.util.Locale r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.AbstractC3247p r13) {
            /*
                r6 = this;
                r13 = r12 & 2
                if (r13 == 0) goto L5
                r8 = 0
            L5:
                r2 = r8
                r8 = r12 & 4
                if (r8 == 0) goto L13
                java.util.Locale r9 = java.util.Locale.getDefault()
                java.lang.String r8 = "getDefault(...)"
                kotlin.jvm.internal.AbstractC3255y.h(r9, r8)
            L13:
                r3 = r9
                r8 = r12 & 8
                if (r8 == 0) goto L22
                u2.b$a r8 = u2.C4055b.f39941c
                u2.b r8 = r8.a()
                java.lang.String r10 = r8.b()
            L22:
                r4 = r10
                r8 = r12 & 16
                if (r8 == 0) goto L29
                java.lang.String r11 = "AndroidBindings/20.49.0"
            L29:
                r5 = r11
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A2.y.b.<init>(A2.j$c, u2.c, java.util.Locale, java.lang.String, java.lang.String, int, kotlin.jvm.internal.p):void");
        }

        @Override // A2.y
        protected Map f() {
            return this.f267j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.c options, C4056c c4056c, Locale locale, String apiVersion, String sdkVersion) {
            super(new a(options), c4056c, locale, apiVersion, sdkVersion);
            AbstractC3255y.i(options, "options");
            AbstractC3255y.i(locale, "locale");
            AbstractC3255y.i(apiVersion, "apiVersion");
            AbstractC3255y.i(sdkVersion, "sdkVersion");
            this.f267j = Q.e(O5.x.a("Content-Type", G.b.f123b.b() + "; charset=" + y.f261b.a()));
        }
    }
}
