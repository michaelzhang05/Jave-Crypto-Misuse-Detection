package S4;

import L5.I;
import L5.t;
import X4.C1498h;
import X4.C1501k;
import X4.J;
import X4.N;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import l5.C3312F;
import l5.C3326n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9450a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.q f9451b;

    /* renamed from: c, reason: collision with root package name */
    private final C1501k f9452c;

    /* renamed from: d, reason: collision with root package name */
    private final M f9453d;

    /* renamed from: e, reason: collision with root package name */
    private int f9454e;

    /* renamed from: f, reason: collision with root package name */
    private int f9455f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f9456g;

    /* renamed from: h, reason: collision with root package name */
    private C1498h f9457h;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9458a;

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
            int i8 = this.f9458a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                h hVar = h.this;
                this.f9458a = 1;
                if (hVar.u(this) == e8) {
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
        int f9460a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9462c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9463a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9464b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9465c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9464b = hVar;
                this.f9465c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9464b, this.f9465c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9463a == 0) {
                    t.b(obj);
                    this.f9464b.f9451b.c((ArrayList) this.f9465c.f33761a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9462c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f9462c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9460a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f33761a = new ArrayList();
                C3326n a8 = C3326n.f34504t.a(h.this.f9450a);
                a8.a();
                String str = "features_by_category_" + h.this.f9452c.c();
                J s02 = a8.s0(str);
                int i9 = 0;
                if (s02 != null && s02.a()) {
                    t8.f33761a = this.f9462c.F0(s02.c());
                } else {
                    X4.I e02 = this.f9462c.e0(h.this.f9452c.c(), 6, 0);
                    if (e02.f()) {
                        t8.f33761a = this.f9462c.F0(e02);
                        String d8 = e02.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33761a).isEmpty()) {
                    h.this.f9455f++;
                    h.this.f9454e = -1;
                    Iterator it = ((ArrayList) t8.f33761a).iterator();
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (g6.n.s(((C1498h) it.next()).y0(), h.this.f9450a.getPackageName(), true)) {
                            h.this.f9454e = i9;
                        }
                        i9 = i10;
                    }
                    if (h.this.f9454e > -1 && h.this.f9454e < ((ArrayList) t8.f33761a).size()) {
                        ((ArrayList) t8.f33761a).remove(h.this.f9454e);
                    }
                    if (((ArrayList) t8.f33761a).size() > 5) {
                        h.this.f9457h = (C1498h) ((ArrayList) t8.f33761a).remove(5);
                        W4.q qVar = h.this.f9451b;
                        C1498h c1498h = h.this.f9457h;
                        AbstractC3159y.f(c1498h);
                        qVar.e(c1498h);
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(h.this, t8, null);
                this.f9460a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9466a;

        /* renamed from: b, reason: collision with root package name */
        int f9467b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9469a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9470b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9471c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9470b = hVar;
                this.f9471c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9470b, this.f9471c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                    java.lang.Object r0 = Q5.b.e()
                    int r1 = r6.f9469a
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    L5.t.b(r7)
                    goto L63
                L18:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L20:
                    L5.t.b(r7)
                    goto L56
                L24:
                    L5.t.b(r7)
                    goto L49
                L28:
                    L5.t.b(r7)
                    goto L3c
                L2c:
                    L5.t.b(r7)
                    S4.h r7 = r6.f9470b
                    l5.F r1 = r6.f9471c
                    r6.f9469a = r5
                    java.lang.Object r7 = S4.h.b(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    S4.h r7 = r6.f9470b
                    l5.F r1 = r6.f9471c
                    r6.f9469a = r4
                    java.lang.Object r7 = S4.h.i(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    S4.h r7 = r6.f9470b
                    l5.F r1 = r6.f9471c
                    r6.f9469a = r3
                    java.lang.Object r7 = S4.h.l(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    S4.h r7 = r6.f9470b
                    l5.F r1 = r6.f9471c
                    r6.f9469a = r2
                    java.lang.Object r7 = S4.h.m(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    L5.I r7 = L5.I.f6487a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: S4.h.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9472a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9473b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, P5.d dVar) {
                super(2, dVar);
                this.f9473b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9473b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9472a == 0) {
                    t.b(obj);
                    this.f9473b.f9451b.f();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.h$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0206c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9474a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9475b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9476c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0206c(h hVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9475b = hVar;
                this.f9476c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0206c(this.f9475b, this.f9476c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0206c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9474a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    h hVar = this.f9475b;
                    C3312F c3312f = this.f9476c;
                    ArrayList arrayList = hVar.f9456g;
                    this.f9474a = 1;
                    if (hVar.B(c3312f, arrayList, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r11.f9467b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.f9466a
                l5.F r0 = (l5.C3312F) r0
                L5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f9466a
                l5.F r1 = (l5.C3312F) r1
                L5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                L5.t.b(r12)
                S4.h r12 = S4.h.this
                r1 = 0
                S4.h.s(r12, r1)
                l5.F r12 = new l5.F
                S4.h r1 = S4.h.this
                android.content.Context r1 = S4.h.d(r1)
                r12.<init>(r1)
                S4.h r1 = S4.h.this
                i6.M r5 = r1.y()
                S4.h$c$a r8 = new S4.h$c$a
                S4.h r1 = S4.h.this
                r8.<init>(r1, r12, r3)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                i6.x0 r1 = i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                r11.f9466a = r12
                r11.f9467b = r4
                java.lang.Object r1 = r1.e(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                i6.J0 r1 = i6.C2812b0.c()
                S4.h$c$b r5 = new S4.h$c$b
                S4.h r6 = S4.h.this
                r5.<init>(r6, r3)
                r11.f9466a = r12
                r11.f9467b = r2
                java.lang.Object r1 = i6.AbstractC2825i.g(r1, r5, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                S4.h r12 = S4.h.this
                int r12 = S4.h.k(r12)
                if (r12 < r4) goto L8f
                S4.h r12 = S4.h.this
                i6.M r4 = r12.y()
                S4.h$c$c r7 = new S4.h$c$c
                S4.h r12 = S4.h.this
                r7.<init>(r12, r0, r3)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                i6.AbstractC2825i.d(r4, r5, r6, r7, r8, r9)
            L8f:
                L5.I r12 = L5.I.f6487a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9477a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3312F f9478b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f9479c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f9481b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f9482c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList arrayList, h hVar, P5.d dVar) {
                super(2, dVar);
                this.f9481b = arrayList;
                this.f9482c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9481b, this.f9482c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9480a == 0) {
                    t.b(obj);
                    if (!this.f9481b.isEmpty()) {
                        this.f9482c.f9451b.d(this.f9481b);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3312F c3312f, h hVar, P5.d dVar) {
            super(2, dVar);
            this.f9478b = c3312f;
            this.f9479c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f9478b, this.f9479c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = Q5.b.e();
            int i9 = this.f9477a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                X4.I x8 = this.f9478b.x(this.f9479c.f9452c.c());
                if (!x8.b() && x8.d() != null) {
                    String d8 = x8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = x8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jsonObjectFloatingCategory = jSONArray.getJSONObject(i10);
                                C1501k c1501k = new C1501k(0, null, null, 7, null);
                                AbstractC3159y.h(jsonObjectFloatingCategory, "jsonObjectFloatingCategory");
                                c1501k.z(jsonObjectFloatingCategory);
                                arrayList.add(c1501k);
                            }
                        }
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(arrayList, this.f9479c, null);
                this.f9477a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9483a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9485c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9486a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9487b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, P5.d dVar) {
                super(2, dVar);
                this.f9487b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9487b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9486a == 0) {
                    t.b(obj);
                    this.f9487b.f9451b.j(this.f9487b.f9456g);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9485c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f9485c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9483a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3326n a8 = C3326n.f34504t.a(h.this.f9450a);
                a8.a();
                String str = "leaf_categories_" + h.this.f9452c.c();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    h.this.f9456g = C1501k.f12634g.a(s02.b(), h.this.f9452c.c());
                } else {
                    X4.I q8 = this.f9485c.q(h.this.f9452c.c());
                    if (q8.f()) {
                        h hVar = h.this;
                        C1501k.b bVar = C1501k.f12634g;
                        String d8 = q8.d();
                        AbstractC3159y.f(d8);
                        hVar.f9456g = bVar.a(d8, h.this.f9452c.c());
                        String d9 = q8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J(str, d9);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!h.this.f9456g.isEmpty()) {
                    h.this.f9455f++;
                    J0 c8 = C2812b0.c();
                    a aVar = new a(h.this, null);
                    this.f9483a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9488a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9490c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9491a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9492b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9493c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9492b = hVar;
                this.f9493c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9492b, this.f9493c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9491a == 0) {
                    t.b(obj);
                    this.f9492b.f9451b.i(this.f9493c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9490c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9490c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = Q5.b.e();
            int i8 = this.f9488a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3326n a8 = C3326n.f34504t.a(h.this.f9450a);
                a8.a();
                String str = "recent_by_category_" + h.this.f9452c.c();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    arrayList = this.f9490c.F0(s02.c());
                } else {
                    X4.I S7 = this.f9490c.S(h.this.f9452c.c(), 20, 0);
                    if (S7.f()) {
                        ArrayList F02 = this.f9490c.F0(S7);
                        String d8 = S7.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                        arrayList = F02;
                    } else {
                        arrayList = null;
                    }
                }
                a8.g();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = h.this.f9450a.getString(R.string.the_latest_title);
                    AbstractC3159y.h(string, "context.getString(R.string.the_latest_title)");
                    C1501k c1501k = new C1501k(-2, string, null, 4, null);
                    c1501k.V(h.this.f9452c.c());
                    N n8 = new N(c1501k, arrayList, 0, 4, null);
                    n8.f(1);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(h.this, n8, null);
                    this.f9488a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9494a;

        /* renamed from: b, reason: collision with root package name */
        Object f9495b;

        /* renamed from: c, reason: collision with root package name */
        int f9496c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3312F f9498e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9499a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9500b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9501c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9500b = hVar;
                this.f9501c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9500b, this.f9501c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9499a == 0) {
                    t.b(obj);
                    this.f9500b.f9451b.a(this.f9501c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9502a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9503b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9504c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9503b = hVar;
                this.f9504c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9503b, this.f9504c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9502a == 0) {
                    t.b(obj);
                    this.f9503b.f9451b.g((C1498h) this.f9504c.f33761a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9498e = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9498e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3326n a8;
            ArrayList arrayList;
            C3326n c3326n;
            Object e8 = Q5.b.e();
            int i8 = this.f9496c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3326n = (C3326n) this.f9494a;
                        t.b(obj);
                        a8 = c3326n;
                        a8.g();
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8 = (C3326n) this.f9495b;
                arrayList = (ArrayList) this.f9494a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a8 = C3326n.f34504t.a(h.this.f9450a);
                a8.a();
                String str = "top_downloads_" + h.this.f9452c.c();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    arrayList2 = this.f9498e.F0(s02.c());
                } else {
                    X4.I b02 = this.f9498e.b0(h.this.f9452c.c(), 20, 0);
                    if (b02.f()) {
                        arrayList2 = this.f9498e.F0(b02);
                        String d8 = b02.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = h.this.f9450a.getString(R.string.top_downloads_title);
                    AbstractC3159y.h(string, "context.getString(R.string.top_downloads_title)");
                    N n8 = new N(h.this.f9452c, arrayList, 0, 4, null);
                    n8.b().T(string);
                    if (h.this.f9452c.c() == 523 && !UptodownApp.f28003B.S()) {
                        n8.f(4);
                    } else {
                        n8.f(5);
                    }
                    J0 c8 = C2812b0.c();
                    a aVar = new a(h.this, n8, null);
                    this.f9494a = arrayList;
                    this.f9495b = a8;
                    this.f9496c = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a8.g();
                return I.f6487a;
            }
            if (h.this.f9454e > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1498h c1498h = (C1498h) it.next();
                    if (!g6.n.s(c1498h.y0(), h.this.f9450a.getPackageName(), true)) {
                        t8.f33761a = c1498h;
                        break;
                    }
                }
                if (t8.f33761a != null) {
                    J0 c9 = C2812b0.c();
                    b bVar = new b(h.this, t8, null);
                    this.f9494a = a8;
                    this.f9495b = null;
                    this.f9496c = 2;
                    if (AbstractC2825i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                    c3326n = a8;
                    a8 = c3326n;
                }
            }
            a8.g();
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S4.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0207h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9505a;

        /* renamed from: b, reason: collision with root package name */
        Object f9506b;

        /* renamed from: c, reason: collision with root package name */
        Object f9507c;

        /* renamed from: d, reason: collision with root package name */
        int f9508d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9510f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3312F f9511g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.h$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9512a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9513b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9514c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9513b = hVar;
                this.f9514c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9513b, this.f9514c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9512a == 0) {
                    t.b(obj);
                    if (this.f9513b.f9452c.c() != 523) {
                        this.f9513b.f9451b.h(this.f9514c);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.h$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9515a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9516b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9517c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3312F f9518d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.h$h$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f9519a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f9520b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3312F f9521c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(h hVar, C3312F c3312f, P5.d dVar) {
                    super(2, dVar);
                    this.f9520b = hVar;
                    this.f9521c = c3312f;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new a(this.f9520b, this.f9521c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f9519a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        h hVar = this.f9520b;
                        C3312F c3312f = this.f9521c;
                        this.f9519a = 1;
                        if (hVar.v(c3312f, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, ArrayList arrayList, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9516b = hVar;
                this.f9517c = arrayList;
                this.f9518d = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9516b, this.f9517c, this.f9518d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2855x0 d8;
                Q5.b.e();
                if (this.f9515a == 0) {
                    t.b(obj);
                    if (this.f9516b.f9452c.c() == 523) {
                        this.f9516b.f9451b.b(this.f9517c);
                    }
                    d8 = AbstractC2829k.d(this.f9516b.y(), null, null, new a(this.f9516b, this.f9518d, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0207h(ArrayList arrayList, C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9510f = arrayList;
            this.f9511g = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0207h(this.f9510f, this.f9511g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0207h) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            C3326n c3326n;
            Iterator it;
            Object e8 = Q5.b.e();
            int i8 = this.f9508d;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f9507c;
                c3326n = (C3326n) this.f9506b;
                arrayList = (ArrayList) this.f9505a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                C3326n a8 = C3326n.f34504t.a(h.this.f9450a);
                a8.a();
                arrayList = arrayList2;
                c3326n = a8;
                it = this.f9510f.iterator();
            }
            while (it.hasNext()) {
                C1501k leafCategory = (C1501k) it.next();
                h hVar = h.this;
                AbstractC3159y.h(leafCategory, "leafCategory");
                N A8 = hVar.A(leafCategory, this.f9511g, c3326n);
                arrayList.add(A8);
                J0 c8 = C2812b0.c();
                a aVar = new a(h.this, A8, null);
                this.f9505a = arrayList;
                this.f9506b = c3326n;
                this.f9507c = it;
                this.f9508d = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            c3326n.g();
            J0 c9 = C2812b0.c();
            b bVar = new b(h.this, arrayList, this.f9511g, null);
            this.f9505a = null;
            this.f9506b = null;
            this.f9507c = null;
            this.f9508d = 2;
            obj = AbstractC2825i.g(c9, bVar, this);
            if (obj == e8) {
                return e8;
            }
            return obj;
        }
    }

    public h(Context context, W4.q listener, C1501k category, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(category, "category");
        AbstractC3159y.i(scope, "scope");
        this.f9450a = context;
        this.f9451b = listener;
        this.f9452c = category;
        this.f9453d = scope;
        this.f9454e = -1;
        this.f9456g = new ArrayList();
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N A(C1501k c1501k, C3312F c3312f, C3326n c3326n) {
        String str = "category_top_" + c1501k.c();
        int e8 = c1501k.e();
        int j8 = c1501k.j();
        ArrayList arrayList = new ArrayList();
        J s02 = c3326n.s0(str);
        if (s02 != null && s02.a()) {
            arrayList = c3312f.F0(s02.c());
        } else {
            X4.I c02 = c3312f.c0(c1501k.c(), e8, 0);
            if (c02.f()) {
                arrayList = c3312f.F0(c02);
                String d8 = c02.d();
                AbstractC3159y.f(d8);
                J j9 = new J(str, d8);
                c3326n.L(str);
                c3326n.O0(j9);
            }
        }
        N n8 = new N(c1501k, arrayList, 0, 4, null);
        n8.f(j8);
        return n8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(C3312F c3312f, ArrayList arrayList, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new C0207h(arrayList, c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(c3312f, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final M y() {
        return this.f9453d;
    }
}
