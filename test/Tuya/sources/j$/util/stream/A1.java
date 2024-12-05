package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class A1 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    protected final L0 f32265a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f32266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32267c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f32268d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, K0 k02, int i8) {
        this(a12, k02, i8, (byte) 0);
        this.f32267c = 0;
        this.f32268d = a12.f32268d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, L0 l02, int i8) {
        this(a12, l02, i8, (byte) 0);
        this.f32267c = 1;
        this.f32268d = (Object[]) a12.f32268d;
    }

    A1(A1 a12, L0 l02, int i8, byte b8) {
        super(a12);
        this.f32265a = l02;
        this.f32266b = i8;
    }

    public A1(L0 l02, Object obj, int i8) {
        this.f32267c = i8;
        this.f32265a = l02;
        this.f32266b = 0;
        this.f32268d = obj;
    }

    final void a() {
        switch (this.f32267c) {
            case 0:
                ((K0) this.f32265a).q(this.f32266b, this.f32268d);
                return;
            default:
                this.f32265a.h((Object[]) this.f32268d, this.f32266b);
                return;
        }
    }

    final A1 b(int i8, int i9) {
        switch (this.f32267c) {
            case 0:
                return new A1(this, ((K0) this.f32265a).b(i8), i9);
            default:
                return new A1(this, this.f32265a.b(i8), i9);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        A1 a12 = this;
        while (a12.f32265a.p() != 0) {
            a12.setPendingCount(a12.f32265a.p() - 1);
            int i8 = 0;
            int i9 = 0;
            while (i8 < a12.f32265a.p() - 1) {
                A1 b8 = a12.b(i8, a12.f32266b + i9);
                i9 = (int) (i9 + b8.f32265a.count());
                b8.fork();
                i8++;
            }
            a12 = a12.b(i8, a12.f32266b + i9);
        }
        a12.a();
        a12.propagateCompletion();
    }
}
