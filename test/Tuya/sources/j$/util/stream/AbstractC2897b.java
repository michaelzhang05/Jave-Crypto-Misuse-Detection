package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2897b implements InterfaceC2927h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2897b f32480a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2897b f32481b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f32482c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC2897b f32483d;

    /* renamed from: e, reason: collision with root package name */
    private int f32484e;

    /* renamed from: f, reason: collision with root package name */
    private int f32485f;

    /* renamed from: g, reason: collision with root package name */
    private Spliterator f32486g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32487h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f32488i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f32489j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f32490k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2897b(Spliterator spliterator, int i8, boolean z8) {
        this.f32481b = null;
        this.f32486g = spliterator;
        this.f32480a = this;
        int i9 = EnumC2916e3.f32516g & i8;
        this.f32482c = i9;
        this.f32485f = (~(i9 << 1)) & EnumC2916e3.f32521l;
        this.f32484e = 0;
        this.f32490k = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2897b(AbstractC2897b abstractC2897b, int i8) {
        if (abstractC2897b.f32487h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC2897b.f32487h = true;
        abstractC2897b.f32483d = this;
        this.f32481b = abstractC2897b;
        this.f32482c = EnumC2916e3.f32517h & i8;
        this.f32485f = EnumC2916e3.j(i8, abstractC2897b.f32485f);
        AbstractC2897b abstractC2897b2 = abstractC2897b.f32480a;
        this.f32480a = abstractC2897b2;
        if (M()) {
            abstractC2897b2.f32488i = true;
        }
        this.f32484e = abstractC2897b.f32484e + 1;
    }

    private Spliterator O(int i8) {
        int i9;
        int i10;
        AbstractC2897b abstractC2897b = this.f32480a;
        Spliterator spliterator = abstractC2897b.f32486g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC2897b.f32486g = null;
        if (abstractC2897b.f32490k && abstractC2897b.f32488i) {
            AbstractC2897b abstractC2897b2 = abstractC2897b.f32483d;
            int i11 = 1;
            while (abstractC2897b != this) {
                int i12 = abstractC2897b2.f32482c;
                if (abstractC2897b2.M()) {
                    if (EnumC2916e3.SHORT_CIRCUIT.r(i12)) {
                        i12 &= ~EnumC2916e3.f32530u;
                    }
                    spliterator = abstractC2897b2.L(abstractC2897b, spliterator);
                    if (spliterator.hasCharacteristics(64)) {
                        i9 = (~EnumC2916e3.f32529t) & i12;
                        i10 = EnumC2916e3.f32528s;
                    } else {
                        i9 = (~EnumC2916e3.f32528s) & i12;
                        i10 = EnumC2916e3.f32529t;
                    }
                    i12 = i9 | i10;
                    i11 = 0;
                }
                abstractC2897b2.f32484e = i11;
                abstractC2897b2.f32485f = EnumC2916e3.j(i12, abstractC2897b.f32485f);
                i11++;
                AbstractC2897b abstractC2897b3 = abstractC2897b2;
                abstractC2897b2 = abstractC2897b2.f32483d;
                abstractC2897b = abstractC2897b3;
            }
        }
        if (i8 != 0) {
            this.f32485f = EnumC2916e3.j(i8, this.f32485f);
        }
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final L0 A(IntFunction intFunction) {
        AbstractC2897b abstractC2897b;
        if (this.f32487h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f32487h = true;
        if (!this.f32480a.f32490k || (abstractC2897b = this.f32481b) == null || !M()) {
            return y(O(0), true, intFunction);
        }
        this.f32484e = 0;
        return K(abstractC2897b, abstractC2897b.O(0), intFunction);
    }

    abstract L0 B(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8, IntFunction intFunction);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long C(Spliterator spliterator) {
        if (EnumC2916e3.SIZED.r(this.f32485f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean D(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC2921f3 E();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC2921f3 F() {
        AbstractC2897b abstractC2897b = this;
        while (abstractC2897b.f32484e > 0) {
            abstractC2897b = abstractC2897b.f32481b;
        }
        return abstractC2897b.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G() {
        return this.f32485f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H() {
        return EnumC2916e3.ORDERED.r(this.f32485f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator I() {
        return O(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract D0 J(long j8, IntFunction intFunction);

    L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator L(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        return K(abstractC2897b, spliterator, new C2947l(18)).spliterator();
    }

    abstract boolean M();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator P() {
        AbstractC2897b abstractC2897b = this.f32480a;
        if (this != abstractC2897b) {
            throw new IllegalStateException();
        }
        if (this.f32487h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f32487h = true;
        Spliterator spliterator = abstractC2897b.f32486g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC2897b.f32486g = null;
        return spliterator;
    }

    abstract Spliterator Q(AbstractC2897b abstractC2897b, Supplier supplier, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC2975q2 R(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        w(spliterator, S((InterfaceC2975q2) Objects.requireNonNull(interfaceC2975q2)));
        return interfaceC2975q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC2975q2 S(InterfaceC2975q2 interfaceC2975q2) {
        Objects.requireNonNull(interfaceC2975q2);
        AbstractC2897b abstractC2897b = this;
        while (abstractC2897b.f32484e > 0) {
            AbstractC2897b abstractC2897b2 = abstractC2897b.f32481b;
            interfaceC2975q2 = abstractC2897b.N(abstractC2897b2.f32485f, interfaceC2975q2);
            abstractC2897b = abstractC2897b2;
        }
        return interfaceC2975q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator T(Spliterator spliterator) {
        return this.f32484e == 0 ? spliterator : Q(this, new C2892a(7, spliterator), this.f32480a.f32490k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f32487h = true;
        this.f32486g = null;
        AbstractC2897b abstractC2897b = this.f32480a;
        Runnable runnable = abstractC2897b.f32489j;
        if (runnable != null) {
            abstractC2897b.f32489j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final boolean isParallel() {
        return this.f32480a.f32490k;
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final InterfaceC2927h onClose(Runnable runnable) {
        if (this.f32487h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC2897b abstractC2897b = this.f32480a;
        Runnable runnable2 = abstractC2897b.f32489j;
        if (runnable2 != null) {
            runnable = new J3(runnable2, runnable);
        }
        abstractC2897b.f32489j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final InterfaceC2927h parallel() {
        this.f32480a.f32490k = true;
        return this;
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final InterfaceC2927h sequential() {
        this.f32480a.f32490k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC2927h
    public Spliterator spliterator() {
        if (this.f32487h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f32487h = true;
        AbstractC2897b abstractC2897b = this.f32480a;
        if (this != abstractC2897b) {
            return Q(this, new C2892a(0, this), abstractC2897b.f32490k);
        }
        Spliterator spliterator = abstractC2897b.f32486g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC2897b.f32486g = null;
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        Objects.requireNonNull(interfaceC2975q2);
        if (EnumC2916e3.SHORT_CIRCUIT.r(this.f32485f)) {
            x(spliterator, interfaceC2975q2);
            return;
        }
        interfaceC2975q2.k(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC2975q2);
        interfaceC2975q2.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x(Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        AbstractC2897b abstractC2897b = this;
        while (abstractC2897b.f32484e > 0) {
            abstractC2897b = abstractC2897b.f32481b;
        }
        interfaceC2975q2.k(spliterator.getExactSizeIfKnown());
        boolean D8 = abstractC2897b.D(spliterator, interfaceC2975q2);
        interfaceC2975q2.j();
        return D8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final L0 y(Spliterator spliterator, boolean z8, IntFunction intFunction) {
        if (this.f32480a.f32490k) {
            return B(this, spliterator, z8, intFunction);
        }
        D0 J8 = J(C(spliterator), intFunction);
        R(spliterator, J8);
        return J8.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object z(K3 k32) {
        if (this.f32487h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f32487h = true;
        return this.f32480a.f32490k ? k32.c(this, O(k32.d())) : k32.b(this, O(k32.d()));
    }
}
