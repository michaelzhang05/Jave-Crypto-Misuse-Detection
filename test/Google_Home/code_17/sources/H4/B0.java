package h4;

import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class B0 implements p4.H {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f32199a = AbstractC3700N.a(Integer.valueOf(e4.n.f31771z0));

    /* renamed from: b, reason: collision with root package name */
    private final o6.w f32200b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f32201c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f32202d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f32203e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f32204f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f32205g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f32206h;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32207a = new a();

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
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32208a = new b();

        b() {
            super(2);
        }

        public final C4061a a(boolean z8, String str) {
            return new C4061a(str, z8);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    public B0(boolean z8) {
        o6.w a8 = AbstractC3700N.a(Boolean.valueOf(z8));
        this.f32200b = a8;
        this.f32201c = a8;
        this.f32202d = y4.g.m(a8, a.f32207a);
        this.f32203e = j();
        this.f32204f = y4.g.n(null);
        this.f32205g = y4.g.n(Boolean.TRUE);
        this.f32206h = y4.g.d(t(), v(), b.f32208a);
    }

    public InterfaceC3698L b() {
        return this.f32199a;
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f32204f;
    }

    public InterfaceC3698L j() {
        return this.f32202d;
    }

    @Override // p4.H
    public InterfaceC3698L m() {
        return this.f32206h;
    }

    @Override // p4.H
    public void r(String rawValue) {
        boolean z8;
        AbstractC3255y.i(rawValue, "rawValue");
        Boolean L02 = j6.n.L0(rawValue);
        if (L02 != null) {
            z8 = L02.booleanValue();
        } else {
            z8 = true;
        }
        x(z8);
    }

    @Override // p4.H
    public InterfaceC3698L t() {
        return this.f32205g;
    }

    public InterfaceC3698L v() {
        return this.f32203e;
    }

    public final InterfaceC3698L w() {
        return this.f32201c;
    }

    public final void x(boolean z8) {
        this.f32200b.setValue(Boolean.valueOf(z8));
    }
}
