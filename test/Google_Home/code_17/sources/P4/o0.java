package p4;

import P5.AbstractC1378t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.k0;
import u4.C4061a;

/* loaded from: classes4.dex */
public abstract class o0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    private final G f37667a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C4061a formFieldEntry) {
            AbstractC3255y.i(formFieldEntry, "formFieldEntry");
            return AbstractC1378t.e(O5.x.a(o0.this.a(), formFieldEntry));
        }
    }

    public o0(G identifier) {
        AbstractC3255y.i(identifier, "identifier");
        this.f37667a = identifier;
    }

    @Override // p4.k0
    public G a() {
        return this.f37667a;
    }

    @Override // p4.k0
    public InterfaceC3698L d() {
        return y4.g.m(i().m(), new a());
    }

    @Override // p4.k0
    public InterfaceC3698L e() {
        List e8 = AbstractC1378t.e(a());
        if (!(i() instanceof w0)) {
            e8 = null;
        }
        if (e8 == null) {
            e8 = AbstractC1378t.m();
        }
        return AbstractC3700N.a(e8);
    }

    @Override // p4.k0
    public m0 f() {
        return i();
    }

    @Override // p4.k0
    public boolean g() {
        return k0.a.a(this);
    }

    @Override // p4.k0
    public void h(Map rawValuesMap) {
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(a());
        if (str != null) {
            i().r(str);
        }
    }

    public abstract H i();
}
