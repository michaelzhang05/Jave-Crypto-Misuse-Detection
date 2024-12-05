package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2973q0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC3001w0 f32605b;

    public /* synthetic */ C2973q0(EnumC3001w0 enumC3001w0, int i8) {
        this.f32604a = i8;
        this.f32605b = enumC3001w0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f32604a) {
            case 0:
                return new AbstractC2997v0(this.f32605b);
            case 1:
                return new AbstractC2997v0(this.f32605b);
            default:
                return new AbstractC2997v0(this.f32605b);
        }
    }
}
