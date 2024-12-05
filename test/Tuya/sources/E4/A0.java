package e4;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class A0 implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30272a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30273b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3983b f30274c;

    public A0(m4.G identifier, boolean z8) {
        AbstractC3159y.i(identifier, "identifier");
        this.f30272a = identifier;
        this.f30273b = z8;
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30272a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30274c;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30273b;
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return D.a.a(this);
    }

    public abstract void f(boolean z8, Composer composer, int i8);
}
