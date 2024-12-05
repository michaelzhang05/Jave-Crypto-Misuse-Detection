package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2922g implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2927h f32542a;

    private /* synthetic */ C2922g(InterfaceC2927h interfaceC2927h) {
        this.f32542a = interfaceC2927h;
    }

    public static /* synthetic */ BaseStream w(InterfaceC2927h interfaceC2927h) {
        if (interfaceC2927h == null) {
            return null;
        }
        return interfaceC2927h instanceof C2917f ? ((C2917f) interfaceC2927h).f32537a : interfaceC2927h instanceof G ? F.w((G) interfaceC2927h) : interfaceC2927h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC2927h) : interfaceC2927h instanceof InterfaceC2968p0 ? C2963o0.w((InterfaceC2968p0) interfaceC2927h) : interfaceC2927h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC2927h) : new C2922g(interfaceC2927h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f32542a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC2927h interfaceC2927h = this.f32542a;
        if (obj instanceof C2922g) {
            obj = ((C2922g) obj).f32542a;
        }
        return interfaceC2927h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32542a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f32542a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f32542a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return w(this.f32542a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return w(this.f32542a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return w(this.f32542a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f32542a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return w(this.f32542a.unordered());
    }
}
