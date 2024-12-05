package o3;

import O5.I;
import O5.s;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: o3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3527i implements InterfaceC3529k {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f35911a;

    /* renamed from: o3.i$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35912a = new a();

        a() {
            super(1);
        }

        public final void a(HttpsURLConnection httpsURLConnection) {
            AbstractC3255y.i(httpsURLConnection, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((HttpsURLConnection) obj);
            return I.f8278a;
        }
    }

    public C3527i(Function1 configureSSL) {
        AbstractC3255y.i(configureSSL, "configureSSL");
        this.f35911a = configureSSL;
    }

    @Override // o3.InterfaceC3529k
    public Object a(String str, S5.d dVar) {
        Object b8;
        try {
            s.a aVar = O5.s.f8302b;
            URLConnection openConnection = new URL(str).openConnection();
            AbstractC3255y.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            if (httpURLConnection instanceof HttpsURLConnection) {
                this.f35911a.invoke(httpURLConnection);
            }
            httpURLConnection.getResponseCode();
            b8 = O5.s.b(httpURLConnection.getURL().toString());
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        if (O5.s.e(b8) == null) {
            return b8;
        }
        return str;
    }

    public C3527i() {
        this(a.f35912a);
    }
}
