package kotlin.reflect.x.internal.l0.i.r;

import java.util.Arrays;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class e extends o<Character> {
    public e(char c2) {
        super(Character.valueOf(c2));
    }

    private final String c(char c2) {
        return c2 == '\b' ? "\\b" : c2 == '\t' ? "\\t" : c2 == '\n' ? "\\n" : c2 == '\f' ? "\\f" : c2 == '\r' ? "\\r" : e(c2) ? String.valueOf(c2) : "?";
    }

    private final boolean e(char c2) {
        byte type = (byte) Character.getType(c2);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public m0 a(g0 g0Var) {
        l.f(g0Var, "module");
        m0 u = g0Var.o().u();
        l.e(u, "module.builtIns.charType");
        return u;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        l.e(format, "format(this, *args)");
        return format;
    }
}
