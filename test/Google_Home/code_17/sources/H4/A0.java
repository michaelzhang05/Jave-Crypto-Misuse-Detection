package h4;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import p4.D;

/* loaded from: classes4.dex */
public abstract class A0 implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32193a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32194b;

    /* renamed from: c, reason: collision with root package name */
    private final B2.b f32195c;

    public A0(p4.G identifier, boolean z8) {
        AbstractC3255y.i(identifier, "identifier");
        this.f32193a = identifier;
        this.f32194b = z8;
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32193a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32195c;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32194b;
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public abstract void f(boolean z8, Composer composer, int i8);
}
