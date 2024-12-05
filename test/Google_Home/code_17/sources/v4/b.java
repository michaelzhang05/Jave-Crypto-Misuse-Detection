package V4;

import O5.I;
import O5.t;
import Z4.InterfaceC1599m;
import a5.C1641h;
import a5.C1643j;
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
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Context f10885a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1599m f10886b;

    /* renamed from: c, reason: collision with root package name */
    private final M f10887c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10888a;

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
            int i8 = this.f10888a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f10888a = 1;
                if (bVar.d(this) == e8) {
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
    /* renamed from: V4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0221b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10890a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10892a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10893b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10893b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f10893b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10892a == 0) {
                    t.b(obj);
                    this.f10893b.f10886b.a();
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
        /* renamed from: V4.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0222b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10894a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10895b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0222b(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10895b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0222b(this.f10895b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10894a == 0) {
                    t.b(obj);
                    this.f10895b.f10886b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0222b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.b$b$c */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10896a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10897b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10897b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f10897b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10896a == 0) {
                    t.b(obj);
                    this.f10897b.f10886b.a();
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
        /* renamed from: V4.b$b$d */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10898a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10899b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10899b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f10899b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10898a == 0) {
                    t.b(obj);
                    this.f10899b.f10886b.b();
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
        /* renamed from: V4.b$b$e */
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10900a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10901b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10901b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f10901b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10900a == 0) {
                    t.b(obj);
                    this.f10901b.f10886b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.b$b$f */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10902a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10903b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10903b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new f(this.f10903b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10902a == 0) {
                    t.b(obj);
                    this.f10903b.f10886b.a();
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
        /* renamed from: V4.b$b$g */
        /* loaded from: classes5.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10904a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10905b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10905b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new g(this.f10905b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10904a == 0) {
                    t.b(obj);
                    this.f10905b.f10886b.a();
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
        /* renamed from: V4.b$b$h */
        /* loaded from: classes5.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10906a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10907b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10907b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new h(this.f10907b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10906a == 0) {
                    t.b(obj);
                    this.f10907b.f10886b.a();
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
        /* renamed from: V4.b$b$i */
        /* loaded from: classes5.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10908a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10909b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10909b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new i(this.f10909b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10908a == 0) {
                    t.b(obj);
                    this.f10909b.f10886b.a();
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
        /* renamed from: V4.b$b$j */
        /* loaded from: classes5.dex */
        public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10910a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10911b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f10911b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new j(this.f10911b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10910a == 0) {
                    t.b(obj);
                    this.f10911b.f10886b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        C0221b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0221b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            Object e8 = T5.b.e();
            switch (this.f10890a) {
                case 0:
                    t.b(obj);
                    C1643j.a aVar = C1643j.f14251n;
                    C1643j d8 = aVar.d(b.this.f10885a);
                    if (d8 != null && !d8.d()) {
                        J0 c8 = C3347b0.c();
                        C0222b c0222b = new C0222b(b.this, null);
                        this.f10890a = 1;
                        if (AbstractC3360i.g(c8, c0222b, this) == e8) {
                            return e8;
                        }
                    } else {
                        C3660F c3660f = new C3660F(b.this.f10885a);
                        a5.I o8 = c3660f.o();
                        if (!o8.b() && o8.d() != null) {
                            String d9 = o8.d();
                            AbstractC3255y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                int i8 = jSONObject2.getInt("success");
                                if (i8 == 1) {
                                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                        JSONObject jsonObjectData = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        AbstractC3255y.h(jsonObjectData, "jsonObjectData");
                                        C1643j c9 = aVar.c(jsonObjectData);
                                        if (c9 != null) {
                                            long j8 = 1000;
                                            c9.y(System.currentTimeMillis() / j8);
                                            if (d8 == null) {
                                                c9.t(b.this.f10885a);
                                            } else if (c9.k() == d8.k()) {
                                                if (!j6.n.s(c9.n(), d8.n(), true)) {
                                                    d8.B(c9.n());
                                                    d8.y(System.currentTimeMillis() / j8);
                                                    d8.t(b.this.f10885a);
                                                } else {
                                                    c9.t(b.this.f10885a);
                                                }
                                            } else {
                                                c9.t(b.this.f10885a);
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
                                                        aVar.a(b.this.f10885a);
                                                        J0 c10 = C3347b0.c();
                                                        c cVar = new c(b.this, null);
                                                        this.f10890a = 2;
                                                        if (AbstractC3360i.g(c10, cVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    } else {
                                                        J0 c11 = C3347b0.c();
                                                        d dVar = new d(b.this, null);
                                                        this.f10890a = 3;
                                                        if (AbstractC3360i.g(c11, dVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    }
                                                } else {
                                                    J0 c12 = C3347b0.c();
                                                    e eVar = new e(b.this, null);
                                                    this.f10890a = 4;
                                                    if (AbstractC3360i.g(c12, eVar, this) == e8) {
                                                        return e8;
                                                    }
                                                }
                                            } else {
                                                J0 c13 = C3347b0.c();
                                                f fVar = new f(b.this, null);
                                                this.f10890a = 5;
                                                if (AbstractC3360i.g(c13, fVar, this) == e8) {
                                                    return e8;
                                                }
                                            }
                                        } else {
                                            J0 c14 = C3347b0.c();
                                            g gVar = new g(b.this, null);
                                            this.f10890a = 6;
                                            if (AbstractC3360i.g(c14, gVar, this) == e8) {
                                                return e8;
                                            }
                                        }
                                    } else {
                                        J0 c15 = C3347b0.c();
                                        h hVar = new h(b.this, null);
                                        this.f10890a = 7;
                                        if (AbstractC3360i.g(c15, hVar, this) == e8) {
                                            return e8;
                                        }
                                    }
                                } else {
                                    aVar.a(b.this.f10885a);
                                    J0 c16 = C3347b0.c();
                                    i iVar = new i(b.this, null);
                                    this.f10890a = 8;
                                    if (AbstractC3360i.g(c16, iVar, this) == e8) {
                                        return e8;
                                    }
                                }
                            } else {
                                J0 c17 = C3347b0.c();
                                j jVar = new j(b.this, null);
                                this.f10890a = 9;
                                if (AbstractC3360i.g(c17, jVar, this) == e8) {
                                    return e8;
                                }
                            }
                        } else {
                            if (o8.e() == 404) {
                                aVar.a(b.this.f10885a);
                            }
                            J0 c18 = C3347b0.c();
                            a aVar2 = new a(b.this, null);
                            this.f10890a = 10;
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
            return ((C0221b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public b(Context context, InterfaceC1599m listener, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(scope, "scope");
        this.f10885a = context;
        this.f10886b = listener;
        this.f10887c = scope;
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new C0221b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
