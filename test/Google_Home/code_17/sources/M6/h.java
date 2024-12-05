package M6;

import I6.A;
import S6.InterfaceC1419g;

/* loaded from: classes5.dex */
public final class h extends A {

    /* renamed from: a, reason: collision with root package name */
    private final String f7230a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7231b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1419g f7232c;

    public h(String str, long j8, InterfaceC1419g interfaceC1419g) {
        this.f7230a = str;
        this.f7231b = j8;
        this.f7232c = interfaceC1419g;
    }

    @Override // I6.A
    public long a() {
        return this.f7231b;
    }

    @Override // I6.A
    public InterfaceC1419g g() {
        return this.f7232c;
    }
}
