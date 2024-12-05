package V4;

import O5.I;
import O5.t;
import a5.C1641h;
import a5.C1644k;
import a5.J;
import a5.N;
import a6.InterfaceC1668n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.J0;
import l6.M;
import o5.C3660F;
import o5.C3674n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11093a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.q f11094b;

    /* renamed from: c, reason: collision with root package name */
    private final C1644k f11095c;

    /* renamed from: d, reason: collision with root package name */
    private final M f11096d;

    /* renamed from: e, reason: collision with root package name */
    private int f11097e;

    /* renamed from: f, reason: collision with root package name */
    private int f11098f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f11099g;

    /* renamed from: h, reason: collision with root package name */
    private C1641h f11100h;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11101a;

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
            int i8 = this.f11101a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                h hVar = h.this;
                this.f11101a = 1;
                if (hVar.u(this) == e8) {
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
        int f11103a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f11105c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11106a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11107b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11108c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, T t8, S5.d dVar) {
                super(2, dVar);
                this.f11107b = hVar;
                this.f11108c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11107b, this.f11108c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11106a == 0) {
                    t.b(obj);
                    this.f11107b.f11094b.c((ArrayList) this.f11108c.f34162a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11105c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f11105c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11103a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34162a = new ArrayList();
                C3674n a8 = C3674n.f36505t.a(h.this.f11093a);
                a8.a();
                String str = "features_by_category_" + h.this.f11095c.b();
                J s02 = a8.s0(str);
                int i9 = 0;
                if (s02 != null && s02.a()) {
                    t8.f34162a = this.f11105c.F0(s02.c());
                } else {
                    a5.I e02 = this.f11105c.e0(h.this.f11095c.b(), 6, 0);
                    if (e02.f()) {
                        t8.f34162a = this.f11105c.F0(e02);
                        String d8 = e02.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                a8.l();
                if (!((Collection) t8.f34162a).isEmpty()) {
                    h.this.f11098f++;
                    h.this.f11097e = -1;
                    Iterator it = ((ArrayList) t8.f34162a).iterator();
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (j6.n.s(((C1641h) it.next()).y0(), h.this.f11093a.getPackageName(), true)) {
                            h.this.f11097e = i9;
                        }
                        i9 = i10;
                    }
                    if (h.this.f11097e > -1 && h.this.f11097e < ((ArrayList) t8.f34162a).size()) {
                        ((ArrayList) t8.f34162a).remove(h.this.f11097e);
                    }
                    if (((ArrayList) t8.f34162a).size() > 5) {
                        h.this.f11100h = (C1641h) ((ArrayList) t8.f34162a).remove(5);
                        Z4.q qVar = h.this.f11094b;
                        C1641h c1641h = h.this.f11100h;
                        AbstractC3255y.f(c1641h);
                        qVar.f(c1641h);
                    }
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(h.this, t8, null);
                this.f11103a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
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
        Object f11109a;

        /* renamed from: b, reason: collision with root package name */
        int f11110b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11112a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11113b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f11114c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f11113b = hVar;
                this.f11114c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11113b, this.f11114c, dVar);
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
                    java.lang.Object r0 = T5.b.e()
                    int r1 = r6.f11112a
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    O5.t.b(r7)
                    goto L63
                L18:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L20:
                    O5.t.b(r7)
                    goto L56
                L24:
                    O5.t.b(r7)
                    goto L49
                L28:
                    O5.t.b(r7)
                    goto L3c
                L2c:
                    O5.t.b(r7)
                    V4.h r7 = r6.f11113b
                    o5.F r1 = r6.f11114c
                    r6.f11112a = r5
                    java.lang.Object r7 = V4.h.b(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    V4.h r7 = r6.f11113b
                    o5.F r1 = r6.f11114c
                    r6.f11112a = r4
                    java.lang.Object r7 = V4.h.i(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    V4.h r7 = r6.f11113b
                    o5.F r1 = r6.f11114c
                    r6.f11112a = r3
                    java.lang.Object r7 = V4.h.l(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    V4.h r7 = r6.f11113b
                    o5.F r1 = r6.f11114c
                    r6.f11112a = r2
                    java.lang.Object r7 = V4.h.m(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    O5.I r7 = O5.I.f8278a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: V4.h.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
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
            int f11115a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11116b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, S5.d dVar) {
                super(2, dVar);
                this.f11116b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f11116b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11115a == 0) {
                    t.b(obj);
                    this.f11116b.f11094b.h();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.h$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0231c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11117a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11118b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f11119c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0231c(h hVar, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f11118b = hVar;
                this.f11119c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0231c(this.f11118b, this.f11119c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f11117a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    h hVar = this.f11118b;
                    C3660F c3660f = this.f11119c;
                    ArrayList arrayList = hVar.f11099g;
                    this.f11117a = 1;
                    if (hVar.B(c3660f, arrayList, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0231c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r11.f11110b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.f11109a
                o5.F r0 = (o5.C3660F) r0
                O5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f11109a
                o5.F r1 = (o5.C3660F) r1
                O5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                O5.t.b(r12)
                V4.h r12 = V4.h.this
                r1 = 0
                V4.h.s(r12, r1)
                o5.F r12 = new o5.F
                V4.h r1 = V4.h.this
                android.content.Context r1 = V4.h.d(r1)
                r12.<init>(r1)
                V4.h r1 = V4.h.this
                l6.M r5 = r1.y()
                V4.h$c$a r8 = new V4.h$c$a
                V4.h r1 = V4.h.this
                r8.<init>(r1, r12, r3)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                l6.x0 r1 = l6.AbstractC3360i.d(r5, r6, r7, r8, r9, r10)
                r11.f11109a = r12
                r11.f11110b = r4
                java.lang.Object r1 = r1.y(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                l6.J0 r1 = l6.C3347b0.c()
                V4.h$c$b r5 = new V4.h$c$b
                V4.h r6 = V4.h.this
                r5.<init>(r6, r3)
                r11.f11109a = r12
                r11.f11110b = r2
                java.lang.Object r1 = l6.AbstractC3360i.g(r1, r5, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                V4.h r12 = V4.h.this
                int r12 = V4.h.k(r12)
                if (r12 < r4) goto L8f
                V4.h r12 = V4.h.this
                l6.M r4 = r12.y()
                V4.h$c$c r7 = new V4.h$c$c
                V4.h r12 = V4.h.this
                r7.<init>(r12, r0, r3)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                l6.AbstractC3360i.d(r4, r5, r6, r7, r8, r9)
            L8f:
                O5.I r12 = O5.I.f8278a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: V4.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
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
        int f11120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3660F f11121b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f11122c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11123a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f11124b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f11125c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList arrayList, h hVar, S5.d dVar) {
                super(2, dVar);
                this.f11124b = arrayList;
                this.f11125c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11124b, this.f11125c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11123a == 0) {
                    t.b(obj);
                    if (!this.f11124b.isEmpty()) {
                        this.f11125c.f11094b.d(this.f11124b);
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3660F c3660f, h hVar, S5.d dVar) {
            super(2, dVar);
            this.f11121b = c3660f;
            this.f11122c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f11121b, this.f11122c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = T5.b.e();
            int i9 = this.f11120a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                a5.I x8 = this.f11121b.x(this.f11122c.f11095c.b());
                if (!x8.b() && x8.d() != null) {
                    String d8 = x8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = x8.d();
                        AbstractC3255y.f(d9);
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
                                C1644k c1644k = new C1644k(0, null, null, 7, null);
                                AbstractC3255y.h(jsonObjectFloatingCategory, "jsonObjectFloatingCategory");
                                c1644k.x(jsonObjectFloatingCategory);
                                arrayList.add(c1644k);
                            }
                        }
                    }
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(arrayList, this.f11122c, null);
                this.f11120a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11126a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f11128c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11130b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, S5.d dVar) {
                super(2, dVar);
                this.f11130b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11130b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11129a == 0) {
                    t.b(obj);
                    this.f11130b.f11094b.i(this.f11130b.f11099g);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11128c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f11128c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11126a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3674n a8 = C3674n.f36505t.a(h.this.f11093a);
                a8.a();
                String str = "leaf_categories_" + h.this.f11095c.b();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    h.this.f11099g = C1644k.f14255g.a(s02.b(), h.this.f11095c.b());
                } else {
                    a5.I q8 = this.f11128c.q(h.this.f11095c.b());
                    if (q8.f()) {
                        h hVar = h.this;
                        C1644k.b bVar = C1644k.f14255g;
                        String d8 = q8.d();
                        AbstractC3255y.f(d8);
                        hVar.f11099g = bVar.a(d8, h.this.f11095c.b());
                        String d9 = q8.d();
                        AbstractC3255y.f(d9);
                        J j8 = new J(str, d9);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                a8.l();
                if (!h.this.f11099g.isEmpty()) {
                    h.this.f11098f++;
                    J0 c8 = C3347b0.c();
                    a aVar = new a(h.this, null);
                    this.f11126a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11131a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f11133c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11134a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11135b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f11136c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, S5.d dVar) {
                super(2, dVar);
                this.f11135b = hVar;
                this.f11136c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11135b, this.f11136c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11134a == 0) {
                    t.b(obj);
                    this.f11135b.f11094b.j(this.f11136c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11133c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f11133c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = T5.b.e();
            int i8 = this.f11131a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3674n a8 = C3674n.f36505t.a(h.this.f11093a);
                a8.a();
                String str = "recent_by_category_" + h.this.f11095c.b();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    arrayList = this.f11133c.F0(s02.c());
                } else {
                    a5.I S8 = this.f11133c.S(h.this.f11095c.b(), 20, 0);
                    if (S8.f()) {
                        ArrayList F02 = this.f11133c.F0(S8);
                        String d8 = S8.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                        arrayList = F02;
                    } else {
                        arrayList = null;
                    }
                }
                a8.l();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = h.this.f11093a.getString(R.string.the_latest_title);
                    AbstractC3255y.h(string, "context.getString(R.string.the_latest_title)");
                    C1644k c1644k = new C1644k(-2, string, null, 4, null);
                    c1644k.W(h.this.f11095c.b());
                    N n8 = new N(c1644k, arrayList, 0, 4, null);
                    n8.f(1);
                    J0 c8 = C3347b0.c();
                    a aVar = new a(h.this, n8, null);
                    this.f11131a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
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
        Object f11137a;

        /* renamed from: b, reason: collision with root package name */
        Object f11138b;

        /* renamed from: c, reason: collision with root package name */
        int f11139c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3660F f11141e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11142a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11143b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f11144c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, S5.d dVar) {
                super(2, dVar);
                this.f11143b = hVar;
                this.f11144c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11143b, this.f11144c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11142a == 0) {
                    t.b(obj);
                    this.f11143b.f11094b.a(this.f11144c);
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
            int f11145a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11146b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11147c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, T t8, S5.d dVar) {
                super(2, dVar);
                this.f11146b = hVar;
                this.f11147c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f11146b, this.f11147c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11145a == 0) {
                    t.b(obj);
                    this.f11146b.f11094b.e((C1641h) this.f11147c.f34162a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11141e = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f11141e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3674n a8;
            ArrayList arrayList;
            C3674n c3674n;
            Object e8 = T5.b.e();
            int i8 = this.f11139c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3674n = (C3674n) this.f11137a;
                        t.b(obj);
                        a8 = c3674n;
                        a8.l();
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8 = (C3674n) this.f11138b;
                arrayList = (ArrayList) this.f11137a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a8 = C3674n.f36505t.a(h.this.f11093a);
                a8.a();
                String str = "top_downloads_" + h.this.f11095c.b();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    arrayList2 = this.f11141e.F0(s02.c());
                } else {
                    a5.I b02 = this.f11141e.b0(h.this.f11095c.b(), 20, 0);
                    if (b02.f()) {
                        arrayList2 = this.f11141e.F0(b02);
                        String d8 = b02.d();
                        AbstractC3255y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = h.this.f11093a.getString(R.string.top_downloads_title);
                    AbstractC3255y.h(string, "context.getString(R.string.top_downloads_title)");
                    N n8 = new N(h.this.f11095c, arrayList, 0, 4, null);
                    n8.b().U(string);
                    if (h.this.f11095c.b() == 523 && !UptodownApp.f29058B.S()) {
                        n8.f(4);
                    } else {
                        n8.f(5);
                    }
                    J0 c8 = C3347b0.c();
                    a aVar = new a(h.this, n8, null);
                    this.f11137a = arrayList;
                    this.f11138b = a8;
                    this.f11139c = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a8.l();
                return I.f8278a;
            }
            if (h.this.f11097e > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1641h c1641h = (C1641h) it.next();
                    if (!j6.n.s(c1641h.y0(), h.this.f11093a.getPackageName(), true)) {
                        t8.f34162a = c1641h;
                        break;
                    }
                }
                if (t8.f34162a != null) {
                    J0 c9 = C3347b0.c();
                    b bVar = new b(h.this, t8, null);
                    this.f11137a = a8;
                    this.f11138b = null;
                    this.f11139c = 2;
                    if (AbstractC3360i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                    c3674n = a8;
                    a8 = c3674n;
                }
            }
            a8.l();
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V4.h$h, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0232h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f11148a;

        /* renamed from: b, reason: collision with root package name */
        Object f11149b;

        /* renamed from: c, reason: collision with root package name */
        Object f11150c;

        /* renamed from: d, reason: collision with root package name */
        int f11151d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f11153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3660F f11154g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.h$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11155a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11156b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f11157c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, S5.d dVar) {
                super(2, dVar);
                this.f11156b = hVar;
                this.f11157c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11156b, this.f11157c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11155a == 0) {
                    t.b(obj);
                    if (this.f11156b.f11095c.b() != 523) {
                        this.f11156b.f11094b.g(this.f11157c);
                    }
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
        /* renamed from: V4.h$h$b */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11158a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11159b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f11160c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3660F f11161d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: V4.h$h$b$a */
            /* loaded from: classes5.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f11162a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f11163b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3660F f11164c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(h hVar, C3660F c3660f, S5.d dVar) {
                    super(2, dVar);
                    this.f11163b = hVar;
                    this.f11164c = c3660f;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new a(this.f11163b, this.f11164c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f11162a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        h hVar = this.f11163b;
                        C3660F c3660f = this.f11164c;
                        this.f11162a = 1;
                        if (hVar.v(c3660f, this) == e8) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, ArrayList arrayList, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f11159b = hVar;
                this.f11160c = arrayList;
                this.f11161d = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f11159b, this.f11160c, this.f11161d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3390x0 d8;
                T5.b.e();
                if (this.f11158a == 0) {
                    t.b(obj);
                    if (this.f11159b.f11095c.b() == 523) {
                        this.f11159b.f11094b.b(this.f11160c);
                    }
                    d8 = AbstractC3364k.d(this.f11159b.y(), null, null, new a(this.f11159b, this.f11161d, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0232h(ArrayList arrayList, C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11153f = arrayList;
            this.f11154g = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0232h(this.f11153f, this.f11154g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            C3674n c3674n;
            Iterator it;
            Object e8 = T5.b.e();
            int i8 = this.f11151d;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f11150c;
                c3674n = (C3674n) this.f11149b;
                arrayList = (ArrayList) this.f11148a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                C3674n a8 = C3674n.f36505t.a(h.this.f11093a);
                a8.a();
                arrayList = arrayList2;
                c3674n = a8;
                it = this.f11153f.iterator();
            }
            while (it.hasNext()) {
                C1644k leafCategory = (C1644k) it.next();
                h hVar = h.this;
                AbstractC3255y.h(leafCategory, "leafCategory");
                N A8 = hVar.A(leafCategory, this.f11154g, c3674n);
                arrayList.add(A8);
                J0 c8 = C3347b0.c();
                a aVar = new a(h.this, A8, null);
                this.f11148a = arrayList;
                this.f11149b = c3674n;
                this.f11150c = it;
                this.f11151d = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            c3674n.l();
            J0 c9 = C3347b0.c();
            b bVar = new b(h.this, arrayList, this.f11154g, null);
            this.f11148a = null;
            this.f11149b = null;
            this.f11150c = null;
            this.f11151d = 2;
            obj = AbstractC3360i.g(c9, bVar, this);
            if (obj == e8) {
                return e8;
            }
            return obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0232h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public h(Context context, Z4.q listener, C1644k category, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(category, "category");
        AbstractC3255y.i(scope, "scope");
        this.f11093a = context;
        this.f11094b = listener;
        this.f11095c = category;
        this.f11096d = scope;
        this.f11097e = -1;
        this.f11099g = new ArrayList();
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N A(C1644k c1644k, C3660F c3660f, C3674n c3674n) {
        String str = "category_top_" + c1644k.b();
        int g8 = c1644k.g();
        int l8 = c1644k.l();
        ArrayList arrayList = new ArrayList();
        J s02 = c3674n.s0(str);
        if (s02 != null && s02.a()) {
            arrayList = c3660f.F0(s02.c());
        } else {
            a5.I c02 = c3660f.c0(c1644k.b(), g8, 0);
            if (c02.f()) {
                arrayList = c3660f.F0(c02);
                String d8 = c02.d();
                AbstractC3255y.f(d8);
                J j8 = new J(str, d8);
                c3674n.L(str);
                c3674n.O0(j8);
            }
        }
        N n8 = new N(c1644k, arrayList, 0, 4, null);
        n8.f(l8);
        return n8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(C3660F c3660f, ArrayList arrayList, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new C0232h(arrayList, c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(c3660f, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new f(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new g(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final M y() {
        return this.f11096d;
    }
}
