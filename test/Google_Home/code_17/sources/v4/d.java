package V4;

import O5.I;
import O5.t;
import a5.C1644k;
import a5.N;
import a6.InterfaceC1668n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.J0;
import l6.M;
import o5.C3660F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Context f11018a;

    /* renamed from: b, reason: collision with root package name */
    private Z4.o f11019b;

    /* renamed from: c, reason: collision with root package name */
    private final M f11020c;

    /* renamed from: d, reason: collision with root package name */
    private int f11021d;

    /* renamed from: e, reason: collision with root package name */
    private C1644k f11022e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f11023f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f11024g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f11025h;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11026a;

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
            int i8 = this.f11026a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                d dVar = d.this;
                this.f11026a = 1;
                if (dVar.r(this) == e8) {
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
        int f11028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3660F f11029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f11030c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11031a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11032b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, S5.d dVar2) {
                super(2, dVar2);
                this.f11032b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11032b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11031a == 0) {
                    t.b(obj);
                    Z4.o oVar = this.f11032b.f11019b;
                    if (oVar != null) {
                        oVar.b(this.f11032b.f11024g);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3660F c3660f, d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f11029b = c3660f;
            this.f11030c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f11029b, this.f11030c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = T5.b.e();
            int i9 = this.f11028a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a5.I q8 = this.f11029b.q(this.f11030c.f11022e.b());
                this.f11030c.f11024g = new ArrayList();
                if (!q8.b() && q8.d() != null) {
                    String d8 = q8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = q8.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 != 1) {
                            this.f11030c.f11021d++;
                        } else if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jsonObjectTop = jSONArray.getJSONObject(i10);
                                C1644k c1644k = new C1644k(0, null, null, 7, null);
                                AbstractC3255y.h(jsonObjectTop, "jsonObjectTop");
                                c1644k.w(jsonObjectTop, this.f11030c.f11022e.b());
                                this.f11030c.f11024g.add(c1644k);
                            }
                            J0 c8 = C3347b0.c();
                            a aVar = new a(this.f11030c, null);
                            this.f11028a = 1;
                            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11033a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11035a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11036b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3660F f11037c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, C3660F c3660f, S5.d dVar2) {
                super(2, dVar2);
                this.f11036b = dVar;
                this.f11037c = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11036b, this.f11037c, dVar);
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
                    java.lang.Object r0 = T5.b.e()
                    int r1 = r7.f11035a
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
                    O5.t.b(r8)
                    goto L77
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    O5.t.b(r8)
                    goto L6a
                L27:
                    O5.t.b(r8)
                    goto L5d
                L2b:
                    O5.t.b(r8)
                    goto L50
                L2f:
                    O5.t.b(r8)
                    goto L43
                L33:
                    O5.t.b(r8)
                    V4.d r8 = r7.f11036b
                    o5.F r1 = r7.f11037c
                    r7.f11035a = r6
                    java.lang.Object r8 = V4.d.m(r8, r1, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    V4.d r8 = r7.f11036b
                    o5.F r1 = r7.f11037c
                    r7.f11035a = r5
                    java.lang.Object r8 = V4.d.a(r8, r1, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    V4.d r8 = r7.f11036b
                    o5.F r1 = r7.f11037c
                    r7.f11035a = r4
                    java.lang.Object r8 = V4.d.j(r8, r1, r7)
                    if (r8 != r0) goto L5d
                    return r0
                L5d:
                    V4.d r8 = r7.f11036b
                    o5.F r1 = r7.f11037c
                    r7.f11035a = r3
                    java.lang.Object r8 = V4.d.k(r8, r1, r7)
                    if (r8 != r0) goto L6a
                    return r0
                L6a:
                    V4.d r8 = r7.f11036b
                    o5.F r1 = r7.f11037c
                    r7.f11035a = r2
                    java.lang.Object r8 = V4.d.l(r8, r1, r7)
                    if (r8 != r0) goto L77
                    return r0
                L77:
                    O5.I r8 = O5.I.f8278a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: V4.d.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
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
            int f11038a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11039b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, S5.d dVar2) {
                super(2, dVar2);
                this.f11039b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f11039b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11038a == 0) {
                    t.b(obj);
                    Z4.o oVar = this.f11039b.f11019b;
                    if (oVar != null) {
                        oVar.c(this.f11039b.f11025h, this.f11039b.f11024g, this.f11039b.f11023f, this.f11039b.f11021d);
                        return I.f8278a;
                    }
                    return null;
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
            InterfaceC3390x0 d8;
            Object e8 = T5.b.e();
            int i8 = this.f11033a;
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
                d8 = AbstractC3364k.d(d.this.t(), null, null, new a(d.this, new C3660F(d.this.f11018a), null), 3, null);
                this.f11033a = 1;
                if (d8.y(this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3347b0.c();
            b bVar = new b(d.this, null);
            this.f11033a = 2;
            obj = AbstractC3360i.g(c8, bVar, this);
            if (obj == e8) {
                return e8;
            }
            return obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V4.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0227d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3660F f11041b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f11042c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0227d(C3660F c3660f, d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f11041b = c3660f;
            this.f11042c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0227d(this.f11041b, this.f11042c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            T5.b.e();
            if (this.f11040a == 0) {
                t.b(obj);
                a5.I S8 = this.f11041b.S(this.f11042c.f11022e.b(), 10, 0);
                if (!S8.b() && S8.d() != null) {
                    String d8 = S8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        ArrayList F02 = this.f11041b.F0(S8);
                        try {
                            str = this.f11042c.f11018a.getString(R.string.the_latest_title);
                            AbstractC3255y.h(str, "context.getString(R.string.the_latest_title)");
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            str = "The latest";
                        }
                        C1644k c1644k = new C1644k(-2, str, null, 4, null);
                        c1644k.W(this.f11042c.f11022e.b());
                        N n8 = new N(c1644k, F02, 0, 4, null);
                        n8.f(1);
                        return kotlin.coroutines.jvm.internal.b.a(this.f11042c.f11023f.add(n8));
                    }
                }
                d dVar = this.f11042c;
                int i8 = dVar.f11021d;
                dVar.f11021d = i8 + 1;
                return kotlin.coroutines.jvm.internal.b.c(i8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0227d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11043a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f11045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11045c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f11045c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            String str;
            T5.b.e();
            if (this.f11043a == 0) {
                t.b(obj);
                if (d.this.f11022e.b() == 523) {
                    i8 = 8;
                } else {
                    i8 = 10;
                }
                a5.I b02 = this.f11045c.b0(d.this.f11022e.b(), i8, 0);
                if (!b02.b() && b02.d() != null) {
                    String d8 = b02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        ArrayList F02 = this.f11045c.F0(b02);
                        try {
                            str = d.this.f11018a.getString(R.string.top_downloads_title);
                            AbstractC3255y.h(str, "context.getString(R.string.top_downloads_title)");
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            str = "Top Downloads";
                        }
                        C1644k c1644k = new C1644k(-1, str, null, 4, null);
                        c1644k.W(d.this.f11022e.b());
                        N n8 = new N(c1644k, F02, 0, 4, null);
                        if (d.this.f11022e.b() == 523 && !UptodownApp.f29058B.S()) {
                            n8.f(4);
                        } else {
                            n8.f(5);
                        }
                        return kotlin.coroutines.jvm.internal.b.a(d.this.f11023f.add(n8));
                    }
                }
                d dVar = d.this;
                int i9 = dVar.f11021d;
                dVar.f11021d = i9 + 1;
                return kotlin.coroutines.jvm.internal.b.c(i9);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        int f11046a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f11048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3660F c3660f, S5.d dVar) {
            super(2, dVar);
            this.f11048c = c3660f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f11048c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            T5.b.e();
            if (this.f11046a == 0) {
                t.b(obj);
                Iterator it = d.this.f11024g.iterator();
                while (it.hasNext()) {
                    C1644k leafCategory = (C1644k) it.next();
                    if (leafCategory.b() != 648 && leafCategory.b() != 567 && leafCategory.b() != 563) {
                        i8 = 10;
                    } else {
                        i8 = 12;
                    }
                    a5.I c02 = this.f11048c.c0(leafCategory.b(), i8, 0);
                    if (!c02.b() && c02.d() != null) {
                        String d8 = c02.d();
                        AbstractC3255y.f(d8);
                        if (d8.length() > 0) {
                            ArrayList F02 = this.f11048c.F0(c02);
                            AbstractC3255y.h(leafCategory, "leafCategory");
                            N n8 = new N(leafCategory, F02, 0, 4, null);
                            if (d.this.f11022e.b() == 523) {
                                int b8 = leafCategory.b();
                                if (b8 != 568 && b8 != 593 && b8 != 645) {
                                    switch (b8) {
                                        case 558:
                                        case 559:
                                        case 560:
                                        case 562:
                                            break;
                                        case 561:
                                            break;
                                        default:
                                            switch (b8) {
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
                            d.this.f11023f.add(n8);
                        }
                    }
                    d.this.f11021d++;
                }
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
        int f11049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3660F f11050b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f11051c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11052a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11053b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, S5.d dVar2) {
                super(2, dVar2);
                this.f11053b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11053b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f11052a == 0) {
                    t.b(obj);
                    Z4.o oVar = this.f11053b.f11019b;
                    if (oVar != null) {
                        oVar.a(this.f11053b.f11025h);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3660F c3660f, d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f11050b = c3660f;
            this.f11051c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f11050b, this.f11051c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11049a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            a5.I e02 = this.f11050b.e0(this.f11051c.f11022e.b(), 10, 0);
            if (!e02.b() && e02.d() != null) {
                String d8 = e02.d();
                AbstractC3255y.f(d8);
                if (d8.length() > 0) {
                    this.f11051c.f11025h = this.f11050b.F0(e02);
                    J0 c8 = C3347b0.c();
                    a aVar = new a(this.f11051c, null);
                    this.f11049a = 1;
                    Object g8 = AbstractC3360i.g(c8, aVar, this);
                    if (g8 == e8) {
                        return e8;
                    }
                    return g8;
                }
            }
            d dVar = this.f11051c;
            int i9 = dVar.f11021d;
            dVar.f11021d = i9 + 1;
            return kotlin.coroutines.jvm.internal.b.c(i9);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public d(Context context, Z4.o oVar, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(scope, "scope");
        this.f11018a = context;
        this.f11019b = oVar;
        this.f11020c = scope;
        this.f11022e = new C1644k(523, "Games", null, 4, null);
        this.f11023f = new ArrayList();
        this.f11024g = new ArrayList();
        this.f11025h = new ArrayList();
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(c3660f, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new C0227d(c3660f, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new f(c3660f, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3660F c3660f, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new g(c3660f, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final M t() {
        return this.f11020c;
    }
}
