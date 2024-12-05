package V4;

import O5.I;
import O5.t;
import P5.AbstractC1378t;
import V4.f;
import Z4.x;
import a5.C1639f;
import a5.C1641h;
import a5.z;
import a6.InterfaceC1668n;
import android.content.Context;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import o5.C3667g;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11080a;

    /* renamed from: b, reason: collision with root package name */
    private C1639f f11081b;

    /* renamed from: c, reason: collision with root package name */
    private C1641h f11082c;

    /* renamed from: d, reason: collision with root package name */
    private final x f11083d;

    /* renamed from: e, reason: collision with root package name */
    private int f11084e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11085a;

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
            int i8 = this.f11085a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                f fVar = f.this;
                this.f11085a = 1;
                if (fVar.h(this) == e8) {
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
        int f11087a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11089a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f11090b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, S5.d dVar) {
                super(2, dVar);
                this.f11090b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11090b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11089a == 0) {
                    t.b(obj);
                    this.f11090b.f11083d.c(this.f11090b.f11082c, this.f11090b.f11081b);
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
        /* renamed from: V4.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0230b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11091a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f11092b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0230b(f fVar, S5.d dVar) {
                super(2, dVar);
                this.f11092b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0230b(this.f11092b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11091a == 0) {
                    t.b(obj);
                    x xVar = this.f11092b.f11083d;
                    C1639f c1639f = this.f11092b.f11081b;
                    AbstractC3255y.f(c1639f);
                    String z8 = c1639f.z();
                    if (z8 == null) {
                        z8 = this.f11092b.f11082c.s0();
                        AbstractC3255y.f(z8);
                    }
                    xVar.e(z8);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0230b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int m(z zVar, z zVar2) {
            if (zVar != null && zVar2 != null) {
                long l8 = zVar2.l() - zVar.l();
                if (l8 == 0 && zVar.a() != null && zVar2.a() != null) {
                    String a8 = zVar2.a();
                    AbstractC3255y.f(a8);
                    long parseLong = Long.parseLong(a8);
                    String a9 = zVar.a();
                    AbstractC3255y.f(a9);
                    l8 = parseLong - Long.parseLong(a9);
                }
                return (int) l8;
            }
            return 0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11087a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                f.this.f11081b = new C3667g().z(f.this.f11080a, f.this.f11082c.y0());
                a5.I B02 = new C3660F(f.this.f11080a).B0(f.this.f11082c.i(), 20, f.this.f11084e);
                if (!B02.b() && B02.d() != null) {
                    String d8 = B02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        z.b bVar = z.f14361h;
                        String d9 = B02.d();
                        AbstractC3255y.f(d9);
                        ArrayList a8 = bVar.a(d9);
                        if (a8 != null && a8.size() > 0) {
                            AbstractC1378t.B(a8, new Comparator() { // from class: V4.g
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int m8;
                                    m8 = f.b.m((z) obj2, (z) obj3);
                                    return m8;
                                }
                            });
                            f.this.f11082c.y1(a8);
                            J0 c8 = C3347b0.c();
                            a aVar = new a(f.this, null);
                            this.f11087a = 1;
                            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        } else {
                            J0 c9 = C3347b0.c();
                            C0230b c0230b = new C0230b(f.this, null);
                            this.f11087a = 2;
                            if (AbstractC3360i.g(c9, c0230b, this) == e8) {
                                return e8;
                            }
                        }
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

    public f(M scope, Context context, C1639f c1639f, C1641h appInfo, x listener, int i8) {
        AbstractC3255y.i(scope, "scope");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(listener, "listener");
        this.f11080a = context;
        this.f11081b = c1639f;
        this.f11082c = appInfo;
        this.f11083d = listener;
        this.f11084e = i8;
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
