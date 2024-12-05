package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3060d2 extends AbstractC3105m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33696b = 1;

    /* renamed from: c, reason: collision with root package name */
    boolean f33697c;

    /* renamed from: d, reason: collision with root package name */
    Object f33698d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC3047b f33699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3060d2(Y y8, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33699e = y8;
        InterfaceC3125q2 interfaceC3125q22 = this.f33772a;
        Objects.requireNonNull(interfaceC3125q22);
        this.f33698d = new W(interfaceC3125q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3060d2(C3088j0 c3088j0, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33699e = c3088j0;
        InterfaceC3125q2 interfaceC3125q22 = this.f33772a;
        Objects.requireNonNull(interfaceC3125q22);
        this.f33698d = new C3063e0(interfaceC3125q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3060d2(C3150w c3150w, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33699e = c3150w;
        InterfaceC3125q2 interfaceC3125q22 = this.f33772a;
        Objects.requireNonNull(interfaceC3125q22);
        this.f33698d = new C3131s(interfaceC3125q22);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        switch (this.f33696b) {
            case 0:
                InterfaceC3118p0 interfaceC3118p0 = (InterfaceC3118p0) ((Function) ((C3088j0) this.f33699e).f33759n).apply(obj);
                if (interfaceC3118p0 != null) {
                    try {
                        boolean z8 = this.f33697c;
                        C3063e0 c3063e0 = (C3063e0) this.f33698d;
                        if (z8) {
                            j$.util.c0 spliterator = interfaceC3118p0.sequential().spliterator();
                            while (!this.f33772a.m() && spliterator.tryAdvance((LongConsumer) c3063e0)) {
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
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((Function) ((Y) this.f33699e).f33655n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z9 = this.f33697c;
                        W w8 = (W) this.f33698d;
                        if (z9) {
                            j$.util.Z spliterator2 = intStream.sequential().spliterator();
                            while (!this.f33772a.m() && spliterator2.tryAdvance((IntConsumer) w8)) {
                            }
                        } else {
                            intStream.sequential().forEach(w8);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                G g8 = (G) ((Function) ((C3150w) this.f33699e).f33834n).apply(obj);
                if (g8 != null) {
                    try {
                        boolean z10 = this.f33697c;
                        C3131s c3131s = (C3131s) this.f33698d;
                        if (z10) {
                            j$.util.W spliterator3 = g8.sequential().spliterator();
                            while (!this.f33772a.m() && spliterator3.tryAdvance((DoubleConsumer) c3131s)) {
                            }
                        } else {
                            g8.sequential().forEach(c3131s);
                        }
                    } catch (Throwable th5) {
                        try {
                            g8.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (g8 != null) {
                    g8.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        switch (this.f33696b) {
            case 0:
                this.f33772a.k(-1L);
                return;
            case 1:
                this.f33772a.k(-1L);
                return;
            default:
                this.f33772a.k(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        switch (this.f33696b) {
            case 0:
                this.f33697c = true;
                return this.f33772a.m();
            case 1:
                this.f33697c = true;
                return this.f33772a.m();
            default:
                this.f33697c = true;
                return this.f33772a.m();
        }
    }
}
