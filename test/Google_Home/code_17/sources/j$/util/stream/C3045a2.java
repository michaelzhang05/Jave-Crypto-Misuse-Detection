package j$.util.stream;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3045a2 extends AbstractC3050b2 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33685b++;
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33685b += ((AbstractC3050b2) v12).f33685b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f33685b);
    }
}
