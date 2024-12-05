package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3117p extends AbstractC3105m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33788b = 2;

    /* renamed from: c, reason: collision with root package name */
    boolean f33789c;

    /* renamed from: d, reason: collision with root package name */
    Object f33790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3117p(O3 o32, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33790d = o32;
        this.f33789c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3117p(C3070f2 c3070f2, InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33790d = c3070f2;
    }

    public /* synthetic */ C3117p(InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f33788b) {
            case 0:
                InterfaceC3125q2 interfaceC3125q2 = this.f33772a;
                if (obj != null) {
                    Object obj2 = this.f33790d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else {
                    if (this.f33789c) {
                        return;
                    }
                    this.f33789c = true;
                    obj = null;
                }
                this.f33790d = obj;
                interfaceC3125q2.accept((InterfaceC3125q2) obj);
                return;
            case 1:
                Stream stream = (Stream) ((C3070f2) this.f33790d).f33734n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z8 = this.f33789c;
                        InterfaceC3125q2 interfaceC3125q22 = this.f33772a;
                        if (z8) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC3125q22.m() && spliterator.tryAdvance(interfaceC3125q22)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC3125q22);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f33789c) {
                    boolean test = ((O3) this.f33790d).f33571m.test(obj);
                    this.f33789c = test;
                    if (test) {
                        this.f33772a.accept((InterfaceC3125q2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public void j() {
        switch (this.f33788b) {
            case 0:
                this.f33789c = false;
                this.f33790d = null;
                this.f33772a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        switch (this.f33788b) {
            case 0:
                this.f33789c = false;
                this.f33790d = null;
                this.f33772a.k(-1L);
                return;
            case 1:
                this.f33772a.k(-1L);
                return;
            default:
                this.f33772a.k(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public boolean m() {
        switch (this.f33788b) {
            case 1:
                this.f33789c = true;
                return this.f33772a.m();
            case 2:
                return !this.f33789c || this.f33772a.m();
            default:
                return super.m();
        }
    }
}
