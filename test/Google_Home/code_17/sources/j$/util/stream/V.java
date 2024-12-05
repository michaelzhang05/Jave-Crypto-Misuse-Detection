package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class V extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private Spliterator f33645a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3125q2 f33646b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3047b f33647c;

    /* renamed from: d, reason: collision with root package name */
    private long f33648d;

    V(V v8, Spliterator spliterator) {
        super(v8);
        this.f33645a = spliterator;
        this.f33646b = v8.f33646b;
        this.f33648d = v8.f33648d;
        this.f33647c = v8.f33647c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(AbstractC3047b abstractC3047b, Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2) {
        super(null);
        this.f33646b = interfaceC3125q2;
        this.f33647c = abstractC3047b;
        this.f33645a = spliterator;
        this.f33648d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33645a;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f33648d;
        if (j8 == 0) {
            j8 = AbstractC3062e.g(estimateSize);
            this.f33648d = j8;
        }
        boolean r8 = EnumC3066e3.SHORT_CIRCUIT.r(this.f33647c.G());
        InterfaceC3125q2 interfaceC3125q2 = this.f33646b;
        boolean z8 = false;
        V v8 = this;
        while (true) {
            if (r8 && interfaceC3125q2.m()) {
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            V v9 = new V(v8, trySplit);
            v8.addToPendingCount(1);
            if (z8) {
                spliterator = trySplit;
            } else {
                V v10 = v8;
                v8 = v9;
                v9 = v10;
            }
            z8 = !z8;
            v8.fork();
            v8 = v9;
            estimateSize = spliterator.estimateSize();
        }
        v8.f33647c.w(spliterator, interfaceC3125q2);
        v8.f33645a = null;
        v8.propagateCompletion();
    }
}
