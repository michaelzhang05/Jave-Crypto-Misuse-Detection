package l1;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34344c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f34345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34346b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l1.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0785a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f34347a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34348b;

            /* renamed from: d, reason: collision with root package name */
            int f34350d;

            C0785a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34348b = obj;
                this.f34350d |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        private a() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(3:29|30|(1:32))|23|24|25|(1:27)|13|14|15|16))|37|6|7|(0)(0)|23|24|25|(0)|13|14|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        
            android.util.Log.w("InstallationId", "Error getting authentication token.", r10);
            r10 = r9;
            r9 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
        
            android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
            r9 = r9;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(c1.e r9, S5.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof l1.s.a.C0785a
                if (r0 == 0) goto L13
                r0 = r10
                l1.s$a$a r0 = (l1.s.a.C0785a) r0
                int r1 = r0.f34350d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34350d = r1
                goto L18
            L13:
                l1.s$a$a r0 = new l1.s$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f34348b
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f34350d
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L48
                if (r2 == r6) goto L3e
                if (r2 != r5) goto L36
                java.lang.Object r9 = r0.f34347a
                java.lang.String r9 = (java.lang.String) r9
                O5.t.b(r10)     // Catch: java.lang.Exception -> L34
                goto L8a
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f34347a
                c1.e r9 = (c1.e) r9
                O5.t.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6f
            L48:
                O5.t.b(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.a(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.AbstractC3255y.h(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f34347a = r9     // Catch: java.lang.Exception -> L46
                r0.f34350d = r6     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = v6.b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                return r1
            L60:
                com.google.firebase.installations.g r10 = (com.google.firebase.installations.g) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.AbstractC3255y.h(r10, r2)     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L76
            L6f:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L76:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.AbstractC3255y.h(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f34347a = r9     // Catch: java.lang.Exception -> L34
                r0.f34350d = r5     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = v6.b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L8a
                return r1
            L8a:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.AbstractC3255y.h(r10, r0)     // Catch: java.lang.Exception -> L34
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                r3 = r10
                goto L98
            L93:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L98:
                l1.s r10 = new l1.s
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.s.a.a(c1.e, S5.d):java.lang.Object");
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ s(String str, String str2, AbstractC3247p abstractC3247p) {
        this(str, str2);
    }

    public final String a() {
        return this.f34346b;
    }

    public final String b() {
        return this.f34345a;
    }

    private s(String str, String str2) {
        this.f34345a = str;
        this.f34346b = str2;
    }
}
