package x6;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3957q extends AbstractC3956p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3957q(t6.b element) {
        super(element, null);
        AbstractC3159y.i(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator i(Collection collection) {
        AbstractC3159y.i(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int j(Collection collection) {
        AbstractC3159y.i(collection, "<this>");
        return collection.size();
    }
}
