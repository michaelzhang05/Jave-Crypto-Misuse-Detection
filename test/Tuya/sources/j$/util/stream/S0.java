package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class S0 extends AbstractC2912e {

    /* renamed from: h, reason: collision with root package name */
    protected final AbstractC2897b f32412h;

    /* renamed from: i, reason: collision with root package name */
    protected final LongFunction f32413i;

    /* renamed from: j, reason: collision with root package name */
    protected final BinaryOperator f32414j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(S0 s02, Spliterator spliterator) {
        super(s02, spliterator);
        this.f32412h = s02.f32412h;
        this.f32413i = s02.f32413i;
        this.f32414j = s02.f32414j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(AbstractC2897b abstractC2897b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC2897b, spliterator);
        this.f32412h = abstractC2897b;
        this.f32413i = longFunction;
        this.f32414j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public AbstractC2912e e(Spliterator spliterator) {
        return new S0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final L0 a() {
        D0 d02 = (D0) this.f32413i.apply(this.f32412h.C(this.f32509b));
        this.f32412h.R(this.f32509b, d02);
        return d02.a();
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC2912e abstractC2912e = this.f32511d;
        if (abstractC2912e != null) {
            f((L0) this.f32414j.apply((L0) ((S0) abstractC2912e).c(), (L0) ((S0) this.f32512e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
