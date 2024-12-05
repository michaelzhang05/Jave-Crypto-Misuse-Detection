package i3;

import L5.s;
import M5.AbstractC1246t;
import e3.m;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2778a {

    /* renamed from: b, reason: collision with root package name */
    private static final C0758a f31564b = new C0758a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f31565c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final List f31566d = AbstractC1246t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final m f31567a;

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0758a {
        private C0758a() {
        }

        public /* synthetic */ C0758a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31568a;

        /* renamed from: c, reason: collision with root package name */
        int f31570c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31568a = obj;
            this.f31570c |= Integer.MIN_VALUE;
            Object a8 = C2778a.this.a(null, null, null, null, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31571a;

        /* renamed from: c, reason: collision with root package name */
        int f31573c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31571a = obj;
            this.f31573c |= Integer.MIN_VALUE;
            Object b8 = C2778a.this.b(null, null, null, null, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    public C2778a(m stripeRepository) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        this.f31567a = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|8|(1:(1:11)(2:16|17))(7:18|19|20|21|(2:23|(1:25))|26|27)|12|14))|33|6|7|8|(0)(0)|12|14) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r2 = L5.s.f6511b;
        r0 = L5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, P5.d r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof i3.C2778a.b
            if (r2 == 0) goto L18
            r2 = r0
            i3.a$b r2 = (i3.C2778a.b) r2
            int r3 = r2.f31570c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f31570c = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            i3.a$b r2 = new i3.a$b
            r2.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.f31568a
            java.lang.Object r2 = Q5.b.e()
            int r3 = r9.f31570c
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            L5.s r0 = (L5.s) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L35
            goto L89
        L35:
            r0 = move-exception
            goto L93
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            L5.t.b(r0)
            L5.s$a r0 = L5.s.f6511b     // Catch: java.lang.Throwable -> L50
            com.stripe.android.model.n$c r0 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L50
            r3 = r19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r0 = move-exception
            L5.s$a r3 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
            java.lang.Object r0 = L5.s.b(r0)
        L5b:
            boolean r3 = L5.s.h(r0)
            if (r3 == 0) goto L99
            com.stripe.android.model.n$c r0 = (com.stripe.android.model.n.c) r0     // Catch: java.lang.Throwable -> L35
            e3.m r3 = r1.f31567a     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.c()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L35
            x2.j$c r7 = new x2.j$c     // Catch: java.lang.Throwable -> L35
            r14 = 4
            r15 = 0
            r13 = 0
            r10 = r7
            r11 = r17
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L35
            java.util.List r8 = i3.C2778a.f31566d     // Catch: java.lang.Throwable -> L35
            r9.f31570c = r4     // Catch: java.lang.Throwable -> L35
            r4 = r5
            r5 = r0
            r6 = r18
            java.lang.Object r0 = r3.k(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L35
            if (r0 != r2) goto L89
            return r2
        L89:
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            com.stripe.android.model.n r0 = (com.stripe.android.model.n) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L93:
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
        L99:
            java.lang.Object r0 = L5.s.b(r0)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2778a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|8|(1:(1:11)(2:16|17))(7:18|19|20|21|(2:23|(1:25))|26|27)|12|14))|33|6|7|8|(0)(0)|12|14) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r2 = L5.s.f6511b;
        r0 = L5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, P5.d r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof i3.C2778a.c
            if (r2 == 0) goto L18
            r2 = r0
            i3.a$c r2 = (i3.C2778a.c) r2
            int r3 = r2.f31573c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f31573c = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            i3.a$c r2 = new i3.a$c
            r2.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.f31571a
            java.lang.Object r2 = Q5.b.e()
            int r3 = r9.f31573c
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            L5.s r0 = (L5.s) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L35
            goto L89
        L35:
            r0 = move-exception
            goto L93
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            L5.t.b(r0)
            L5.s$a r0 = L5.s.f6511b     // Catch: java.lang.Throwable -> L50
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L50
            r3 = r19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r0 = move-exception
            L5.s$a r3 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
            java.lang.Object r0 = L5.s.b(r0)
        L5b:
            boolean r3 = L5.s.h(r0)
            if (r3 == 0) goto L99
            com.stripe.android.model.u$b r0 = (com.stripe.android.model.u.b) r0     // Catch: java.lang.Throwable -> L35
            e3.m r3 = r1.f31567a     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.c()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L35
            x2.j$c r7 = new x2.j$c     // Catch: java.lang.Throwable -> L35
            r14 = 4
            r15 = 0
            r13 = 0
            r10 = r7
            r11 = r17
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L35
            java.util.List r8 = i3.C2778a.f31566d     // Catch: java.lang.Throwable -> L35
            r9.f31573c = r4     // Catch: java.lang.Throwable -> L35
            r4 = r5
            r5 = r0
            r6 = r18
            java.lang.Object r0 = r3.c(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L35
            if (r0 != r2) goto L89
            return r2
        L89:
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            com.stripe.android.model.u r0 = (com.stripe.android.model.u) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L93:
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
        L99:
            java.lang.Object r0 = L5.s.b(r0)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2778a.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, P5.d):java.lang.Object");
    }
}
