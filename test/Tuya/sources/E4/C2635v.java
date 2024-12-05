package e4;

import M5.AbstractC1246t;
import com.stripe.android.view.C2469s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.D;
import r4.C3688a;
import y2.InterfaceC3983b;

/* renamed from: e4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2635v implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30848a;

    /* renamed from: b, reason: collision with root package name */
    private final List f30849b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30850c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f30851d;

    /* renamed from: e, reason: collision with root package name */
    private final m4.q0 f30852e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f30853f;

    /* renamed from: e4.v$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String textFieldValue) {
            AbstractC3159y.i(textFieldValue, "textFieldValue");
            List list = C2635v.this.f30849b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (g6.n.C(textFieldValue, ((C2469s.a) obj).c(), false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C2469s.a) it.next()).b());
            }
            return (String) AbstractC1246t.o0(arrayList2);
        }
    }

    /* renamed from: e4.v$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements X5.n {
        b() {
            super(2);
        }

        public final List a(boolean z8, String fieldValue) {
            AbstractC3159y.i(fieldValue, "fieldValue");
            return AbstractC1246t.e(L5.x.a(C2635v.this.a(), new C3688a(fieldValue, z8)));
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    public C2635v(m4.G identifierSpec, List banks, String str) {
        AbstractC3159y.i(identifierSpec, "identifierSpec");
        AbstractC3159y.i(banks, "banks");
        this.f30848a = identifierSpec;
        this.f30849b = banks;
        this.f30850c = true;
        m4.q0 q0Var = new m4.q0(m4.G.Companion.a("au_becs_debit[bsb_number]"), new m4.s0(new C2634u(banks), false, str, 2, null));
        this.f30852e = q0Var;
        this.f30853f = v4.g.m(q0Var.i().k(), new a());
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30848a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30851d;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30850c;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.d(this.f30852e.i().t(), this.f30852e.i().k(), new b());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return D.a.a(this);
    }

    public final InterfaceC3349K g() {
        return this.f30853f;
    }

    public final m4.q0 h() {
        return this.f30852e;
    }
}
