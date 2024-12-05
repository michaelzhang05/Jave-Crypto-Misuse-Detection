package m4;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.D;
import r4.C3688a;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class L implements D {

    /* renamed from: e, reason: collision with root package name */
    public static final int f35124e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final G f35125a;

    /* renamed from: b, reason: collision with root package name */
    private final K f35126b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35127c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f35128d;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(String it) {
            boolean z8;
            AbstractC3159y.i(it, "it");
            G a8 = L.this.a();
            if (it.length() == L.this.f().y()) {
                z8 = true;
            } else {
                z8 = false;
            }
            return AbstractC1246t.e(L5.x.a(a8, new C3688a(it, z8)));
        }
    }

    public L(G identifier, K controller) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35125a = identifier;
        this.f35126b = controller;
        this.f35127c = true;
    }

    @Override // m4.D
    public G a() {
        return this.f35125a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f35128d;
    }

    @Override // m4.D
    public boolean c() {
        return this.f35127c;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.m(f().k(), new a());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
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
        if (AbstractC3159y.d(this.f35125a, l8.f35125a) && AbstractC3159y.d(this.f35126b, l8.f35126b)) {
            return true;
        }
        return false;
    }

    public K f() {
        return this.f35126b;
    }

    public int hashCode() {
        return (this.f35125a.hashCode() * 31) + this.f35126b.hashCode();
    }

    public String toString() {
        return "OTPElement(identifier=" + this.f35125a + ", controller=" + this.f35126b + ")";
    }
}
