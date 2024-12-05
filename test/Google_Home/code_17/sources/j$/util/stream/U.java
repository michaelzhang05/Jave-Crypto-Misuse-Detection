package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class U extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3047b f33632a;

    /* renamed from: b, reason: collision with root package name */
    private Spliterator f33633b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33634c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f33635d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3125q2 f33636e;

    /* renamed from: f, reason: collision with root package name */
    private final U f33637f;

    /* renamed from: g, reason: collision with root package name */
    private L0 f33638g;

    U(U u8, Spliterator spliterator, U u9) {
        super(u8);
        this.f33632a = u8.f33632a;
        this.f33633b = spliterator;
        this.f33634c = u8.f33634c;
        this.f33635d = u8.f33635d;
        this.f33636e = u8.f33636e;
        this.f33637f = u9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public U(AbstractC3047b abstractC3047b, Spliterator spliterator, InterfaceC3125q2 interfaceC3125q2) {
        super(null);
        this.f33632a = abstractC3047b;
        this.f33633b = spliterator;
        this.f33634c = AbstractC3062e.g(spliterator.estimateSize());
        this.f33635d = new ConcurrentHashMap(Math.max(16, AbstractC3062e.b() << 1));
        this.f33636e = interfaceC3125q2;
        this.f33637f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33633b;
        long j8 = this.f33634c;
        boolean z8 = false;
        U u8 = this;
        while (spliterator.estimateSize() > j8 && (trySplit = spliterator.trySplit()) != null) {
            U u9 = new U(u8, trySplit, u8.f33637f);
            U u10 = new U(u8, spliterator, u9);
            u8.addToPendingCount(1);
            u10.addToPendingCount(1);
            u8.f33635d.put(u9, u10);
            if (u8.f33637f != null) {
                u9.addToPendingCount(1);
                if (u8.f33635d.replace(u8.f33637f, u8, u9)) {
                    u8.addToPendingCount(-1);
                } else {
                    u9.addToPendingCount(-1);
                }
            }
            if (z8) {
                spliterator = trySplit;
                u8 = u9;
                u9 = u10;
            } else {
                u8 = u10;
            }
            z8 = !z8;
            u9.fork();
        }
        if (u8.getPendingCount() > 0) {
            C3112o c3112o = new C3112o(14);
            AbstractC3047b abstractC3047b = u8.f33632a;
            D0 J8 = abstractC3047b.J(abstractC3047b.C(spliterator), c3112o);
            u8.f33632a.R(spliterator, J8);
            u8.f33638g = J8.a();
            u8.f33633b = null;
        }
        u8.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l02 = this.f33638g;
        if (l02 != null) {
            l02.forEach(this.f33636e);
            this.f33638g = null;
        } else {
            Spliterator spliterator = this.f33633b;
            if (spliterator != null) {
                this.f33632a.R(spliterator, this.f33636e);
                this.f33633b = null;
            }
        }
        U u8 = (U) this.f33635d.remove(this);
        if (u8 != null) {
            u8.tryComplete();
        }
    }
}
