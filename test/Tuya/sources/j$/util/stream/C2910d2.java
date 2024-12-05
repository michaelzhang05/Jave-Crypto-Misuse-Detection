package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2910d2 extends AbstractC2955m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32502b = 1;

    /* renamed from: c, reason: collision with root package name */
    boolean f32503c;

    /* renamed from: d, reason: collision with root package name */
    Object f32504d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2897b f32505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910d2(Y y8, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32505e = y8;
        InterfaceC2975q2 interfaceC2975q22 = this.f32578a;
        Objects.requireNonNull(interfaceC2975q22);
        this.f32504d = new W(interfaceC2975q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910d2(C2938j0 c2938j0, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32505e = c2938j0;
        InterfaceC2975q2 interfaceC2975q22 = this.f32578a;
        Objects.requireNonNull(interfaceC2975q22);
        this.f32504d = new C2913e0(interfaceC2975q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910d2(C3000w c3000w, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32505e = c3000w;
        InterfaceC2975q2 interfaceC2975q22 = this.f32578a;
        Objects.requireNonNull(interfaceC2975q22);
        this.f32504d = new C2981s(interfaceC2975q22);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        switch (this.f32502b) {
            case 0:
                InterfaceC2968p0 interfaceC2968p0 = (InterfaceC2968p0) ((Function) ((C2938j0) this.f32505e).f32565n).apply(obj);
                if (interfaceC2968p0 != null) {
                    try {
                        boolean z8 = this.f32503c;
                        C2913e0 c2913e0 = (C2913e0) this.f32504d;
                        if (z8) {
                            j$.util.c0 spliterator = interfaceC2968p0.sequential().spliterator();
                            while (!this.f32578a.m() && spliterator.tryAdvance((LongConsumer) c2913e0)) {
                            }
                        } else {
                            interfaceC2968p0.sequential().forEach(c2913e0);
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC2968p0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC2968p0 != null) {
                    interfaceC2968p0.close();
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((Function) ((Y) this.f32505e).f32461n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z9 = this.f32503c;
                        W w8 = (W) this.f32504d;
                        if (z9) {
                            j$.util.Z spliterator2 = intStream.sequential().spliterator();
                            while (!this.f32578a.m() && spliterator2.tryAdvance((IntConsumer) w8)) {
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
                G g8 = (G) ((Function) ((C3000w) this.f32505e).f32640n).apply(obj);
                if (g8 != null) {
                    try {
                        boolean z10 = this.f32503c;
                        C2981s c2981s = (C2981s) this.f32504d;
                        if (z10) {
                            j$.util.W spliterator3 = g8.sequential().spliterator();
                            while (!this.f32578a.m() && spliterator3.tryAdvance((DoubleConsumer) c2981s)) {
                            }
                        } else {
                            g8.sequential().forEach(c2981s);
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

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        switch (this.f32502b) {
            case 0:
                this.f32578a.k(-1L);
                return;
            case 1:
                this.f32578a.k(-1L);
                return;
            default:
                this.f32578a.k(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        switch (this.f32502b) {
            case 0:
                this.f32503c = true;
                return this.f32578a.m();
            case 1:
                this.f32503c = true;
                return this.f32578a.m();
            default:
                this.f32503c = true;
                return this.f32578a.m();
        }
    }
}
