package P5;

import b6.InterfaceC1985a;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class L implements Iterable, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f8840a;

    public L(Function0 iteratorFactory) {
        AbstractC3255y.i(iteratorFactory, "iteratorFactory");
        this.f8840a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new M((Iterator) this.f8840a.invoke());
    }
}
