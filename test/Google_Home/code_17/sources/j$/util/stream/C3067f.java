package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3067f implements InterfaceC3077h {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f33731a;

    private /* synthetic */ C3067f(BaseStream baseStream) {
        this.f33731a = baseStream;
    }

    public static /* synthetic */ InterfaceC3077h w(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C3072g ? ((C3072g) baseStream).f33736a : baseStream instanceof DoubleStream ? E.w((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C3108n0.w((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C3051b3.w((java.util.stream.Stream) baseStream) : new C3067f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33731a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f33731a;
        if (obj instanceof C3067f) {
            obj = ((C3067f) obj).f33731a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33731a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ boolean isParallel() {
        return this.f33731a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33731a.iterator();
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h onClose(Runnable runnable) {
        return w(this.f33731a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h parallel() {
        return w(this.f33731a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3077h sequential() {
        return w(this.f33731a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33731a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final /* synthetic */ InterfaceC3077h unordered() {
        return w(this.f33731a.unordered());
    }
}
