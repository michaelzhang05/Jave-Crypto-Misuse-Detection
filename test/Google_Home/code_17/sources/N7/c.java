package N7;

import O5.I;
import O5.t;
import Y5.i;
import a6.InterfaceC1668n;
import android.graphics.BitmapFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes5.dex */
public final class c implements N7.b {

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f7786a;

        /* renamed from: c, reason: collision with root package name */
        public int f7788c;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7786a = obj;
            this.f7788c |= Integer.MIN_VALUE;
            return c.this.b(null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7789a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, S5.d dVar) {
            super(2, dVar);
            this.f7789a = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f7789a, dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new b(this.f7789a, (S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            t.b(obj);
            URLConnection openConnection = new URL(this.f7789a).openConnection();
            if (openConnection != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((HttpURLConnection) openConnection).getInputStream()));
                try {
                    String f8 = i.f(bufferedReader);
                    Y5.b.a(bufferedReader, null);
                    return f8;
                } finally {
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
        }
    }

    /* renamed from: N7.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0142c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f7790a;

        /* renamed from: c, reason: collision with root package name */
        public int f7792c;

        public C0142c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7790a = obj;
            this.f7792c |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7793a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, S5.d dVar) {
            super(2, dVar);
            this.f7793a = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f7793a, dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new d(this.f7793a, (S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            t.b(obj);
            return BitmapFactory.decodeStream(new URL(this.f7793a).openConnection().getInputStream());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // N7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r12, S5.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof N7.c.C0142c
            if (r0 == 0) goto L13
            r0 = r13
            N7.c$c r0 = (N7.c.C0142c) r0
            int r1 = r0.f7792c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7792c = r1
            goto L18
        L13:
            N7.c$c r0 = new N7.c$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f7790a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f7792c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r13)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r12 = move-exception
            r9 = r12
            goto L52
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            O5.t.b(r13)
            l6.I r13 = l6.C3347b0.b()     // Catch: java.lang.Exception -> L29
            N7.c$d r2 = new N7.c$d     // Catch: java.lang.Exception -> L29
            r4 = 0
            r2.<init>(r12, r4)     // Catch: java.lang.Exception -> L29
            r0.f7792c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r13 = l6.AbstractC3360i.g(r13, r2, r0)     // Catch: java.lang.Exception -> L29
            if (r13 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r12 = "url: String): Bitmap {\n …}\n            }\n        }"
            kotlin.jvm.internal.AbstractC3255y.h(r13, r12)     // Catch: java.lang.Exception -> L29
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13     // Catch: java.lang.Exception -> L29
            return r13
        L52:
            boolean r12 = r9 instanceof java.security.cert.CertificateException
            if (r12 == 0) goto L58
            r12 = 1
            goto L5a
        L58:
            boolean r12 = r9 instanceof javax.net.ssl.SSLHandshakeException
        L5a:
            if (r12 == 0) goto L5e
            r12 = 1
            goto L60
        L5e:
            boolean r12 = r9 instanceof java.net.SocketException
        L60:
            if (r12 == 0) goto L64
            r12 = 1
            goto L66
        L64:
            boolean r12 = r9 instanceof java.net.MalformedURLException
        L66:
            if (r12 == 0) goto L69
            goto L6b
        L69:
            boolean r3 = r9 instanceof java.lang.NullPointerException
        L6b:
            if (r3 != 0) goto L77
            boolean r12 = r9 instanceof java.io.FileNotFoundException
            if (r12 == 0) goto L74
            com.inmobi.cmp.model.ChoiceError r12 = com.inmobi.cmp.model.ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR
            goto L79
        L74:
            com.inmobi.cmp.model.ChoiceError r12 = com.inmobi.cmp.model.ChoiceError.NETWORK_UNEXPECTED_ERROR
            goto L79
        L77:
            com.inmobi.cmp.model.ChoiceError r12 = com.inmobi.cmp.model.ChoiceError.FAILED_LOGO_DOWNLOAD
        L79:
            y5.b r4 = y5.C4209b.f41007a
            r8 = 0
            r10 = 14
            r6 = 0
            r7 = 0
            r5 = r12
            y5.C4209b.b(r4, r5, r6, r7, r8, r9, r10)
            y5.a r13 = new y5.a
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.c.a(java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // N7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, S5.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof N7.c.a
            if (r0 == 0) goto L13
            r0 = r13
            N7.c$a r0 = (N7.c.a) r0
            int r1 = r0.f7788c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7788c = r1
            goto L18
        L13:
            N7.c$a r0 = new N7.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f7786a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f7788c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r13)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r12 = move-exception
            r9 = r12
            goto L4d
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            O5.t.b(r13)
            l6.I r13 = l6.C3347b0.b()     // Catch: java.lang.Exception -> L29
            N7.c$b r2 = new N7.c$b     // Catch: java.lang.Exception -> L29
            r4 = 0
            r2.<init>(r12, r4)     // Catch: java.lang.Exception -> L29
            r0.f7788c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r13 = l6.AbstractC3360i.g(r13, r2, r0)     // Catch: java.lang.Exception -> L29
            if (r13 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Exception -> L29
            return r13
        L4d:
            boolean r12 = r9 instanceof java.security.cert.CertificateException
            if (r12 == 0) goto L53
            r12 = 1
            goto L55
        L53:
            boolean r12 = r9 instanceof javax.net.ssl.SSLHandshakeException
        L55:
            if (r12 == 0) goto L59
            r12 = 1
            goto L5b
        L59:
            boolean r12 = r9 instanceof java.net.SocketException
        L5b:
            if (r12 == 0) goto L5f
            r12 = 1
            goto L61
        L5f:
            boolean r12 = r9 instanceof java.net.MalformedURLException
        L61:
            if (r12 == 0) goto L64
            goto L66
        L64:
            boolean r3 = r9 instanceof java.lang.NullPointerException
        L66:
            if (r3 != 0) goto L72
            boolean r12 = r9 instanceof java.io.FileNotFoundException
            if (r12 == 0) goto L6f
            com.inmobi.cmp.model.ChoiceError r12 = com.inmobi.cmp.model.ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR
            goto L74
        L6f:
            com.inmobi.cmp.model.ChoiceError r12 = com.inmobi.cmp.model.ChoiceError.NETWORK_UNEXPECTED_ERROR
            goto L74
        L72:
            com.inmobi.cmp.model.ChoiceError r12 = com.inmobi.cmp.model.ChoiceError.NETWORK_CALL_FAILED
        L74:
            y5.b r4 = y5.C4209b.f41007a
            r8 = 0
            r10 = 14
            r6 = 0
            r7 = 0
            r5 = r12
            y5.C4209b.b(r4, r5, r6, r7, r8, r9, r10)
            y5.a r13 = new y5.a
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.c.b(java.lang.String, S5.d):java.lang.Object");
    }
}