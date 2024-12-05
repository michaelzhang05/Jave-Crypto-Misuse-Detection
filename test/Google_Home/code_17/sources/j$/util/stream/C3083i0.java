package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3083i0 extends AbstractC3100l2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f33753b;

    /* renamed from: c, reason: collision with root package name */
    C3063e0 f33754c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3088j0 f33755d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3083i0(C3088j0 c3088j0, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33755d = c3088j0;
        InterfaceC3125q2 interfaceC3125q22 = this.f33767a;
        Objects.requireNonNull(interfaceC3125q22);
        this.f33754c = new C3063e0(interfaceC3125q22);
    }

    @Override // j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        InterfaceC3118p0 interfaceC3118p0 = (InterfaceC3118p0) ((LongFunction) this.f33755d.f33759n).apply(j8);
        if (interfaceC3118p0 != null) {
            try {
                boolean z8 = this.f33753b;
                C3063e0 c3063e0 = this.f33754c;
                if (z8) {
                    j$.util.c0 spliterator = interfaceC3118p0.sequential().spliterator();
                    while (!this.f33767a.m() && spliterator.tryAdvance((LongConsumer) c3063e0)) {
                    }
                } else {
                    interfaceC3118p0.sequential().forEach(c3063e0);
                }
            } catch (Throwable th) {
                try {
                    interfaceC3118p0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC3118p0 != null) {
            interfaceC3118p0.close();
        }
    }

    @Override // j$.util.stream.AbstractC3100l2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33767a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC3100l2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        this.f33753b = true;
        return this.f33767a.m();
    }
}
