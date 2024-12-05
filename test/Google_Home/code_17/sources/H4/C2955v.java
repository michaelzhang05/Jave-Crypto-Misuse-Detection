package h4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import com.stripe.android.view.C2663s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import p4.D;
import u4.C4061a;

/* renamed from: h4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2955v implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32769a;

    /* renamed from: b, reason: collision with root package name */
    private final List f32770b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32771c;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f32772d;

    /* renamed from: e, reason: collision with root package name */
    private final p4.q0 f32773e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f32774f;

    /* renamed from: h4.v$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String textFieldValue) {
            AbstractC3255y.i(textFieldValue, "textFieldValue");
            List list = C2955v.this.f32770b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (j6.n.C(textFieldValue, ((C2663s.a) obj).b(), false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C2663s.a) it.next()).a());
            }
            return (String) AbstractC1378t.o0(arrayList2);
        }
    }

    /* renamed from: h4.v$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {
        b() {
            super(2);
        }

        public final List a(boolean z8, String fieldValue) {
            AbstractC3255y.i(fieldValue, "fieldValue");
            return AbstractC1378t.e(O5.x.a(C2955v.this.a(), new C4061a(fieldValue, z8)));
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    public C2955v(p4.G identifierSpec, List banks, String str) {
        AbstractC3255y.i(identifierSpec, "identifierSpec");
        AbstractC3255y.i(banks, "banks");
        this.f32769a = identifierSpec;
        this.f32770b = banks;
        this.f32771c = true;
        p4.q0 q0Var = new p4.q0(p4.G.Companion.a("au_becs_debit[bsb_number]"), new p4.s0(new C2954u(banks), false, str, 2, null));
        this.f32773e = q0Var;
        this.f32774f = y4.g.m(q0Var.i().j(), new a());
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32769a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32772d;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32771c;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return y4.g.d(this.f32773e.i().t(), this.f32773e.i().j(), new b());
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public final InterfaceC3698L g() {
        return this.f32774f;
    }

    public final p4.q0 h() {
        return this.f32773e;
    }
}
