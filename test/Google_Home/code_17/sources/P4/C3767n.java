package p4;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import p4.D;
import u4.C4061a;

/* renamed from: p4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3767n implements D {

    /* renamed from: a, reason: collision with root package name */
    private final G f37641a;

    /* renamed from: b, reason: collision with root package name */
    private final C3766m f37642b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37643c;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f37644d;

    /* renamed from: p4.n$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        public final List a(boolean z8) {
            return AbstractC1378t.e(O5.x.a(C3767n.this.a(), new C4061a(String.valueOf(z8), z8)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public C3767n(G identifier, C3766m controller) {
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f37641a = identifier;
        this.f37642b = controller;
        this.f37643c = true;
    }

    @Override // p4.D
    public G a() {
        return this.f37641a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f37644d;
    }

    @Override // p4.D
    public boolean c() {
        return this.f37643c;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return y4.g.m(f().y(), new a());
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public C3766m f() {
        return this.f37642b;
    }
}
