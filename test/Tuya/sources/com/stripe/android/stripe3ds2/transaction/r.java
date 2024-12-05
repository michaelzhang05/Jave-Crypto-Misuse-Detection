package com.stripe.android.stripe3ds2.transaction;

import L5.I;
import L5.s;
import L5.t;
import androidx.browser.trusted.sharing.ShareTarget;
import g6.C2728d;
import i6.AbstractC2825i;
import i6.M;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class r implements X3.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f26926a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26927b;

    /* renamed from: c, reason: collision with root package name */
    private final U3.c f26928c;

    /* renamed from: d, reason: collision with root package name */
    private final P5.g f26929d;

    /* loaded from: classes4.dex */
    public interface a {
        HttpURLConnection a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements a {
        @Override // com.stripe.android.stripe3ds2.transaction.r.a
        public HttpURLConnection a(String url) {
            AbstractC3159y.i(url, "url");
            URLConnection openConnection = new URL(url).openConnection();
            AbstractC3159y.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) openConnection;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26930a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26931b;

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            c cVar = new c(dVar);
            cVar.f26931b = obj;
            return cVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            InputStream inputStream;
            Q5.b.e();
            if (this.f26930a == 0) {
                t.b(obj);
                r rVar = r.this;
                try {
                    s.a aVar = s.f6511b;
                    HttpURLConnection f8 = rVar.f();
                    f8.connect();
                    if (f8.getResponseCode() == 200) {
                        inputStream = f8.getInputStream();
                    } else {
                        inputStream = null;
                    }
                    b8 = s.b(inputStream);
                } catch (Throwable th) {
                    s.a aVar2 = s.f6511b;
                    b8 = s.b(t.a(th));
                }
                r rVar2 = r.this;
                Throwable e8 = s.e(b8);
                if (e8 != null) {
                    rVar2.f26928c.i(e8);
                }
                if (s.g(b8)) {
                    return null;
                }
                return b8;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26933a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26934b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26936d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26937e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, P5.d dVar) {
            super(2, dVar);
            this.f26936d = str;
            this.f26937e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(this.f26936d, this.f26937e, dVar);
            dVar2.f26934b = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Q5.b.e();
            if (this.f26933a == 0) {
                t.b(obj);
                r rVar = r.this;
                String str = this.f26936d;
                String str2 = this.f26937e;
                try {
                    s.a aVar = s.f6511b;
                    b8 = s.b(rVar.i(str, str2));
                } catch (Throwable th) {
                    s.a aVar2 = s.f6511b;
                    b8 = s.b(t.a(th));
                }
                r rVar2 = r.this;
                Throwable e8 = s.e(b8);
                if (e8 != null) {
                    rVar2.f26928c.i(e8);
                }
                Throwable e9 = s.e(b8);
                if (e9 == null) {
                    return b8;
                }
                throw new R3.b(e9);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public r(String url, a connectionFactory, U3.c errorReporter, P5.g workContext) {
        AbstractC3159y.i(url, "url");
        AbstractC3159y.i(connectionFactory, "connectionFactory");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        this.f26926a = url;
        this.f26927b = connectionFactory;
        this.f26928c = errorReporter;
        this.f26929d = workContext;
    }

    private final HttpURLConnection e() {
        return this.f26927b.a(this.f26926a);
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
    public final X3.l i(String str, String str2) {
        HttpURLConnection g8 = g(str, str2);
        OutputStream outputStream = g8.getOutputStream();
        try {
            AbstractC3159y.f(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC3159y.h(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.flush();
                I i8 = I.f6487a;
                V5.b.a(outputStreamWriter, null);
                V5.b.a(outputStream, null);
                g8.connect();
                return k(g8);
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

    private final String j(InputStream inputStream) {
        Object b8;
        Object obj = null;
        try {
            s.a aVar = s.f6511b;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C2728d.f31293b), 8192);
            try {
                String f8 = V5.i.f(bufferedReader);
                V5.b.a(bufferedReader, null);
                b8 = s.b(f8);
            } finally {
            }
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
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

    @Override // X3.k
    public Object a(String str, String str2, P5.d dVar) {
        return AbstractC2825i.g(this.f26929d, new d(str, str2, null), dVar);
    }

    public Object h(P5.d dVar) {
        return AbstractC2825i.g(this.f26929d, new c(null), dVar);
    }

    public final X3.l k(HttpURLConnection conn) {
        AbstractC3159y.i(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (l(responseCode)) {
            InputStream inputStream = conn.getInputStream();
            AbstractC3159y.h(inputStream, "getInputStream(...)");
            return new X3.l(j(inputStream), conn.getContentType());
        }
        throw new R3.b("Unsuccessful response code from " + this.f26926a + ": " + responseCode, null, 2, null);
    }

    public /* synthetic */ r(String str, a aVar, U3.c cVar, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? new b() : aVar, cVar, gVar);
    }
}
