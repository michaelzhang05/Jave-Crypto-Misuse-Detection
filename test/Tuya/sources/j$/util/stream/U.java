package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class U extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2897b f32438a;

    /* renamed from: b, reason: collision with root package name */
    private Spliterator f32439b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32440c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f32441d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2975q2 f32442e;

    /* renamed from: f, reason: collision with root package name */
    private final U f32443f;

    /* renamed from: g, reason: collision with root package name */
    private L0 f32444g;

    U(U u8, Spliterator spliterator, U u9) {
        super(u8);
        this.f32438a = u8.f32438a;
        this.f32439b = spliterator;
        this.f32440c = u8.f32440c;
        this.f32441d = u8.f32441d;
        this.f32442e = u8.f32442e;
        this.f32443f = u9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public U(AbstractC2897b abstractC2897b, Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        super(null);
        this.f32438a = abstractC2897b;
        this.f32439b = spliterator;
        this.f32440c = AbstractC2912e.g(spliterator.estimateSize());
        this.f32441d = new ConcurrentHashMap(Math.max(16, AbstractC2912e.b() << 1));
        this.f32442e = interfaceC2975q2;
        this.f32443f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f32439b;
        long j8 = this.f32440c;
        boolean z8 = false;
        U u8 = this;
        while (spliterator.estimateSize() > j8 && (trySplit = spliterator.trySplit()) != null) {
            U u9 = new U(u8, trySplit, u8.f32443f);
            U u10 = new U(u8, spliterator, u9);
            u8.addToPendingCount(1);
            u10.addToPendingCount(1);
            u8.f32441d.put(u9, u10);
            if (u8.f32443f != null) {
                u9.addToPendingCount(1);
                if (u8.f32441d.replace(u8.f32443f, u8, u9)) {
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
            C2962o c2962o = new C2962o(14);
            AbstractC2897b abstractC2897b = u8.f32438a;
            D0 J8 = abstractC2897b.J(abstractC2897b.C(spliterator), c2962o);
            u8.f32438a.R(spliterator, J8);
            u8.f32444g = J8.a();
            u8.f32439b = null;
        }
        u8.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l02 = this.f32444g;
        if (l02 != null) {
            l02.forEach(this.f32442e);
            this.f32444g = null;
        } else {
            Spliterator spliterator = this.f32439b;
            if (spliterator != null) {
                this.f32438a.R(spliterator, this.f32442e);
                this.f32439b = null;
            }
        }
        U u8 = (U) this.f32441d.remove(this);
        if (u8 != null) {
            u8.tryComplete();
        }
    }
}
