package com.stripe.android.stripe3ds2.transaction;

import L5.I;
import L5.t;
import Y3.a;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.c;
import i6.AbstractC2825i;
import i6.M;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface b {
    Object a(com.stripe.android.stripe3ds2.transaction.a aVar, P5.d dVar);

    /* loaded from: classes4.dex */
    public static final class a implements b {

        /* renamed from: e, reason: collision with root package name */
        public static final C0675a f26803e = new C0675a(null);

        /* renamed from: f, reason: collision with root package name */
        private static final long f26804f = TimeUnit.SECONDS.toMillis(1);

        /* renamed from: a, reason: collision with root package name */
        private final Y3.a f26805a;

        /* renamed from: b, reason: collision with root package name */
        private final U3.c f26806b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.transaction.c f26807c;

        /* renamed from: d, reason: collision with root package name */
        private final P5.g f26808d;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0675a {
            private C0675a() {
            }

            public /* synthetic */ C0675a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.stripe3ds2.transaction.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0676b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f26809a;

            /* renamed from: b, reason: collision with root package name */
            Object f26810b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f26811c;

            /* renamed from: e, reason: collision with root package name */
            int f26813e;

            C0676b(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f26811c = obj;
                this.f26813e |= Integer.MIN_VALUE;
                return a.this.d(null, this);
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f26814a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f26816c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(com.stripe.android.stripe3ds2.transaction.a aVar, P5.d dVar) {
                super(2, dVar);
                this.f26816c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f26816c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Y3.a c8;
                Object e8 = Q5.b.e();
                int i8 = this.f26814a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                Y3.a aVar = new Y3.a(a.this.f26805a.k(), a.this.f26805a.o(), a.this.f26805a.e(), a.this.f26805a.n(), null, null, null, a.this.f26805a.j(), null, null, 880, null);
                com.stripe.android.stripe3ds2.transaction.a aVar2 = this.f26816c;
                if (aVar2 instanceof a.c) {
                    c8 = Y3.a.c(aVar, null, null, null, null, ((a.c) aVar2).b(), null, null, null, null, null, PointerIconCompat.TYPE_CROSSHAIR, null);
                } else if (aVar2 instanceof a.b) {
                    c8 = Y3.a.c(aVar, null, null, null, null, null, null, ((a.b) aVar2).b(), null, null, null, 959, null);
                } else if (aVar2 instanceof a.d) {
                    c8 = Y3.a.c(aVar, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), null, 767, null);
                } else if (aVar2 instanceof a.e) {
                    c8 = Y3.a.c(aVar, null, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), FrameMetricsAggregator.EVERY_DURATION, null);
                } else if (aVar2 instanceof a.C0669a) {
                    c8 = Y3.a.c(aVar, null, null, null, null, null, a.EnumC0247a.f13084b, null, null, null, null, 991, null);
                } else {
                    throw new L5.p();
                }
                a aVar3 = a.this;
                this.f26814a = 1;
                Object d8 = aVar3.d(c8, this);
                if (d8 == e8) {
                    return e8;
                }
                return d8;
            }
        }

        public a(Y3.a creqData, U3.c errorReporter, com.stripe.android.stripe3ds2.transaction.c challengeRequestExecutor, P5.g workContext) {
            AbstractC3159y.i(creqData, "creqData");
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(challengeRequestExecutor, "challengeRequestExecutor");
            AbstractC3159y.i(workContext, "workContext");
            this.f26805a = creqData;
            this.f26806b = errorReporter;
            this.f26807c = challengeRequestExecutor;
            this.f26808d = workContext;
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
        public final java.lang.Object d(Y3.a r8, P5.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.stripe.android.stripe3ds2.transaction.b.a.C0676b
                if (r0 == 0) goto L13
                r0 = r9
                com.stripe.android.stripe3ds2.transaction.b$a$b r0 = (com.stripe.android.stripe3ds2.transaction.b.a.C0676b) r0
                int r1 = r0.f26813e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26813e = r1
                goto L18
            L13:
                com.stripe.android.stripe3ds2.transaction.b$a$b r0 = new com.stripe.android.stripe3ds2.transaction.b$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f26811c
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f26813e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r8 = r0.f26810b
                Y3.a r8 = (Y3.a) r8
                java.lang.Object r0 = r0.f26809a
                com.stripe.android.stripe3ds2.transaction.b$a r0 = (com.stripe.android.stripe3ds2.transaction.b.a) r0
                L5.t.b(r9)     // Catch: java.lang.Throwable -> L34
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
                java.lang.Object r8 = r0.f26810b
                Y3.a r8 = (Y3.a) r8
                java.lang.Object r2 = r0.f26809a
                com.stripe.android.stripe3ds2.transaction.b$a r2 = (com.stripe.android.stripe3ds2.transaction.b.a) r2
                L5.t.b(r9)
                goto L5d
            L4a:
                L5.t.b(r9)
                long r5 = com.stripe.android.stripe3ds2.transaction.b.a.f26804f
                r0.f26809a = r7
                r0.f26810b = r8
                r0.f26813e = r4
                java.lang.Object r9 = i6.X.b(r5, r0)
                if (r9 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
            L5d:
                L5.s$a r9 = L5.s.f6511b     // Catch: java.lang.Throwable -> L76
                com.stripe.android.stripe3ds2.transaction.c r9 = r2.f26807c     // Catch: java.lang.Throwable -> L76
                r0.f26809a = r2     // Catch: java.lang.Throwable -> L76
                r0.f26810b = r8     // Catch: java.lang.Throwable -> L76
                r0.f26813e = r3     // Catch: java.lang.Throwable -> L76
                java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> L76
                if (r9 != r1) goto L6e
                return r1
            L6e:
                r0 = r2
            L6f:
                com.stripe.android.stripe3ds2.transaction.d r9 = (com.stripe.android.stripe3ds2.transaction.d) r9     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = L5.s.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L82
            L76:
                r9 = move-exception
                r0 = r2
            L78:
                L5.s$a r1 = L5.s.f6511b
                java.lang.Object r9 = L5.t.a(r9)
                java.lang.Object r9 = L5.s.b(r9)
            L82:
                java.lang.Throwable r1 = L5.s.e(r9)
                if (r1 == 0) goto Lb0
                U3.c r0 = r0.f26806b
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                Y3.a r8 = r8.u()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "\n                            Failed to execute challenge request.\n\n                            CReq = "
                r3.append(r4)
                r3.append(r8)
                java.lang.String r8 = "\n                        "
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                java.lang.String r8 = g6.n.e(r8)
                r2.<init>(r8, r1)
                r0.i(r2)
            Lb0:
                java.lang.Throwable r8 = L5.s.e(r9)
                if (r8 != 0) goto Lb7
                goto Lbc
            Lb7:
                com.stripe.android.stripe3ds2.transaction.d$c r9 = new com.stripe.android.stripe3ds2.transaction.d$c
                r9.<init>(r8)
            Lbc:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.b.a.d(Y3.a, P5.d):java.lang.Object");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.b
        public Object a(com.stripe.android.stripe3ds2.transaction.a aVar, P5.d dVar) {
            return AbstractC2825i.g(this.f26808d, new c(aVar, null), dVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Y3.a creqData, U3.c errorReporter, c.b creqExecutorFactory, P5.g workContext) {
            this(creqData, errorReporter, creqExecutorFactory.s(errorReporter, workContext), workContext);
            AbstractC3159y.i(creqData, "creqData");
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(creqExecutorFactory, "creqExecutorFactory");
            AbstractC3159y.i(workContext, "workContext");
        }
    }
}
