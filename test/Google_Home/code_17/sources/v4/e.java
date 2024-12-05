package V4;

import O5.I;
import O5.t;
import a5.C1641h;
import a5.C1653u;
import a6.InterfaceC1668n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Context f11054a;

    /* renamed from: b, reason: collision with root package name */
    private Z4.p f11055b;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11056a;

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
            int i8 = this.f11056a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                e eVar = e.this;
                this.f11056a = 1;
                if (eVar.d(this) == e8) {
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
        int f11058a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11060a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11061b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11061b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11061b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11060a == 0) {
                    t.b(obj);
                    this.f11061b.f11055b.a();
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
        /* renamed from: V4.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0228b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11062a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11063b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0228b(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11063b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0228b(this.f11063b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11062a == 0) {
                    t.b(obj);
                    this.f11063b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0228b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11064a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11065b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11065b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f11065b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11064a == 0) {
                    t.b(obj);
                    this.f11065b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11066a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11067b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11067b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f11067b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11066a == 0) {
                    t.b(obj);
                    this.f11067b.f11055b.b();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.e$b$e, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0229e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11068a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11069b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0229e(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11069b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0229e(this.f11069b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11068a == 0) {
                    t.b(obj);
                    this.f11069b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0229e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11070a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11071b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11071b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new f(this.f11071b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11070a == 0) {
                    t.b(obj);
                    this.f11071b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f11072a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11073b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11073b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new g(this.f11073b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11072a == 0) {
                    t.b(obj);
                    this.f11073b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f11074a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11075b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11075b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new h(this.f11075b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11074a == 0) {
                    t.b(obj);
                    this.f11075b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f11076a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11077b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11077b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new i(this.f11077b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11076a == 0) {
                    t.b(obj);
                    this.f11077b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f11078a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11079b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(e eVar, S5.d dVar) {
                super(2, dVar);
                this.f11079b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new j(this.f11079b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11078a == 0) {
                    t.b(obj);
                    this.f11079b.f11055b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            Object e8 = T5.b.e();
            switch (this.f11058a) {
                case 0:
                    t.b(obj);
                    C1653u.a aVar = C1653u.f14337n;
                    C1653u d8 = aVar.d(e.this.f11054a);
                    if (d8 != null && !d8.d()) {
                        J0 c8 = C3347b0.c();
                        C0228b c0228b = new C0228b(e.this, null);
                        this.f11058a = 1;
                        if (AbstractC3360i.g(c8, c0228b, this) == e8) {
                            return e8;
                        }
                    } else {
                        C3660F c3660f = new C3660F(e.this.f11054a);
                        a5.I z8 = c3660f.z();
                        if (!z8.b() && z8.d() != null) {
                            String d9 = z8.d();
                            AbstractC3255y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                int i8 = jSONObject2.getInt("success");
                                if (i8 == 1) {
                                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                        JSONObject jsonObjectData = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        AbstractC3255y.h(jsonObjectData, "jsonObjectData");
                                        C1653u c9 = aVar.c(jsonObjectData);
                                        if (c9 != null) {
                                            long j8 = 1000;
                                            c9.y(System.currentTimeMillis() / j8);
                                            if (d8 == null) {
                                                c9.t(e.this.f11054a);
                                            } else if (c9.k() == d8.k()) {
                                                if (!j6.n.s(c9.n(), d8.n(), true)) {
                                                    d8.y(System.currentTimeMillis() / j8);
                                                    d8.B(c9.n());
                                                    d8.t(e.this.f11054a);
                                                } else {
                                                    c9.t(e.this.f11054a);
                                                }
                                            } else {
                                                c9.t(e.this.f11054a);
                                            }
                                            a5.I Q8 = c3660f.Q(c9.k());
                                            if (!Q8.b() && Q8.d() != null) {
                                                String d10 = Q8.d();
                                                AbstractC3255y.f(d10);
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
                                                    if (!C1641h.f14163L0.a(jSONObject).k1()) {
                                                        aVar.a(e.this.f11054a);
                                                        J0 c10 = C3347b0.c();
                                                        c cVar = new c(e.this, null);
                                                        this.f11058a = 2;
                                                        if (AbstractC3360i.g(c10, cVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    } else {
                                                        J0 c11 = C3347b0.c();
                                                        d dVar = new d(e.this, null);
                                                        this.f11058a = 3;
                                                        if (AbstractC3360i.g(c11, dVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    }
                                                } else {
                                                    J0 c12 = C3347b0.c();
                                                    C0229e c0229e = new C0229e(e.this, null);
                                                    this.f11058a = 4;
                                                    if (AbstractC3360i.g(c12, c0229e, this) == e8) {
                                                        return e8;
                                                    }
                                                }
                                            } else {
                                                J0 c13 = C3347b0.c();
                                                f fVar = new f(e.this, null);
                                                this.f11058a = 5;
                                                if (AbstractC3360i.g(c13, fVar, this) == e8) {
                                                    return e8;
                                                }
                                            }
                                        } else {
                                            J0 c14 = C3347b0.c();
                                            g gVar = new g(e.this, null);
                                            this.f11058a = 6;
                                            if (AbstractC3360i.g(c14, gVar, this) == e8) {
                                                return e8;
                                            }
                                        }
                                    } else {
                                        J0 c15 = C3347b0.c();
                                        h hVar = new h(e.this, null);
                                        this.f11058a = 7;
                                        if (AbstractC3360i.g(c15, hVar, this) == e8) {
                                            return e8;
                                        }
                                    }
                                } else {
                                    aVar.a(e.this.f11054a);
                                    J0 c16 = C3347b0.c();
                                    i iVar = new i(e.this, null);
                                    this.f11058a = 8;
                                    if (AbstractC3360i.g(c16, iVar, this) == e8) {
                                        return e8;
                                    }
                                }
                            } else {
                                J0 c17 = C3347b0.c();
                                j jVar = new j(e.this, null);
                                this.f11058a = 9;
                                if (AbstractC3360i.g(c17, jVar, this) == e8) {
                                    return e8;
                                }
                            }
                        } else {
                            if (z8.e() == 404) {
                                aVar.a(e.this.f11054a);
                            }
                            J0 c18 = C3347b0.c();
                            a aVar2 = new a(e.this, null);
                            this.f11058a = 10;
                            if (AbstractC3360i.g(c18, aVar2, this) == e8) {
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
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public e(Context context, Z4.p listener, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(scope, "scope");
        this.f11054a = context;
        this.f11055b = listener;
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
