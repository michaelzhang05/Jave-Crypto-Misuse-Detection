package P5;

import i6.AbstractC3001j;
import i6.InterfaceC2998g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class A extends AbstractC1384z {
    public static boolean C(Collection collection, InterfaceC2998g elements) {
        AbstractC3255y.i(collection, "<this>");
        AbstractC3255y.i(elements, "elements");
        Iterator it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean D(Collection collection, Iterable elements) {
        AbstractC3255y.i(collection, "<this>");
        AbstractC3255y.i(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean E(Collection collection, Object[] elements) {
        AbstractC3255y.i(collection, "<this>");
        AbstractC3255y.i(elements, "elements");
        return collection.addAll(AbstractC1371l.c(elements));
    }

    public static final Collection F(Iterable iterable) {
        AbstractC3255y.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC1378t.W0(iterable);
        }
        return (Collection) iterable;
    }

    private static final boolean G(Iterable iterable, Function1 function1, boolean z8) {
        Iterator it = iterable.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z8) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    private static final boolean H(List list, Function1 function1, boolean z8) {
        if (!(list instanceof RandomAccess)) {
            AbstractC3255y.g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return G(kotlin.jvm.internal.Z.b(list), function1, z8);
        }
        N it = new g6.i(0, AbstractC1378t.o(list)).iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            Object obj = list.get(nextInt);
            if (((Boolean) function1.invoke(obj)).booleanValue() != z8) {
                if (i8 != nextInt) {
                    list.set(i8, obj);
                }
                i8++;
            }
        }
        if (i8 >= list.size()) {
            return false;
        }
        int o8 = AbstractC1378t.o(list);
        if (i8 > o8) {
            return true;
        }
        while (true) {
            list.remove(o8);
            if (o8 != i8) {
                o8--;
            } else {
                return true;
            }
        }
    }

    public static boolean I(Iterable iterable, Function1 predicate) {
        AbstractC3255y.i(iterable, "<this>");
        AbstractC3255y.i(predicate, "predicate");
        return G(iterable, predicate, true);
    }

    public static boolean J(Collection collection, InterfaceC2998g elements) {
        AbstractC3255y.i(collection, "<this>");
        AbstractC3255y.i(elements, "elements");
        List D8 = AbstractC3001j.D(elements);
        if ((!D8.isEmpty()) && collection.removeAll(D8)) {
            return true;
        }
        return false;
    }

    public static boolean K(Collection collection, Iterable elements) {
        AbstractC3255y.i(collection, "<this>");
        AbstractC3255y.i(elements, "elements");
        return collection.removeAll(F(elements));
    }

    public static boolean L(Collection collection, Object[] elements) {
        boolean z8;
        AbstractC3255y.i(collection, "<this>");
        AbstractC3255y.i(elements, "elements");
        if (elements.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!(!z8) || !collection.removeAll(AbstractC1371l.c(elements))) {
            return false;
        }
        return true;
    }

    public static boolean M(List list, Function1 predicate) {
        AbstractC3255y.i(list, "<this>");
        AbstractC3255y.i(predicate, "predicate");
        return H(list, predicate, true);
    }

    public static Object N(List list) {
        AbstractC3255y.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object O(List list) {
        AbstractC3255y.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object P(List list) {
        AbstractC3255y.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(AbstractC1378t.o(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object Q(List list) {
        AbstractC3255y.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC1378t.o(list));
    }

    public static boolean R(Iterable iterable, Function1 predicate) {
        AbstractC3255y.i(iterable, "<this>");
        AbstractC3255y.i(predicate, "predicate");
        return G(iterable, predicate, false);
    }

    public static boolean S(Collection collection, Iterable elements) {
        AbstractC3255y.i(collection, "<this>");
        AbstractC3255y.i(elements, "elements");
        return collection.retainAll(F(elements));
    }
}
