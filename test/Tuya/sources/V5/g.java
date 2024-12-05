package V5;

import g6.n;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class g extends f {
    public static String a(File file) {
        AbstractC3159y.i(file, "<this>");
        String name = file.getName();
        AbstractC3159y.h(name, "getName(...)");
        return n.F0(name, '.', "");
    }
}
