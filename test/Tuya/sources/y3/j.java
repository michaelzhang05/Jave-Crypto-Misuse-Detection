package y3;

import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;
import y3.i;

/* loaded from: classes4.dex */
public abstract class j {
    public static final i a(AbstractC3991f abstractC3991f) {
        AbstractC3159y.i(abstractC3991f, "<this>");
        if (abstractC3991f instanceof AbstractC3991f.c) {
            return i.a.f39832a;
        }
        if (abstractC3991f instanceof AbstractC3991f.d) {
            return i.b.f39833a;
        }
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            String str = ((AbstractC3991f.C0916f) abstractC3991f).v().f24408a;
            if (str == null) {
                str = "";
            }
            return new i.d(str);
        }
        return null;
    }
}
