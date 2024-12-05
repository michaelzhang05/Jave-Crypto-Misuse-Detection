package com.stripe.android.stripe3ds2.transaction;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import b4.C1975a;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;

/* loaded from: classes4.dex */
public interface b {
    Object a(com.stripe.android.stripe3ds2.transaction.a aVar, S5.d dVar);

    /* loaded from: classes4.dex */
    public static final class a implements b {

        /* renamed from: e, reason: collision with root package name */
        public static final C0671a f27858e = new C0671a(null);

        /* renamed from: f, reason: collision with root package name */
        private static final long f27859f = TimeUnit.SECONDS.toMillis(1);

        /* renamed from: a, reason: collision with root package name */
        private final C1975a f27860a;

        /* renamed from: b, reason: collision with root package name */
        private final X3.c f27861b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.transaction.c f27862c;

        /* renamed from: d, reason: collision with root package name */
        private final S5.g f27863d;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0671a {
            private C0671a() {
            }

            public /* synthetic */ C0671a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.stripe3ds2.transaction.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0672b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f27864a;

            /* renamed from: b, reason: collision with root package name */
            Object f27865b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f27866c;

            /* renamed from: e, reason: collision with root package name */
            int f27868e;

            C0672b(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f27866c = obj;
                this.f27868e |= Integer.MIN_VALUE;
                return a.this.d(null, this);
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f27869a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f27871c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(com.stripe.android.stripe3ds2.transaction.a aVar, S5.d dVar) {
                super(2, dVar);
                this.f27871c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f27871c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C1975a b8;
                Object e8 = T5.b.e();
                int i8 = this.f27869a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                C1975a c1975a = new C1975a(a.this.f27860a.s(), a.this.f27860a.v(), a.this.f27860a.g(), a.this.f27860a.u(), null, null, null, a.this.f27860a.i(), null, null, 880, null);
                com.stripe.android.stripe3ds2.transaction.a aVar = this.f27871c;
                if (aVar instanceof a.c) {
                    b8 = C1975a.b(c1975a, null, null, null, null, ((a.c) aVar).a(), null, null, null, null, null, PointerIconCompat.TYPE_CROSSHAIR, null);
                } else if (aVar instanceof a.b) {
                    b8 = C1975a.b(c1975a, null, null, null, null, null, null, ((a.b) aVar).a(), null, null, null, 959, null);
                } else if (aVar instanceof a.d) {
                    b8 = C1975a.b(c1975a, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), null, 767, null);
                } else if (aVar instanceof a.e) {
                    b8 = C1975a.b(c1975a, null, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), FrameMetricsAggregator.EVERY_DURATION, null);
                } else if (aVar instanceof a.C0665a) {
                    b8 = C1975a.b(c1975a, null, null, null, null, null, C1975a.EnumC0361a.f15369b, null, null, null, null, 991, null);
                } else {
                    throw new O5.p();
                }
                a aVar2 = a.this;
                this.f27869a = 1;
                Object d8 = aVar2.d(b8, this);
                if (d8 == e8) {
                    return e8;
                }
                return d8;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        public a(C1975a creqData, X3.c errorReporter, com.stripe.android.stripe3ds2.transaction.c challengeRequestExecutor, S5.g workContext) {
            AbstractC3255y.i(creqData, "creqData");
            AbstractC3255y.i(errorReporter, "errorReporter");
            AbstractC3255y.i(challengeRequestExecutor, "challengeRequestExecutor");
            AbstractC3255y.i(workContext, "workContext");
            this.f27860a = creqData;
            this.f27861b = errorReporter;
            this.f27862c = challengeRequestExecutor;
            this.f27863d = workContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(1:(8:10|11|12|13|14|(1:16)|17|(1:22)(2:19|20))(2:26|27))(1:28))(2:37|(1:39)(1:40))|29|30|(1:32)(6:33|13|14|(0)|17|(0)(0))))|41|6|(0)(0)|29|30|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        
            r9 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
        
