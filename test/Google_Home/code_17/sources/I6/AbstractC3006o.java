package i6;

import P5.AbstractC1378t;
import b6.InterfaceC1985a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3006o extends AbstractC3005n {

    /* renamed from: i6.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2998g f33011a;

        public a(InterfaceC2998g interfaceC2998g) {
            this.f33011a = interfaceC2998g;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f33011a.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i6.o$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33012a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    public static Comparable A(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        Iterator it = interfaceC2998g.iterator();
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

    public static InterfaceC2998g B(InterfaceC2998g interfaceC2998g, int i8) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return AbstractC3001j.e();
            }
            if (interfaceC2998g instanceof InterfaceC2993b) {
                return ((InterfaceC2993b) interfaceC2998g).a(i8);
            }
            return new C3007p(interfaceC2998g, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static InterfaceC2998g C(InterfaceC2998g interfaceC2998g, Function1 predicate) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        AbstractC3255y.i(predicate, "predicate");
        return new C3008q(interfaceC2998g, predicate);
    }

    public static List D(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        Iterator it = interfaceC2998g.iterator();
        if (!it.hasNext()) {
            return AbstractC1378t.m();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1378t.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static boolean l(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        return interfaceC2998g.iterator().hasNext();
    }

    public static Iterable m(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        return new a(interfaceC2998g);
    }

    public static boolean n(InterfaceC2998g interfaceC2998g, Object obj) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        if (t(interfaceC2998g, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static int o(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        Iterator it = interfaceC2998g.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                AbstractC1378t.v();
            }
        }
        return i8;
    }

    public static InterfaceC2998g p(InterfaceC2998g interfaceC2998g, Function1 predicate) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        AbstractC3255y.i(predicate, "predicate");
        return new C2995d(interfaceC2998g, false, predicate);
    }

    public static InterfaceC2998g q(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        InterfaceC2998g p8 = AbstractC3001j.p(interfaceC2998g, b.f33012a);
        AbstractC3255y.g(p8, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return p8;
    }

    public static Object r(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        Iterator it = interfaceC2998g.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object s(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        Iterator it = interfaceC2998g.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final int t(InterfaceC2998g interfaceC2998g, Object obj) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        int i8 = 0;
        for (Object obj2 : interfaceC2998g) {
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            if (AbstractC3255y.d(obj, obj2)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final Appendable u(InterfaceC2998g interfaceC2998g, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        AbstractC3255y.i(buffer, "buffer");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : interfaceC2998g) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            j6.n.a(buffer, obj, function1);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String v(InterfaceC2998g interfaceC2998g, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        AbstractC3255y.i(separator, "separator");
        AbstractC3255y.i(prefix, "prefix");
        AbstractC3255y.i(postfix, "postfix");
        AbstractC3255y.i(truncated, "truncated");
        String sb = ((StringBuilder) u(interfaceC2998g, new StringBuilder(), separator, prefix, postfix, i8, truncated, function1)).toString();
        AbstractC3255y.h(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String w(InterfaceC2998g interfaceC2998g, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
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
        return v(interfaceC2998g, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }

    public static Object x(InterfaceC2998g interfaceC2998g) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        Iterator it = interfaceC2998g.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static InterfaceC2998g y(InterfaceC2998g interfaceC2998g, Function1 transform) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        AbstractC3255y.i(transform, "transform");
        return new C3009r(interfaceC2998g, transform);
    }

    public static InterfaceC2998g z(InterfaceC2998g interfaceC2998g, Function1 transform) {
        AbstractC3255y.i(interfaceC2998g, "<this>");
        AbstractC3255y.i(transform, "transform");
        return AbstractC3001j.q(new C3009r(interfaceC2998g, transform));
    }
}
