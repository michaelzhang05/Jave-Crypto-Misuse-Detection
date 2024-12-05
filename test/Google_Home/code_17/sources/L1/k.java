package l1;

import a6.InterfaceC1668n;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import n1.C3461f;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final b f34336c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f34337a;

    /* renamed from: b, reason: collision with root package name */
    private final C3461f f34338b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34339a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S5.g f34341c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3297F f34342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S5.g gVar, InterfaceC3297F interfaceC3297F, S5.d dVar) {
            super(2, dVar);
            this.f34341c = gVar;
            this.f34342d = interfaceC3297F;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f34341c, this.f34342d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r5.f34339a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                O5.t.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                O5.t.b(r6)
                goto L2e
            L20:
                O5.t.b(r6)
                m1.a r6 = m1.C3401a.f34695a
                r5.f34339a = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L9b
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L9b
                java.lang.Object r1 = r6.next()
                m1.b r1 = (m1.InterfaceC3402b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L48
                l1.k r6 = l1.k.this
                n1.f r6 = l1.k.b(r6)
                r5.f34339a = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L69
                return r0
            L69:
                l1.k r6 = l1.k.this
                n1.f r6 = l1.k.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L7b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto La0
            L7b:
                l1.D r6 = new l1.D
                S5.g r0 = r5.f34341c
                r6.<init>(r0)
                l1.F r0 = r5.f34342d
                r6.i(r0)
                l1.H r0 = l1.H.f34266a
                r0.a(r6)
                l1.k r6 = l1.k.this
                A0.f r6 = l1.k.a(r6)
                l1.j r0 = new l1.j
                r0.<init>()
                r6.h(r0)
                goto La0
            L9b:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            La0:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public k(A0.f firebaseApp, C3461f settings, S5.g backgroundDispatcher, InterfaceC3297F lifecycleServiceBinder) {
        AbstractC3255y.i(firebaseApp, "firebaseApp");
        AbstractC3255y.i(settings, "settings");
        AbstractC3255y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3255y.i(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f34337a = firebaseApp;
        this.f34338b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(H.f34266a);
            AbstractC3364k.d(N.a(backgroundDispatcher), null, null, new a(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
