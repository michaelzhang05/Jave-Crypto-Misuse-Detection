package V4;

import O5.I;
import O5.t;
import Z4.K;
import a5.H;
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
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11210a;

    /* renamed from: b, reason: collision with root package name */
    private String f11211b;

    /* renamed from: c, reason: collision with root package name */
    private String f11212c;

    /* renamed from: d, reason: collision with root package name */
    private final K f11213d;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11214a;

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
            int i8 = this.f11214a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                if (m.this.f11211b != null) {
                    m mVar = m.this;
                    this.f11214a = 1;
                    if (mVar.i(this) == e8) {
                        return e8;
                    }
                } else {
                    m mVar2 = m.this;
                    this.f11214a = 2;
                    if (mVar2.j(this) == e8) {
                        return e8;
                    }
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
        int f11216a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11218a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11219b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f11220c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, H h8, S5.d dVar) {
                super(2, dVar);
                this.f11219b = mVar;
                this.f11220c = h8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11219b, this.f11220c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11218a == 0) {
                    t.b(obj);
                    this.f11219b.f11213d.b(this.f11220c);
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
        /* renamed from: V4.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0235b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11221a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11222b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0235b(m mVar, S5.d dVar) {
                super(2, dVar);
                this.f11222b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0235b(this.f11222b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11221a == 0) {
                    t.b(obj);
                    this.f11222b.f11213d.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0235b) create(m8, dVar)).invokeSuspend(I.f8278a);
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
            Object e8 = T5.b.e();
            int i8 = this.f11216a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3660F c3660f = new C3660F(m.this.f11210a);
                String str = m.this.f11211b;
                AbstractC3255y.f(str);
                a5.I u02 = c3660f.u0(str);
                if (!u02.b() && u02.d() != null) {
                    String d8 = u02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        H h8 = m.this.h(u02);
                        if (h8 != null) {
                            J0 c8 = C3347b0.c();
                            a aVar = new a(m.this, h8, null);
                            this.f11216a = 1;
                            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
                J0 c9 = C3347b0.c();
                C0235b c0235b = new C0235b(m.this, null);
                this.f11216a = 2;
                if (AbstractC3360i.g(c9, c0235b, this) == e8) {
                    return e8;
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
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11223a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11225a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11226b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f11227c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, H h8, S5.d dVar) {
                super(2, dVar);
                this.f11226b = mVar;
                this.f11227c = h8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11226b, this.f11227c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11225a == 0) {
                    t.b(obj);
                    this.f11226b.f11213d.b(this.f11227c);
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
            int f11228a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11229b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m mVar, S5.d dVar) {
                super(2, dVar);
                this.f11229b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f11229b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11228a == 0) {
                    t.b(obj);
                    this.f11229b.f11213d.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11223a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3660F c3660f = new C3660F(m.this.f11210a);
                String str = m.this.f11212c;
                AbstractC3255y.f(str);
                a5.I v02 = c3660f.v0(str);
                if (!v02.b() && v02.d() != null) {
                    String d8 = v02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        H h8 = m.this.h(v02);
                        if (h8 != null) {
                            J0 c8 = C3347b0.c();
                            a aVar = new a(m.this, h8, null);
                            this.f11223a = 1;
                            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
                J0 c9 = C3347b0.c();
                b bVar = new b(m.this, null);
                this.f11223a = 2;
                if (AbstractC3360i.g(c9, bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public m(Context context, String str, String str2, K listener, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(scope, "scope");
        this.f11210a = context;
        this.f11211b = str;
        this.f11212c = str2;
        this.f11213d = listener;
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H h(a5.I i8) {
        int i9;
        JSONObject jSONObject;
        String d8 = i8.d();
        AbstractC3255y.f(d8);
        JSONObject jSONObject2 = new JSONObject(d8);
        if (!jSONObject2.isNull("success")) {
            i9 = jSONObject2.getInt("success");
        } else {
            i9 = 0;
        }
        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
        } else {
            jSONObject = null;
        }
        if (i9 != 1 || jSONObject == null) {
            return null;
        }
        H h8 = new H();
        h8.a(jSONObject);
        return h8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
