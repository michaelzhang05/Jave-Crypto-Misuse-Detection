package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3156x1 extends CountedCompleter implements InterfaceC3125q2 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f33844a;

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC3047b f33845b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f33846c;

    /* renamed from: d, reason: collision with root package name */
    protected long f33847d;

    /* renamed from: e, reason: collision with root package name */
    protected long f33848e;

    /* renamed from: f, reason: collision with root package name */
    protected int f33849f;

    /* renamed from: g, reason: collision with root package name */
    protected int f33850g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3156x1(Spliterator spliterator, AbstractC3047b abstractC3047b, int i8) {
        this.f33844a = spliterator;
        this.f33845b = abstractC3047b;
        this.f33846c = AbstractC3062e.g(spliterator.estimateSize());
        this.f33847d = 0L;
        this.f33848e = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3156x1(AbstractC3156x1 abstractC3156x1, Spliterator spliterator, long j8, long j9, int i8) {
        super(abstractC3156x1);
        this.f33844a = spliterator;
        this.f33845b = abstractC3156x1.f33845b;
        this.f33846c = abstractC3156x1.f33846c;
        this.f33847d = j8;
        this.f33848e = j9;
        if (j8 < 0 || j9 < 0 || (j8 + j9) - 1 >= i8) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j8), Long.valueOf(j8), Long.valueOf(j9), Integer.valueOf(i8)));
        }
    }

    public /* synthetic */ void accept(double d8) {
        AbstractC3163z0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i8) {
        AbstractC3163z0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC3163z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    abstract AbstractC3156x1 b(Spliterator spliterator, long j8, long j9);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33844a;
        AbstractC3156x1 abstractC3156x1 = this;
        while (spliterator.estimateSize() > abstractC3156x1.f33846c && (trySplit = spliterator.trySplit()) != null) {
            abstractC3156x1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC3156x1.b(trySplit, abstractC3156x1.f33847d, estimateSize).fork();
            abstractC3156x1 = abstractC3156x1.b(spliterator, abstractC3156x1.f33847d + estimateSize, abstractC3156x1.f33848e - estimateSize);
        }
        abstractC3156x1.f33845b.R(spliterator, abstractC3156x1);
        abstractC3156x1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        long j9 = this.f33848e;
        if (j8 > j9) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i8 = (int) this.f33847d;
        this.f33849f = i8;
        this.f33850g = i8 + ((int) j9);
    }

    @Override // j$.util.stream.InterfaceC3125q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
