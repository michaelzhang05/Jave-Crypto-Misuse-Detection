package x6;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class M extends AbstractC3957q {

    /* renamed from: b, reason: collision with root package name */
    private final v6.f f39521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(t6.b eSerializer) {
        super(eSerializer);
        AbstractC3159y.i(eSerializer, "eSerializer");
        this.f39521b = new L(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Set q(LinkedHashSet linkedHashSet) {
        AbstractC3159y.i(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // x6.AbstractC3956p, t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return this.f39521b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet f() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashSet linkedHashSet) {
        AbstractC3159y.i(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashSet linkedHashSet, int i8) {
        AbstractC3159y.i(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(LinkedHashSet linkedHashSet, int i8, Object obj) {
        AbstractC3159y.i(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet p(Set set) {
        LinkedHashSet linkedHashSet;
        AbstractC3159y.i(set, "<this>");
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
