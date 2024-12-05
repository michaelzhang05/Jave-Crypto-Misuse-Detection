package V4;

import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a5.C1641h;
import a5.C1644k;
import a5.J;
import a5.N;
import a6.InterfaceC1668n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.J0;
import l6.M;
import o5.C3660F;
import o5.C3674n;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f10912a;

    /* renamed from: b, reason: collision with root package name */
    private Z4.n f10913b;

    /* renamed from: c, reason: collision with root package name */
    private final M f10914c;

    /* renamed from: d, reason: collision with root package name */
    private int f10915d;

    /* renamed from: e, reason: collision with root package name */
    private int f10916e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10917a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10917a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                this.f10917a = 1;
                if (cVar.t(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10919a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f10921c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10922a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10923b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f10924c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3660F f10925d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: V4.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0223a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f10926a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f10927b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3660F f10928c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f10929d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0223a(c cVar, C3660F c3660f, T t8, S5.d dVar) {
                    super(2, dVar);
                    this.f10927b = cVar;
                    this.f10928c = c3660f;
                    this.f10929d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0223a(this.f10927b, this.f10928c, this.f10929d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f10926a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f10927b;
                        C3660F c3660f = this.f10928c;
                        ArrayList arrayList = (ArrayList) this.f10929d.f34162a;
                        this.f10926a = 1;
                        if (cVar.D(c3660f, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0223a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f10923b = cVar;
                this.f10924c = t8;
                this.f10925d = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10923b, this.f10924c, this.f10925d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3390x0 d8;
                T5.b.e();
                if (this.f10922a == 0) {
                    t.b(obj);
                    this.f10923b.f10913b.l((ArrayList) this.f10924c.f34162a);
                    d8 = AbstractC3364k.d(this.f10923b.A(), null, null, new C0223a(this.f10923b, this.f10925d, this.f10924c, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10921c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f10921c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10919a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34162a = new ArrayList();
                C3674n a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("categories");
                if (s02 != null && s02.a()) {
                    t8.f34162a = C1644k.b.b(C1644k.f14255g, s02.b(), 0, 2, null);
                } else {
                    a5.I p8 = this.f10921c.p();
                    if (p8.f()) {
                        C1644k.b bVar = C1644k.f14255g;
                        String d8 = p8.d();
                        AbstractC3255y.f(d8);
                        t8.f34162a = C1644k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3255y.f(d9);
                        J j8 = new J("categories", d9);
                        a8.L("categories");
                        a8.O0(j8);
                    }
                }
                a8.l();
                if (!((Collection) t8.f34162a).isEmpty()) {
                    c.this.f10916e++;
                    J0 c8 = C3347b0.c();
                    a aVar = new a(c.this, t8, this.f10921c, null);
                    this.f10919a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V4.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0224c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f10930a;

        /* renamed from: b, reason: collision with root package name */
        int f10931b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.c$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10933a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10934b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f10935c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f10934b = cVar;
                this.f10935c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10934b, this.f10935c, dVar);
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
                    java.lang.Object r0 = T5.b.e()
                    int r1 = r6.f10933a
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    O5.t.b(r7)
                    goto L63
                L18:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L20:
                    O5.t.b(r7)
                    goto L56
                L24:
                    O5.t.b(r7)
                    goto L49
                L28:
                    O5.t.b(r7)
                    goto L3c
                L2c:
                    O5.t.b(r7)
                    V4.c r7 = r6.f10934b
                    o5.F r1 = r6.f10935c
                    r6.f10933a = r5
                    java.lang.Object r7 = V4.c.e(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    V4.c r7 = r6.f10934b
                    o5.F r1 = r6.f10935c
                    r6.f10933a = r4
                    java.lang.Object r7 = V4.c.a(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    V4.c r7 = r6.f10934b
                    o5.F r1 = r6.f10935c
                    r6.f10933a = r3
                    java.lang.Object r7 = V4.c.d(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    V4.c r7 = r6.f10934b
                    o5.F r1 = r6.f10935c
                    r6.f10933a = r2
                    java.lang.Object r7 = V4.c.k(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    O5.I r7 = O5.I.f8278a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: V4.c.C0224c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.c$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10936a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10937b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, S5.d dVar) {
                super(2, dVar);
                this.f10937b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f10937b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10936a == 0) {
                    t.b(obj);
                    this.f10937b.f10913b.h();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.c$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0225c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10938a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10939b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f10940c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0225c(c cVar, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f10939b = cVar;
                this.f10940c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0225c(this.f10939b, this.f10940c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f10938a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f10939b;
                    C3660F c3660f = this.f10940c;
                    this.f10938a = 1;
                    if (cVar.w(c3660f, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0225c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.c$c$d */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10941a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10942b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f10943c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(c cVar, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f10942b = cVar;
                this.f10943c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f10942b, this.f10943c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f10941a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f10942b;
                    C3660F c3660f = this.f10943c;
                    this.f10941a = 1;
                    if (cVar.z(c3660f, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.c$c$e */
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10944a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10945b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f10946c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(c cVar, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f10945b = cVar;
                this.f10946c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f10945b, this.f10946c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f10944a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f10945b;
                    C3660F c3660f = this.f10946c;
                    this.f10944a = 1;
                    if (cVar.C(c3660f, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.c$c$f */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10947a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10948b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f10949c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(c cVar, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f10948b = cVar;
                this.f10949c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new f(this.f10948b, this.f10949c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f10947a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f10948b;
                    C3660F c3660f = this.f10949c;
                    this.f10947a = 1;
                    if (cVar.x(c3660f, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        C0224c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0224c(dVar);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r11.f10931b
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r2) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r11.f10930a
                o5.F r0 = (o5.C3660F) r0
                O5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f10930a
                o5.F r1 = (o5.C3660F) r1
                O5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                O5.t.b(r12)
                V4.c r12 = V4.c.this
                r1 = 0
                V4.c.r(r12, r1)
                o5.F r12 = new o5.F
                V4.c r1 = V4.c.this
                android.content.Context r1 = V4.c.b(r1)
                r12.<init>(r1)
                V4.c r1 = V4.c.this
                l6.M r5 = r1.A()
                V4.c$c$a r8 = new V4.c$c$a
                V4.c r1 = V4.c.this
                r8.<init>(r1, r12, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                l6.x0 r1 = l6.AbstractC3360i.d(r5, r6, r7, r8, r9, r10)
                r11.f10930a = r12
                r11.f10931b = r2
                java.lang.Object r1 = r1.y(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                l6.J0 r1 = l6.C3347b0.c()
                V4.c$c$b r2 = new V4.c$c$b
                V4.c r5 = V4.c.this
                r2.<init>(r5, r4)
                r11.f10930a = r12
                r11.f10931b = r3
                java.lang.Object r1 = l6.AbstractC3360i.g(r1, r2, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                V4.c r12 = V4.c.this
                int r12 = V4.c.j(r12)
                if (r12 < r3) goto Lbf
                V4.c r12 = V4.c.this
                l6.M r5 = r12.A()
                V4.c$c$c r8 = new V4.c$c$c
                V4.c r12 = V4.c.this
                r8.<init>(r12, r0, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                l6.AbstractC3360i.d(r5, r6, r7, r8, r9, r10)
                V4.c r12 = V4.c.this
                l6.M r5 = r12.A()
                V4.c$c$d r8 = new V4.c$c$d
                V4.c r12 = V4.c.this
                r8.<init>(r12, r0, r4)
                l6.AbstractC3360i.d(r5, r6, r7, r8, r9, r10)
                V4.c r12 = V4.c.this
                l6.M r5 = r12.A()
                V4.c$c$e r8 = new V4.c$c$e
                V4.c r12 = V4.c.this
                r8.<init>(r12, r0, r4)
                l6.AbstractC3360i.d(r5, r6, r7, r8, r9, r10)
                V4.c r12 = V4.c.this
                l6.M r5 = r12.A()
                V4.c$c$f r8 = new V4.c$c$f
                V4.c r12 = V4.c.this
                r8.<init>(r12, r0, r4)
                l6.AbstractC3360i.d(r5, r6, r7, r8, r9, r10)
            Lbf:
                O5.I r12 = O5.I.f8278a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: V4.c.C0224c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0224c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f10950a;

        /* renamed from: b, reason: collision with root package name */
        int f10951b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3660F f10953d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10954a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10955b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f10956c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3660F f10957d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f10958e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: V4.c$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0226a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f10959a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f10960b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3660F f10961c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f10962d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0226a(c cVar, C3660F c3660f, T t8, S5.d dVar) {
                    super(2, dVar);
                    this.f10960b = cVar;
                    this.f10961c = c3660f;
                    this.f10962d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0226a(this.f10960b, this.f10961c, this.f10962d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f10959a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f10960b;
                        C3660F c3660f = this.f10961c;
                        ArrayList arrayList = (ArrayList) this.f10962d.f34162a;
                        this.f10959a = 1;
                        if (cVar.E(c3660f, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0226a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, C3660F c3660f, T t8, S5.d dVar) {
                super(2, dVar);
                this.f10955b = cVar;
                this.f10956c = n8;
                this.f10957d = c3660f;
                this.f10958e = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10955b, this.f10956c, this.f10957d, this.f10958e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3390x0 d8;
                T5.b.e();
                if (this.f10954a == 0) {
                    t.b(obj);
                    this.f10955b.f10913b.e(this.f10956c);
                    d8 = AbstractC3364k.d(this.f10955b.A(), null, null, new C0226a(this.f10955b, this.f10957d, this.f10958e, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10953d = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f10953d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3674n a8;
            C3674n c3674n;
            Object e8 = T5.b.e();
            int i8 = this.f10951b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3674n = (C3674n) this.f10950a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34162a = new ArrayList();
                a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("floating_categories");
                if (s02 != null && s02.a()) {
                    t8.f34162a = C1644k.f14255g.c(s02.b());
                } else {
                    a5.I v8 = this.f10953d.v();
                    if (v8.f()) {
                        C1644k.b bVar = C1644k.f14255g;
                        String d8 = v8.d();
                        AbstractC3255y.f(d8);
                        t8.f34162a = bVar.c(d8);
                        String d9 = v8.d();
                        AbstractC3255y.f(d9);
                        J j8 = new J("floating_categories", d9);
                        a8.L("floating_categories");
                        a8.O0(j8);
                    }
                }
                if (!((Collection) t8.f34162a).isEmpty()) {
                    N B8 = c.this.B((C1644k) AbstractC1378t.m0((List) t8.f34162a), this.f10953d, a8);
                    J0 c8 = C3347b0.c();
                    a aVar = new a(c.this, B8, this.f10953d, t8, null);
                    this.f10950a = a8;
                    this.f10951b = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                    c3674n = a8;
                }
                a8.l();
                return I.f8278a;
            }
            a8 = c3674n;
            a8.l();
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10963a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f10965c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10966a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10967b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f10968c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, S5.d dVar) {
                super(2, dVar);
                this.f10967b = cVar;
                this.f10968c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10967b, this.f10968c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10966a == 0) {
                    t.b(obj);
                    this.f10967b.f10913b.d((ArrayList) this.f10968c.f34162a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10965c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f10965c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10963a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34162a = new ArrayList();
                C3674n a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("home_features");
                if (s02 != null && s02.a()) {
                    t8.f34162a = this.f10965c.F0(s02.c());
                } else {
                    a5.I y8 = this.f10965c.y();
                    if (y8.f()) {
                        t8.f34162a = this.f10965c.F0(y8);
                        String d8 = y8.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J("home_features", d8);
                        a8.L("home_features");
                        a8.O0(j8);
                    }
                }
                a8.l();
                if (!((Collection) t8.f34162a).isEmpty()) {
                    c.this.f10916e++;
                    c.this.f10915d = -1;
                    Iterator it = ((ArrayList) t8.f34162a).iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (j6.n.s(((C1641h) it.next()).y0(), c.this.f10912a.getPackageName(), true)) {
                            c.this.f10915d = i9;
                        }
                        i9 = i10;
                    }
                    if (c.this.f10915d > -1 && c.this.f10915d < ((ArrayList) t8.f34162a).size()) {
                        ((ArrayList) t8.f34162a).remove(c.this.f10915d);
                    }
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(c.this, t8, null);
                this.f10963a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10969a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f10971c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10972a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10973b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f10974c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, S5.d dVar) {
                super(2, dVar);
                this.f10973b = cVar;
                this.f10974c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10973b, this.f10974c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10972a == 0) {
                    t.b(obj);
                    this.f10973b.f10913b.f(this.f10974c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10971c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f10971c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10969a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3674n a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("last_updates");
                if (s02 != null && s02.a()) {
                    arrayList = this.f10971c.F0(s02.c());
                } else {
                    a5.I E8 = this.f10971c.E(20, 0);
                    if (E8.f()) {
                        arrayList = this.f10971c.F0(E8);
                        String d8 = E8.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J("last_updates", d8);
                        a8.L("last_updates");
                        a8.O0(j8);
                    }
                }
                ArrayList arrayList2 = arrayList;
                a8.l();
                String string = c.this.f10912a.getString(R.string.latest_updates);
                AbstractC3255y.h(string, "context.getString(R.string.latest_updates)");
                N n8 = new N(new C1644k(-3, string, null, 4, null), arrayList2, 0, 4, null);
                n8.f(1);
                J0 c8 = C3347b0.c();
                a aVar = new a(c.this, n8, null);
                this.f10969a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10975a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f10977c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10978a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f10979b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f10980c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T t8, c cVar, S5.d dVar) {
                super(2, dVar);
                this.f10979b = t8;
                this.f10980c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10979b, this.f10980c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10978a == 0) {
                    t.b(obj);
                    if (this.f10979b.f34162a != null) {
                        this.f10980c.f10913b.c((C1641h) this.f10979b.f34162a);
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10977c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f10977c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10975a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3674n a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("main_app");
                if (s02 != null && s02.a()) {
                    JSONObject jsonObjectData = new JSONObject(s02.b()).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    C1641h c1641h = new C1641h();
                    t8.f34162a = c1641h;
                    AbstractC3255y.h(jsonObjectData, "jsonObjectData");
                    c1641h.a(jsonObjectData);
                } else {
                    a5.I F8 = this.f10977c.F();
                    if (F8.f()) {
                        String d8 = F8.d();
                        AbstractC3255y.f(d8);
                        JSONObject jsonObjectData2 = new JSONObject(d8).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        C1641h c1641h2 = new C1641h();
                        t8.f34162a = c1641h2;
                        AbstractC3255y.h(jsonObjectData2, "jsonObjectData");
                        c1641h2.a(jsonObjectData2);
                        String d9 = F8.d();
                        AbstractC3255y.f(d9);
                        J j8 = new J("main_app", d9);
                        a8.L("main_app");
                        a8.O0(j8);
                    }
                }
                a8.l();
                J0 c8 = C3347b0.c();
                a aVar = new a(t8, c.this, null);
                this.f10975a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10981a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f10983c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10984a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10985b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f10986c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, S5.d dVar) {
                super(2, dVar);
                this.f10985b = cVar;
                this.f10986c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10985b, this.f10986c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10984a == 0) {
                    t.b(obj);
                    this.f10985b.f10913b.g(this.f10986c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10983c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f10983c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = T5.b.e();
            int i8 = this.f10981a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3674n a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("new_releases");
                if (s02 != null && s02.a()) {
                    arrayList = this.f10983c.F0(s02.c());
                } else {
                    a5.I I8 = this.f10983c.I(20, 0);
                    if (I8.f()) {
                        ArrayList F02 = this.f10983c.F0(I8);
                        String d8 = I8.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J("new_releases", d8);
                        a8.L("new_releases");
                        a8.O0(j8);
                        arrayList = F02;
                    } else {
                        arrayList = null;
                    }
                }
                a8.l();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = c.this.f10912a.getString(R.string.new_releases);
                    AbstractC3255y.h(string, "context.getString(R.string.new_releases)");
                    N n8 = new N(new C1644k(-2, string, null, 4, null), arrayList, 0, 4, null);
                    n8.f(1);
                    J0 c8 = C3347b0.c();
                    a aVar = new a(c.this, n8, null);
                    this.f10981a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10987a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f10989c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10990a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10991b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f10992c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, S5.d dVar) {
                super(2, dVar);
                this.f10991b = cVar;
                this.f10992c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10991b, this.f10992c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10990a == 0) {
                    t.b(obj);
                    this.f10991b.f10913b.j((ArrayList) this.f10992c.f34162a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10989c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f10989c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10987a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3674n a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("recent_featured");
                if (s02 != null && s02.a()) {
                    t8.f34162a = this.f10989c.F0(s02.c());
                } else {
                    a5.I T8 = this.f10989c.T(1, 0);
                    if (T8.f()) {
                        t8.f34162a = this.f10989c.F0(T8);
                        String d8 = T8.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J("recent_featured", d8);
                        a8.L("recent_featured");
                        a8.O0(j8);
                    }
                }
                a8.l();
                Collection collection = (Collection) t8.f34162a;
                if (collection != null && !collection.isEmpty()) {
                    J0 c8 = C3347b0.c();
                    a aVar = new a(c.this, t8, null);
                    this.f10987a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f10993a;

        /* renamed from: b, reason: collision with root package name */
        Object f10994b;

        /* renamed from: c, reason: collision with root package name */
        int f10995c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3660F f10997e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10998a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f10999b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f11000c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, S5.d dVar) {
                super(2, dVar);
                this.f10999b = cVar;
                this.f11000c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10999b, this.f11000c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10998a == 0) {
                    t.b(obj);
                    this.f10999b.f10913b.a(this.f11000c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11001a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11002b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11003c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, T t8, S5.d dVar) {
                super(2, dVar);
                this.f11002b = cVar;
                this.f11003c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f11002b, this.f11003c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11001a == 0) {
                    t.b(obj);
                    this.f11002b.f10913b.i((C1641h) this.f11003c.f34162a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f10997e = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(this.f10997e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3674n a8;
            ArrayList arrayList;
            C3674n c3674n;
            Object e8 = T5.b.e();
            int i8 = this.f10995c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3674n = (C3674n) this.f10993a;
                        t.b(obj);
                        a8 = c3674n;
                        a8.l();
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8 = (C3674n) this.f10994b;
                arrayList = (ArrayList) this.f10993a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                J s02 = a8.s0("top_downloads");
                if (s02 != null && s02.a()) {
                    arrayList2 = this.f10997e.F0(s02.c());
                } else {
                    a5.I a02 = this.f10997e.a0(20, 0);
                    if (a02.f()) {
                        arrayList2 = this.f10997e.F0(a02);
                        String d8 = a02.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J("top_downloads", d8);
                        a8.L("top_downloads");
                        a8.O0(j8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = c.this.f10912a.getString(R.string.top_downloads_title);
                    AbstractC3255y.h(string, "context.getString(R.string.top_downloads_title)");
                    N n8 = new N(new C1644k(-1, string, null, 4, null), arrayList, 0, 4, null);
                    n8.f(8);
                    J0 c8 = C3347b0.c();
                    a aVar = new a(c.this, n8, null);
                    this.f10993a = arrayList;
                    this.f10994b = a8;
                    this.f10995c = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a8.l();
                return I.f8278a;
            }
            if (c.this.f10915d > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1641h c1641h = (C1641h) it.next();
                    if (!j6.n.s(c1641h.y0(), c.this.f10912a.getPackageName(), true)) {
                        t8.f34162a = c1641h;
                        break;
                    }
                }
                if (t8.f34162a != null) {
                    J0 c9 = C3347b0.c();
                    b bVar = new b(c.this, t8, null);
                    this.f10993a = a8;
                    this.f10994b = null;
                    this.f10995c = 2;
                    if (AbstractC3360i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                    c3674n = a8;
                    a8 = c3674n;
                }
            }
            a8.l();
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11004a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f11006c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3660F f11007d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11008a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11009b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f11010c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, S5.d dVar) {
                super(2, dVar);
                this.f11009b = cVar;
                this.f11010c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11009b, this.f11010c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11008a == 0) {
                    t.b(obj);
                    this.f11009b.f10913b.b(this.f11010c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList, C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11006c = arrayList;
            this.f11007d = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f11006c, this.f11007d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11004a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3674n a8 = C3674n.f36505t.a(c.this.f10912a);
                a8.a();
                Iterator it = this.f11006c.iterator();
                while (it.hasNext()) {
                    C1644k category = (C1644k) it.next();
                    c cVar = c.this;
                    AbstractC3255y.h(category, "category");
                    arrayList.add(cVar.B(category, this.f11007d, a8));
                }
                a8.l();
                J0 c8 = C3347b0.c();
                a aVar = new a(c.this, arrayList, null);
                this.f11004a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11011a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f11012b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f11013c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3660F f11014d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11015a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11016b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f11017c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, S5.d dVar) {
                super(2, dVar);
                this.f11016b = cVar;
                this.f11017c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11016b, this.f11017c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11015a == 0) {
                    t.b(obj);
                    this.f11016b.f10913b.k(this.f11017c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ArrayList arrayList, c cVar, C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11012b = arrayList;
            this.f11013c = cVar;
            this.f11014d = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(this.f11012b, this.f11013c, this.f11014d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11011a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (!this.f11012b.isEmpty()) {
                    C3674n a8 = C3674n.f36505t.a(this.f11013c.f10912a);
                    a8.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f11012b.iterator();
                    while (it.hasNext()) {
                        C1644k floatingCategory = (C1644k) it.next();
                        c cVar = this.f11013c;
                        AbstractC3255y.h(floatingCategory, "floatingCategory");
                        arrayList.add(cVar.B(floatingCategory, this.f11014d, a8));
                    }
                    a8.l();
                    J0 c8 = C3347b0.c();
                    a aVar = new a(this.f11013c, arrayList, null);
                    this.f11011a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public c(Context context, Z4.n listener, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(scope, "scope");
        this.f10912a = context;
        this.f10913b = listener;
        this.f10914c = scope;
        this.f10915d = -1;
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N B(C1644k c1644k, C3660F c3660f, C3674n c3674n) {
        String str;
        a5.I b02;
        int i8 = 5;
        int i9 = 20;
        if (c1644k.s()) {
            str = "floating_category_top_" + c1644k.b();
        } else {
            str = "category_top_" + c1644k.b();
            int b8 = c1644k.b();
            if (b8 != 521) {
                if (b8 != 523) {
                    if (b8 != 524) {
                        i9 = 12;
                        i8 = 6;
                    }
                } else {
                    if (!UptodownApp.f29058B.S()) {
                        i8 = 4;
                    }
                    i9 = 8;
                }
            }
            i8 = 1;
        }
        ArrayList arrayList = new ArrayList();
        J s02 = c3674n.s0(str);
        if (s02 != null && s02.a()) {
            arrayList = c3660f.F0(s02.c());
        } else {
            if (c1644k.s()) {
                b02 = c3660f.d0(c1644k.b(), i9, 0);
            } else {
                b02 = c3660f.b0(c1644k.b(), i9, 0);
            }
            if (b02.f()) {
                arrayList = c3660f.F0(b02);
                String d8 = b02.d();
                AbstractC3255y.f(d8);
                J j8 = new J(str, d8);
                c3674n.L(str);
                c3674n.O0(j8);
            }
        }
        N n8 = new N(c1644k, arrayList, 0, 4, null);
        n8.f(i8);
        return n8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new j(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(C3660F c3660f, ArrayList arrayList, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new k(arrayList, c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(C3660F c3660f, ArrayList arrayList, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new l(arrayList, this, c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new C0224c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new f(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new g(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new h(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new i(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final M A() {
        return this.f10914c;
    }
}
