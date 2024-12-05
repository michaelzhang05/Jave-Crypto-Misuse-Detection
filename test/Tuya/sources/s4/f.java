package S4;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import S4.f;
import W4.x;
import X4.C1496f;
import X4.C1498h;
import X4.z;
import android.content.Context;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import l5.C3319g;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9437a;

    /* renamed from: b, reason: collision with root package name */
    private C1496f f9438b;

    /* renamed from: c, reason: collision with root package name */
    private C1498h f9439c;

    /* renamed from: d, reason: collision with root package name */
    private final x f9440d;

    /* renamed from: e, reason: collision with root package name */
    private int f9441e;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9442a;

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
            int i8 = this.f9442a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                f fVar = f.this;
                this.f9442a = 1;
                if (fVar.h(this) == e8) {
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
        int f9444a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9446a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f9447b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, P5.d dVar) {
                super(2, dVar);
                this.f9447b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9447b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9446a == 0) {
                    t.b(obj);
                    this.f9447b.f9440d.b(this.f9447b.f9439c, this.f9447b.f9438b);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0205b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9448a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f9449b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0205b(f fVar, P5.d dVar) {
                super(2, dVar);
                this.f9449b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0205b(this.f9449b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0205b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9448a == 0) {
                    t.b(obj);
                    x xVar = this.f9449b.f9440d;
                    C1496f c1496f = this.f9449b.f9438b;
                    AbstractC3159y.f(c1496f);
                    String I8 = c1496f.I();
                    if (I8 == null) {
                        I8 = this.f9449b.f9439c.s0();
                        AbstractC3159y.f(I8);
                    }
                    xVar.e(I8);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int h(z zVar, z zVar2) {
            if (zVar != null && zVar2 != null) {
                long j8 = zVar2.j() - zVar.j();
                if (j8 == 0 && zVar.b() != null && zVar2.b() != null) {
                    String b8 = zVar2.b();
                    AbstractC3159y.f(b8);
                    long parseLong = Long.parseLong(b8);
                    String b9 = zVar.b();
                    AbstractC3159y.f(b9);
                    j8 = parseLong - Long.parseLong(b9);
                }
                return (int) j8;
            }
            return 0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9444a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                f.this.f9438b = new C3319g().z(f.this.f9437a, f.this.f9439c.y0());
                X4.I B02 = new C3312F(f.this.f9437a).B0(f.this.f9439c.i(), 20, f.this.f9441e);
                if (!B02.b() && B02.d() != null) {
                    String d8 = B02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        z.b bVar = z.f12740h;
                        String d9 = B02.d();
                        AbstractC3159y.f(d9);
                        ArrayList a8 = bVar.a(d9);
                        if (a8 != null && a8.size() > 0) {
                            AbstractC1246t.B(a8, new Comparator() { // from class: S4.g
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int h8;
                                    h8 = f.b.h((z) obj2, (z) obj3);
                                    return h8;
                                }
                            });
                            f.this.f9439c.y1(a8);
                            J0 c8 = C2812b0.c();
                            a aVar = new a(f.this, null);
                            this.f9444a = 1;
                            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        } else {
                            J0 c9 = C2812b0.c();
                            C0205b c0205b = new C0205b(f.this, null);
                            this.f9444a = 2;
                            if (AbstractC2825i.g(c9, c0205b, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
            }
            return I.f6487a;
        }
    }

    public f(M scope, Context context, C1496f c1496f, C1498h appInfo, x listener, int i8) {
        AbstractC3159y.i(scope, "scope");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(listener, "listener");
        this.f9437a = context;
        this.f9438b = c1496f;
        this.f9439c = appInfo;
        this.f9440d = listener;
        this.f9441e = i8;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
