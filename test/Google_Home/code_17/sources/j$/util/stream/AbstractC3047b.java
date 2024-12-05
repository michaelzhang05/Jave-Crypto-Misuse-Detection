package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3047b implements InterfaceC3077h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3047b f33674a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3047b f33675b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f33676c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3047b f33677d;

    /* renamed from: e, reason: collision with root package name */
    private int f33678e;

    /* renamed from: f, reason: collision with root package name */
    private int f33679f;

    /* renamed from: g, reason: collision with root package name */
    private Spliterator f33680g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33681h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f33682i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f33683j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33684k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3047b(Spliterator spliterator, int i8, boolean z8) {
        this.f33675b = null;
        this.f33680g = spliterator;
        this.f33674a = this;
        int i9 = EnumC3066e3.f33710g & i8;
        this.f33676c = i9;
        this.f33679f = (~(i9 << 1)) & EnumC3066e3.f33715l;
        this.f33678e = 0;
        this.f33684k = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3047b(AbstractC3047b abstractC3047b, int i8) {
        if (abstractC3047b.f33681h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC3047b.f33681h = true;
        abstractC3047b.f33677d = this;
        this.f33675b = abstractC3047b;
        this.f33676c = EnumC3066e3.f33711h & i8;
        this.f33679f = EnumC3066e3.j(i8, abstractC3047b.f33679f);
        AbstractC3047b abstractC3047b2 = abstractC3047b.f33674a;
        this.f33674a = abstractC3047b2;
        if (M()) {
            abstractC3047b2.f33682i = true;
        }
        this.f33678e = abstractC3047b.f33678e + 1;
    }

    private Spliterator O(int i8) {
        int i9;
        int i10;
        AbstractC3047b abstractC3047b = this.f33674a;
        Spliterator spliterator = abstractC3047b.f33680g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC3047b.f33680g = null;
        if (abstractC3047b.f33684k && abstractC3047b.f33682i) {
            AbstractC3047b abstractC3047b2 = abstractC3047b.f33677d;
            int i11 = 1;
            while (abstractC3047b != this) {
                int i12 = abstractC3047b2.f33676c;
                if (abstractC3047b2.M()) {
                    if (EnumC3066e3.SHORT_CIRCUIT.r(i12)) {
                        i12 &= ~EnumC3066e3.f33724u;
                    }
                    spliterator = abstractC3047b2.L(abstractC3047b, spliterator);
                    if (spliterator.hasCharacteristics(64)) {
                        i9 = (~EnumC3066e3.f33723t) & i12;
                        i10 = EnumC3066e3.f33722s;
                    } else {
                        i9 = (~EnumC3066e3.f33722s) & i12;
                        i10 = EnumC3066e3.f33723t;
                    }
                    i12 = i9 | i10;
                    i11 = 0;
                }
                abstractC3047b2.f33678e = i11;
                abstractC3047b2.f33679f = EnumC3066e3.j(i12, abstractC3047b.f33679f);
                i11++;
                AbstractC3047b abstractC3047b3 = abstractC3047b2;
                abstractC3047b2 = abstractC3047b2.f33677d;
                abstractC3047b = abstractC3047b3;
            }
        }
        if (i8 != 0) {
            this.f33679f = EnumC3066e3.j(i8, this.f33679f);
        }
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final L0 A(IntFunction intFunction) {
        AbstractC3047b abstractC3047b;
        if (this.f33681h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33681h = true;
        if (!this.f33674a.f33684k || (abstractC3047b = this.f33675b) == null || !M()) {
            return y(O(0), true, intFunction);
        }
        this.f33678e = 0;
        return K(abstractC3047b, abstractC3047b.O(0), intFunction);
    }

    abstract L0 B(AbstractC3047b abstractC3047b, Spliterator spliterator, boolean z8, IntFunction intFunction);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long C(Spliterator spliterator) {
        if (EnumC3066e3.SIZED.r(this.f33679f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean D(Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC3071f3 E();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC3071f3 F() {
        AbstractC3047b abstractC3047b = this;
        while (abstractC3047b.f33678e > 0) {
            abstractC3047b = abstractC3047b.f33675b;
        }
        return abstractC3047b.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G() {
        return this.f33679f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H() {
        return EnumC3066e3.ORDERED.r(this.f33679f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator I() {
        return O(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract D0 J(long j8, IntFunction intFunction);

    L0 K(AbstractC3047b abstractC3047b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator L(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        return K(abstractC3047b, spliterator, new C3097l(18)).spliterator();
    }

    abstract boolean M();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator P() {
        AbstractC3047b abstractC3047b = this.f33674a;
        if (this != abstractC3047b) {
            throw new IllegalStateException();
        }
        if (this.f33681h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33681h = true;
        Spliterator spliterator = abstractC3047b.f33680g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC3047b.f33680g = null;
        return spliterator;
    }

    abstract Spliterator Q(AbstractC3047b abstractC3047b, Supplier supplier, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC3125q2 R(Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2) {
        w(spliterator, S((InterfaceC3125q2) Objects.requireNonNull(interfaceC3125q2)));
        return interfaceC3125q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC3125q2 S(InterfaceC3125q2 interfaceC3125q2) {
        Objects.requireNonNull(interfaceC3125q2);
        AbstractC3047b abstractC3047b = this;
        while (abstractC3047b.f33678e > 0) {
            AbstractC3047b abstractC3047b2 = abstractC3047b.f33675b;
            interfaceC3125q2 = abstractC3047b.N(abstractC3047b2.f33679f, interfaceC3125q2);
            abstractC3047b = abstractC3047b2;
        }
        return interfaceC3125q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator T(Spliterator spliterator) {
        return this.f33678e == 0 ? spliterator : Q(this, new C3042a(7, spliterator), this.f33674a.f33684k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f33681h = true;
        this.f33680g = null;
        AbstractC3047b abstractC3047b = this.f33674a;
        Runnable runnable = abstractC3047b.f33683j;
        if (runnable != null) {
            abstractC3047b.f33683j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final boolean isParallel() {
        return this.f33674a.f33684k;
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final InterfaceC3077h onClose(Runnable runnable) {
        if (this.f33681h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC3047b abstractC3047b = this.f33674a;
        Runnable runnable2 = abstractC3047b.f33683j;
        if (runnable2 != null) {
            runnable = new J3(runnable2, runnable);
        }
        abstractC3047b.f33683j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final InterfaceC3077h parallel() {
        this.f33674a.f33684k = true;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final InterfaceC3077h sequential() {
        this.f33674a.f33684k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3077h
    public Spliterator spliterator() {
        if (this.f33681h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33681h = true;
        AbstractC3047b abstractC3047b = this.f33674a;
        if (this != abstractC3047b) {
            return Q(this, new C3042a(0, this), abstractC3047b.f33684k);
        }
        Spliterator spliterator = abstractC3047b.f33680g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC3047b.f33680g = null;
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2) {
        Objects.requireNonNull(interfaceC3125q2);
        if (EnumC3066e3.SHORT_CIRCUIT.r(this.f33679f)) {
            x(spliterator, interfaceC3125q2);
            return;
        }
        interfaceC3125q2.k(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC3125q2);
        interfaceC3125q2.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x(Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2) {
        AbstractC3047b abstractC3047b = this;
        while (abstractC3047b.f33678e > 0) {
            abstractC3047b = abstractC3047b.f33675b;
        }
        interfaceC3125q2.k(spliterator.getExactSizeIfKnown());
        boolean D8 = abstractC3047b.D(spliterator, interfaceC3125q2);
        interfaceC3125q2.j();
        return D8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final L0 y(Spliterator spliterator, boolean z8, IntFunction intFunction) {
        if (this.f33674a.f33684k) {
            return B(this, spliterator, z8, intFunction);
        }
        D0 J8 = J(C(spliterator), intFunction);
        R(spliterator, J8);
        return J8.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object z(K3 k32) {
        if (this.f33681h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33681h = true;
        return this.f33674a.f33684k ? k32.c(this, O(k32.d())) : k32.b(this, O(k32.d()));
    }
}
