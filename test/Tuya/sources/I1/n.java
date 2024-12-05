package i1;

import a1.InterfaceC1554e;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31506c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1554e f31507a;

    /* renamed from: b, reason: collision with root package name */
    private final h f31508b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31509a;

        /* renamed from: b, reason: collision with root package name */
        Object f31510b;

        /* renamed from: c, reason: collision with root package name */
        Object f31511c;

        /* renamed from: d, reason: collision with root package name */
        Object f31512d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f31513e;

        /* renamed from: g, reason: collision with root package name */
        int f31515g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31513e = obj;
            this.f31515g |= Integer.MIN_VALUE;
            return n.this.a(null, this);
        }
    }

    public n(InterfaceC1554e firebaseInstallations, h eventGDTLogger) {
        AbstractC3159y.i(firebaseInstallations, "firebaseInstallations");
        AbstractC3159y.i(eventGDTLogger, "eventGDTLogger");
        this.f31507a = firebaseInstallations;
        this.f31508b = eventGDTLogger;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|(1:(3:9|10|11)(2:25|26))(4:27|28|29|(1:31)(1:32))|12|13|14|15|16|17))|36|6|(0)(0)|12|13|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        android.util.Log.e("SessionCoordinator", "Error logging Session Start event to DataTransport: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(i1.p r7, P5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof i1.n.b
            if (r0 == 0) goto L13
            r0 = r8
            i1.n$b r0 = (i1.n.b) r0
            int r1 = r0.f31515g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31515g = r1
            goto L18
        L13:
            i1.n$b r0 = new i1.n$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31513e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f31515g
            r3 = 1
            java.lang.String r4 = "SessionCoordinator"
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.f31512d
            i1.s r7 = (i1.s) r7
            java.lang.Object r1 = r0.f31511c
            i1.s r1 = (i1.s) r1
            java.lang.Object r2 = r0.f31510b
            i1.p r2 = (i1.p) r2
            java.lang.Object r0 = r0.f31509a
            i1.n r0 = (i1.n) r0
            L5.t.b(r8)     // Catch: java.lang.Exception -> L3b
            goto L6d
        L3b:
            r7 = move-exception
            goto L7a
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            L5.t.b(r8)
            i1.s r8 = r7.c()
            a1.e r2 = r6.f31507a     // Catch: java.lang.Exception -> L75
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = "firebaseInstallations.id"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r5)     // Catch: java.lang.Exception -> L75
            r0.f31509a = r6     // Catch: java.lang.Exception -> L75
            r0.f31510b = r7     // Catch: java.lang.Exception -> L75
            r0.f31511c = r8     // Catch: java.lang.Exception -> L75
            r0.f31512d = r8     // Catch: java.lang.Exception -> L75
            r0.f31515g = r3     // Catch: java.lang.Exception -> L75
            java.lang.Object r0 = s6.b.a(r2, r0)     // Catch: java.lang.Exception -> L75
            if (r0 != r1) goto L68
            return r1
        L68:
            r2 = r7
            r7 = r8
            r1 = r7
            r8 = r0
            r0 = r6
        L6d:
            java.lang.String r3 = "{\n        firebaseInstallations.id.await()\n      }"
            kotlin.jvm.internal.AbstractC3159y.h(r8, r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3b
            goto L96
        L75:
            r0 = move-exception
            r2 = r7
            r1 = r8
            r7 = r0
            r0 = r6
        L7a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "Error getting Firebase Installation ID: "
            r8.append(r3)
            r8.append(r7)
            java.lang.String r7 = ". Using an empty ID"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.e(r4, r7)
            java.lang.String r8 = ""
            r7 = r1
        L96:
            r7.g(r8)
            i1.h r7 = r0.f31508b     // Catch: java.lang.RuntimeException -> Lbb
            r7.a(r2)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lbb
            r7.<init>()     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r8 = "Successfully logged Session Start event: "
            r7.append(r8)     // Catch: java.lang.RuntimeException -> Lbb
            i1.s r8 = r2.c()     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r8 = r8.e()     // Catch: java.lang.RuntimeException -> Lbb
            r7.append(r8)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.RuntimeException -> Lbb
            android.util.Log.i(r4, r7)     // Catch: java.lang.RuntimeException -> Lbb
            goto Lc1
        Lbb:
            r7 = move-exception
            java.lang.String r8 = "Error logging Session Start event to DataTransport: "
            android.util.Log.e(r4, r8, r7)
        Lc1:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.n.a(i1.p, P5.d):java.lang.Object");
    }
}
