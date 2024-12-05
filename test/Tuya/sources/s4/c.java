package S4;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import X4.C1498h;
import X4.C1501k;
import X4.J;
import X4.N;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import l5.C3312F;
import l5.C3326n;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f9269a;

    /* renamed from: b, reason: collision with root package name */
    private W4.n f9270b;

    /* renamed from: c, reason: collision with root package name */
    private final M f9271c;

    /* renamed from: d, reason: collision with root package name */
    private int f9272d;

    /* renamed from: e, reason: collision with root package name */
    private int f9273e;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9274a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9274a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                this.f9274a = 1;
                if (cVar.t(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9276a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9278c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9281c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3312F f9282d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0198a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f9283a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f9284b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3312F f9285c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f9286d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0198a(c cVar, C3312F c3312f, T t8, P5.d dVar) {
                    super(2, dVar);
                    this.f9284b = cVar;
                    this.f9285c = c3312f;
                    this.f9286d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0198a(this.f9284b, this.f9285c, this.f9286d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0198a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f9283a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f9284b;
                        C3312F c3312f = this.f9285c;
                        ArrayList arrayList = (ArrayList) this.f9286d.f33761a;
                        this.f9283a = 1;
                        if (cVar.D(c3312f, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9280b = cVar;
                this.f9281c = t8;
                this.f9282d = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9280b, this.f9281c, this.f9282d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2855x0 d8;
                Q5.b.e();
                if (this.f9279a == 0) {
                    t.b(obj);
                    this.f9280b.f9270b.l((ArrayList) this.f9281c.f33761a);
                    d8 = AbstractC2829k.d(this.f9280b.A(), null, null, new C0198a(this.f9280b, this.f9282d, this.f9281c, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9278c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f9278c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9276a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f33761a = new ArrayList();
                C3326n a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("categories");
                if (s02 != null && s02.a()) {
                    t8.f33761a = C1501k.b.b(C1501k.f12634g, s02.b(), 0, 2, null);
                } else {
                    X4.I p8 = this.f9278c.p();
                    if (p8.f()) {
                        C1501k.b bVar = C1501k.f12634g;
                        String d8 = p8.d();
                        AbstractC3159y.f(d8);
                        t8.f33761a = C1501k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J("categories", d9);
                        a8.L("categories");
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33761a).isEmpty()) {
                    c.this.f9273e++;
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, t8, this.f9278c, null);
                    this.f9276a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S4.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0199c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9287a;

        /* renamed from: b, reason: collision with root package name */
        int f9288b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9290a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9291b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9292c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9291b = cVar;
                this.f9292c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9291b, this.f9292c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = Q5.b.e()
                    int r1 = r6.f9290a
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    L5.t.b(r7)
                    goto L63
                L18:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L20:
                    L5.t.b(r7)
                    goto L56
                L24:
                    L5.t.b(r7)
                    goto L49
                L28:
                    L5.t.b(r7)
                    goto L3c
                L2c:
                    L5.t.b(r7)
                    S4.c r7 = r6.f9291b
                    l5.F r1 = r6.f9292c
                    r6.f9290a = r5
                    java.lang.Object r7 = S4.c.e(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    S4.c r7 = r6.f9291b
                    l5.F r1 = r6.f9292c
                    r6.f9290a = r4
                    java.lang.Object r7 = S4.c.a(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    S4.c r7 = r6.f9291b
                    l5.F r1 = r6.f9292c
                    r6.f9290a = r3
                    java.lang.Object r7 = S4.c.d(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    S4.c r7 = r6.f9291b
                    l5.F r1 = r6.f9292c
                    r6.f9290a = r2
                    java.lang.Object r7 = S4.c.k(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    L5.I r7 = L5.I.f6487a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: S4.c.C0199c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9293a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9294b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, P5.d dVar) {
                super(2, dVar);
                this.f9294b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9294b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9293a == 0) {
                    t.b(obj);
                    this.f9294b.f9270b.e();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0200c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9295a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9296b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9297c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0200c(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9296b = cVar;
                this.f9297c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0200c(this.f9296b, this.f9297c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0200c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9295a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9296b;
                    C3312F c3312f = this.f9297c;
                    this.f9295a = 1;
                    if (cVar.w(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$d */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9298a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9299b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9300c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9299b = cVar;
                this.f9300c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f9299b, this.f9300c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9298a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9299b;
                    C3312F c3312f = this.f9300c;
                    this.f9298a = 1;
                    if (cVar.z(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$e */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9301a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9302b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9303c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9302b = cVar;
                this.f9303c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f9302b, this.f9303c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9301a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9302b;
                    C3312F c3312f = this.f9303c;
                    this.f9301a = 1;
                    if (cVar.C(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$f */
        /* loaded from: classes4.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9304a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9305b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9306c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9305b = cVar;
                this.f9306c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new f(this.f9305b, this.f9306c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9304a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9305b;
                    C3312F c3312f = this.f9306c;
                    this.f9304a = 1;
                    if (cVar.x(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        C0199c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0199c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0199c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r11.f9288b
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r2) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r11.f9287a
                l5.F r0 = (l5.C3312F) r0
                L5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f9287a
                l5.F r1 = (l5.C3312F) r1
                L5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                L5.t.b(r12)
                S4.c r12 = S4.c.this
                r1 = 0
                S4.c.r(r12, r1)
                l5.F r12 = new l5.F
                S4.c r1 = S4.c.this
                android.content.Context r1 = S4.c.b(r1)
                r12.<init>(r1)
                S4.c r1 = S4.c.this
                i6.M r5 = r1.A()
                S4.c$c$a r8 = new S4.c$c$a
                S4.c r1 = S4.c.this
                r8.<init>(r1, r12, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                i6.x0 r1 = i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                r11.f9287a = r12
                r11.f9288b = r2
                java.lang.Object r1 = r1.e(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                i6.J0 r1 = i6.C2812b0.c()
                S4.c$c$b r2 = new S4.c$c$b
                S4.c r5 = S4.c.this
                r2.<init>(r5, r4)
                r11.f9287a = r12
                r11.f9288b = r3
                java.lang.Object r1 = i6.AbstractC2825i.g(r1, r2, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                S4.c r12 = S4.c.this
                int r12 = S4.c.j(r12)
                if (r12 < r3) goto Lbf
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$c r8 = new S4.c$c$c
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$d r8 = new S4.c$c$d
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$e r8 = new S4.c$c$e
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$f r8 = new S4.c$c$f
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
            Lbf:
                L5.I r12 = L5.I.f6487a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.c.C0199c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9307a;

        /* renamed from: b, reason: collision with root package name */
        int f9308b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3312F f9310d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9311a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9312b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9313c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3312F f9314d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f9315e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.c$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0201a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f9316a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f9317b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3312F f9318c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f9319d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0201a(c cVar, C3312F c3312f, T t8, P5.d dVar) {
                    super(2, dVar);
                    this.f9317b = cVar;
                    this.f9318c = c3312f;
                    this.f9319d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0201a(this.f9317b, this.f9318c, this.f9319d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0201a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f9316a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f9317b;
                        C3312F c3312f = this.f9318c;
                        ArrayList arrayList = (ArrayList) this.f9319d.f33761a;
                        this.f9316a = 1;
                        if (cVar.E(c3312f, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, C3312F c3312f, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9312b = cVar;
                this.f9313c = n8;
                this.f9314d = c3312f;
                this.f9315e = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9312b, this.f9313c, this.f9314d, this.f9315e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2855x0 d8;
                Q5.b.e();
                if (this.f9311a == 0) {
                    t.b(obj);
                    this.f9312b.f9270b.h(this.f9313c);
                    d8 = AbstractC2829k.d(this.f9312b.A(), null, null, new C0201a(this.f9312b, this.f9314d, this.f9315e, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9310d = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f9310d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3326n a8;
            C3326n c3326n;
            Object e8 = Q5.b.e();
            int i8 = this.f9308b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3326n = (C3326n) this.f9307a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f33761a = new ArrayList();
                a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("floating_categories");
                if (s02 != null && s02.a()) {
                    t8.f33761a = C1501k.f12634g.c(s02.b());
                } else {
                    X4.I v8 = this.f9310d.v();
                    if (v8.f()) {
                        C1501k.b bVar = C1501k.f12634g;
                        String d8 = v8.d();
                        AbstractC3159y.f(d8);
                        t8.f33761a = bVar.c(d8);
                        String d9 = v8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J("floating_categories", d9);
                        a8.L("floating_categories");
                        a8.O0(j8);
                    }
                }
                if (!((Collection) t8.f33761a).isEmpty()) {
                    N B8 = c.this.B((C1501k) AbstractC1246t.m0((List) t8.f33761a), this.f9310d, a8);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, B8, this.f9310d, t8, null);
                    this.f9307a = a8;
                    this.f9308b = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                    c3326n = a8;
                }
                a8.g();
                return I.f6487a;
            }
            a8 = c3326n;
            a8.g();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9320a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9322c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9324b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9325c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9324b = cVar;
                this.f9325c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9324b, this.f9325c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9323a == 0) {
                    t.b(obj);
                    this.f9324b.f9270b.d((ArrayList) this.f9325c.f33761a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9322c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f9322c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9320a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f33761a = new ArrayList();
                C3326n a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("home_features");
                if (s02 != null && s02.a()) {
                    t8.f33761a = this.f9322c.F0(s02.c());
                } else {
                    X4.I y8 = this.f9322c.y();
                    if (y8.f()) {
                        t8.f33761a = this.f9322c.F0(y8);
                        String d8 = y8.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("home_features", d8);
                        a8.L("home_features");
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33761a).isEmpty()) {
                    c.this.f9273e++;
                    c.this.f9272d = -1;
                    Iterator it = ((ArrayList) t8.f33761a).iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (g6.n.s(((C1498h) it.next()).y0(), c.this.f9269a.getPackageName(), true)) {
                            c.this.f9272d = i9;
                        }
                        i9 = i10;
                    }
                    if (c.this.f9272d > -1 && c.this.f9272d < ((ArrayList) t8.f33761a).size()) {
                        ((ArrayList) t8.f33761a).remove(c.this.f9272d);
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(c.this, t8, null);
                this.f9320a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9326a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9328c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9329a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9330b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9331c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9330b = cVar;
                this.f9331c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9330b, this.f9331c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9329a == 0) {
                    t.b(obj);
                    this.f9330b.f9270b.f(this.f9331c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9328c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9328c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9326a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3326n a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("last_updates");
                if (s02 != null && s02.a()) {
                    arrayList = this.f9328c.F0(s02.c());
                } else {
                    X4.I E8 = this.f9328c.E(20, 0);
                    if (E8.f()) {
                        arrayList = this.f9328c.F0(E8);
                        String d8 = E8.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("last_updates", d8);
                        a8.L("last_updates");
                        a8.O0(j8);
                    }
                }
                ArrayList arrayList2 = arrayList;
                a8.g();
                String string = c.this.f9269a.getString(R.string.latest_updates);
                AbstractC3159y.h(string, "context.getString(R.string.latest_updates)");
                N n8 = new N(new C1501k(-3, string, null, 4, null), arrayList2, 0, 4, null);
                n8.f(1);
                J0 c8 = C2812b0.c();
                a aVar = new a(c.this, n8, null);
                this.f9326a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9332a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9334c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9335a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f9336b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f9337c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T t8, c cVar, P5.d dVar) {
                super(2, dVar);
                this.f9336b = t8;
                this.f9337c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9336b, this.f9337c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9335a == 0) {
                    t.b(obj);
                    if (this.f9336b.f33761a != null) {
                        this.f9337c.f9270b.k((C1498h) this.f9336b.f33761a);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9334c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9334c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9332a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3326n a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("main_app");
                if (s02 != null && s02.a()) {
                    JSONObject jsonObjectData = new JSONObject(s02.b()).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    C1498h c1498h = new C1498h();
                    t8.f33761a = c1498h;
                    AbstractC3159y.h(jsonObjectData, "jsonObjectData");
                    c1498h.b(jsonObjectData);
                } else {
                    X4.I F8 = this.f9334c.F();
                    if (F8.f()) {
                        String d8 = F8.d();
                        AbstractC3159y.f(d8);
                        JSONObject jsonObjectData2 = new JSONObject(d8).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        C1498h c1498h2 = new C1498h();
                        t8.f33761a = c1498h2;
                        AbstractC3159y.h(jsonObjectData2, "jsonObjectData");
                        c1498h2.b(jsonObjectData2);
                        String d9 = F8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J("main_app", d9);
                        a8.L("main_app");
                        a8.O0(j8);
                    }
                }
                a8.g();
                J0 c8 = C2812b0.c();
                a aVar = new a(t8, c.this, null);
                this.f9332a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9338a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9340c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9341a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9342b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9343c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9342b = cVar;
                this.f9343c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9342b, this.f9343c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9341a == 0) {
                    t.b(obj);
                    this.f9342b.f9270b.c(this.f9343c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9340c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f9340c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = Q5.b.e();
            int i8 = this.f9338a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3326n a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("new_releases");
                if (s02 != null && s02.a()) {
                    arrayList = this.f9340c.F0(s02.c());
                } else {
                    X4.I I8 = this.f9340c.I(20, 0);
                    if (I8.f()) {
                        ArrayList F02 = this.f9340c.F0(I8);
                        String d8 = I8.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("new_releases", d8);
                        a8.L("new_releases");
                        a8.O0(j8);
                        arrayList = F02;
                    } else {
                        arrayList = null;
                    }
                }
                a8.g();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = c.this.f9269a.getString(R.string.new_releases);
                    AbstractC3159y.h(string, "context.getString(R.string.new_releases)");
                    N n8 = new N(new C1501k(-2, string, null, 4, null), arrayList, 0, 4, null);
                    n8.f(1);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, n8, null);
                    this.f9338a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9344a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9346c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9347a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9348b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9349c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9348b = cVar;
                this.f9349c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9348b, this.f9349c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9347a == 0) {
                    t.b(obj);
                    this.f9348b.f9270b.g((ArrayList) this.f9349c.f33761a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9346c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f9346c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9344a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3326n a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("recent_featured");
                if (s02 != null && s02.a()) {
                    t8.f33761a = this.f9346c.F0(s02.c());
                } else {
                    X4.I T7 = this.f9346c.T(1, 0);
                    if (T7.f()) {
                        t8.f33761a = this.f9346c.F0(T7);
                        String d8 = T7.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("recent_featured", d8);
                        a8.L("recent_featured");
                        a8.O0(j8);
                    }
                }
                a8.g();
                Collection collection = (Collection) t8.f33761a;
                if (collection != null && !collection.isEmpty()) {
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, t8, null);
                    this.f9344a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9350a;

        /* renamed from: b, reason: collision with root package name */
        Object f9351b;

        /* renamed from: c, reason: collision with root package name */
        int f9352c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3312F f9354e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9355a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9356b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9357c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9356b = cVar;
                this.f9357c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9356b, this.f9357c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9355a == 0) {
                    t.b(obj);
                    this.f9356b.f9270b.a(this.f9357c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9358a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9359b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9360c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9359b = cVar;
                this.f9360c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9359b, this.f9360c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9358a == 0) {
                    t.b(obj);
                    this.f9359b.f9270b.j((C1498h) this.f9360c.f33761a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9354e = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f9354e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3326n a8;
            ArrayList arrayList;
            C3326n c3326n;
            Object e8 = Q5.b.e();
            int i8 = this.f9352c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3326n = (C3326n) this.f9350a;
                        t.b(obj);
                        a8 = c3326n;
                        a8.g();
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8 = (C3326n) this.f9351b;
                arrayList = (ArrayList) this.f9350a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                J s02 = a8.s0("top_downloads");
                if (s02 != null && s02.a()) {
                    arrayList2 = this.f9354e.F0(s02.c());
                } else {
                    X4.I a02 = this.f9354e.a0(20, 0);
                    if (a02.f()) {
                        arrayList2 = this.f9354e.F0(a02);
                        String d8 = a02.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("top_downloads", d8);
                        a8.L("top_downloads");
                        a8.O0(j8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = c.this.f9269a.getString(R.string.top_downloads_title);
                    AbstractC3159y.h(string, "context.getString(R.string.top_downloads_title)");
                    N n8 = new N(new C1501k(-1, string, null, 4, null), arrayList, 0, 4, null);
                    n8.f(8);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, n8, null);
                    this.f9350a = arrayList;
                    this.f9351b = a8;
                    this.f9352c = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a8.g();
                return I.f6487a;
            }
            if (c.this.f9272d > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1498h c1498h = (C1498h) it.next();
                    if (!g6.n.s(c1498h.y0(), c.this.f9269a.getPackageName(), true)) {
                        t8.f33761a = c1498h;
                        break;
                    }
                }
                if (t8.f33761a != null) {
                    J0 c9 = C2812b0.c();
                    b bVar = new b(c.this, t8, null);
                    this.f9350a = a8;
                    this.f9351b = null;
                    this.f9352c = 2;
                    if (AbstractC2825i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                    c3326n = a8;
                    a8 = c3326n;
                }
            }
            a8.g();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9361a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f9363c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3312F f9364d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9365a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9366b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9367c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f9366b = cVar;
                this.f9367c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9366b, this.f9367c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9365a == 0) {
                    t.b(obj);
                    this.f9366b.f9270b.b(this.f9367c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList, C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9363c = arrayList;
            this.f9364d = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f9363c, this.f9364d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9361a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3326n a8 = C3326n.f34504t.a(c.this.f9269a);
                a8.a();
                Iterator it = this.f9363c.iterator();
                while (it.hasNext()) {
                    C1501k category = (C1501k) it.next();
                    c cVar = c.this;
                    AbstractC3159y.h(category, "category");
                    arrayList.add(cVar.B(category, this.f9364d, a8));
                }
                a8.g();
                J0 c8 = C2812b0.c();
                a aVar = new a(c.this, arrayList, null);
                this.f9361a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f9369b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f9370c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3312F f9371d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9372a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9373b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9374c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f9373b = cVar;
                this.f9374c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9373b, this.f9374c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9372a == 0) {
                    t.b(obj);
                    this.f9373b.f9270b.i(this.f9374c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ArrayList arrayList, c cVar, C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9369b = arrayList;
            this.f9370c = cVar;
            this.f9371d = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(this.f9369b, this.f9370c, this.f9371d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9368a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (!this.f9369b.isEmpty()) {
                    C3326n a8 = C3326n.f34504t.a(this.f9370c.f9269a);
                    a8.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f9369b.iterator();
                    while (it.hasNext()) {
                        C1501k floatingCategory = (C1501k) it.next();
                        c cVar = this.f9370c;
                        AbstractC3159y.h(floatingCategory, "floatingCategory");
                        arrayList.add(cVar.B(floatingCategory, this.f9371d, a8));
                    }
                    a8.g();
                    J0 c8 = C2812b0.c();
                    a aVar = new a(this.f9370c, arrayList, null);
                    this.f9368a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    public c(Context context, W4.n listener, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(scope, "scope");
        this.f9269a = context;
        this.f9270b = listener;
        this.f9271c = scope;
        this.f9272d = -1;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N B(C1501k c1501k, C3312F c3312f, C3326n c3326n) {
        String str;
        X4.I b02;
        int i8 = 5;
        int i9 = 20;
        if (c1501k.n()) {
            str = "floating_category_top_" + c1501k.c();
        } else {
            str = "category_top_" + c1501k.c();
            int c8 = c1501k.c();
            if (c8 != 521) {
                if (c8 != 523) {
                    if (c8 != 524) {
                        i9 = 12;
                        i8 = 6;
                    }
                } else {
                    if (!UptodownApp.f28003B.S()) {
                        i8 = 4;
                    }
                    i9 = 8;
                }
            }
            i8 = 1;
        }
        ArrayList arrayList = new ArrayList();
        J s02 = c3326n.s0(str);
        if (s02 != null && s02.a()) {
            arrayList = c3312f.F0(s02.c());
        } else {
            if (c1501k.n()) {
                b02 = c3312f.d0(c1501k.c(), i9, 0);
            } else {
                b02 = c3312f.b0(c1501k.c(), i9, 0);
            }
            if (b02.f()) {
                arrayList = c3312f.F0(b02);
                String d8 = b02.d();
                AbstractC3159y.f(d8);
                J j8 = new J(str, d8);
                c3326n.L(str);
                c3326n.O0(j8);
            }
        }
        N n8 = new N(c1501k, arrayList, 0, 4, null);
        n8.f(i8);
        return n8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new j(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(C3312F c3312f, ArrayList arrayList, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new k(arrayList, c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(C3312F c3312f, ArrayList arrayList, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new l(arrayList, this, c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new C0199c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new h(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new i(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final M A() {
        return this.f9271c;
    }
}
