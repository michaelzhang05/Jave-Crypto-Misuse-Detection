package O7;

import O5.I;
import a6.InterfaceC1668n;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final N7.a f8515a;

    /* renamed from: b, reason: collision with root package name */
    public final N7.b f8516b;

    /* renamed from: c, reason: collision with root package name */
    public final P7.j f8517c;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public Object f8518a;

        /* renamed from: b, reason: collision with root package name */
        public int f8519b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f8520c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f8522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, S5.d dVar) {
            super(2, dVar);
            this.f8522e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f8522e, dVar);
            aVar.f8520c = obj;
            return aVar;
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            a aVar = new a(this.f8522e, (S5.d) obj2);
            aVar.f8520c = (LiveDataScope) obj;
            return aVar.invokeSuspend(I.f8278a);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r13.f8519b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                O5.t.b(r14)
                goto L84
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                java.lang.Object r1 = r13.f8518a
                P7.j r1 = (P7.j) r1
                java.lang.Object r5 = r13.f8520c
                androidx.lifecycle.LiveDataScope r5 = (androidx.lifecycle.LiveDataScope) r5
                O5.t.b(r14)     // Catch: y5.C4208a -> L72
                goto L56
            L27:
                O5.t.b(r14)
                java.lang.Object r14 = r13.f8520c
                r5 = r14
                androidx.lifecycle.LiveDataScope r5 = (androidx.lifecycle.LiveDataScope) r5
                O7.h r14 = O7.h.this     // Catch: y5.C4208a -> L72
                N7.a r14 = r14.f8515a     // Catch: y5.C4208a -> L72
                boolean r14 = r14.a()     // Catch: y5.C4208a -> L72
                if (r14 == 0) goto L5f
                java.lang.String r14 = r13.f8522e     // Catch: y5.C4208a -> L72
                int r14 = r14.length()     // Catch: y5.C4208a -> L72
                if (r14 <= 0) goto L5f
                O7.h r14 = O7.h.this     // Catch: y5.C4208a -> L72
                P7.j r1 = r14.f8517c     // Catch: y5.C4208a -> L72
                N7.b r14 = r14.f8516b     // Catch: y5.C4208a -> L72
                java.lang.String r6 = r13.f8522e     // Catch: y5.C4208a -> L72
                r13.f8520c = r5     // Catch: y5.C4208a -> L72
                r13.f8518a = r1     // Catch: y5.C4208a -> L72
                r13.f8519b = r4     // Catch: y5.C4208a -> L72
                java.lang.Object r14 = r14.b(r6, r13)     // Catch: y5.C4208a -> L72
                if (r14 != r0) goto L56
                return r0
            L56:
                java.lang.String r14 = (java.lang.String) r14     // Catch: y5.C4208a -> L72
                java.lang.Object r14 = r1.a(r14)     // Catch: y5.C4208a -> L72
                M7.d r14 = (M7.d) r14     // Catch: y5.C4208a -> L72
                goto L77
            L5f:
                y5.b r6 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L72
                com.inmobi.cmp.model.ChoiceError r7 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L72
                r11 = 0
                r12 = 30
                r8 = 0
                r9 = 0
                r10 = 0
                y5.C4209b.b(r6, r7, r8, r9, r10, r11, r12)     // Catch: y5.C4208a -> L72
                M7.d r14 = new M7.d     // Catch: y5.C4208a -> L72
                r14.<init>(r3, r4)     // Catch: y5.C4208a -> L72
                goto L77
            L72:
                M7.d r14 = new M7.d
                r14.<init>(r3, r4)
            L77:
                r13.f8520c = r3
                r13.f8518a = r3
                r13.f8519b = r2
                java.lang.Object r14 = r5.emit(r14, r13)
                if (r14 != r0) goto L84
                return r0
            L84:
                O5.I r14 = O5.I.f8278a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: O7.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(N7.a networkUtil, N7.b requestApi, P7.j resolver) {
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(resolver, "resolver");
        this.f8515a = networkUtil;
        this.f8516b = requestApi;
        this.f8517c = resolver;
    }

    @Override // O7.g
    public LiveData a(String url) {
        AbstractC3255y.i(url, "url");
        return CoroutineLiveDataKt.liveData$default((S5.g) null, 0L, new a(url, null), 3, (Object) null);
    }
}
