package M5;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class b0 {
    public static Set a(Set builder) {
        AbstractC3159y.i(builder, "builder");
        return ((N5.h) builder).a();
    }

    public static Set b() {
        return new N5.h();
    }

    public static Set c(int i8) {
        return new N5.h(i8);
    }

    public static Set d(Object obj) {
        Set singleton = Collections.singleton(obj);
        AbstractC3159y.h(singleton, "singleton(...)");
        return singleton;
    }

    public static TreeSet e(Object... elements) {
        AbstractC3159y.i(elements, "elements");
        return (TreeSet) AbstractC1243p.T0(elements, new TreeSet());
    }
}
