package m2;

import P5.a0;
import a6.InterfaceC1668n;
import android.content.Context;
import h3.C2901c;
import h3.C2902d;
import h3.InterfaceC2905g;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;
import l6.N;

/* renamed from: m2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3421g implements InterfaceC3423i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3425k f34951a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2905g f34952b;

    /* renamed from: c, reason: collision with root package name */
    private final A2.F f34953c;

    /* renamed from: d, reason: collision with root package name */
    private final n3.i f34954d;

    /* renamed from: e, reason: collision with root package name */
    private final S5.g f34955e;

    /* renamed from: f, reason: collision with root package name */
    private C2902d f34956f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m2.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34957a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34958b;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(dVar);
            aVar.f34958b = obj;
            return aVar;
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r8.f34957a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r8.f34958b
                m2.g r0 = (m2.C3421g) r0
                O5.t.b(r9)     // Catch: java.lang.Throwable -> L16
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
                java.lang.Object r1 = r8.f34958b
                l6.M r1 = (l6.M) r1
                O5.t.b(r9)
                goto L40
            L28:
                O5.t.b(r9)
                java.lang.Object r9 = r8.f34958b
                l6.M r9 = (l6.M) r9
                m2.g r1 = m2.C3421g.this
                m2.k r1 = m2.C3421g.f(r1)
                r8.f34958b = r9
                r8.f34957a = r3
                java.lang.Object r9 = r1.a(r8)
                if (r9 != r0) goto L40
                return r0
            L40:
                m2.g r1 = m2.C3421g.this
                h3.d r9 = (h3.C2902d) r9
                if (r9 == 0) goto L5a
                kotlin.jvm.functions.Function0 r3 = m2.AbstractC3424j.b()
                java.lang.Object r3 = r3.invoke()
                java.lang.Number r3 = (java.lang.Number) r3
                long r3 = r3.longValue()
                boolean r3 = r9.i(r3)
                if (r3 == 0) goto Lac
            L5a:
                O5.s$a r3 = O5.s.f8302b     // Catch: java.lang.Throwable -> L7f
                A2.F r3 = m2.C3421g.g(r1)     // Catch: java.lang.Throwable -> L7f
                h3.g r4 = m2.C3421g.e(r1)     // Catch: java.lang.Throwable -> L7f
                h3.f r9 = r4.a(r9)     // Catch: java.lang.Throwable -> L7f
                r8.f34958b = r1     // Catch: java.lang.Throwable -> L7f
                r8.f34957a = r2     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r9 = r3.a(r9, r8)     // Catch: java.lang.Throwable -> L7f
                if (r9 != r0) goto L73
                return r0
            L73:
                r0 = r1
            L74:
                A2.H r9 = (A2.H) r9     // Catch: java.lang.Throwable -> L16
                h3.d r9 = m2.AbstractC3424j.a(r9)     // Catch: java.lang.Throwable -> L16
                java.lang.Object r9 = O5.s.b(r9)     // Catch: java.lang.Throwable -> L16
                goto L8b
            L7f:
                r9 = move-exception
                r0 = r1
            L81:
                O5.s$a r1 = O5.s.f8302b
                java.lang.Object r9 = O5.t.a(r9)
                java.lang.Object r9 = O5.s.b(r9)
            L8b:
                java.lang.Throwable r1 = O5.s.e(r9)
                if (r1 == 0) goto La3
                n3.i r2 = m2.C3421g.d(r0)
                n3.i$d r3 = n3.i.d.f35403q
                w2.k$a r0 = w2.AbstractC4144k.f40356e
                w2.k r4 = r0.b(r1)
                r6 = 4
                r7 = 0
                r5 = 0
                n3.i.b.a(r2, r3, r4, r5, r6, r7)
            La3:
                boolean r0 = O5.s.g(r9)
                if (r0 == 0) goto Laa
                r9 = 0
            Laa:
                h3.d r9 = (h3.C2902d) r9
            Lac:
                m2.g r0 = m2.C3421g.this
                h3.d r0 = m2.C3421g.c(r0)
                boolean r0 = kotlin.jvm.internal.AbstractC3255y.d(r0, r9)
                if (r0 != 0) goto Lbf
                if (r9 == 0) goto Lbf
                m2.g r0 = m2.C3421g.this
                r0.i(r9)
            Lbf:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.C3421g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m2.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34960a;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f34960a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C3421g c3421g = C3421g.this;
                this.f34960a = 1;
                if (c3421g.h(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public C3421g(InterfaceC3425k localStore, InterfaceC2905g fraudDetectionDataRequestFactory, A2.F stripeNetworkClient, n3.i errorReporter, S5.g workContext) {
        AbstractC3255y.i(localStore, "localStore");
        AbstractC3255y.i(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        AbstractC3255y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        this.f34951a = localStore;
        this.f34952b = fraudDetectionDataRequestFactory;
        this.f34953c = stripeNetworkClient;
        this.f34954d = errorReporter;
        this.f34955e = workContext;
    }

    @Override // m2.InterfaceC3423i
    public C2902d a() {
        C2902d c2902d = this.f34956f;
        if (!C3411I.f34910f.a()) {
            return null;
        }
        return c2902d;
    }

    @Override // m2.InterfaceC3423i
    public void b() {
        if (C3411I.f34910f.a()) {
            AbstractC3360i.d(N.a(this.f34955e), null, null, new b(null), 3, null);
        }
    }

    public Object h(S5.d dVar) {
        return AbstractC3360i.g(this.f34955e, new a(null), dVar);
    }

    public void i(C2902d fraudDetectionData) {
        AbstractC3255y.i(fraudDetectionData, "fraudDetectionData");
        this.f34956f = fraudDetectionData;
        this.f34951a.b(fraudDetectionData);
    }

    public /* synthetic */ C3421g(Context context, S5.g gVar, int i8, AbstractC3247p abstractC3247p) {
        this(context, (i8 & 2) != 0 ? C3347b0.b() : gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3421g(Context context, S5.g workContext) {
        this(new C3422h(context, workContext), new C2901c(context), new A2.o(workContext, null, null, 0, null, 30, null), n3.i.f35386a.a(context, a0.f()), workContext);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(workContext, "workContext");
    }
}
