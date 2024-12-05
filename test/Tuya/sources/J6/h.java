package J6;

import F6.A;
import P6.InterfaceC1281g;

/* loaded from: classes5.dex */
public final class h extends A {

    /* renamed from: a, reason: collision with root package name */
    private final String f5524a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5525b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1281g f5526c;

    public h(String str, long j8, InterfaceC1281g interfaceC1281g) {
        this.f5524a = str;
        this.f5525b = j8;
        this.f5526c = interfaceC1281g;
    }

    @Override // F6.A
    public long a() {
        return this.f5525b;
    }

    @Override // F6.A
    public InterfaceC1281g f() {
        return this.f5526c;
    }
}
