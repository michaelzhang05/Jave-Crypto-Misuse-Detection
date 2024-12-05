package x0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import x0.AbstractC4181p;
import x0.AbstractC4182q;

/* renamed from: x0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4183s extends AbstractC4182q implements InterfaceC4157A {

    /* renamed from: c, reason: collision with root package name */
    private final transient r f40663c;

    /* renamed from: x0.s$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4182q.a {
        public C4183s a() {
            Collection entrySet = this.f40659a.entrySet();
            Comparator comparator = this.f40660b;
            if (comparator != null) {
                entrySet = AbstractC4163G.a(comparator).d().b(entrySet);
            }
            return C4183s.e(entrySet, this.f40661c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4183s(AbstractC4181p abstractC4181p, int i8, Comparator comparator) {
        super(abstractC4181p, i8);
        this.f40663c = d(comparator);
    }

    private static r d(Comparator comparator) {
        if (comparator == null) {
            return r.t();
        }
        return AbstractC4184t.F(comparator);
    }

    static C4183s e(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        AbstractC4181p.a aVar = new AbstractC4181p.a(collection.size());
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r g8 = g(comparator, (Collection) entry.getValue());
            if (!g8.isEmpty()) {
                aVar.e(key, g8);
                i8 += g8.size();
            }
        }
        return new C4183s(aVar.b(), i8, comparator);
    }

    public static C4183s f() {
        return C4177l.f40634d;
    }

    private static r g(Comparator comparator, Collection collection) {
        if (comparator == null) {
            return r.o(collection);
        }
        return AbstractC4184t.C(comparator, collection);
    }
}
