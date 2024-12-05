package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class A1 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    protected final L0 f33459a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f33460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33461c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f33462d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, K0 k02, int i8) {
        this(a12, k02, i8, (byte) 0);
        this.f33461c = 0;
        this.f33462d = a12.f33462d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, L0 l02, int i8) {
        this(a12, l02, i8, (byte) 0);
        this.f33461c = 1;
        this.f33462d = (Object[]) a12.f33462d;
    }

    A1(A1 a12, L0 l02, int i8, byte b8) {
        super(a12);
        this.f33459a = l02;
        this.f33460b = i8;
    }

    public A1(L0 l02, Object obj, int i8) {
        this.f33461c = i8;
        this.f33459a = l02;
        this.f33460b = 0;
        this.f33462d = obj;
    }

    final void a() {
        switch (this.f33461c) {
            case 0:
                ((K0) this.f33459a).q(this.f33460b, this.f33462d);
                return;
            default:
                this.f33459a.h((Object[]) this.f33462d, this.f33460b);
                return;
        }
    }

    final A1 b(int i8, int i9) {
        switch (this.f33461c) {
            case 0:
                return new A1(this, ((K0) this.f33459a).b(i8), i9);
            default:
                return new A1(this, this.f33459a.b(i8), i9);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        A1 a12 = this;
        while (a12.f33459a.p() != 0) {
            a12.setPendingCount(a12.f33459a.p() - 1);
            int i8 = 0;
            int i9 = 0;
            while (i8 < a12.f33459a.p() - 1) {
                A1 b8 = a12.b(i8, a12.f33460b + i9);
                i9 = (int) (i9 + b8.f33459a.count());
                b8.fork();
                i8++;
            }
            a12 = a12.b(i8, a12.f33460b + i9);
        }
        a12.a();
        a12.propagateCompletion();
    }
}
