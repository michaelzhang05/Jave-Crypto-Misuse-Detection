package O3;

import L5.r;
import L5.s;
import L5.x;
import M5.Q;
import c3.C1923i;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.C3683c;
import x2.InterfaceC3868F;
import x2.j;

/* loaded from: classes4.dex */
public final class b implements O3.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7773d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f7774e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f7775f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f7776g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f7777h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f7778i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f7779j;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3868F f7780a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.b f7781b;

    /* renamed from: c, reason: collision with root package name */
    private final j.b f7782c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            return "https://api.stripe.com/v1/" + str;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0164b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7783a;

        /* renamed from: c, reason: collision with root package name */
        int f7785c;

        C0164b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7783a = obj;
            this.f7785c |= Integer.MIN_VALUE;
            Object b8 = b.this.b(null, null, null, null, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7786a;

        /* renamed from: c, reason: collision with root package name */
        int f7788c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7786a = obj;
            this.f7788c |= Integer.MIN_VALUE;
            Object c8 = b.this.c(null, null, null, null, null, null, null, null, this);
            if (c8 == Q5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    static {
        a aVar = new a(null);
        f7773d = aVar;
        f7774e = aVar.b("consumers/accounts/sign_up");
        f7775f = aVar.b("consumers/sessions/lookup");
        f7776g = aVar.b("consumers/sessions/start_verification");
        f7777h = aVar.b("consumers/sessions/confirm_verification");
        f7778i = aVar.b("consumers/attach_link_consumer_to_link_account_session");
        f7779j = aVar.b("consumers/payment_details");
    }

    public b(InterfaceC3868F stripeNetworkClient, String apiVersion, String sdkVersion, C3683c c3683c) {
        AbstractC3159y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3159y.i(apiVersion, "apiVersion");
        AbstractC3159y.i(sdkVersion, "sdkVersion");
        this.f7780a = stripeNetworkClient;
        this.f7781b = new w2.b();
        this.f7782c = new j.b(c3683c, apiVersion, sdkVersion);
    }

    @Override // O3.a
    public Object a(String str, String str2, j.c cVar, P5.d dVar) {
        w2.b bVar = this.f7781b;
        InterfaceC3868F interfaceC3868F = this.f7780a;
        j.b bVar2 = this.f7782c;
        String str3 = f7775f;
        r a8 = x.a("request_surface", str2);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC3159y.h(lowerCase, "toLowerCase(...)");
        return x2.x.a(interfaceC3868F, bVar, j.b.d(bVar2, str3, cVar, Q.k(a8, x.a("email_address", lowerCase)), false, 8, null), new C1923i(), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // O3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r14, b3.InterfaceC1877l r15, java.lang.String r16, x2.j.c r17, P5.d r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            r2 = 1
            boolean r3 = r1 instanceof O3.b.C0164b
            if (r3 == 0) goto L17
            r3 = r1
            O3.b$b r3 = (O3.b.C0164b) r3
            int r4 = r3.f7785c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f7785c = r4
            goto L1c
        L17:
            O3.b$b r3 = new O3.b$b
            r3.<init>(r1)
        L1c:
            java.lang.Object r1 = r3.f7783a
            java.lang.Object r4 = Q5.b.e()
            int r5 = r3.f7785c
            if (r5 == 0) goto L3a
            if (r5 != r2) goto L32
            L5.t.b(r1)
            L5.s r1 = (L5.s) r1
            java.lang.Object r1 = r1.k()
            goto L87
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            L5.t.b(r1)
            w2.b r1 = r0.f7781b
            x2.F r5 = r0.f7780a
            x2.j$b r6 = r0.f7782c
            java.lang.String r7 = O3.b.f7779j
            java.lang.String r8 = "request_surface"
            r9 = r16
            L5.r r8 = L5.x.a(r8, r9)
            java.lang.String r9 = "consumer_session_client_secret"
            r10 = r14
            L5.r r9 = L5.x.a(r9, r14)
            java.util.Map r9 = M5.Q.e(r9)
            java.lang.String r10 = "credentials"
            L5.r r9 = L5.x.a(r10, r9)
            r10 = 2
            L5.r[] r10 = new L5.r[r10]
            r11 = 0
            r10[r11] = r8
            r10[r2] = r9
            java.util.Map r8 = M5.Q.k(r10)
            java.util.Map r9 = r15.y()
            java.util.Map r9 = M5.Q.q(r8, r9)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            x2.j r6 = x2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            c3.f r7 = c3.C1920f.f14914b
            r3.f7785c = r2
            java.lang.Object r1 = x2.x.b(r5, r1, r6, r7, r3)
            if (r1 != r4) goto L87
            return r4
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.b.b(java.lang.String, b3.l, java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // O3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.Locale r22, java.lang.String r23, b3.r r24, x2.j.c r25, P5.d r26) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.b.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Locale, java.lang.String, b3.r, x2.j$c, P5.d):java.lang.Object");
    }
}
