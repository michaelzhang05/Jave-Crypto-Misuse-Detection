package f6;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2688o extends AbstractC2687n {

    /* renamed from: f6.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterable, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2680g f31148a;

        public a(InterfaceC2680g interfaceC2680g) {
            this.f31148a = interfaceC2680g;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f31148a.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f6.o$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31149a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    public static Comparable A(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        Iterator it = interfaceC2680g.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static InterfaceC2680g B(InterfaceC2680g interfaceC2680g, int i8) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return AbstractC2683j.e();
            }
            if (interfaceC2680g instanceof InterfaceC2675b) {
                return ((InterfaceC2675b) interfaceC2680g).a(i8);
            }
            return new C2689p(interfaceC2680g, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static InterfaceC2680g C(InterfaceC2680g interfaceC2680g, Function1 predicate) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        AbstractC3159y.i(predicate, "predicate");
        return new C2690q(interfaceC2680g, predicate);
    }

    public static List D(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        Iterator it = interfaceC2680g.iterator();
        if (!it.hasNext()) {
            return AbstractC1246t.m();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1246t.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static boolean l(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        return interfaceC2680g.iterator().hasNext();
    }

    public static Iterable m(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        return new a(interfaceC2680g);
    }

    public static boolean n(InterfaceC2680g interfaceC2680g, Object obj) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        if (t(interfaceC2680g, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static int o(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        Iterator it = interfaceC2680g.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                AbstractC1246t.v();
            }
        }
        return i8;
    }

    public static InterfaceC2680g p(InterfaceC2680g interfaceC2680g, Function1 predicate) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        AbstractC3159y.i(predicate, "predicate");
        return new C2677d(interfaceC2680g, false, predicate);
    }

    public static InterfaceC2680g q(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        InterfaceC2680g p8 = AbstractC2683j.p(interfaceC2680g, b.f31149a);
        AbstractC3159y.g(p8, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return p8;
    }

    public static Object r(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        Iterator it = interfaceC2680g.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object s(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        Iterator it = interfaceC2680g.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final int t(InterfaceC2680g interfaceC2680g, Object obj) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        int i8 = 0;
        for (Object obj2 : interfaceC2680g) {
            if (i8 < 0) {
                AbstractC1246t.w();
            }
            if (AbstractC3159y.d(obj, obj2)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final Appendable u(InterfaceC2680g interfaceC2680g, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        AbstractC3159y.i(buffer, "buffer");
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        AbstractC3159y.i(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : interfaceC2680g) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            g6.n.a(buffer, obj, function1);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String v(InterfaceC2680g interfaceC2680g, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        AbstractC3159y.i(separator, "separator");
        AbstractC3159y.i(prefix, "prefix");
        AbstractC3159y.i(postfix, "postfix");
        AbstractC3159y.i(truncated, "truncated");
        String sb = ((StringBuilder) u(interfaceC2680g, new StringBuilder(), separator, prefix, postfix, i8, truncated, function1)).toString();
        AbstractC3159y.h(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String w(InterfaceC2680g interfaceC2680g, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        int i10;
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i9 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i9 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i9 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            function1 = null;
        }
        return v(interfaceC2680g, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }

    public static Object x(InterfaceC2680g interfaceC2680g) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        Iterator it = interfaceC2680g.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static InterfaceC2680g y(InterfaceC2680g interfaceC2680g, Function1 transform) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        AbstractC3159y.i(transform, "transform");
        return new C2691r(interfaceC2680g, transform);
    }

    public static InterfaceC2680g z(InterfaceC2680g interfaceC2680g, Function1 transform) {
        AbstractC3159y.i(interfaceC2680g, "<this>");
        AbstractC3159y.i(transform, "transform");
        return AbstractC2683j.q(new C2691r(interfaceC2680g, transform));
    }
}
