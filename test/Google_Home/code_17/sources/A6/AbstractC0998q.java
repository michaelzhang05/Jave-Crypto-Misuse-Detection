package A6;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0998q extends AbstractC0997p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0998q(w6.b element) {
        super(element, null);
        AbstractC3255y.i(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator i(Collection collection) {
        AbstractC3255y.i(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int j(Collection collection) {
        AbstractC3255y.i(collection, "<this>");
        return collection.size();
    }
}
