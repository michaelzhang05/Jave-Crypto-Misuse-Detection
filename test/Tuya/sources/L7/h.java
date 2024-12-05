package L7;

import L5.I;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final K7.a f6724a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.b f6725b;

    /* renamed from: c, reason: collision with root package name */
    public final M7.j f6726c;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public Object f6727a;

        /* renamed from: b, reason: collision with root package name */
        public int f6728b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f6729c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f6731e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, P5.d dVar) {
            super(2, dVar);
            this.f6731e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f6731e, dVar);
            aVar.f6729c = obj;
            return aVar;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            a aVar = new a(this.f6731e, (P5.d) obj2);
            aVar.f6729c = (LiveDataScope) obj;
            return aVar.invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r13.f6728b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                L5.t.b(r14)
                goto L84
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                java.lang.Object r1 = r13.f6727a
                M7.j r1 = (M7.j) r1
                java.lang.Object r5 = r13.f6729c
                androidx.lifecycle.LiveDataScope r5 = (androidx.lifecycle.LiveDataScope) r5
                L5.t.b(r14)     // Catch: v5.C3831a -> L72
                goto L56
            L27:
                L5.t.b(r14)
                java.lang.Object r14 = r13.f6729c
                r5 = r14
                androidx.lifecycle.LiveDataScope r5 = (androidx.lifecycle.LiveDataScope) r5
                L7.h r14 = L7.h.this     // Catch: v5.C3831a -> L72
                K7.a r14 = r14.f6724a     // Catch: v5.C3831a -> L72
                boolean r14 = r14.a()     // Catch: v5.C3831a -> L72
                if (r14 == 0) goto L5f
                java.lang.String r14 = r13.f6731e     // Catch: v5.C3831a -> L72
                int r14 = r14.length()     // Catch: v5.C3831a -> L72
                if (r14 <= 0) goto L5f
                L7.h r14 = L7.h.this     // Catch: v5.C3831a -> L72
                M7.j r1 = r14.f6726c     // Catch: v5.C3831a -> L72
                K7.b r14 = r14.f6725b     // Catch: v5.C3831a -> L72
                java.lang.String r6 = r13.f6731e     // Catch: v5.C3831a -> L72
                r13.f6729c = r5     // Catch: v5.C3831a -> L72
                r13.f6727a = r1     // Catch: v5.C3831a -> L72
                r13.f6728b = r4     // Catch: v5.C3831a -> L72
                java.lang.Object r14 = r14.b(r6, r13)     // Catch: v5.C3831a -> L72
                if (r14 != r0) goto L56
                return r0
            L56:
                java.lang.String r14 = (java.lang.String) r14     // Catch: v5.C3831a -> L72
                java.lang.Object r14 = r1.a(r14)     // Catch: v5.C3831a -> L72
                J7.d r14 = (J7.d) r14     // Catch: v5.C3831a -> L72
                goto L77
            L5f:
                v5.b r6 = v5.C3832b.f38876a     // Catch: v5.C3831a -> L72
                com.inmobi.cmp.model.ChoiceError r7 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L72
                r11 = 0
                r12 = 30
                r8 = 0
                r9 = 0
                r10 = 0
                v5.C3832b.b(r6, r7, r8, r9, r10, r11, r12)     // Catch: v5.C3831a -> L72
                J7.d r14 = new J7.d     // Catch: v5.C3831a -> L72
                r14.<init>(r3, r4)     // Catch: v5.C3831a -> L72
                goto L77
            L72:
                J7.d r14 = new J7.d
                r14.<init>(r3, r4)
            L77:
                r13.f6729c = r3
                r13.f6727a = r3
                r13.f6728b = r2
                java.lang.Object r14 = r5.emit(r14, r13)
                if (r14 != r0) goto L84
                return r0
            L84:
                L5.I r14 = L5.I.f6487a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: L7.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(K7.a networkUtil, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6724a = networkUtil;
        this.f6725b = requestApi;
        this.f6726c = resolver;
    }

    @Override // L7.g
    public LiveData a(String url) {
        AbstractC3159y.i(url, "url");
        return CoroutineLiveDataKt.liveData$default((P5.g) null, 0L, new a(url, null), 3, (Object) null);
    }
}