            r0 = r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object d(b4.C1975a r8, S5.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.stripe.android.stripe3ds2.transaction.b.a.C0672b
                if (r0 == 0) goto L13
                r0 = r9
                com.stripe.android.stripe3ds2.transaction.b$a$b r0 = (com.stripe.android.stripe3ds2.transaction.b.a.C0672b) r0
                int r1 = r0.f27868e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27868e = r1
                goto L18
            L13:
                com.stripe.android.stripe3ds2.transaction.b$a$b r0 = new com.stripe.android.stripe3ds2.transaction.b$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f27866c
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f27868e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r8 = r0.f27865b
                b4.a r8 = (b4.C1975a) r8
                java.lang.Object r0 = r0.f27864a
                com.stripe.android.stripe3ds2.transaction.b$a r0 = (com.stripe.android.stripe3ds2.transaction.b.a) r0
                O5.t.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6f
            L34:
                r9 = move-exception
                goto L78
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                java.lang.Object r8 = r0.f27865b
                b4.a r8 = (b4.C1975a) r8
                java.lang.Object r2 = r0.f27864a
                com.stripe.android.stripe3ds2.transaction.b$a r2 = (com.stripe.android.stripe3ds2.transaction.b.a) r2
                O5.t.b(r9)
                goto L5d
            L4a:
                O5.t.b(r9)
                long r5 = com.stripe.android.stripe3ds2.transaction.b.a.f27859f
                r0.f27864a = r7
                r0.f27865b = r8
                r0.f27868e = r4
                java.lang.Object r9 = l6.X.b(r5, r0)
                if (r9 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
            L5d:
                O5.s$a r9 = O5.s.f8302b     // Catch: java.lang.Throwable -> L76
                com.stripe.android.stripe3ds2.transaction.c r9 = r2.f27862c     // Catch: java.lang.Throwable -> L76
                r0.f27864a = r2     // Catch: java.lang.Throwable -> L76
                r0.f27865b = r8     // Catch: java.lang.Throwable -> L76
                r0.f27868e = r3     // Catch: java.lang.Throwable -> L76
                java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> L76
                if (r9 != r1) goto L6e
                return r1
            L6e:
                r0 = r2
            L6f:
                com.stripe.android.stripe3ds2.transaction.d r9 = (com.stripe.android.stripe3ds2.transaction.d) r9     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = O5.s.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L82
            L76:
                r9 = move-exception
                r0 = r2
            L78:
                O5.s$a r1 = O5.s.f8302b
                java.lang.Object r9 = O5.t.a(r9)
                java.lang.Object r9 = O5.s.b(r9)
            L82:
                java.lang.Throwable r1 = O5.s.e(r9)
                if (r1 == 0) goto Lb0
                X3.c r0 = r0.f27861b
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                b4.a r8 = r8.w()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "\n                            Failed to execute challenge request.\n\n                            CReq = "
                r3.append(r4)
                r3.append(r8)
                java.lang.String r8 = "\n                        "
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                java.lang.String r8 = j6.n.e(r8)
                r2.<init>(r8, r1)
                r0.l(r2)
            Lb0:
                java.lang.Throwable r8 = O5.s.e(r9)
                if (r8 != 0) goto Lb7
                goto Lbc
            Lb7:
                com.stripe.android.stripe3ds2.transaction.d$c r9 = new com.stripe.android.stripe3ds2.transaction.d$c
                r9.<init>(r8)
            Lbc:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.b.a.d(b4.a, S5.d):java.lang.Object");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.b
        public Object a(com.stripe.android.stripe3ds2.transaction.a aVar, S5.d dVar) {
            return AbstractC3360i.g(this.f27863d, new c(aVar, null), dVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C1975a creqData, X3.c errorReporter, c.b creqExecutorFactory, S5.g workContext) {
            this(creqData, errorReporter, creqExecutorFactory.H(errorReporter, workContext), workContext);
            AbstractC3255y.i(creqData, "creqData");
            AbstractC3255y.i(errorReporter, "errorReporter");
            AbstractC3255y.i(creqExecutorFactory, "creqExecutorFactory");
            AbstractC3255y.i(workContext, "workContext");
        }
    }
}
