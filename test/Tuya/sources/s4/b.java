package S4;

import L5.I;
import L5.t;
import W4.InterfaceC1490m;
import X4.C1498h;
import X4.C1500j;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Context f9242a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1490m f9243b;

    /* renamed from: c, reason: collision with root package name */
    private final M f9244c;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9245a;

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
            int i8 = this.f9245a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f9245a = 1;
                if (bVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0196b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9247a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9249a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9250b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9250b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9250b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9249a == 0) {
                    t.b(obj);
                    this.f9250b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0197b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9251a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9252b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0197b(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9252b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0197b(this.f9252b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0197b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9251a == 0) {
                    t.b(obj);
                    this.f9252b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9253a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9254b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9254b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f9254b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9253a == 0) {
                    t.b(obj);
                    this.f9254b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$d */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9255a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9256b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9256b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f9256b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9255a == 0) {
                    t.b(obj);
                    this.f9256b.f9243b.b();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$e */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9257a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9258b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9258b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f9258b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9257a == 0) {
                    t.b(obj);
                    this.f9258b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$f */
        /* loaded from: classes4.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9259a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9260b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9260b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new f(this.f9260b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9259a == 0) {
                    t.b(obj);
                    this.f9260b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$g */
        /* loaded from: classes4.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9261a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9262b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9262b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new g(this.f9262b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9261a == 0) {
                    t.b(obj);
                    this.f9262b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$h */
        /* loaded from: classes4.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9263a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9264b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9264b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new h(this.f9264b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9263a == 0) {
                    t.b(obj);
                    this.f9264b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$i */
        /* loaded from: classes4.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9265a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9266b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9266b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new i(this.f9266b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9265a == 0) {
                    t.b(obj);
                    this.f9266b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.b$b$j */
        /* loaded from: classes4.dex */
        public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9267a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9268b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f9268b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new j(this.f9268b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9267a == 0) {
                    t.b(obj);
                    this.f9268b.f9243b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C0196b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0196b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0196b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            Object e8 = Q5.b.e();
            switch (this.f9247a) {
                case 0:
                    t.b(obj);
                    C1500j.a aVar = C1500j.f12630n;
                    C1500j d8 = aVar.d(b.this.f9242a);
                    if (d8 != null && !d8.d()) {
                        J0 c8 = C2812b0.c();
                        C0197b c0197b = new C0197b(b.this, null);
                        this.f9247a = 1;
                        if (AbstractC2825i.g(c8, c0197b, this) == e8) {
                            return e8;
                        }
                    } else {
                        C3312F c3312f = new C3312F(b.this.f9242a);
                        X4.I o8 = c3312f.o();
                        if (!o8.b() && o8.d() != null) {
                            String d9 = o8.d();
                            AbstractC3159y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                int i8 = jSONObject2.getInt("success");
                                if (i8 == 1) {
                                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                        JSONObject jsonObjectData = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        AbstractC3159y.h(jsonObjectData, "jsonObjectData");
                                        C1500j c9 = aVar.c(jsonObjectData);
                                        if (c9 != null) {
                                            long j8 = 1000;
                                            c9.y(System.currentTimeMillis() / j8);
                                            if (d8 == null) {
                                                c9.t(b.this.f9242a);
                                            } else if (c9.k() == d8.k()) {
                                                if (!g6.n.s(c9.n(), d8.n(), true)) {
                                                    d8.B(c9.n());
                                                    d8.y(System.currentTimeMillis() / j8);
                                                    d8.t(b.this.f9242a);
                                                } else {
                                                    c9.t(b.this.f9242a);
                                                }
                                            } else {
                                                c9.t(b.this.f9242a);
                                            }
                                            X4.I Q8 = c3312f.Q(c9.k());
                                            if (!Q8.b() && Q8.d() != null) {
                                                String d10 = Q8.d();
                                                AbstractC3159y.f(d10);
                                                JSONObject jSONObject3 = new JSONObject(d10);
                                                if (!jSONObject3.isNull("success")) {
                                                    i8 = jSONObject3.getInt("success");
                                                }
                                                if (!jSONObject3.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                                    jSONObject = jSONObject3.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                                } else {
                                                    jSONObject = null;
                                                }
                                                if (i8 == 1 && jSONObject != null) {
                                                    if (!C1498h.f12542L0.a(jSONObject).k1()) {
                                                        aVar.a(b.this.f9242a);
                                                        J0 c10 = C2812b0.c();
                                                        c cVar = new c(b.this, null);
                                                        this.f9247a = 2;
                                                        if (AbstractC2825i.g(c10, cVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    } else {
                                                        J0 c11 = C2812b0.c();
                                                        d dVar = new d(b.this, null);
                                                        this.f9247a = 3;
                                                        if (AbstractC2825i.g(c11, dVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    }
                                                } else {
                                                    J0 c12 = C2812b0.c();
                                                    e eVar = new e(b.this, null);
                                                    this.f9247a = 4;
                                                    if (AbstractC2825i.g(c12, eVar, this) == e8) {
                                                        return e8;
                                                    }
                                                }
                                            } else {
                                                J0 c13 = C2812b0.c();
                                                f fVar = new f(b.this, null);
                                                this.f9247a = 5;
                                                if (AbstractC2825i.g(c13, fVar, this) == e8) {
                                                    return e8;
                                                }
                                            }
                                        } else {
                                            J0 c14 = C2812b0.c();
                                            g gVar = new g(b.this, null);
                                            this.f9247a = 6;
                                            if (AbstractC2825i.g(c14, gVar, this) == e8) {
                                                return e8;
                                            }
                                        }
                                    } else {
                                        J0 c15 = C2812b0.c();
                                        h hVar = new h(b.this, null);
                                        this.f9247a = 7;
                                        if (AbstractC2825i.g(c15, hVar, this) == e8) {
                                            return e8;
                                        }
                                    }
                                } else {
                                    aVar.a(b.this.f9242a);
                                    J0 c16 = C2812b0.c();
                                    i iVar = new i(b.this, null);
                                    this.f9247a = 8;
                                    if (AbstractC2825i.g(c16, iVar, this) == e8) {
                                        return e8;
                                    }
                                }
                            } else {
                                J0 c17 = C2812b0.c();
                                j jVar = new j(b.this, null);
                                this.f9247a = 9;
                                if (AbstractC2825i.g(c17, jVar, this) == e8) {
                                    return e8;
                                }
                            }
                        } else {
                            if (o8.e() == 404) {
                                aVar.a(b.this.f9242a);
                            }
                            J0 c18 = C2812b0.c();
                            a aVar2 = new a(b.this, null);
                            this.f9247a = 10;
                            if (AbstractC2825i.g(c18, aVar2, this) == e8) {
                                return e8;
                            }
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    t.b(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return I.f6487a;
        }
    }

    public b(Context context, InterfaceC1490m listener, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(scope, "scope");
        this.f9242a = context;
        this.f9243b = listener;
        this.f9244c = scope;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new C0196b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
