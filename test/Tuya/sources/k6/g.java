package k6;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class g {
    public static final d a(int i8, EnumC3132a enumC3132a, Function1 function1) {
        d pVar;
        if (i8 != -2) {
            if (i8 != -1) {
                if (i8 != 0) {
                    if (i8 != Integer.MAX_VALUE) {
                        if (enumC3132a == EnumC3132a.SUSPEND) {
                            return new b(i8, function1);
                        }
                        return new p(i8, enumC3132a, function1);
                    }
                    return new b(Integer.MAX_VALUE, function1);
                }
                if (enumC3132a == EnumC3132a.SUSPEND) {
                    pVar = new b(0, function1);
                } else {
                    pVar = new p(1, enumC3132a, function1);
                }
            } else {
                if (enumC3132a == EnumC3132a.SUSPEND) {
                    return new p(1, EnumC3132a.DROP_OLDEST, function1);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (enumC3132a == EnumC3132a.SUSPEND) {
            pVar = new b(d.f33610o0.a(), function1);
        } else {
            pVar = new p(1, enumC3132a, function1);
        }
        return pVar;
    }

    public static /* synthetic */ d b(int i8, EnumC3132a enumC3132a, Function1 function1, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        if ((i9 & 2) != 0) {
            enumC3132a = EnumC3132a.SUSPEND;
        }
        if ((i9 & 4) != 0) {
            function1 = null;
        }
        return a(i8, enumC3132a, function1);
    }
}
