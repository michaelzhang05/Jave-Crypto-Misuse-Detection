package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3162z extends AbstractC3090j2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f33858b;

    /* renamed from: c, reason: collision with root package name */
    C3131s f33859c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3150w f33860d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3162z(C3150w c3150w, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33860d = c3150w;
        InterfaceC3125q2 interfaceC3125q22 = this.f33760a;
        Objects.requireNonNull(interfaceC3125q22);
        this.f33859c = new C3131s(interfaceC3125q22);
    }

    @Override // j$.util.stream.InterfaceC3110n2, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        G g8 = (G) ((DoubleFunction) this.f33860d.f33834n).apply(d8);
        if (g8 != null) {
            try {
                boolean z8 = this.f33858b;
                C3131s c3131s = this.f33859c;
                if (z8) {
                    j$.util.W spliterator = g8.sequential().spliterator();
                    while (!this.f33760a.m() && spliterator.tryAdvance((DoubleConsumer) c3131s)) {
                    }
                } else {
                    g8.sequential().forEach(c3131s);
                }
            } catch (Throwable th) {
                try {
                    g8.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (g8 != null) {
            g8.close();
        }
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        this.f33760a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC3090j2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        this.f33858b = true;
        return this.f33760a.m();
    }
}
