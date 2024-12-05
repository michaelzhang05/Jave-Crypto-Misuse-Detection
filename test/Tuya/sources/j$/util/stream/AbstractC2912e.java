package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2912e extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    private static final int f32507g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC2897b f32508a;

    /* renamed from: b, reason: collision with root package name */
    protected Spliterator f32509b;

    /* renamed from: c, reason: collision with root package name */
    protected long f32510c;

    /* renamed from: d, reason: collision with root package name */
    protected AbstractC2912e f32511d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC2912e f32512e;

    /* renamed from: f, reason: collision with root package name */
    private Object f32513f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2912e(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        super(null);
        this.f32508a = abstractC2897b;
        this.f32509b = spliterator;
        this.f32510c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2912e(AbstractC2912e abstractC2912e, Spliterator spliterator) {
        super(abstractC2912e);
        this.f32509b = spliterator;
        this.f32508a = abstractC2912e.f32508a;
        this.f32510c = abstractC2912e.f32510c;
    }

    public static int b() {
        return f32507g;
    }

    public static long g(long j8) {
        long j9 = j8 / f32507g;
        if (j9 > 0) {
            return j9;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f32513f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f32509b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f32510c;
        if (j8 == 0) {
            j8 = g(estimateSize);
            this.f32510c = j8;
        }
        boolean z8 = false;
        AbstractC2912e abstractC2912e = this;
        while (estimateSize > j8 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC2912e e8 = abstractC2912e.e(trySplit);
            abstractC2912e.f32511d = e8;
            AbstractC2912e e9 = abstractC2912e.e(spliterator);
            abstractC2912e.f32512e = e9;
            abstractC2912e.setPendingCount(1);
            if (z8) {
                spliterator = trySplit;
                abstractC2912e = e8;
                e8 = e9;
            } else {
                abstractC2912e = e9;
            }
            z8 = !z8;
            e8.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC2912e.f(abstractC2912e.a());
        abstractC2912e.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        return ((AbstractC2912e) getCompleter()) == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC2912e e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f32513f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f32513f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f32509b = null;
        this.f32512e = null;
        this.f32511d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
