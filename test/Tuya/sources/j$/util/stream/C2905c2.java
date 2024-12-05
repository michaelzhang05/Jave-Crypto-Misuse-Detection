package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2905c2 extends AbstractC2912e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3013z0 f32496h;

    C2905c2(C2905c2 c2905c2, Spliterator spliterator) {
        super(c2905c2, spliterator);
        this.f32496h = c2905c2.f32496h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2905c2(AbstractC3013z0 abstractC3013z0, AbstractC2897b abstractC2897b, Spliterator spliterator) {
        super(abstractC2897b, spliterator);
        this.f32496h = abstractC3013z0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        AbstractC2897b abstractC2897b = this.f32508a;
        V1 f02 = this.f32496h.f0();
        abstractC2897b.R(this.f32509b, f02);
        return f02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new C2905c2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC2912e abstractC2912e = this.f32511d;
        if (abstractC2912e != null) {
            V1 v12 = (V1) ((C2905c2) abstractC2912e).c();
            v12.f((V1) ((C2905c2) this.f32512e).c());
            f(v12);
        }
        super.onCompletion(countedCompleter);
    }
}
