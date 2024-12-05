package n4;

import P5.AbstractC1378t;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import p4.I;

/* renamed from: n4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3478c {

    /* renamed from: n4.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static boolean a(InterfaceC3478c interfaceC3478c, String str, I isPlacesAvailable) {
            boolean z8;
            boolean z9;
            String b8;
            String str2;
            AbstractC3255y.i(isPlacesAvailable, "isPlacesAvailable");
            Set h8 = interfaceC3478c.h();
            if (h8 != null) {
                Set set = h8;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringKt.toLowerCase((String) it.next(), Locale.Companion.getCurrent()));
                }
                if (str != null) {
                    str2 = StringKt.toLowerCase(str, Locale.Companion.getCurrent());
                } else {
                    str2 = null;
                }
                if (AbstractC1378t.d0(arrayList, str2)) {
                    z8 = true;
                    if (!isPlacesAvailable.invoke() && (b8 = interfaceC3478c.b()) != null && !n.u(b8)) {
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

    boolean a(String str, I i8);

    String b();

    Function0 g();

    Set h();
}
