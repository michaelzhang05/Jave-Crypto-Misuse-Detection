package S4;

import L5.I;
import L5.t;
import X4.C1501k;
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
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Context f9375a;

    /* renamed from: b, reason: collision with root package name */
    private W4.o f9376b;

    /* renamed from: c, reason: collision with root package name */
    private final M f9377c;

    /* renamed from: d, reason: collision with root package name */
    private int f9378d;

    /* renamed from: e, reason: collision with root package name */
    private C1501k f9379e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f9380f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f9381g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f9382h;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9383a;

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
            int i8 = this.f9383a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                d dVar = d.this;
                this.f9383a = 1;
                if (dVar.r(this) == e8) {
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
        int f9385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3312F f9386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f9387c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9388a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f9389b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, P5.d dVar2) {
                super(2, dVar2);
                this.f9389b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9389b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9388a == 0) {
                    t.b(obj);
                    W4.o oVar = this.f9389b.f9376b;
                    if (oVar != null) {
                        oVar.b(this.f9389b.f9381g);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3312F c3312f, d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f9386b = c3312f;
            this.f9387c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f9386b, this.f9387c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = Q5.b.e();
            int i9 = this.f9385a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                X4.I q8 = this.f9386b.q(this.f9387c.f9379e.c());
                this.f9387c.f9381g = new ArrayList();
                if (!q8.b() && q8.d() != null) {
                    String d8 = q8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = q8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 != 1) {
                            this.f9387c.f9378d++;
                        } else if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jsonObjectTop = jSONArray.getJSONObject(i10);
                                C1501k c1501k = new C1501k(0, null, null, 7, null);
                                AbstractC3159y.h(jsonObjectTop, "jsonObjectTop");
                                c1501k.u(jsonObjectTop, this.f9387c.f9379e.c());
                                this.f9387c.f9381g.add(c1501k);
                            }
                            J0 c8 = C2812b0.c();
                            a aVar = new a(this.f9387c, null);
                            this.f9385a = 1;
                            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9390a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9392a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f9393b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9394c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, C3312F c3312f, P5.d dVar2) {
                super(2, dVar2);
                this.f9393b = dVar;
                this.f9394c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9393b, this.f9394c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = Q5.b.e()
                    int r1 = r7.f9392a
                    r2 = 5
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r6) goto L2f
                    if (r1 == r5) goto L2b
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    L5.t.b(r8)
                    goto L77
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    L5.t.b(r8)
                    goto L6a
                L27:
                    L5.t.b(r8)
                    goto L5d
                L2b:
                    L5.t.b(r8)
                    goto L50
                L2f:
                    L5.t.b(r8)
                    goto L43
                L33:
                    L5.t.b(r8)
                    S4.d r8 = r7.f9393b
                    l5.F r1 = r7.f9394c
                    r7.f9392a = r6
                    java.lang.Object r8 = S4.d.m(r8, r1, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    S4.d r8 = r7.f9393b
                    l5.F r1 = r7.f9394c
                    r7.f9392a = r5
                    java.lang.Object r8 = S4.d.a(r8, r1, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    S4.d r8 = r7.f9393b
                    l5.F r1 = r7.f9394c
                    r7.f9392a = r4
                    java.lang.Object r8 = S4.d.j(r8, r1, r7)
                    if (r8 != r0) goto L5d
                    return r0
                L5d:
                    S4.d r8 = r7.f9393b
                    l5.F r1 = r7.f9394c
                    r7.f9392a = r3
                    java.lang.Object r8 = S4.d.k(r8, r1, r7)
                    if (r8 != r0) goto L6a
                    return r0
                L6a:
                    S4.d r8 = r7.f9393b
                    l5.F r1 = r7.f9394c
                    r7.f9392a = r2
                    java.lang.Object r8 = S4.d.l(r8, r1, r7)
                    if (r8 != r0) goto L77
                    return r0
                L77:
                    L5.I r8 = L5.I.f6487a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: S4.d.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9395a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f9396b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, P5.d dVar2) {
                super(2, dVar2);
                this.f9396b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9396b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9395a == 0) {
                    t.b(obj);
                    W4.o oVar = this.f9396b.f9376b;
                    if (oVar != null) {
                        oVar.c(this.f9396b.f9382h, this.f9396b.f9381g, this.f9396b.f9380f, this.f9396b.f9378d);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2855x0 d8;
            Object e8 = Q5.b.e();
            int i8 = this.f9390a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                d8 = AbstractC2829k.d(d.this.t(), null, null, new a(d.this, new C3312F(d.this.f9375a), null), 3, null);
                this.f9390a = 1;
                if (d8.e(this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C2812b0.c();
            b bVar = new b(d.this, null);
            this.f9390a = 2;
            obj = AbstractC2825i.g(c8, bVar, this);
            if (obj == e8) {
                return e8;
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S4.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0202d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3312F f9398b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f9399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0202d(C3312F c3312f, d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f9398b = c3312f;
            this.f9399c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0202d(this.f9398b, this.f9399c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0202d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Q5.b.e();
            if (this.f9397a == 0) {
                t.b(obj);
                X4.I S7 = this.f9398b.S(this.f9399c.f9379e.c(), 10, 0);
                if (!S7.b() && S7.d() != null) {
                    String d8 = S7.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        ArrayList F02 = this.f9398b.F0(S7);
                        try {
                            str = this.f9399c.f9375a.getString(R.string.the_latest_title);
                            AbstractC3159y.h(str, "context.getString(R.string.the_latest_title)");
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            str = "The latest";
                        }
                        C1501k c1501k = new C1501k(-2, str, null, 4, null);
                        c1501k.V(this.f9399c.f9379e.c());
                        N n8 = new N(c1501k, F02, 0, 4, null);
                        n8.f(1);
                        return kotlin.coroutines.jvm.internal.b.a(this.f9399c.f9380f.add(n8));
                    }
                }
                d dVar = this.f9399c;
                int i8 = dVar.f9378d;
                dVar.f9378d = i8 + 1;
                return kotlin.coroutines.jvm.internal.b.c(i8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9400a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9402c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9402c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f9402c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            String str;
            Q5.b.e();
            if (this.f9400a == 0) {
                t.b(obj);
                if (d.this.f9379e.c() == 523) {
                    i8 = 8;
                } else {
                    i8 = 10;
                }
                X4.I b02 = this.f9402c.b0(d.this.f9379e.c(), i8, 0);
                if (!b02.b() && b02.d() != null) {
                    String d8 = b02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        ArrayList F02 = this.f9402c.F0(b02);
                        try {
                            str = d.this.f9375a.getString(R.string.top_downloads_title);
                            AbstractC3159y.h(str, "context.getString(R.string.top_downloads_title)");
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            str = "Top Downloads";
                        }
                        C1501k c1501k = new C1501k(-1, str, null, 4, null);
                        c1501k.V(d.this.f9379e.c());
                        N n8 = new N(c1501k, F02, 0, 4, null);
                        if (d.this.f9379e.c() == 523 && !UptodownApp.f28003B.S()) {
                            n8.f(4);
                        } else {
                            n8.f(5);
                        }
                        return kotlin.coroutines.jvm.internal.b.a(d.this.f9380f.add(n8));
                    }
                }
                d dVar = d.this;
                int i9 = dVar.f9378d;
                dVar.f9378d = i9 + 1;
                return kotlin.coroutines.jvm.internal.b.c(i9);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9403a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9405c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9405c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Q5.b.e();
            if (this.f9403a == 0) {
                t.b(obj);
                Iterator it = d.this.f9381g.iterator();
                while (it.hasNext()) {
                    C1501k leafCategory = (C1501k) it.next();
                    if (leafCategory.c() != 648 && leafCategory.c() != 567 && leafCategory.c() != 563) {
                        i8 = 10;
                    } else {
                        i8 = 12;
                    }
                    X4.I c02 = this.f9405c.c0(leafCategory.c(), i8, 0);
                    if (!c02.b() && c02.d() != null) {
                        String d8 = c02.d();
                        AbstractC3159y.f(d8);
                        if (d8.length() > 0) {
                            ArrayList F02 = this.f9405c.F0(c02);
                            AbstractC3159y.h(leafCategory, "leafCategory");
                            N n8 = new N(leafCategory, F02, 0, 4, null);
                            if (d.this.f9379e.c() == 523) {
                                int c8 = leafCategory.c();
                                if (c8 != 568 && c8 != 593 && c8 != 645) {
                                    switch (c8) {
                                        case 558:
                                        case 559:
                                        case 560:
                                        case 562:
                                            break;
                                        case 561:
                                            break;
                                        default:
                                            switch (c8) {
                                                case 564:
                                                case 565:
                                                case 566:
                                                    break;
                                                default:
                                                    n8.f(6);
                                                    break;
                                            }
                                    }
                                    n8.f(5);
                                }
                                n8.f(1);
                            } else {
                                n8.f(1);
                            }
                            d.this.f9380f.add(n8);
                        }
                    }
                    d.this.f9378d++;
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3312F f9407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f9408c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9409a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f9410b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, P5.d dVar2) {
                super(2, dVar2);
                this.f9410b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9410b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9409a == 0) {
                    t.b(obj);
                    W4.o oVar = this.f9410b.f9376b;
                    if (oVar != null) {
                        oVar.a(this.f9410b.f9382h);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3312F c3312f, d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f9407b = c3312f;
            this.f9408c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9407b, this.f9408c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9406a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            X4.I e02 = this.f9407b.e0(this.f9408c.f9379e.c(), 10, 0);
            if (!e02.b() && e02.d() != null) {
                String d8 = e02.d();
                AbstractC3159y.f(d8);
                if (d8.length() > 0) {
                    this.f9408c.f9382h = this.f9407b.F0(e02);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(this.f9408c, null);
                    this.f9406a = 1;
                    Object g8 = AbstractC2825i.g(c8, aVar, this);
                    if (g8 == e8) {
                        return e8;
                    }
                    return g8;
                }
            }
            d dVar = this.f9408c;
            int i9 = dVar.f9378d;
            dVar.f9378d = i9 + 1;
            return kotlin.coroutines.jvm.internal.b.c(i9);
        }
    }

    public d(Context context, W4.o oVar, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(scope, "scope");
        this.f9375a = context;
        this.f9376b = oVar;
        this.f9377c = scope;
        this.f9379e = new C1501k(523, "Games", null, 4, null);
        this.f9380f = new ArrayList();
        this.f9381g = new ArrayList();
        this.f9382h = new ArrayList();
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(c3312f, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new C0202d(c3312f, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(c3312f, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final M t() {
        return this.f9377c;
    }
}
