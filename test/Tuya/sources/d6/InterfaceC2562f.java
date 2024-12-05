package d6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2562f {

    /* renamed from: d6.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static boolean a(InterfaceC2562f interfaceC2562f, Comparable value) {
            AbstractC3159y.i(value, "value");
            if (value.compareTo(interfaceC2562f.getStart()) >= 0 && value.compareTo(interfaceC2562f.getEndInclusive()) <= 0) {
                return true;
            }
            return false;
        }

        public static boolean b(InterfaceC2562f interfaceC2562f) {
            if (interfaceC2562f.getStart().compareTo(interfaceC2562f.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    Comparable getEndInclusive();

    Comparable getStart();

    boolean isEmpty();
}
