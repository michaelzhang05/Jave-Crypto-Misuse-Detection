package g6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: g6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2886f {

    /* renamed from: g6.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static boolean a(InterfaceC2886f interfaceC2886f, Comparable value) {
            AbstractC3255y.i(value, "value");
            if (value.compareTo(interfaceC2886f.getStart()) >= 0 && value.compareTo(interfaceC2886f.getEndInclusive()) <= 0) {
                return true;
            }
            return false;
        }

        public static boolean b(InterfaceC2886f interfaceC2886f) {
            if (interfaceC2886f.getStart().compareTo(interfaceC2886f.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    Comparable getEndInclusive();

    Comparable getStart();

    boolean isEmpty();
}
