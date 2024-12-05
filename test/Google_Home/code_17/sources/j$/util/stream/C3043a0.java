package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3043a0 extends AbstractC3095k2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f33669b;

    /* renamed from: c, reason: collision with root package name */
    W f33670c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y f33671d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043a0(Y y8, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33671d = y8;
        InterfaceC3125q2 interfaceC3125q22 = this.f33763a;
        Objects.requireNonNull(interfaceC3125q22);
        this.f33670c = new W(interfaceC3125q22);
    }

    @Override // j$.util.stream.InterfaceC3115o2, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        IntStream intStream = (IntStream) ((IntFunction) this.f33671d.f33655n).apply(i8);
        if (intStream != null) {
            try {
                boolean z8 = this.f33669b;
                W w8 = this.f33670c;
                if (z8) {
                    j$.util.Z spliterator = intStream.sequential().spliterator();
                    while (!this.f33763a.m() && spliterator.tryAdvance((IntConsumer) w8)) {
                    }
                } else {
                    intStream.sequential().forEach(w8);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33763a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC3095k2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        this.f33669b = true;
        return this.f33763a.m();
    }
}
