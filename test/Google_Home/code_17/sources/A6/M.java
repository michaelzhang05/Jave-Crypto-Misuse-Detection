package A6;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class M extends AbstractC0998q {

    /* renamed from: b, reason: collision with root package name */
    private final y6.f f516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(w6.b eSerializer) {
        super(eSerializer);
        AbstractC3255y.i(eSerializer, "eSerializer");
        this.f516b = new L(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Set q(LinkedHashSet linkedHashSet) {
        AbstractC3255y.i(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // A6.AbstractC0997p, w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return this.f516b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet f() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashSet linkedHashSet) {
        AbstractC3255y.i(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashSet linkedHashSet, int i8) {
        AbstractC3255y.i(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(LinkedHashSet linkedHashSet, int i8, Object obj) {
        AbstractC3255y.i(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet p(Set set) {
        LinkedHashSet linkedHashSet;
        AbstractC3255y.i(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet(set);
        }
        return linkedHashSet;
    }
}
