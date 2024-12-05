package V4;

import O5.I;
import O5.t;
import a5.C1641h;
import a6.InterfaceC1668n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Q;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11193a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11194b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.r f11195c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11196a;

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
            int i8 = this.f11196a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                l lVar = l.this;
                this.f11196a = 1;
                if (lVar.e(this) == e8) {
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
        Object f11198a;

        /* renamed from: b, reason: collision with root package name */
        Object f11199b;

        /* renamed from: c, reason: collision with root package name */
        Object f11200c;

        /* renamed from: d, reason: collision with root package name */
        Object f11201d;

        /* renamed from: e, reason: collision with root package name */
        int f11202e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11204a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f11205b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1641h f11206c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, C1641h c1641h, S5.d dVar) {
                super(2, dVar);
                this.f11205b = lVar;
                this.f11206c = c1641h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11205b, this.f11206c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11204a == 0) {
                    t.b(obj);
                    Z4.r rVar = this.f11205b.f11195c;
                    if (rVar != null) {
                        rVar.e(this.f11206c);
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
        /* renamed from: V4.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0234b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11207a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f11208b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a5.I f11209c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0234b(l lVar, a5.I i8, S5.d dVar) {
                super(2, dVar);
                this.f11208b = lVar;
                this.f11209c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0234b(this.f11208b, this.f11209c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11207a == 0) {
                    t.b(obj);
                    Z4.r rVar = this.f11208b.f11195c;
                    if (rVar != null) {
                        rVar.c(this.f11209c.e());
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0234b) create(m8, dVar)).invokeSuspend(I.f8278a);
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
            Q q8;
            C3660F c3660f;
            Iterator it;
            l lVar;
            JSONObject jSONObject;
            Object e8 = T5.b.e();
            int i8 = this.f11202e;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f11201d;
                lVar = (l) this.f11200c;
                c3660f = (C3660F) this.f11199b;
                q8 = (Q) this.f11198a;
                t.b(obj);
            } else {
                t.b(obj);
                Q q9 = new Q();
                C3660F c3660f2 = new C3660F(l.this.f11193a);
                List list = l.this.f11194b;
                l lVar2 = l.this;
                q8 = q9;
                c3660f = c3660f2;
                it = list.iterator();
                lVar = lVar2;
            }
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (longValue > 0) {
                    a5.I Q8 = c3660f.Q(longValue);
                    if (!Q8.b() && Q8.d() != null) {
                        String d8 = Q8.d();
                        AbstractC3255y.f(d8);
                        JSONObject jSONObject2 = new JSONObject(d8);
                        if (!jSONObject2.isNull("success")) {
                            q8.f34160a = jSONObject2.getInt("success");
                        }
                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONObject = null;
                        }
                        if (q8.f34160a == 1 && jSONObject != null) {
                            C1641h a8 = C1641h.f14163L0.a(jSONObject);
                            if (a8.t0() != null) {
                                J0 c8 = C3347b0.c();
                                a aVar = new a(lVar, a8, null);
                                this.f11198a = q8;
                                this.f11199b = c3660f;
                                this.f11200c = lVar;
                                this.f11201d = it;
                                this.f11202e = 1;
                                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                                    return e8;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        J0 c9 = C3347b0.c();
                        C0234b c0234b = new C0234b(lVar, Q8, null);
                        this.f11198a = q8;
                        this.f11199b = c3660f;
                        this.f11200c = lVar;
                        this.f11201d = it;
                        this.f11202e = 2;
                        if (AbstractC3360i.g(c9, c0234b, this) == e8) {
                            return e8;
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

    public l(Context context, List appsIDs, Z4.r rVar, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(appsIDs, "appsIDs");
        AbstractC3255y.i(scope, "scope");
        this.f11193a = context;
        this.f11194b = appsIDs;
        this.f11195c = rVar;
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
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
