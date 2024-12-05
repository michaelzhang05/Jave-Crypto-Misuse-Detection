package R3;

import A2.F;
import A2.j;
import O5.r;
import O5.s;
import O5.x;
import P5.Q;
import f3.C2833i;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import u2.C4056c;

/* loaded from: classes4.dex */
public final class b implements R3.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9629d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f9630e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f9631f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f9632g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f9633h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f9634i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f9635j;

    /* renamed from: a, reason: collision with root package name */
    private final F f9636a;

    /* renamed from: b, reason: collision with root package name */
    private final z2.b f9637b;

    /* renamed from: c, reason: collision with root package name */
    private final j.b f9638c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            return "https://api.stripe.com/v1/" + str;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0193b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9639a;

        /* renamed from: c, reason: collision with root package name */
        int f9641c;

        C0193b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9639a = obj;
            this.f9641c |= Integer.MIN_VALUE;
            Object b8 = b.this.b(null, null, null, null, this);
            if (b8 == T5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9642a;

        /* renamed from: c, reason: collision with root package name */
        int f9644c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9642a = obj;
            this.f9644c |= Integer.MIN_VALUE;
            Object a8 = b.this.a(null, null, null, null, null, null, null, null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    static {
        a aVar = new a(null);
        f9629d = aVar;
        f9630e = aVar.b("consumers/accounts/sign_up");
        f9631f = aVar.b("consumers/sessions/lookup");
        f9632g = aVar.b("consumers/sessions/start_verification");
        f9633h = aVar.b("consumers/sessions/confirm_verification");
        f9634i = aVar.b("consumers/attach_link_consumer_to_link_account_session");
        f9635j = aVar.b("consumers/payment_details");
    }

    public b(F stripeNetworkClient, String apiVersion, String sdkVersion, C4056c c4056c) {
        AbstractC3255y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3255y.i(apiVersion, "apiVersion");
        AbstractC3255y.i(sdkVersion, "sdkVersion");
        this.f9636a = stripeNetworkClient;
        this.f9637b = new z2.b();
        this.f9638c = new j.b(c4056c, apiVersion, sdkVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // R3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.Locale r22, java.lang.String r23, e3.r r24, A2.j.c r25, S5.d r26) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Locale, java.lang.String, e3.r, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // R3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r14, e3.InterfaceC2798l r15, java.lang.String r16, A2.j.c r17, S5.d r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            r2 = 1
            boolean r3 = r1 instanceof R3.b.C0193b
            if (r3 == 0) goto L17
            r3 = r1
            R3.b$b r3 = (R3.b.C0193b) r3
            int r4 = r3.f9641c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f9641c = r4
            goto L1c
        L17:
            R3.b$b r3 = new R3.b$b
            r3.<init>(r1)
        L1c:
            java.lang.Object r1 = r3.f9639a
            java.lang.Object r4 = T5.b.e()
            int r5 = r3.f9641c
            if (r5 == 0) goto L3a
            if (r5 != r2) goto L32
            O5.t.b(r1)
            O5.s r1 = (O5.s) r1
            java.lang.Object r1 = r1.j()
            goto L87
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            O5.t.b(r1)
            z2.b r1 = r0.f9637b
            A2.F r5 = r0.f9636a
            A2.j$b r6 = r0.f9638c
            java.lang.String r7 = R3.b.f9635j
            java.lang.String r8 = "request_surface"
            r9 = r16
            O5.r r8 = O5.x.a(r8, r9)
            java.lang.String r9 = "consumer_session_client_secret"
            r10 = r14
            O5.r r9 = O5.x.a(r9, r14)
            java.util.Map r9 = P5.Q.e(r9)
            java.lang.String r10 = "credentials"
            O5.r r9 = O5.x.a(r10, r9)
            r10 = 2
            O5.r[] r10 = new O5.r[r10]
            r11 = 0
            r10[r11] = r8
            r10[r2] = r9
            java.util.Map r8 = P5.Q.k(r10)
            java.util.Map r9 = r15.B()
            java.util.Map r9 = P5.Q.q(r8, r9)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            A2.j r6 = A2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            f3.f r7 = f3.C2830f.f31889b
            r3.f9641c = r2
            java.lang.Object r1 = A2.x.b(r5, r1, r6, r7, r3)
            if (r1 != r4) goto L87
            return r4
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.b(java.lang.String, e3.l, java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    @Override // R3.a
    public Object c(String str, String str2, j.c cVar, S5.d dVar) {
        z2.b bVar = this.f9637b;
        F f8 = this.f9636a;
        j.b bVar2 = this.f9638c;
        String str3 = f9631f;
        r a8 = x.a("request_surface", str2);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC3255y.h(lowerCase, "toLowerCase(...)");
        return A2.x.a(f8, bVar, j.b.d(bVar2, str3, cVar, Q.k(a8, x.a("email_address", lowerCase)), false, 8, null), new C2833i(), dVar);
    }
}
