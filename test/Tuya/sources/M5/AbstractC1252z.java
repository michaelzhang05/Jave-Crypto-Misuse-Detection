package M5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: M5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1252z extends AbstractC1251y {
    public static final void A(List list) {
        AbstractC3159y.i(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void B(List list, Comparator comparator) {
        AbstractC3159y.i(list, "<this>");
        AbstractC3159y.i(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
