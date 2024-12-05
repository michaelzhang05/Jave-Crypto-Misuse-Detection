package U3;

import L5.I;
import L5.r;
import L5.s;
import L5.t;
import L5.x;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.Q;
import P5.g;
import X5.n;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.stripe.android.stripe3ds2.transaction.o;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a implements U3.c {

    /* renamed from: i, reason: collision with root package name */
    private static final C0222a f11075i = new C0222a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final String f11076j = StandardCharsets.UTF_8.name();

    /* renamed from: a, reason: collision with root package name */
    private final Context f11077a;

    /* renamed from: b, reason: collision with root package name */
    private final b f11078b;

    /* renamed from: c, reason: collision with root package name */
    private final g f11079c;

    /* renamed from: d, reason: collision with root package name */
    private final o f11080d;

    /* renamed from: e, reason: collision with root package name */
    private final U3.d f11081e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11082f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11083g;

    /* renamed from: h, reason: collision with root package name */
    private final int f11084h;

    /* renamed from: U3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0222a {
        private C0222a() {
        }

        public /* synthetic */ C0222a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        Map b();
    }

    /* loaded from: classes4.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11085a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Map f11086b = Q.h();

        private c() {
        }

        @Override // U3.a.b
        public Map b() {
            return f11086b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11087a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(r rVar) {
            AbstractC3159y.i(rVar, "<name for destructuring parameter 0>");
            return ((String) rVar.a()) + "=" + ((String) rVar.b());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f11088a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11089b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f11091d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Throwable th, P5.d dVar) {
            super(2, dVar);
            this.f11091d = th;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            e eVar = new e(this.f11091d, dVar);
            eVar.f11089b = obj;
            return eVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Q5.b.e();
            if (this.f11088a == 0) {
                t.b(obj);
                a aVar = a.this;
                Throwable th = this.f11091d;
                try {
                    s.a aVar2 = s.f6511b;
                    aVar.l(aVar.d(th));
                    b8 = s.b(I.f6487a);
                } catch (Throwable th2) {
                    s.a aVar3 = s.f6511b;
                    b8 = s.b(t.a(th2));
                }
                a aVar4 = a.this;
                Throwable e8 = s.e(b8);
                if (e8 != null) {
                    aVar4.j(e8);
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(Context context, b config, g workContext, o logger, U3.d sentryConfig, String environment, String localeCountry, int i8) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(sentryConfig, "sentryConfig");
        AbstractC3159y.i(environment, "environment");
        AbstractC3159y.i(localeCountry, "localeCountry");
        this.f11077a = context;
        this.f11078b = config;
        this.f11079c = workContext;
        this.f11080d = logger;
        this.f11081e = sentryConfig;
        this.f11082f = environment;
        this.f11083g = localeCountry;
        this.f11084h = i8;
    }

    private final HttpsURLConnection c() {
        HttpsURLConnection k8 = k();
        k8.setRequestMethod(ShareTarget.METHOD_POST);
        k8.setDoOutput(true);
        for (Map.Entry entry : Q.k(x.a("Content-Type", "application/json; charset=utf-8"), x.a(Command.HTTP_HEADER_USER_AGENT, "Android3ds2Sdk 6.1.8"), x.a("X-Sentry-Auth", g())).entrySet()) {
            k8.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return k8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Throwable th) {
        this.f11080d.a("Failed to send error report.", th);
    }

    private final HttpsURLConnection k() {
        URLConnection openConnection = new URL("https://errors.stripe.com/api/" + this.f11081e.a() + "/store/").openConnection();
        AbstractC3159y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) openConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(JSONObject jSONObject) {
        HttpsURLConnection c8 = c();
        OutputStream outputStream = c8.getOutputStream();
        try {
            AbstractC3159y.f(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC3159y.h(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.flush();
                I i8 = I.f6487a;
                V5.b.a(outputStreamWriter, null);
                V5.b.a(outputStream, null);
                c8.connect();
                h(c8, c8.getResponseCode());
                c8.disconnect();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                V5.b.a(outputStream, th);
                throw th2;
            }
        }
    }

    public final /* synthetic */ JSONObject d(Throwable t8) {
        AbstractC3159y.i(t8, "t");
        JSONObject put = new JSONObject().put("release", "com.stripe.android.stripe3ds2@6.1.8+25");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject put2 = new JSONObject().put("type", t8.getClass().getCanonicalName());
        String message = t8.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject put3 = put.put("exception", jSONObject.put("values", jSONArray.put(put2.put("value", message).put("stacktrace", f(t8)))));
        JSONObject put4 = new JSONObject().put("locale", this.f11083g).put("environment", this.f11082f).put("android_os_version", this.f11084h);
        for (Map.Entry entry : this.f11078b.b().entrySet()) {
            put4.put((String) entry.getKey(), (String) entry.getValue());
        }
        I i8 = I.f6487a;
        JSONObject put5 = put3.put("tags", put4).put("contexts", e());
        AbstractC3159y.h(put5, "put(...)");
        return put5;
    }

    public final /* synthetic */ JSONObject e() {
        Object b8;
        CharSequence charSequence;
        ApplicationInfo applicationInfo;
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(this.f11077a.getPackageManager().getPackageInfo(this.f11077a.getPackageName(), 0));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        String str = null;
        if (s.g(b8)) {
            b8 = null;
        }
        PackageInfo packageInfo = (PackageInfo) b8;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(this.f11077a.getPackageManager());
        } else {
            charSequence = null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject put = new JSONObject().put("app_identifier", this.f11077a.getPackageName()).put("app_name", charSequence);
        if (packageInfo != null) {
            str = packageInfo.versionName;
        }
        if (str == null) {
            str = "";
        }
        JSONObject put2 = jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, put.put("app_version", str));
        JSONObject put3 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject put4 = put2.put("os", put3.put("type", str2).put("build", Build.DISPLAY));
        JSONObject put5 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        AbstractC3159y.h(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        for (String str3 : SUPPORTED_ABIS) {
            jSONArray.put(str3);
        }
        I i8 = I.f6487a;
        JSONObject put6 = put4.put("device", put5.put("archs", jSONArray));
        AbstractC3159y.h(put6, "put(...)");
        return put6;
    }

    public final /* synthetic */ JSONObject f(Throwable t8) {
        AbstractC3159y.i(t8, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = t8.getStackTrace();
        AbstractC3159y.h(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : AbstractC1239l.I0(stackTrace)) {
            jSONArray.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        I i8 = I.f6487a;
        JSONObject put = jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS, jSONArray);
        AbstractC3159y.h(put, "put(...)");
        return put;
    }

    public final /* synthetic */ String g() {
        return AbstractC1246t.w0(AbstractC1246t.p("Sentry", AbstractC1246t.w0(AbstractC1246t.p(x.a("sentry_key", this.f11081e.getKey()), x.a("sentry_version", this.f11081e.getVersion()), x.a("sentry_timestamp", this.f11081e.c()), x.a("sentry_client", "Android3ds2Sdk 6.1.8"), x.a("sentry_secret", this.f11081e.b())), ", ", null, null, 0, null, d.f11087a, 30, null)), " ", null, null, 0, null, null, 62, null);
    }

    @Override // U3.c
    public void i(Throwable t8) {
        AbstractC3159y.i(t8, "t");
        AbstractC2829k.d(N.a(this.f11079c), null, null, new e(t8, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(android.content.Context r9, U3.a.b r10, P5.g r11, com.stripe.android.stripe3ds2.transaction.o r12, U3.d r13, java.lang.String r14, java.lang.String r15, int r16, int r17, kotlin.jvm.internal.AbstractC3151p r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            if (r1 == 0) goto L9
            U3.a$c r1 = U3.a.c.f11085a
            goto La
        L9:
            r1 = r10
        La:
            r2 = r0 & 4
            if (r2 == 0) goto L13
            i6.I r2 = i6.C2812b0.b()
            goto L14
        L13:
            r2 = r11
        L14:
            r3 = r0 & 8
            if (r3 == 0) goto L1b
            com.stripe.android.stripe3ds2.transaction.o$b r3 = com.stripe.android.stripe3ds2.transaction.o.b.f26893b
            goto L1c
        L1b:
            r3 = r12
        L1c:
            r4 = r0 & 16
            if (r4 == 0) goto L23
            U3.b r4 = U3.b.f11092a
            goto L24
        L23:
            r4 = r13
        L24:
            r5 = r0 & 32
            if (r5 == 0) goto L2b
            java.lang.String r5 = "release"
            goto L2c
        L2b:
            r5 = r14
        L2c:
            r6 = r0 & 64
            if (r6 == 0) goto L3e
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getCountry()
            java.lang.String r7 = "getCountry(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r6, r7)
            goto L3f
        L3e:
            r6 = r15
        L3f:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L46
            int r0 = android.os.Build.VERSION.SDK_INT
            goto L48
        L46:
            r0 = r16
        L48:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.a.<init>(android.content.Context, U3.a$b, P5.g, com.stripe.android.stripe3ds2.transaction.o, U3.d, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.p):void");
    }

    private final void h(HttpsURLConnection httpsURLConnection, int i8) {
    }
}
