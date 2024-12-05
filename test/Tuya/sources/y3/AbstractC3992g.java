package y3;

import L5.p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* renamed from: y3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3992g {
    public static final boolean a(AbstractC3991f abstractC3991f) {
        AbstractC3159y.i(abstractC3991f, "<this>");
        if (abstractC3991f instanceof AbstractC3991f.c) {
            return false;
        }
        if (!(abstractC3991f instanceof AbstractC3991f.d) && !(abstractC3991f instanceof AbstractC3991f.e.c)) {
            if (abstractC3991f instanceof AbstractC3991f.e) {
                return false;
            }
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                if (((AbstractC3991f.C0916f) abstractC3991f).k() != AbstractC3991f.C0916f.b.f39822c) {
                    return false;
                }
            } else {
                if (abstractC3991f instanceof AbstractC3991f.b) {
                    return false;
                }
                throw new p();
            }
        }
        return true;
    }

    public static final boolean b(AbstractC3991f abstractC3991f) {
        AbstractC3159y.i(abstractC3991f, "<this>");
        return abstractC3991f instanceof AbstractC3991f.C0916f;
    }
}
