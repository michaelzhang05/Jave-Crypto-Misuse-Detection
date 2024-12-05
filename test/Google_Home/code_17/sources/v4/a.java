package V4;

import O5.I;
import O5.t;
import P5.AbstractC1378t;
import Z4.InterfaceC1594h;
import a5.C1631C;
import a5.C1639f;
import a5.C1647n;
import a6.InterfaceC1668n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import o5.C3667g;
import o5.C3674n;
import o5.C3683w;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f10869a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1594h f10870b;

    /* renamed from: c, reason: collision with root package name */
    private final M f10871c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f10872d;

    /* renamed from: V4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0219a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10873a;

        C0219a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0219a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10873a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = a.this;
                this.f10873a = 1;
                if (aVar.f(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0219a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10875a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f10877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f10878d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f10879e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0220a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f10880a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f10881b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f10882c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f10883d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Q f10884e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0220a(a aVar, ArrayList arrayList, T t8, Q q8, S5.d dVar) {
                super(2, dVar);
                this.f10881b = aVar;
                this.f10882c = arrayList;
                this.f10883d = t8;
                this.f10884e = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0220a(this.f10881b, this.f10882c, this.f10883d, this.f10884e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f10880a == 0) {
                    t.b(obj);
                    ArrayList arrayList = this.f10881b.f10872d;
                    if (arrayList == null || arrayList.isEmpty()) {
                        InterfaceC1594h interfaceC1594h = this.f10881b.f10870b;
                        if (interfaceC1594h != null) {
                            interfaceC1594h.b();
                            return I.f8278a;
                        }
                        return null;
                    }
                    if (this.f10881b.f10870b == null) {
                        if (!this.f10882c.isEmpty()) {
                            C3683w.f36547a.n(this.f10881b.f10869a, this.f10882c.size(), (String) this.f10883d.f34162a);
                        }
                    } else if (this.f10884e.f34160a == 1) {
                        InterfaceC1594h interfaceC1594h2 = this.f10881b.f10870b;
                        AbstractC3255y.f(interfaceC1594h2);
                        ArrayList arrayList2 = this.f10881b.f10872d;
                        AbstractC3255y.f(arrayList2);
                        interfaceC1594h2.a(arrayList2);
                    } else {
                        InterfaceC1594h interfaceC1594h3 = this.f10881b.f10870b;
                        AbstractC3255y.f(interfaceC1594h3);
                        interfaceC1594h3.b();
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0220a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Q q8, ArrayList arrayList, T t8, S5.d dVar) {
            super(2, dVar);
            this.f10877c = q8;
            this.f10878d = arrayList;
            this.f10879e = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f10877c, this.f10878d, this.f10879e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            Object e8 = T5.b.e();
            int i8 = this.f10875a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    new C3667g().f(new C3667g().A(a.this.f10869a), a.this.f10869a);
                    C1647n c1647n = new C1647n();
                    c1647n.h(a.this.f10869a);
                    C3660F c3660f = new C3660F(a.this.f10869a);
                    if (c1647n.d() != null) {
                        String d8 = c1647n.d();
                        AbstractC3255y.f(d8);
                        a5.I N8 = c3660f.N(d8);
                        if (!N8.b() && N8.d() != null) {
                            String d9 = N8.d();
                            AbstractC3255y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success")) {
                                this.f10877c.f34160a = jSONObject.getInt("success");
                                if (this.f10877c.f34160a == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                    a.this.f10872d = new ArrayList();
                                    JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                                    int length = jSONArray.length();
                                    for (int i9 = 0; i9 < length; i9++) {
                                        JSONObject jsonObjectPositive = jSONArray.getJSONObject(i9);
                                        C1631C c1631c = new C1631C();
                                        AbstractC3255y.h(jsonObjectPositive, "jsonObjectPositive");
                                        c1631c.a(jsonObjectPositive);
                                        ArrayList arrayList = a.this.f10872d;
                                        AbstractC3255y.f(arrayList);
                                        arrayList.add(c1631c);
                                    }
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = a.this.f10872d;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        C3674n a8 = C3674n.f36505t.a(a.this.f10869a);
                        a8.a();
                        ArrayList V7 = a8.V();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = a.this.f10872d;
                        AbstractC3255y.f(arrayList4);
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
                                String X7 = ((C1639f) V7.get(i11)).X();
                                if (X7 != null) {
                                    ArrayList arrayList5 = a.this.f10872d;
                                    AbstractC3255y.f(arrayList5);
                                    if (j6.n.s(X7, ((C1631C) arrayList5.get(i10)).c(), true)) {
                                        ArrayList arrayList6 = a.this.f10872d;
                                        AbstractC3255y.f(arrayList6);
                                        arrayList3.add(arrayList6.get(i10));
                                        Object obj3 = V7.get(i11);
                                        AbstractC3255y.h(obj3, "appsBBDD[i]");
                                        C1639f c1639f = (C1639f) obj3;
                                        if (c1639f.W() == 0) {
                                            c1639f.F0(1);
                                            a8.m1(c1639f);
                                            ArrayList arrayList7 = a.this.f10872d;
                                            AbstractC3255y.f(arrayList7);
                                            Iterator it = arrayList7.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    C1631C c1631c2 = (C1631C) it.next();
                                                    if (j6.n.t(c1631c2.c(), c1639f.X(), false, 2, null)) {
                                                        this.f10878d.add(c1631c2);
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
                        a8.l();
                        a.this.f10872d = arrayList3;
                        if (this.f10878d.size() == 1) {
                            ArrayList arrayList8 = this.f10878d;
                            Iterator it2 = V7.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (AbstractC3255y.d(((C1639f) obj2).X(), ((C1631C) AbstractC1378t.m0(arrayList8)).c())) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            C1639f c1639f2 = (C1639f) obj2;
                            T t8 = this.f10879e;
                            if (c1639f2 != null) {
                                str = c1639f2.z();
                            }
                            t8.f34162a = str;
                        }
                    }
                    SettingsPreferences.f30353b.L0(a.this.f10869a, System.currentTimeMillis());
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3347b0.c();
                C0220a c0220a = new C0220a(a.this, this.f10878d, this.f10879e, this.f10877c, null);
                this.f10875a = 1;
                obj = AbstractC3360i.g(c8, c0220a, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public a(Context context, InterfaceC1594h interfaceC1594h, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(scope, "scope");
        this.f10869a = context;
        this.f10870b = interfaceC1594h;
        this.f10871c = scope;
        AbstractC3364k.d(scope, null, null, new C0219a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new b(new Q(), new ArrayList(), new T(), null), dVar);
    }
}
