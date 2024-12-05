package com.stripe.android.stripe3ds2.transaction;

import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import androidx.browser.trusted.sharing.ShareTarget;
import j6.C3205d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;

/* loaded from: classes4.dex */
public final class r implements a4.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f27981a;

    /* renamed from: b, reason: collision with root package name */
    private final a f27982b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.c f27983c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.g f27984d;

    /* loaded from: classes4.dex */
    public interface a {
        HttpURLConnection a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements a {
        @Override // com.stripe.android.stripe3ds2.transaction.r.a
        public HttpURLConnection a(String url) {
            AbstractC3255y.i(url, "url");
            URLConnection openConnection = new URL(url).openConnection();
            AbstractC3255y.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) openConnection;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27985a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27986b;

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            c cVar = new c(dVar);
            cVar.f27986b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            InputStream inputStream;
            T5.b.e();
            if (this.f27985a == 0) {
                t.b(obj);
                r rVar = r.this;
                try {
                    s.a aVar = s.f8302b;
                    HttpURLConnection f8 = rVar.f();
                    f8.connect();
                    if (f8.getResponseCode() == 200) {
                        inputStream = f8.getInputStream();
                    } else {
                        inputStream = null;
                    }
                    b8 = s.b(inputStream);
                } catch (Throwable th) {
                    s.a aVar2 = s.f8302b;
                    b8 = s.b(t.a(th));
                }
                r rVar2 = r.this;
                Throwable e8 = s.e(b8);
                if (e8 != null) {
                    rVar2.f27983c.l(e8);
                }
                if (s.g(b8)) {
                    return null;
                }
                return b8;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27988a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27989b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27991d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f27992e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, S5.d dVar) {
            super(2, dVar);
            this.f27991d = str;
            this.f27992e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(this.f27991d, this.f27992e, dVar);
            dVar2.f27989b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            T5.b.e();
            if (this.f27988a == 0) {
                t.b(obj);
                r rVar = r.this;
                String str = this.f27991d;
                String str2 = this.f27992e;
                try {
                    s.a aVar = s.f8302b;
                    b8 = s.b(rVar.i(str, str2));
                } catch (Throwable th) {
                    s.a aVar2 = s.f8302b;
                    b8 = s.b(t.a(th));
                }
                r rVar2 = r.this;
                Throwable e8 = s.e(b8);
                if (e8 != null) {
                    rVar2.f27983c.l(e8);
                }
                Throwable e9 = s.e(b8);
                if (e9 == null) {
                    return b8;
                }
                throw new U3.b(e9);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public r(String url, a connectionFactory, X3.c errorReporter, S5.g workContext) {
        AbstractC3255y.i(url, "url");
        AbstractC3255y.i(connectionFactory, "connectionFactory");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        this.f27981a = url;
        this.f27982b = connectionFactory;
        this.f27983c = errorReporter;
        this.f27984d = workContext;
    }

    private final HttpURLConnection e() {
        return this.f27982b.a(this.f27981a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpURLConnection f() {
        HttpURLConnection e8 = e();
        e8.setDoInput(true);
        return e8;
    }

    private final HttpURLConnection g(String str, String str2) {
        HttpURLConnection e8 = e();
        e8.setRequestMethod(ShareTarget.METHOD_POST);
        e8.setDoOutput(true);
        e8.setRequestProperty("Content-Type", str2);
        e8.setRequestProperty("Content-Length", String.valueOf(str.length()));
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a4.l i(String str, String str2) {
        HttpURLConnection g8 = g(str, str2);
        OutputStream outputStream = g8.getOutputStream();
        try {
            AbstractC3255y.f(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC3255y.h(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.flush();
                I i8 = I.f8278a;
                Y5.b.a(outputStreamWriter, null);
                Y5.b.a(outputStream, null);
                g8.connect();
                return k(g8);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Y5.b.a(outputStream, th);
                throw th2;
            }
        }
    }

    private final String j(InputStream inputStream) {
        Object b8;
        Object obj = null;
        try {
            s.a aVar = s.f8302b;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C3205d.f34020b), 8192);
            try {
                String f8 = Y5.i.f(bufferedReader);
                Y5.b.a(bufferedReader, null);
                b8 = s.b(f8);
            } finally {
            }
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        if (!s.g(b8)) {
            obj = b8;
        }
        String str = (String) obj;
        if (str == null) {
            return "";
        }
        return str;
    }

    private final boolean l(int i8) {
        return 200 <= i8 && i8 < 300;
    }

    @Override // a4.k
    public Object a(String str, String str2, S5.d dVar) {
        return AbstractC3360i.g(this.f27984d, new d(str, str2, null), dVar);
    }

    public Object h(S5.d dVar) {
        return AbstractC3360i.g(this.f27984d, new c(null), dVar);
    }

    public final a4.l k(HttpURLConnection conn) {
        AbstractC3255y.i(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (l(responseCode)) {
            InputStream inputStream = conn.getInputStream();
            AbstractC3255y.h(inputStream, "getInputStream(...)");
            return new a4.l(j(inputStream), conn.getContentType());
        }
        throw new U3.b("Unsuccessful response code from " + this.f27981a + ": " + responseCode, null, 2, null);
    }

    public /* synthetic */ r(String str, a aVar, X3.c cVar, S5.g gVar, int i8, AbstractC3247p abstractC3247p) {
        this(str, (i8 & 2) != 0 ? new b() : aVar, cVar, gVar);
    }
}
