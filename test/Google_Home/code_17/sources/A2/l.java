package A2;

import A2.E;
import A2.G;
import O5.I;
import a6.InterfaceC1668n;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public interface l {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f196a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f197b;

        /* renamed from: c, reason: collision with root package name */
        private static final int f198c;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f197b = (int) timeUnit.toMillis(30L);
            f198c = (int) timeUnit.toMillis(80L);
        }

        private a() {
        }
    }

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f199a = new a();

            private a() {
            }

            @Override // A2.l.b
            public HttpsURLConnection a(G request, InterfaceC1668n callback) {
                AbstractC3255y.i(request, "request");
                AbstractC3255y.i(callback, "callback");
                URLConnection openConnection = new URL(request.f()).openConnection();
                AbstractC3255y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                callback.invoke(httpsURLConnection, request);
                return httpsURLConnection;
            }
        }

        HttpsURLConnection a(G g8, InterfaceC1668n interfaceC1668n);
    }

    /* loaded from: classes4.dex */
    public static final class c implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f200a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static volatile b f201b = b.a.f199a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f202a = new a();

            a() {
                super(2);
            }

            public final void a(HttpURLConnection open, G request) {
                AbstractC3255y.i(open, "$this$open");
                AbstractC3255y.i(request, "request");
                open.setConnectTimeout(a.f197b);
                open.setReadTimeout(a.f198c);
                open.setUseCaches(request.e());
                open.setRequestMethod(request.b().b());
                for (Map.Entry entry : request.a().entrySet()) {
                    open.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (G.a.f118c == request.b()) {
                    open.setDoOutput(true);
                    Map c8 = request.c();
                    if (c8 != null) {
                        for (Map.Entry entry2 : c8.entrySet()) {
                            open.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    OutputStream outputStream = open.getOutputStream();
                    try {
                        AbstractC3255y.f(outputStream);
                        request.g(outputStream);
                        I i8 = I.f8278a;
                        Y5.b.a(outputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Y5.b.a(outputStream, th);
                            throw th2;
                        }
                    }
                }
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((HttpURLConnection) obj, (G) obj2);
                return I.f8278a;
            }
        }

        private c() {
        }

        private final HttpsURLConnection b(G g8) {
            return f201b.a(g8, a.f202a);
        }

        @Override // A2.l
        public /* synthetic */ E a(G request) {
            AbstractC3255y.i(request, "request");
            return new E.b(b(request));
        }
    }

    E a(G g8);
}
