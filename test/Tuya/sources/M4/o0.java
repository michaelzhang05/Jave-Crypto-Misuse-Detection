package m4;

import M5.AbstractC1246t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.k0;
import r4.C3688a;

/* loaded from: classes4.dex */
public abstract class o0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    private final G f35641a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C3688a formFieldEntry) {
            AbstractC3159y.i(formFieldEntry, "formFieldEntry");
            return AbstractC1246t.e(L5.x.a(o0.this.a(), formFieldEntry));
        }
    }

    public o0(G identifier) {
        AbstractC3159y.i(identifier, "identifier");
        this.f35641a = identifier;
    }

    @Override // m4.k0
    public G a() {
        return this.f35641a;
    }

    @Override // m4.k0
    public InterfaceC3349K d() {
        return v4.g.m(i().m(), new a());
    }

    @Override // m4.k0
    public InterfaceC3349K e() {
        List e8 = AbstractC1246t.e(a());
        if (!(i() instanceof w0)) {
            e8 = null;
        }
        if (e8 == null) {
            e8 = AbstractC1246t.m();
        }
        return AbstractC3351M.a(e8);
    }

    @Override // m4.k0
    public m0 f() {
        return i();
    }

    @Override // m4.k0
    public boolean g() {
        return k0.a.a(this);
    }

    @Override // m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(a());
        if (str != null) {
            i().r(str);
        }
    }

    public abstract H i();
}
