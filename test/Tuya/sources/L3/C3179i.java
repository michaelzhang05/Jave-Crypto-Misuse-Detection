package l3;

import L5.I;
import L5.s;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: l3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3179i implements InterfaceC3181k {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f33910a;

    /* renamed from: l3.i$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33911a = new a();

        a() {
            super(1);
        }

        public final void a(HttpsURLConnection httpsURLConnection) {
            AbstractC3159y.i(httpsURLConnection, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((HttpsURLConnection) obj);
            return I.f6487a;
        }
    }

    public C3179i(Function1 configureSSL) {
        AbstractC3159y.i(configureSSL, "configureSSL");
        this.f33910a = configureSSL;
    }

    @Override // l3.InterfaceC3181k
    public Object a(String str, P5.d dVar) {
        Object b8;
        try {
            s.a aVar = L5.s.f6511b;
            URLConnection openConnection = new URL(str).openConnection();
            AbstractC3159y.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            if (httpURLConnection instanceof HttpsURLConnection) {
                this.f33910a.invoke(httpURLConnection);
            }
            httpURLConnection.getResponseCode();
            b8 = L5.s.b(httpURLConnection.getURL().toString());
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        if (L5.s.e(b8) == null) {
            return b8;
        }
        return str;
    }

    public C3179i() {
        this(a.f33911a);
    }
}
