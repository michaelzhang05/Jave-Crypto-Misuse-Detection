package l3;

import O5.p;
import O5.s;
import com.stripe.android.model.d;
import h3.m;
import j3.InterfaceC3189a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3314b {

    /* renamed from: a, reason: collision with root package name */
    private final m f34426a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34427a;

        /* renamed from: c, reason: collision with root package name */
        int f34429c;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34427a = obj;
            this.f34429c |= Integer.MIN_VALUE;
            Object a8 = C3314b.this.a(null, null, null, null, null, null, null, null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0789b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34430a;

        /* renamed from: c, reason: collision with root package name */
        int f34432c;

        C0789b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34430a = obj;
            this.f34432c |= Integer.MIN_VALUE;
            Object b8 = C3314b.this.b(null, null, null, null, null, this);
            if (b8 == T5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34433a;

        /* renamed from: c, reason: collision with root package name */
        int f34435c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34433a = obj;
            this.f34435c |= Integer.MIN_VALUE;
            Object c8 = C3314b.this.c(null, null, null, null, null, this);
            if (c8 == T5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    public C3314b(m stripeRepository) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        this.f34426a = stripeRepository;
    }

    private final com.stripe.android.model.d d(InterfaceC3189a interfaceC3189a, String str, String str2) {
        if (interfaceC3189a instanceof InterfaceC3189a.b) {
            InterfaceC3189a.b bVar = (InterfaceC3189a.b) interfaceC3189a;
            return new d.b(str, bVar.b(), bVar.a(), str2);
        }
        if (interfaceC3189a instanceof InterfaceC3189a.C0772a) {
            return new d.a(str, ((InterfaceC3189a.C0772a) interfaceC3189a).a(), str2);
        }
        throw new p();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.String r25, S5.d r26) {
        /*
            r17 = this;
            r0 = r17
            r1 = r26
            boolean r2 = r1 instanceof l3.C3314b.a
            if (r2 == 0) goto L17
            r2 = r1
            l3.b$a r2 = (l3.C3314b.a) r2
            int r3 = r2.f34429c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f34429c = r3
            goto L1c
        L17:
            l3.b$a r2 = new l3.b$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f34427a
            java.lang.Object r3 = T5.b.e()
            int r4 = r2.f34429c
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            O5.t.b(r1)
            O5.s r1 = (O5.s) r1
            java.lang.Object r1 = r1.j()
            goto L72
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            O5.t.b(r1)
            h3.m r1 = r0.f34426a
            e3.L r11 = e3.L.f31384b
            e3.s r4 = new e3.s
            r9 = 0
            r10 = 0
            r8 = 0
            r6 = r4
            r7 = r20
            r12 = r23
            r13 = r21
            r14 = r22
            r15 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            A2.j$c r6 = new A2.j$c
            r7 = 4
            r20 = r6
            r21 = r18
            r22 = r19
            r23 = r9
            r24 = r7
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            r2.f34429c = r5
            java.lang.Object r1 = r1.w(r4, r6, r2)
            if (r1 != r3) goto L72
            return r3
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3314b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(7:17|18|19|20|(2:22|(1:24))|25|26)|11|13))|32|6|7|(0)(0)|11|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        r2 = O5.s.f8302b;
        r0 = O5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, j3.InterfaceC3189a r19, S5.d r20) {
        /*
            r14 = this;
            r1 = r14
            r2 = r16
            r0 = r20
            boolean r3 = r0 instanceof l3.C3314b.C0789b
            if (r3 == 0) goto L18
            r3 = r0
            l3.b$b r3 = (l3.C3314b.C0789b) r3
            int r4 = r3.f34432c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f34432c = r4
            goto L1d
        L18:
            l3.b$b r3 = new l3.b$b
            r3.<init>(r0)
        L1d:
            java.lang.Object r0 = r3.f34430a
            java.lang.Object r4 = T5.b.e()
            int r5 = r3.f34432c
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            O5.s r0 = (O5.s) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L34
            goto L83
        L34:
            r0 = move-exception
            goto L8d
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3e:
            O5.t.b(r0)
            O5.s$a r0 = O5.s.f8302b     // Catch: java.lang.Throwable -> L4d
            com.stripe.android.model.n$c r0 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            O5.s$a r5 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
            java.lang.Object r0 = O5.s.b(r0)
        L58:
            boolean r5 = O5.s.h(r0)
            if (r5 == 0) goto L93
            com.stripe.android.model.n$c r0 = (com.stripe.android.model.n.c) r0     // Catch: java.lang.Throwable -> L34
            h3.m r5 = r1.f34426a     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L34
            r7 = r18
            r8 = r19
            com.stripe.android.model.d r2 = r14.d(r8, r2, r7)     // Catch: java.lang.Throwable -> L34
            A2.j$c r13 = new A2.j$c     // Catch: java.lang.Throwable -> L34
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r13
            r8 = r15
            r9 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L34
            r3.f34432c = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r5.d(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L34
            if (r0 != r4) goto L83
            return r4
        L83:
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            e3.x r0 = (e3.x) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L34
            goto L97
        L8d:
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
        L93:
            java.lang.Object r0 = O5.s.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3314b.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, j3.a, S5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(7:17|18|19|20|(2:22|(1:24))|25|26)|11|13))|32|6|7|(0)(0)|11|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        r2 = O5.s.f8302b;
        r0 = O5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, j3.InterfaceC3189a r19, S5.d r20) {
        /*
            r14 = this;
            r1 = r14
            r2 = r16
            r0 = r20
            boolean r3 = r0 instanceof l3.C3314b.c
            if (r3 == 0) goto L18
            r3 = r0
            l3.b$c r3 = (l3.C3314b.c) r3
            int r4 = r3.f34435c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f34435c = r4
            goto L1d
        L18:
            l3.b$c r3 = new l3.b$c
            r3.<init>(r0)
        L1d:
            java.lang.Object r0 = r3.f34433a
            java.lang.Object r4 = T5.b.e()
            int r5 = r3.f34435c
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            O5.s r0 = (O5.s) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L34
            goto L83
        L34:
            r0 = move-exception
            goto L8d
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3e:
            O5.t.b(r0)
            O5.s$a r0 = O5.s.f8302b     // Catch: java.lang.Throwable -> L4d
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            O5.s$a r5 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
            java.lang.Object r0 = O5.s.b(r0)
        L58:
            boolean r5 = O5.s.h(r0)
            if (r5 == 0) goto L93
            com.stripe.android.model.u$b r0 = (com.stripe.android.model.u.b) r0     // Catch: java.lang.Throwable -> L34
            h3.m r5 = r1.f34426a     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L34
            r7 = r18
            r8 = r19
            com.stripe.android.model.d r2 = r14.d(r8, r2, r7)     // Catch: java.lang.Throwable -> L34
            A2.j$c r13 = new A2.j$c     // Catch: java.lang.Throwable -> L34
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r13
            r8 = r15
            r9 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L34
            r3.f34435c = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r5.k(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L34
            if (r0 != r4) goto L83
            return r4
        L83:
            O5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            e3.x r0 = (e3.x) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L34
            goto L97
        L8d:
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
        L93:
            java.lang.Object r0 = O5.s.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C3314b.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, j3.a, S5.d):java.lang.Object");
    }
}
