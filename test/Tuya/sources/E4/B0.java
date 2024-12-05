package e4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class B0 implements m4.H {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f30278a = AbstractC3351M.a(Integer.valueOf(b4.n.f14765z0));

    /* renamed from: b, reason: collision with root package name */
    private final l6.v f30279b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f30280c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f30281d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f30282e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f30283f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f30284g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f30285h;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30286a = new a();

        a() {
            super(1);
        }

        public final String a(boolean z8) {
            return String.valueOf(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30287a = new b();

        b() {
            super(2);
        }

        public final C3688a a(boolean z8, String str) {
            return new C3688a(str, z8);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    public B0(boolean z8) {
        l6.v a8 = AbstractC3351M.a(Boolean.valueOf(z8));
        this.f30279b = a8;
        this.f30280c = a8;
        this.f30281d = v4.g.m(a8, a.f30286a);
        this.f30282e = k();
        this.f30283f = v4.g.n(null);
        this.f30284g = v4.g.n(Boolean.TRUE);
        this.f30285h = v4.g.d(t(), v(), b.f30287a);
    }

    public InterfaceC3349K b() {
        return this.f30278a;
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f30283f;
    }

    public InterfaceC3349K k() {
        return this.f30281d;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f30285h;
    }

    @Override // m4.H
    public void r(String rawValue) {
        boolean z8;
        AbstractC3159y.i(rawValue, "rawValue");
        Boolean L02 = g6.n.L0(rawValue);
        if (L02 != null) {
            z8 = L02.booleanValue();
        } else {
            z8 = true;
        }
        x(z8);
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f30284g;
    }

    public InterfaceC3349K v() {
        return this.f30282e;
    }

    public final InterfaceC3349K w() {
        return this.f30280c;
    }

    public final void x(boolean z8) {
        this.f30279b.setValue(Boolean.valueOf(z8));
    }
}
