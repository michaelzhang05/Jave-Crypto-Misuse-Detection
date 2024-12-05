package j$.util.stream;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2895a2 extends AbstractC2900b2 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32491b++;
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f32491b += ((AbstractC2900b2) v12).f32491b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f32491b);
    }
}
