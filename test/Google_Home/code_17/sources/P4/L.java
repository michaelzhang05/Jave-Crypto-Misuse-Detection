package p4;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import p4.D;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class L implements D {

    /* renamed from: e, reason: collision with root package name */
    public static final int f37150e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final G f37151a;

    /* renamed from: b, reason: collision with root package name */
    private final K f37152b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37153c;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f37154d;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(String it) {
            boolean z8;
            AbstractC3255y.i(it, "it");
            G a8 = L.this.a();
            if (it.length() == L.this.f().y()) {
                z8 = true;
            } else {
                z8 = false;
            }
            return AbstractC1378t.e(O5.x.a(a8, new C4061a(it, z8)));
        }
    }

    public L(G identifier, K controller) {
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f37151a = identifier;
        this.f37152b = controller;
        this.f37153c = true;
    }

    @Override // p4.D
    public G a() {
        return this.f37151a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f37154d;
    }

    @Override // p4.D
    public boolean c() {
        return this.f37153c;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return y4.g.m(f().j(), new a());
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        if (AbstractC3255y.d(this.f37151a, l8.f37151a) && AbstractC3255y.d(this.f37152b, l8.f37152b)) {
            return true;
        }
        return false;
    }

    public K f() {
        return this.f37152b;
    }

    public int hashCode() {
        return (this.f37151a.hashCode() * 31) + this.f37152b.hashCode();
    }

    public String toString() {
        return "OTPElement(identifier=" + this.f37151a + ", controller=" + this.f37152b + ")";
    }
}
