package x2;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Build;
import android.system.Os;
import com.mbridge.msdk.foundation.download.Command;
import g6.C2728d;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.C3683c;
import x2.AbstractC3869G;
import x2.j;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: b, reason: collision with root package name */
    public static final d f39266b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f39267c;

    /* renamed from: a, reason: collision with root package name */
    private Map f39268a;

    /* loaded from: classes4.dex */
    public static final class a extends y {

        /* renamed from: d, reason: collision with root package name */
        public static final a f39269d = new a();

        /* renamed from: e, reason: collision with root package name */
        private static final String f39270e = y.f39266b.b("AndroidBindings/20.49.0");

        /* renamed from: f, reason: collision with root package name */
        private static final Map f39271f = Q.h();

        private a() {
            super(null);
        }

        @Override // x2.y
        protected Map e() {
            return f39271f;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        @Override // x2.y
        protected String g() {
            return f39270e;
        }

        @Override // x2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1246t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
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
        private final Function0 f39274d;

        /* renamed from: e, reason: collision with root package name */
        private final C3683c f39275e;

        /* renamed from: f, reason: collision with root package name */
        private final Locale f39276f;

        /* renamed from: g, reason: collision with root package name */
        private final String f39277g;

        /* renamed from: h, reason: collision with root package name */
        private final String f39278h;

        /* renamed from: i, reason: collision with root package name */
        private final C3866D f39279i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0 optionsProvider, C3683c c3683c, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            AbstractC3159y.i(optionsProvider, "optionsProvider");
            AbstractC3159y.i(locale, "locale");
            AbstractC3159y.i(apiVersion, "apiVersion");
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            this.f39274d = optionsProvider;
            this.f39275e = c3683c;
            this.f39276f = locale;
            this.f39277g = apiVersion;
            this.f39278h = sdkVersion;
            this.f39279i = new C3866D(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        }

        private final String i() {
            String languageTag = this.f39276f.toLanguageTag();
            AbstractC3159y.f(languageTag);
            if (!(!g6.n.u(languageTag)) || AbstractC3159y.d(languageTag, com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
                return null;
            }
            return languageTag;
        }

        @Override // x2.y
        protected Map e() {
            Map h8;
            Map map;
            Map map2;
            j.c cVar = (j.c) this.f39274d.invoke();
            Map q8 = Q.q(Q.k(L5.x.a("Accept", "application/json"), L5.x.a("Stripe-Version", this.f39277g), L5.x.a("Authorization", "Bearer " + cVar.e())), this.f39279i.a(this.f39275e));
            if (cVar.f()) {
                h8 = Q.e(L5.x.a("Stripe-Livemode", String.valueOf(true ^ AbstractC3159y.d(Os.getenv("Stripe-Livemode"), "false"))));
            } else {
                h8 = Q.h();
            }
            Map q9 = Q.q(q8, h8);
            String j8 = cVar.j();
            Map map3 = null;
            if (j8 != null) {
                map = Q.e(L5.x.a("Stripe-Account", j8));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q10 = Q.q(q9, map);
            String i8 = cVar.i();
            if (i8 != null) {
                map2 = Q.e(L5.x.a("Idempotency-Key", i8));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q11 = Q.q(q10, map2);
            String i9 = i();
            if (i9 != null) {
                map3 = Q.e(L5.x.a("Accept-Language", i9));
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            return Q.q(q11, map3);
        }

        @Override // x2.y
        protected String g() {
            String str;
            String b8 = y.f39266b.b(this.f39278h);
            C3683c c3683c = this.f39275e;
            if (c3683c != null) {
                str = c3683c.e();
            } else {
                str = null;
            }
            return AbstractC1246t.w0(AbstractC1246t.r(b8, str), " ", null, null, 0, null, null, 62, null);
        }

        @Override // x2.y
        protected String h() {
            Map d8 = d();
            C3683c c3683c = this.f39275e;
            if (c3683c != null) {
                d8.putAll(c3683c.c());
            }
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1246t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
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
            return y.f39267c;
        }

        public final String b(String sdkVersion) {
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends y {

        /* renamed from: g, reason: collision with root package name */
        public static final a f39280g = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private final Map f39281d;

        /* renamed from: e, reason: collision with root package name */
        private final String f39282e;

        /* renamed from: f, reason: collision with root package name */
        private Map f39283f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String guid) {
            super(null);
            AbstractC3159y.i(guid, "guid");
            this.f39281d = Q.e(L5.x.a("Cookie", "m=" + guid));
            d dVar = y.f39266b;
            this.f39282e = dVar.b("AndroidBindings/20.49.0");
            this.f39283f = Q.e(L5.x.a("Content-Type", AbstractC3869G.b.f39130d.b() + "; charset=" + dVar.a()));
        }

        @Override // x2.y
        protected Map e() {
            return this.f39281d;
        }

        @Override // x2.y
        protected Map f() {
            return this.f39283f;
        }

        @Override // x2.y
        protected String g() {
            return this.f39282e;
        }

        @Override // x2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1246t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    static {
        String name = C2728d.f31293b.name();
        AbstractC3159y.h(name, "name(...)");
        f39267c = name;
    }

    public /* synthetic */ y(AbstractC3151p abstractC3151p) {
        this();
    }

    public final Map b() {
        return Q.q(e(), Q.k(L5.x.a(Command.HTTP_HEADER_USER_AGENT, g()), L5.x.a("Accept-Charset", f39267c), L5.x.a("X-Stripe-User-Agent", h())));
    }

    public final Map c() {
        return f();
    }

    protected final Map d() {
        L5.r a8 = L5.x.a("lang", "kotlin");
        L5.r a9 = L5.x.a("bindings_version", "20.49.0");
        L5.r a10 = L5.x.a("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return Q.m(a8, a9, a10, L5.x.a("type", str + "_" + str2 + "_" + str3), L5.x.a("model", str3));
    }

    protected abstract Map e();

    protected Map f() {
        return this.f39268a;
    }

    protected abstract String g();

    protected abstract String h();

    private y() {
        this.f39268a = Q.h();
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: j, reason: collision with root package name */
        private Map f39272j;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j.c f39273a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j.c cVar) {
                super(0);
                this.f39273a = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j.c invoke() {
                return this.f39273a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ b(x2.j.c r7, r2.C3683c r8, java.util.Locale r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.AbstractC3151p r13) {
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
                kotlin.jvm.internal.AbstractC3159y.h(r9, r8)
            L13:
                r3 = r9
                r8 = r12 & 8
                if (r8 == 0) goto L22
                r2.b$a r8 = r2.C3682b.f37561c
                r2.b r8 = r8.a()
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
            throw new UnsupportedOperationException("Method not decompiled: x2.y.b.<init>(x2.j$c, r2.c, java.util.Locale, java.lang.String, java.lang.String, int, kotlin.jvm.internal.p):void");
        }

        @Override // x2.y
        protected Map f() {
            return this.f39272j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.c options, C3683c c3683c, Locale locale, String apiVersion, String sdkVersion) {
            super(new a(options), c3683c, locale, apiVersion, sdkVersion);
            AbstractC3159y.i(options, "options");
            AbstractC3159y.i(locale, "locale");
            AbstractC3159y.i(apiVersion, "apiVersion");
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            this.f39272j = Q.e(L5.x.a("Content-Type", AbstractC3869G.b.f39128b.b() + "; charset=" + y.f39266b.a()));
        }
    }
}
