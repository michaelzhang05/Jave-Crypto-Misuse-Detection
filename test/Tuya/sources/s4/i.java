package S4;

import L5.I;
import L5.t;
import X4.C1498h;
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
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9522a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9523b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.r f9524c;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9525a;

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
            int i8 = this.f9525a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                i iVar = i.this;
                this.f9525a = 1;
                if (iVar.e(this) == e8) {
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
        int f9527a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9529a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f9530b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1498h f9531c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, C1498h c1498h, P5.d dVar) {
                super(2, dVar);
                this.f9530b = iVar;
                this.f9531c = c1498h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9530b, this.f9531c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9529a == 0) {
                    t.b(obj);
                    W4.r rVar = this.f9530b.f9524c;
                    if (rVar != null) {
                        rVar.f(this.f9531c);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0208b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9532a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f9533b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.I f9534c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0208b(i iVar, X4.I i8, P5.d dVar) {
                super(2, dVar);
                this.f9533b = iVar;
                this.f9534c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0208b(this.f9533b, this.f9534c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0208b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9532a == 0) {
                    t.b(obj);
                    W4.r rVar = this.f9533b.f9524c;
                    if (rVar != null) {
                        rVar.c(this.f9534c.e());
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
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
            int i8;
            JSONObject jSONObject;
            Object e8 = Q5.b.e();
            int i9 = this.f9527a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                X4.I Q8 = new C3312F(i.this.f9522a).Q(i.this.f9523b);
                if (!Q8.b() && Q8.d() != null) {
                    String d8 = Q8.d();
                    AbstractC3159y.f(d8);
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
                        C1498h a8 = C1498h.f12542L0.a(jSONObject);
                        J0 c8 = C2812b0.c();
                        a aVar = new a(i.this, a8, null);
                        this.f9527a = 1;
                        if (AbstractC2825i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                } else if (Q8.b()) {
                    J0 c9 = C2812b0.c();
                    C0208b c0208b = new C0208b(i.this, Q8, null);
                    this.f9527a = 2;
                    if (AbstractC2825i.g(c9, c0208b, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    public i(Context context, long j8, W4.r rVar, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(scope, "scope");
        this.f9522a = context;
        this.f9523b = j8;
        this.f9524c = rVar;
        if (j8 > 0) {
            AbstractC2829k.d(scope, null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
