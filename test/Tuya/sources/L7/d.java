package L7;

import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final K7.a f6710a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f6711b;

    /* renamed from: c, reason: collision with root package name */
    public final K7.b f6712c;

    /* renamed from: d, reason: collision with root package name */
    public final M7.j f6713d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6714e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6715a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6716b;

        /* renamed from: d, reason: collision with root package name */
        public int f6718d;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6716b = obj;
            this.f6718d |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    public d(K7.a networkUtil, SharedStorage sharedStorage, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6710a = networkUtil;
        this.f6711b = sharedStorage;
        this.f6712c = requestApi;
        this.f6713d = resolver;
        this.f6714e = "GVL-v2/cmp-list.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // L7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof L7.d.a
            if (r0 == 0) goto L13
            r0 = r9
            L7.d$a r0 = (L7.d.a) r0
            int r1 = r0.f6718d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6718d = r1
            goto L18
        L13:
            L7.d$a r0 = new L7.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6716b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6718d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f6715a
            L7.d r0 = (L7.d) r0
            L5.t.b(r9)     // Catch: v5.C3831a -> L71
            goto L56
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            L5.t.b(r9)
            K7.a r9 = r8.f6710a     // Catch: v5.C3831a -> L70
            boolean r9 = r9.a()     // Catch: v5.C3831a -> L70
            if (r9 == 0) goto L59
            K7.b r9 = r8.f6712c     // Catch: v5.C3831a -> L70
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r4 = r8.f6714e     // Catch: v5.C3831a -> L70
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3159y.q(r2, r4)     // Catch: v5.C3831a -> L70
            r0.f6715a = r8     // Catch: v5.C3831a -> L70
            r0.f6718d = r3     // Catch: v5.C3831a -> L70
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: v5.C3831a -> L70
            if (r9 != r1) goto L55
            return r1
        L55:
            r0 = r8
        L56:
            java.lang.String r9 = (java.lang.String) r9     // Catch: v5.C3831a -> L71
            goto L79
        L59:
            v5.b r1 = v5.C3832b.f38876a     // Catch: v5.C3831a -> L70
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L70
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            v5.C3832b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: v5.C3831a -> L70
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f6711b     // Catch: v5.C3831a -> L70
            N7.a r0 = N7.a.CMP_LIST     // Catch: v5.C3831a -> L70
            java.lang.String r9 = r9.j(r0)     // Catch: v5.C3831a -> L70
            r0 = r8
            goto L79
        L70:
            r0 = r8
        L71:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f6711b
            N7.a r1 = N7.a.CMP_LIST
            java.lang.String r9 = r9.j(r1)
        L79:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f6711b
            N7.a r2 = N7.a.CMP_LIST
            r1.e(r2, r9)
            M7.j r0 = r0.f6713d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.d.a(P5.d):java.lang.Object");
    }
}
