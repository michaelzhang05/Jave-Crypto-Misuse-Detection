package O7;

import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final N7.a f8501a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f8502b;

    /* renamed from: c, reason: collision with root package name */
    public final N7.b f8503c;

    /* renamed from: d, reason: collision with root package name */
    public final P7.j f8504d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8505e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8506a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8507b;

        /* renamed from: d, reason: collision with root package name */
        public int f8509d;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8507b = obj;
            this.f8509d |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    public d(N7.a networkUtil, SharedStorage sharedStorage, N7.b requestApi, P7.j resolver) {
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(resolver, "resolver");
        this.f8501a = networkUtil;
        this.f8502b = sharedStorage;
        this.f8503c = requestApi;
        this.f8504d = resolver;
        this.f8505e = "GVL-v2/cmp-list.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof O7.d.a
            if (r0 == 0) goto L13
            r0 = r9
            O7.d$a r0 = (O7.d.a) r0
            int r1 = r0.f8509d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8509d = r1
            goto L18
        L13:
            O7.d$a r0 = new O7.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8507b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8509d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f8506a
            O7.d r0 = (O7.d) r0
            O5.t.b(r9)     // Catch: y5.C4208a -> L71
            goto L56
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            O5.t.b(r9)
            N7.a r9 = r8.f8501a     // Catch: y5.C4208a -> L70
            boolean r9 = r9.a()     // Catch: y5.C4208a -> L70
            if (r9 == 0) goto L59
            N7.b r9 = r8.f8503c     // Catch: y5.C4208a -> L70
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r4 = r8.f8505e     // Catch: y5.C4208a -> L70
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3255y.q(r2, r4)     // Catch: y5.C4208a -> L70
            r0.f8506a = r8     // Catch: y5.C4208a -> L70
            r0.f8509d = r3     // Catch: y5.C4208a -> L70
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: y5.C4208a -> L70
            if (r9 != r1) goto L55
            return r1
        L55:
            r0 = r8
        L56:
            java.lang.String r9 = (java.lang.String) r9     // Catch: y5.C4208a -> L71
            goto L79
        L59:
            y5.b r1 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L70
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L70
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            y5.C4209b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: y5.C4208a -> L70
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f8502b     // Catch: y5.C4208a -> L70
            Q7.a r0 = Q7.a.CMP_LIST     // Catch: y5.C4208a -> L70
            java.lang.String r9 = r9.j(r0)     // Catch: y5.C4208a -> L70
            r0 = r8
            goto L79
        L70:
            r0 = r8
        L71:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f8502b
            Q7.a r1 = Q7.a.CMP_LIST
            java.lang.String r9 = r9.j(r1)
        L79:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f8502b
            Q7.a r2 = Q7.a.CMP_LIST
            r1.e(r2, r9)
            P7.j r0 = r0.f8504d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.d.a(S5.d):java.lang.Object");
    }
}
