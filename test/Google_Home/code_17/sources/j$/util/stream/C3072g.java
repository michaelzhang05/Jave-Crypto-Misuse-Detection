package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3072g implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3077h f33736a;

    private /* synthetic */ C3072g(InterfaceC3077h interfaceC3077h) {
        this.f33736a = interfaceC3077h;
    }

    public static /* synthetic */ BaseStream w(InterfaceC3077h interfaceC3077h) {
        if (interfaceC3077h == null) {
            return null;
        }
        return interfaceC3077h instanceof C3067f ? ((C3067f) interfaceC3077h).f33731a : interfaceC3077h instanceof G ? F.w((G) interfaceC3077h) : interfaceC3077h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC3077h) : interfaceC3077h instanceof InterfaceC3118p0 ? C3113o0.w((InterfaceC3118p0) interfaceC3077h) : interfaceC3077h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC3077h) : new C3072g(interfaceC3077h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33736a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC3077h interfaceC3077h = this.f33736a;
        if (obj instanceof C3072g) {
            obj = ((C3072g) obj).f33736a;
        }
        return interfaceC3077h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33736a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f33736a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f33736a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return w(this.f33736a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return w(this.f33736a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return w(this.f33736a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f33736a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return w(this.f33736a.unordered());
    }
}
