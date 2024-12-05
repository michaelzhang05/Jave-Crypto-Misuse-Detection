package i3;

import L5.p;
import L5.s;
import com.stripe.android.model.d;
import e3.m;
import g3.InterfaceC2712a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2779b {

    /* renamed from: a, reason: collision with root package name */
    private final m f31574a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31575a;

        /* renamed from: c, reason: collision with root package name */
        int f31577c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31575a = obj;
            this.f31577c |= Integer.MIN_VALUE;
            Object a8 = C2779b.this.a(null, null, null, null, null, null, null, null, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0759b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31578a;

        /* renamed from: c, reason: collision with root package name */
        int f31580c;

        C0759b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31578a = obj;
            this.f31580c |= Integer.MIN_VALUE;
            Object b8 = C2779b.this.b(null, null, null, null, null, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31581a;

        /* renamed from: c, reason: collision with root package name */
        int f31583c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31581a = obj;
            this.f31583c |= Integer.MIN_VALUE;
            Object c8 = C2779b.this.c(null, null, null, null, null, this);
            if (c8 == Q5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    public C2779b(m stripeRepository) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        this.f31574a = stripeRepository;
    }

    private final com.stripe.android.model.d d(InterfaceC2712a interfaceC2712a, String str, String str2) {
        if (interfaceC2712a instanceof InterfaceC2712a.b) {
            InterfaceC2712a.b bVar = (InterfaceC2712a.b) interfaceC2712a;
            return new d.b(str, bVar.c(), bVar.b(), str2);
        }
        if (interfaceC2712a instanceof InterfaceC2712a.C0747a) {
            return new d.a(str, ((InterfaceC2712a.C0747a) interfaceC2712a).b(), str2);
        }
        throw new p();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.String r25, P5.d r26) {
        /*
            r17 = this;
            r0 = r17
            r1 = r26
            boolean r2 = r1 instanceof i3.C2779b.a
            if (r2 == 0) goto L17
            r2 = r1
            i3.b$a r2 = (i3.C2779b.a) r2
            int r3 = r2.f31577c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f31577c = r3
            goto L1c
        L17:
            i3.b$a r2 = new i3.b$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f31575a
            java.lang.Object r3 = Q5.b.e()
            int r4 = r2.f31577c
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            L5.t.b(r1)
            L5.s r1 = (L5.s) r1
            java.lang.Object r1 = r1.k()
            goto L72
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            L5.t.b(r1)
            e3.m r1 = r0.f31574a
            b3.L r11 = b3.L.f14378b
            b3.s r4 = new b3.s
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
            x2.j$c r6 = new x2.j$c
            r7 = 4
            r20 = r6
            r21 = r18
            r22 = r19
            r23 = r9
            r24 = r7
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            r2.f31577c = r5
            java.lang.Object r1 = r1.i(r4, r6, r2)
            if (r1 != r3) goto L72
            return r3
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2779b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(7:17|18|19|20|(2:22|(1:24))|25|26)|11|13))|32|6|7|(0)(0)|11|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        r2 = L5.s.f6511b;
        r0 = L5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, g3.InterfaceC2712a r19, P5.d r20) {
        /*
            r14 = this;
            r1 = r14
            r2 = r16
            r0 = r20
            boolean r3 = r0 instanceof i3.C2779b.C0759b
            if (r3 == 0) goto L18
            r3 = r0
            i3.b$b r3 = (i3.C2779b.C0759b) r3
            int r4 = r3.f31580c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f31580c = r4
            goto L1d
        L18:
            i3.b$b r3 = new i3.b$b
            r3.<init>(r0)
        L1d:
            java.lang.Object r0 = r3.f31578a
            java.lang.Object r4 = Q5.b.e()
            int r5 = r3.f31580c
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            L5.s r0 = (L5.s) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L34
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
            L5.t.b(r0)
            L5.s$a r0 = L5.s.f6511b     // Catch: java.lang.Throwable -> L4d
            com.stripe.android.model.n$c r0 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            L5.s$a r5 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
            java.lang.Object r0 = L5.s.b(r0)
        L58:
            boolean r5 = L5.s.h(r0)
            if (r5 == 0) goto L93
            com.stripe.android.model.n$c r0 = (com.stripe.android.model.n.c) r0     // Catch: java.lang.Throwable -> L34
            e3.m r5 = r1.f31574a     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L34
            r7 = r18
            r8 = r19
            com.stripe.android.model.d r2 = r14.d(r8, r2, r7)     // Catch: java.lang.Throwable -> L34
            x2.j$c r13 = new x2.j$c     // Catch: java.lang.Throwable -> L34
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r13
            r8 = r15
            r9 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L34
            r3.f31580c = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r5.m(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L34
            if (r0 != r4) goto L83
            return r4
        L83:
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            b3.x r0 = (b3.x) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L34
            goto L97
        L8d:
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
        L93:
            java.lang.Object r0 = L5.s.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2779b.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, g3.a, P5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(7:17|18|19|20|(2:22|(1:24))|25|26)|11|13))|32|6|7|(0)(0)|11|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        r2 = L5.s.f6511b;
        r0 = L5.t.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, g3.InterfaceC2712a r19, P5.d r20) {
        /*
            r14 = this;
            r1 = r14
            r2 = r16
            r0 = r20
            boolean r3 = r0 instanceof i3.C2779b.c
            if (r3 == 0) goto L18
            r3 = r0
            i3.b$c r3 = (i3.C2779b.c) r3
            int r4 = r3.f31583c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f31583c = r4
            goto L1d
        L18:
            i3.b$c r3 = new i3.b$c
            r3.<init>(r0)
        L1d:
            java.lang.Object r0 = r3.f31581a
            java.lang.Object r4 = Q5.b.e()
            int r5 = r3.f31583c
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            L5.s r0 = (L5.s) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L34
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
            L5.t.b(r0)
            L5.s$a r0 = L5.s.f6511b     // Catch: java.lang.Throwable -> L4d
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            L5.s$a r5 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
            java.lang.Object r0 = L5.s.b(r0)
        L58:
            boolean r5 = L5.s.h(r0)
            if (r5 == 0) goto L93
            com.stripe.android.model.u$b r0 = (com.stripe.android.model.u.b) r0     // Catch: java.lang.Throwable -> L34
            e3.m r5 = r1.f31574a     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L34
            r7 = r18
            r8 = r19
            com.stripe.android.model.d r2 = r14.d(r8, r2, r7)     // Catch: java.lang.Throwable -> L34
            x2.j$c r13 = new x2.j$c     // Catch: java.lang.Throwable -> L34
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r13
            r8 = r15
            r9 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L34
            r3.f31583c = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r5.a(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L34
            if (r0 != r4) goto L83
            return r4
        L83:
            L5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            b3.x r0 = (b3.x) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L34
            goto L97
        L8d:
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
        L93:
            java.lang.Object r0 = L5.s.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2779b.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, g3.a, P5.d):java.lang.Object");
    }
}
