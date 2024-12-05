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

/* renamed from: m4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3424n implements D {

    /* renamed from: a, reason: collision with root package name */
    private final G f35615a;

    /* renamed from: b, reason: collision with root package name */
    private final C3423m f35616b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35617c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f35618d;

    /* renamed from: m4.n$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        public final List a(boolean z8) {
            return AbstractC1246t.e(L5.x.a(C3424n.this.a(), new C3688a(String.valueOf(z8), z8)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public C3424n(G identifier, C3423m controller) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35615a = identifier;
        this.f35616b = controller;
        this.f35617c = true;
    }

    @Override // m4.D
    public G a() {
        return this.f35615a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f35618d;
    }

    @Override // m4.D
    public boolean c() {
        return this.f35617c;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.m(f().y(), new a());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return D.a.a(this);
    }

    public C3423m f() {
        return this.f35616b;
    }
}
