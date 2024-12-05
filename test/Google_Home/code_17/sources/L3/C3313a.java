package l3;

import O5.s;
import P5.AbstractC1378t;
import h3.m;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3313a {

    /* renamed from: b, reason: collision with root package name */
    private static final C0788a f34416b = new C0788a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34417c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final List f34418d = AbstractC1378t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final m f34419a;

    /* renamed from: l3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0788a {
        private C0788a() {
        }

        public /* synthetic */ C0788a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34420a;

        /* renamed from: c, reason: collision with root package name */
        int f34422c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34420a = obj;
            this.f34422c |= Integer.MIN_VALUE;
            Object a8 = C3313a.this.a(null, null, null, null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34423a;

        /* renamed from: c, reason: collision with root package name */
        int f34425c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34423a = obj;
            this.f34425c |= Integer.MIN_VALUE;
            Object b8 = C3313a.this.b(null, null, null, null, this);
            if (b8 == T5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    public C3313a(m stripeRepository) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        this.f34419a = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|8|(1:(1:11)(2:16|17))(7:18|19|20|21|(2:23|(1:25))|26|27)|12|14))|33|6|7|8|(0)(0)|12|14) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r2 = O5.s.f8302b;
        r0 = O5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, S5.d r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof l3.C3313a.b
            if (r2 == 0) goto L18
            r2 = r0
            l3.a$b r2 = (l3.C3313a.b) r2
            int r3 = r2.f34422c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f34422c = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            l3.a$b r2 = new l3.a$b
            r2.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.f34420a
            java.lang.Object r2 = T5.b.e()
            int r3 = r9.f34422c
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            O5.s r0 = (O5.s) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L35
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
            O5.t.b(r0)
            O5.s$a r0 = O5.s.f8302b     // Catch: java.lang.Throwable -> L50
            com.stripe.android.model.n$c r0 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L50
            r3 = r19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r0 = move-exception
            O5.s$a r3 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
            java.lang.Object r0 = O5.s.b(r0)
        L5b:
            boolean r3 = O5.s.h(r0)
            if (r3 == 0) goto L99
            com.stripe.android.model.n$c r0 = (com.stripe.android.model.n.c) r0     // Catch: java.lang.Throwable -> L35
            h3.m r3 = r1.f34419a     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.c()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L35
            A2.j$c r7 = new A2.j$c     // Catch: java.lang.Throwable -> L35
            r14 = 4
            r15 = 0
            r13 = 0
            r10 = r7
            r11 = r17
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L35
            java.util.List r8 = l3.C3313a.f34418d     // Catch: java.lang.Throwable -> L35
            r9.f34422c = r4     // Catch: java.lang.Throwable -> L35
            r4 = r5
            r5 = r0
            r6 = r18
            java.lang.Object r0 = r3.j(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L35
            if (r0 != r2) goto L89
            return r2
        L89:
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            com.stripe.android.model.n r0 = (com.stripe.android.model.n) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L93:
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
        L99:
            java.lang.Object r0 = O5.s.b(r0)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3313a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|8|(1:(1:11)(2:16|17))(7:18|19|20|21|(2:23|(1:25))|26|27)|12|14))|33|6|7|8|(0)(0)|12|14) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r2 = O5.s.f8302b;
        r0 = O5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, S5.d r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof l3.C3313a.c
            if (r2 == 0) goto L18
            r2 = r0
            l3.a$c r2 = (l3.C3313a.c) r2
            int r3 = r2.f34425c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f34425c = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            l3.a$c r2 = new l3.a$c
            r2.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.f34423a
            java.lang.Object r2 = T5.b.e()
            int r3 = r9.f34425c
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            O5.s r0 = (O5.s) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L35
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
            O5.t.b(r0)
            O5.s$a r0 = O5.s.f8302b     // Catch: java.lang.Throwable -> L50
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L50
            r3 = r19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r0 = move-exception
            O5.s$a r3 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
            java.lang.Object r0 = O5.s.b(r0)
        L5b:
            boolean r3 = O5.s.h(r0)
            if (r3 == 0) goto L99
            com.stripe.android.model.u$b r0 = (com.stripe.android.model.u.b) r0     // Catch: java.lang.Throwable -> L35
            h3.m r3 = r1.f34419a     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.c()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L35
            A2.j$c r7 = new A2.j$c     // Catch: java.lang.Throwable -> L35
            r14 = 4
            r15 = 0
            r13 = 0
            r10 = r7
            r11 = r17
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L35
            java.util.List r8 = l3.C3313a.f34418d     // Catch: java.lang.Throwable -> L35
            r9.f34425c = r4     // Catch: java.lang.Throwable -> L35
            r4 = r5
            r5 = r0
            r6 = r18
            java.lang.Object r0 = r3.c(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L35
            if (r0 != r2) goto L89
            return r2
        L89:
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            com.stripe.android.model.u r0 = (com.stripe.android.model.u) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L93:
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
        L99:
            java.lang.Object r0 = O5.s.b(r0)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3313a.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, S5.d):java.lang.Object");
    }
}
