package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3123q0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC3151w0 f33799b;

    public /* synthetic */ C3123q0(EnumC3151w0 enumC3151w0, int i8) {
        this.f33798a = i8;
        this.f33799b = enumC3151w0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f33798a) {
            case 0:
                return new AbstractC3147v0(this.f33799b);
            case 1:
                return new AbstractC3147v0(this.f33799b);
            default:
                return new AbstractC3147v0(this.f33799b);
        }
    }
}
