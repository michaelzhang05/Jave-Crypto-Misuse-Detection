package x2;

import L5.I;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import x2.AbstractC3869G;
import x2.InterfaceC3867E;

/* loaded from: classes4.dex */
public interface l {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39201a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f39202b;

        /* renamed from: c, reason: collision with root package name */
        private static final int f39203c;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f39202b = (int) timeUnit.toMillis(30L);
            f39203c = (int) timeUnit.toMillis(80L);
        }

        private a() {
        }
    }

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f39204a = new a();

            private a() {
            }

            @Override // x2.l.b
            public HttpsURLConnection a(AbstractC3869G request, X5.n callback) {
                AbstractC3159y.i(request, "request");
                AbstractC3159y.i(callback, "callback");
                URLConnection openConnection = new URL(request.f()).openConnection();
                AbstractC3159y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                callback.invoke(httpsURLConnection, request);
                return httpsURLConnection;
            }
        }

        HttpsURLConnection a(AbstractC3869G abstractC3869G, X5.n nVar);
    }

    /* loaded from: classes4.dex */
    public static final class c implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f39205a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static volatile b f39206b = b.a.f39204a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f39207a = new a();

            a() {
                super(2);
            }

            public final void a(HttpURLConnection open, AbstractC3869G request) {
                AbstractC3159y.i(open, "$this$open");
                AbstractC3159y.i(request, "request");
                open.setConnectTimeout(a.f39202b);
                open.setReadTimeout(a.f39203c);
                open.setUseCaches(request.e());
                open.setRequestMethod(request.b().b());
                for (Map.Entry entry : request.a().entrySet()) {
                    open.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (AbstractC3869G.a.f39123c == request.b()) {
                    open.setDoOutput(true);
                    Map c8 = request.c();
                    if (c8 != null) {
                        for (Map.Entry entry2 : c8.entrySet()) {
                            open.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    OutputStream outputStream = open.getOutputStream();
                    try {
                        AbstractC3159y.f(outputStream);
                        request.g(outputStream);
                        I i8 = I.f6487a;
                        V5.b.a(outputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            V5.b.a(outputStream, th);
                            throw th2;
                        }
                    }
                }
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((HttpURLConnection) obj, (AbstractC3869G) obj2);
                return I.f6487a;
            }
        }

        private c() {
        }

        private final HttpsURLConnection b(AbstractC3869G abstractC3869G) {
            return f39206b.a(abstractC3869G, a.f39207a);
        }

        @Override // x2.l
        public /* synthetic */ InterfaceC3867E a(AbstractC3869G request) {
            AbstractC3159y.i(request, "request");
            return new InterfaceC3867E.b(b(request));
        }
    }

    InterfaceC3867E a(AbstractC3869G abstractC3869G);
}
