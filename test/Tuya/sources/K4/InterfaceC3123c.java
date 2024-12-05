package k4;

import M5.AbstractC1246t;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import g6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import m4.I;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3123c {

    /* renamed from: k4.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static boolean a(InterfaceC3123c interfaceC3123c, String str, I isPlacesAvailable) {
            boolean z8;
            boolean z9;
            String c8;
            String str2;
            AbstractC3159y.i(isPlacesAvailable, "isPlacesAvailable");
            Set f8 = interfaceC3123c.f();
            if (f8 != null) {
                Set set = f8;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringKt.toLowerCase((String) it.next(), Locale.Companion.getCurrent()));
                }
                if (str != null) {
                    str2 = StringKt.toLowerCase(str, Locale.Companion.getCurrent());
                } else {
                    str2 = null;
                }
                if (AbstractC1246t.d0(arrayList, str2)) {
                    z8 = true;
                    if (!isPlacesAvailable.invoke() && (c8 = interfaceC3123c.c()) != null && !n.u(c8)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z8 && z9) {
                        return true;
                    }
                }
            }
            z8 = false;
            if (!isPlacesAvailable.invoke()) {
            }
            z9 = false;
            return !z8 ? false : false;
        }
    }

    boolean b(String str, I i8);

    String c();

    Function0 e();

    Set f();
}
