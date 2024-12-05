package j2;

import M5.a0;
import android.content.Context;
import e3.C2581c;
import e3.C2582d;
import e3.InterfaceC2585g;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.InterfaceC3868F;

/* renamed from: j2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3067g implements InterfaceC3069i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3071k f32975a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2585g f32976b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3868F f32977c;

    /* renamed from: d, reason: collision with root package name */
    private final k3.i f32978d;

    /* renamed from: e, reason: collision with root package name */
    private final P5.g f32979e;

    /* renamed from: f, reason: collision with root package name */
    private C2582d f32980f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f32981a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f32982b;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(dVar);
            aVar.f32982b = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f32981a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r8.f32982b
                j2.g r0 = (j2.C3067g) r0
                L5.t.b(r9)     // Catch: java.lang.Throwable -> L16
                goto L74
            L16:
                r9 = move-exception
                goto L81
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.f32982b
                i6.M r1 = (i6.M) r1
                L5.t.b(r9)
                goto L40
            L28:
                L5.t.b(r9)
                java.lang.Object r9 = r8.f32982b
                i6.M r9 = (i6.M) r9
                j2.g r1 = j2.C3067g.this
                j2.k r1 = j2.C3067g.f(r1)
                r8.f32982b = r9
                r8.f32981a = r3
                java.lang.Object r9 = r1.a(r8)
                if (r9 != r0) goto L40
                return r0
            L40:
                j2.g r1 = j2.C3067g.this
                e3.d r9 = (e3.C2582d) r9
                if (r9 == 0) goto L5a
                kotlin.jvm.functions.Function0 r3 = j2.AbstractC3070j.b()
                java.lang.Object r3 = r3.invoke()
                java.lang.Number r3 = (java.lang.Number) r3
                long r3 = r3.longValue()
                boolean r3 = r9.i(r3)
                if (r3 == 0) goto Lac
            L5a:
                L5.s$a r3 = L5.s.f6511b     // Catch: java.lang.Throwable -> L7f
                x2.F r3 = j2.C3067g.g(r1)     // Catch: java.lang.Throwable -> L7f
                e3.g r4 = j2.C3067g.e(r1)     // Catch: java.lang.Throwable -> L7f
                e3.f r9 = r4.a(r9)     // Catch: java.lang.Throwable -> L7f
                r8.f32982b = r1     // Catch: java.lang.Throwable -> L7f
                r8.f32981a = r2     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r9 = r3.a(r9, r8)     // Catch: java.lang.Throwable -> L7f
                if (r9 != r0) goto L73
                return r0
            L73:
                r0 = r1
            L74:
                x2.H r9 = (x2.C3870H) r9     // Catch: java.lang.Throwable -> L16
                e3.d r9 = j2.AbstractC3070j.a(r9)     // Catch: java.lang.Throwable -> L16
                java.lang.Object r9 = L5.s.b(r9)     // Catch: java.lang.Throwable -> L16
                goto L8b
            L7f:
                r9 = move-exception
                r0 = r1
            L81:
                L5.s$a r1 = L5.s.f6511b
                java.lang.Object r9 = L5.t.a(r9)
                java.lang.Object r9 = L5.s.b(r9)
            L8b:
                java.lang.Throwable r1 = L5.s.e(r9)
                if (r1 == 0) goto La3
                k3.i r2 = j2.C3067g.d(r0)
                k3.i$d r3 = k3.i.d.f33411q
                t2.k$a r0 = t2.AbstractC3790k.f38229e
                t2.k r4 = r0.b(r1)
                r6 = 4
                r7 = 0
                r5 = 0
                k3.i.b.a(r2, r3, r4, r5, r6, r7)
            La3:
                boolean r0 = L5.s.g(r9)
                if (r0 == 0) goto Laa
                r9 = 0
            Laa:
                e3.d r9 = (e3.C2582d) r9
            Lac:
                j2.g r0 = j2.C3067g.this
                e3.d r0 = j2.C3067g.c(r0)
                boolean r0 = kotlin.jvm.internal.AbstractC3159y.d(r0, r9)
                if (r0 != 0) goto Lbf
                if (r9 == 0) goto Lbf
                j2.g r0 = j2.C3067g.this
                r0.i(r9)
            Lbf:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: j2.C3067g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f32984a;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f32984a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C3067g c3067g = C3067g.this;
                this.f32984a = 1;
                if (c3067g.h(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    public C3067g(InterfaceC3071k localStore, InterfaceC2585g fraudDetectionDataRequestFactory, InterfaceC3868F stripeNetworkClient, k3.i errorReporter, P5.g workContext) {
        AbstractC3159y.i(localStore, "localStore");
        AbstractC3159y.i(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        AbstractC3159y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        this.f32975a = localStore;
        this.f32976b = fraudDetectionDataRequestFactory;
        this.f32977c = stripeNetworkClient;
        this.f32978d = errorReporter;
        this.f32979e = workContext;
    }

    @Override // j2.InterfaceC3069i
    public C2582d a() {
        C2582d c2582d = this.f32980f;
        if (!C3057I.f32934f.a()) {
            return null;
        }
        return c2582d;
    }

    @Override // j2.InterfaceC3069i
    public void b() {
        if (C3057I.f32934f.a()) {
            AbstractC2825i.d(N.a(this.f32979e), null, null, new b(null), 3, null);
        }
    }

    public Object h(P5.d dVar) {
        return AbstractC2825i.g(this.f32979e, new a(null), dVar);
    }

    public void i(C2582d fraudDetectionData) {
        AbstractC3159y.i(fraudDetectionData, "fraudDetectionData");
        this.f32980f = fraudDetectionData;
        this.f32975a.b(fraudDetectionData);
    }

    public /* synthetic */ C3067g(Context context, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
        this(context, (i8 & 2) != 0 ? C2812b0.b() : gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3067g(Context context, P5.g workContext) {
        this(new C3068h(context, workContext), new C2581c(context), new x2.o(workContext, null, null, 0, null, 30, null), k3.i.f33394a.a(context, a0.f()), workContext);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(workContext, "workContext");
    }
}
