package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2995u3 extends x3 implements j$.util.W {
    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.stream.z3, j$.util.Spliterator] */
    @Override // j$.util.stream.z3
    protected final Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        return new z3((j$.util.W) spliterator, j8, j9, j10, j11);
    }

    @Override // j$.util.stream.x3
    protected final Object b() {
        return new E0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2877d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2877d.f(this, consumer);
    }
}