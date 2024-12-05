package S4;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import W4.InterfaceC1485h;
import X4.C;
import X4.C1496f;
import X4.C1504n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.C3312F;
import l5.C3319g;
import l5.C3326n;
import l5.C3335w;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f9226a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1485h f9227b;

    /* renamed from: c, reason: collision with root package name */
    private final M f9228c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f9229d;

    /* renamed from: S4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0194a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9230a;

        C0194a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0194a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0194a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9230a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = a.this;
                this.f9230a = 1;
                if (aVar.f(this) == e8) {
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
        int f9232a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f9234c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f9235d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f9236e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0195a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f9238b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9239c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f9240d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Q f9241e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0195a(a aVar, ArrayList arrayList, T t8, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f9238b = aVar;
                this.f9239c = arrayList;
                this.f9240d = t8;
                this.f9241e = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0195a(this.f9238b, this.f9239c, this.f9240d, this.f9241e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0195a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9237a == 0) {
                    t.b(obj);
                    ArrayList arrayList = this.f9238b.f9229d;
                    if (arrayList == null || arrayList.isEmpty()) {
                        InterfaceC1485h interfaceC1485h = this.f9238b.f9227b;
                        if (interfaceC1485h != null) {
                            interfaceC1485h.b();
                            return I.f6487a;
                        }
                        return null;
                    }
                    if (this.f9238b.f9227b == null) {
                        if (!this.f9239c.isEmpty()) {
                            C3335w.f34546a.n(this.f9238b.f9226a, this.f9239c.size(), (String) this.f9240d.f33761a);
                        }
                    } else if (this.f9241e.f33759a == 1) {
                        InterfaceC1485h interfaceC1485h2 = this.f9238b.f9227b;
                        AbstractC3159y.f(interfaceC1485h2);
                        ArrayList arrayList2 = this.f9238b.f9229d;
                        AbstractC3159y.f(arrayList2);
                        interfaceC1485h2.a(arrayList2);
                    } else {
                        InterfaceC1485h interfaceC1485h3 = this.f9238b.f9227b;
                        AbstractC3159y.f(interfaceC1485h3);
                        interfaceC1485h3.b();
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Q q8, ArrayList arrayList, T t8, P5.d dVar) {
            super(2, dVar);
            this.f9234c = q8;
            this.f9235d = arrayList;
            this.f9236e = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f9234c, this.f9235d, this.f9236e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            Object e8 = Q5.b.e();
            int i8 = this.f9232a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    new C3319g().f(new C3319g().A(a.this.f9226a), a.this.f9226a);
                    C1504n c1504n = new C1504n();
                    c1504n.h(a.this.f9226a);
                    C3312F c3312f = new C3312F(a.this.f9226a);
                    if (c1504n.d() != null) {
                        String d8 = c1504n.d();
                        AbstractC3159y.f(d8);
                        X4.I N8 = c3312f.N(d8);
                        if (!N8.b() && N8.d() != null) {
                            String d9 = N8.d();
                            AbstractC3159y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success")) {
                                this.f9234c.f33759a = jSONObject.getInt("success");
                                if (this.f9234c.f33759a == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                    a.this.f9229d = new ArrayList();
                                    JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                                    int length = jSONArray.length();
                                    for (int i9 = 0; i9 < length; i9++) {
                                        JSONObject jsonObjectPositive = jSONArray.getJSONObject(i9);
                                        C c8 = new C();
                                        AbstractC3159y.h(jsonObjectPositive, "jsonObjectPositive");
                                        c8.a(jsonObjectPositive);
                                        ArrayList arrayList = a.this.f9229d;
                                        AbstractC3159y.f(arrayList);
                                        arrayList.add(c8);
                                    }
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = a.this.f9229d;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        C3326n a8 = C3326n.f34504t.a(a.this.f9226a);
                        a8.a();
                        ArrayList V7 = a8.V();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = a.this.f9229d;
                        AbstractC3159y.f(arrayList4);
                        int size = arrayList4.size();
                        int i10 = 0;
                        while (true) {
                            str = null;
                            if (i10 >= size) {
                                break;
                            }
                            int size2 = V7.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    break;
                                }
                                String X7 = ((C1496f) V7.get(i11)).X();
                                if (X7 != null) {
                                    ArrayList arrayList5 = a.this.f9229d;
                                    AbstractC3159y.f(arrayList5);
                                    if (g6.n.s(X7, ((C) arrayList5.get(i10)).c(), true)) {
                                        ArrayList arrayList6 = a.this.f9229d;
                                        AbstractC3159y.f(arrayList6);
                                        arrayList3.add(arrayList6.get(i10));
                                        Object obj3 = V7.get(i11);
                                        AbstractC3159y.h(obj3, "appsBBDD[i]");
                                        C1496f c1496f = (C1496f) obj3;
                                        if (c1496f.V() == 0) {
                                            c1496f.F0(1);
                                            a8.m1(c1496f);
                                            ArrayList arrayList7 = a.this.f9229d;
                                            AbstractC3159y.f(arrayList7);
                                            Iterator it = arrayList7.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    C c9 = (C) it.next();
                                                    if (g6.n.t(c9.c(), c1496f.X(), false, 2, null)) {
                                                        this.f9235d.add(c9);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i11++;
                            }
                            i10++;
                        }
                        a8.g();
                        a.this.f9229d = arrayList3;
                        if (this.f9235d.size() == 1) {
                            ArrayList arrayList8 = this.f9235d;
                            Iterator it2 = V7.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (AbstractC3159y.d(((C1496f) obj2).X(), ((C) AbstractC1246t.m0(arrayList8)).c())) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            C1496f c1496f2 = (C1496f) obj2;
                            T t8 = this.f9236e;
                            if (c1496f2 != null) {
                                str = c1496f2.I();
                            }
                            t8.f33761a = str;
                        }
                    }
                    SettingsPreferences.f29323b.L0(a.this.f9226a, System.currentTimeMillis());
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c10 = C2812b0.c();
                C0195a c0195a = new C0195a(a.this, this.f9235d, this.f9236e, this.f9234c, null);
                this.f9232a = 1;
                obj = AbstractC2825i.g(c10, c0195a, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }
    }

    public a(Context context, InterfaceC1485h interfaceC1485h, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(scope, "scope");
        this.f9226a = context;
        this.f9227b = interfaceC1485h;
        this.f9228c = scope;
        AbstractC2829k.d(scope, null, null, new C0194a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new b(new Q(), new ArrayList(), new T(), null), dVar);
    }
}
