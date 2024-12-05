package l1;

import a6.InterfaceC1668n;
import android.util.Log;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import n1.C3461f;

/* renamed from: l1.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3293B implements com.google.firebase.sessions.b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f34224g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final double f34225h = Math.random();

    /* renamed from: b, reason: collision with root package name */
    private final A0.f f34226b;

    /* renamed from: c, reason: collision with root package name */
    private final c1.e f34227c;

    /* renamed from: d, reason: collision with root package name */
    private final C3461f f34228d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3305h f34229e;

    /* renamed from: f, reason: collision with root package name */
    private final S5.g f34230f;

    /* renamed from: l1.B$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: l1.B$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f34231a;

        /* renamed from: b, reason: collision with root package name */
        Object f34232b;

        /* renamed from: c, reason: collision with root package name */
        Object f34233c;

        /* renamed from: d, reason: collision with root package name */
        Object f34234d;

        /* renamed from: e, reason: collision with root package name */
        Object f34235e;

        /* renamed from: f, reason: collision with root package name */
        Object f34236f;

        /* renamed from: g, reason: collision with root package name */
        int f34237g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ y f34239i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar, S5.d dVar) {
            super(2, dVar);
            this.f34239i = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f34239i, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r10.f34237g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r10.f34236f
                n1.f r0 = (n1.C3461f) r0
                java.lang.Object r1 = r10.f34235e
                l1.y r1 = (l1.y) r1
                java.lang.Object r2 = r10.f34234d
                A0.f r2 = (A0.f) r2
                java.lang.Object r3 = r10.f34233c
                l1.A r3 = (l1.C3292A) r3
                java.lang.Object r4 = r10.f34232b
                l1.B r4 = (l1.C3293B) r4
                java.lang.Object r5 = r10.f34231a
                l1.s r5 = (l1.s) r5
                O5.t.b(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9d
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L3d:
                O5.t.b(r11)
                goto L6c
            L41:
                O5.t.b(r11)
                goto L53
            L45:
                O5.t.b(r11)
                l1.B r11 = l1.C3293B.this
                r10.f34237g = r4
                java.lang.Object r11 = l1.C3293B.f(r11, r10)
                if (r11 != r0) goto L53
                return r0
            L53:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb0
                l1.s$a r11 = l1.s.f34344c
                l1.B r1 = l1.C3293B.this
                c1.e r1 = l1.C3293B.d(r1)
                r10.f34237g = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L6c
                return r0
            L6c:
                r5 = r11
                l1.s r5 = (l1.s) r5
                l1.B r4 = l1.C3293B.this
                l1.A r3 = l1.C3292A.f34222a
                A0.f r11 = l1.C3293B.c(r4)
                l1.y r1 = r10.f34239i
                l1.B r6 = l1.C3293B.this
                n1.f r6 = l1.C3293B.e(r6)
                m1.a r7 = m1.C3401a.f34695a
                r10.f34231a = r5
                r10.f34232b = r4
                r10.f34233c = r3
                r10.f34234d = r11
                r10.f34235e = r1
                r10.f34236f = r6
                r10.f34237g = r2
                java.lang.Object r2 = r7.c(r10)
                if (r2 != r0) goto L96
                return r0
            L96:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.b()
                java.lang.String r6 = r5.a()
                r5 = r11
                l1.z r11 = r0.a(r1, r2, r3, r4, r5, r6)
                l1.C3293B.b(r7, r11)
            Lb0:
                O5.I r11 = O5.I.f8278a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.C3293B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.B$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34240a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34241b;

        /* renamed from: d, reason: collision with root package name */
        int f34243d;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34241b = obj;
            this.f34243d |= Integer.MIN_VALUE;
            return C3293B.this.i(this);
        }
    }

    public C3293B(A0.f firebaseApp, c1.e firebaseInstallations, C3461f sessionSettings, InterfaceC3305h eventGDTLogger, S5.g backgroundDispatcher) {
        AbstractC3255y.i(firebaseApp, "firebaseApp");
        AbstractC3255y.i(firebaseInstallations, "firebaseInstallations");
        AbstractC3255y.i(sessionSettings, "sessionSettings");
        AbstractC3255y.i(eventGDTLogger, "eventGDTLogger");
        AbstractC3255y.i(backgroundDispatcher, "backgroundDispatcher");
        this.f34226b = firebaseApp;
        this.f34227c = firebaseInstallations;
        this.f34228d = sessionSettings;
        this.f34229e = eventGDTLogger;
        this.f34230f = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(z zVar) {
        try {
            this.f34229e.a(zVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + zVar.c().f());
        } catch (RuntimeException e8) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e8);
        }
    }

    private final boolean h() {
        if (f34225h <= this.f34228d.b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(S5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof l1.C3293B.c
            if (r0 == 0) goto L13
            r0 = r6
            l1.B$c r0 = (l1.C3293B.c) r0
            int r1 = r0.f34243d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34243d = r1
            goto L18
        L13:
            l1.B$c r0 = new l1.B$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34241b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f34243d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f34240a
            l1.B r0 = (l1.C3293B) r0
            O5.t.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            O5.t.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            n1.f r6 = r5.f34228d
            r0.f34240a = r5
            r0.f34243d = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            n1.f r6 = r0.f34228d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L60:
            boolean r6 = r0.h()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C3293B.i(S5.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.b
    public void a(y sessionDetails) {
        AbstractC3255y.i(sessionDetails, "sessionDetails");
        AbstractC3364k.d(N.a(this.f34230f), null, null, new b(sessionDetails, null), 3, null);
    }
}
