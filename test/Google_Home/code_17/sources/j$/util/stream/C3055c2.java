package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3055c2 extends AbstractC3062e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3163z0 f33690h;

    C3055c2(C3055c2 c3055c2, Spliterator spliterator) {
        super(c3055c2, spliterator);
        this.f33690h = c3055c2.f33690h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3055c2(AbstractC3163z0 abstractC3163z0, AbstractC3047b abstractC3047b, Spliterator spliterator) {
        super(abstractC3047b, spliterator);
        this.f33690h = abstractC3163z0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final Object a() {
        AbstractC3047b abstractC3047b = this.f33702a;
        V1 f02 = this.f33690h.f0();
        abstractC3047b.R(this.f33703b, f02);
        return f02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final AbstractC3062e e(Spliterator spliterator) {
        return new C3055c2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3062e abstractC3062e = this.f33705d;
        if (abstractC3062e != null) {
            V1 v12 = (V1) ((C3055c2) abstractC3062e).c();
            v12.f((V1) ((C3055c2) this.f33706e).c());
            f(v12);
        }
        super.onCompletion(countedCompleter);
    }
}
