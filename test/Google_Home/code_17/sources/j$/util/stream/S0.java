package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class S0 extends AbstractC3062e {

    /* renamed from: h, reason: collision with root package name */
    protected final AbstractC3047b f33606h;

    /* renamed from: i, reason: collision with root package name */
    protected final LongFunction f33607i;

    /* renamed from: j, reason: collision with root package name */
    protected final BinaryOperator f33608j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(S0 s02, Spliterator spliterator) {
        super(s02, spliterator);
        this.f33606h = s02.f33606h;
        this.f33607i = s02.f33607i;
        this.f33608j = s02.f33608j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(AbstractC3047b abstractC3047b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC3047b, spliterator);
        this.f33606h = abstractC3047b;
        this.f33607i = longFunction;
        this.f33608j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public AbstractC3062e e(Spliterator spliterator) {
        return new S0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final L0 a() {
        D0 d02 = (D0) this.f33607i.apply(this.f33606h.C(this.f33703b));
        this.f33606h.R(this.f33703b, d02);
        return d02.a();
    }

    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3062e abstractC3062e = this.f33705d;
        if (abstractC3062e != null) {
            f((L0) this.f33608j.apply((L0) ((S0) abstractC3062e).c(), (L0) ((S0) this.f33706e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
