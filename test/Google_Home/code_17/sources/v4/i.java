package V4;

import O5.I;
import O5.t;
import a5.C1641h;
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
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11165a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11166b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.r f11167c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11168a;

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
            int i8 = this.f11168a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                i iVar = i.this;
                this.f11168a = 1;
                if (iVar.e(this) == e8) {
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
        int f11170a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11172a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f11173b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1641h f11174c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, C1641h c1641h, S5.d dVar) {
                super(2, dVar);
                this.f11173b = iVar;
                this.f11174c = c1641h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11173b, this.f11174c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11172a == 0) {
                    t.b(obj);
                    Z4.r rVar = this.f11173b.f11167c;
                    if (rVar != null) {
                        rVar.e(this.f11174c);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0233b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11175a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f11176b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a5.I f11177c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0233b(i iVar, a5.I i8, S5.d dVar) {
                super(2, dVar);
                this.f11176b = iVar;
                this.f11177c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0233b(this.f11176b, this.f11177c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11175a == 0) {
                    t.b(obj);
                    Z4.r rVar = this.f11176b.f11167c;
                    if (rVar != null) {
                        rVar.c(this.f11177c.e());
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0233b) create(m8, dVar)).invokeSuspend(I.f8278a);
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
            int i8;
            JSONObject jSONObject;
            Object e8 = T5.b.e();
            int i9 = this.f11170a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                a5.I Q8 = new C3660F(i.this.f11165a).Q(i.this.f11166b);
                if (!Q8.b() && Q8.d() != null) {
                    String d8 = Q8.d();
                    AbstractC3255y.f(d8);
                    JSONObject jSONObject2 = new JSONObject(d8);
                    if (!jSONObject2.isNull("success")) {
                        i8 = jSONObject2.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONObject = null;
                    }
                    if (i8 == 1 && jSONObject != null) {
                        C1641h a8 = C1641h.f14163L0.a(jSONObject);
                        J0 c8 = C3347b0.c();
                        a aVar = new a(i.this, a8, null);
                        this.f11170a = 1;
                        if (AbstractC3360i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                } else if (Q8.b()) {
                    J0 c9 = C3347b0.c();
                    C0233b c0233b = new C0233b(i.this, Q8, null);
                    this.f11170a = 2;
                    if (AbstractC3360i.g(c9, c0233b, this) == e8) {
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

    public i(Context context, long j8, Z4.r rVar, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(scope, "scope");
        this.f11165a = context;
        this.f11166b = j8;
        this.f11167c = rVar;
        if (j8 > 0) {
            AbstractC3364k.d(scope, null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
