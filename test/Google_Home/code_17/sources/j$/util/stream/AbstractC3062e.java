package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3062e extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    private static final int f33701g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC3047b f33702a;

    /* renamed from: b, reason: collision with root package name */
    protected Spliterator f33703b;

    /* renamed from: c, reason: collision with root package name */
    protected long f33704c;

    /* renamed from: d, reason: collision with root package name */
    protected AbstractC3062e f33705d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC3062e f33706e;

    /* renamed from: f, reason: collision with root package name */
    private Object f33707f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3062e(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        super(null);
        this.f33702a = abstractC3047b;
        this.f33703b = spliterator;
        this.f33704c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3062e(AbstractC3062e abstractC3062e, Spliterator spliterator) {
        super(abstractC3062e);
        this.f33703b = spliterator;
        this.f33702a = abstractC3062e.f33702a;
        this.f33704c = abstractC3062e.f33704c;
    }

    public static int b() {
        return f33701g;
    }

    public static long g(long j8) {
        long j9 = j8 / f33701g;
        if (j9 > 0) {
            return j9;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f33707f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33703b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f33704c;
        if (j8 == 0) {
            j8 = g(estimateSize);
            this.f33704c = j8;
        }
        boolean z8 = false;
        AbstractC3062e abstractC3062e = this;
        while (estimateSize > j8 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC3062e e8 = abstractC3062e.e(trySplit);
            abstractC3062e.f33705d = e8;
            AbstractC3062e e9 = abstractC3062e.e(spliterator);
            abstractC3062e.f33706e = e9;
            abstractC3062e.setPendingCount(1);
            if (z8) {
                spliterator = trySplit;
                abstractC3062e = e8;
                e8 = e9;
            } else {
                abstractC3062e = e9;
            }
            z8 = !z8;
            e8.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC3062e.f(abstractC3062e.a());
        abstractC3062e.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        return ((AbstractC3062e) getCompleter()) == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC3062e e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f33707f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f33707f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f33703b = null;
        this.f33706e = null;
        this.f33705d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
