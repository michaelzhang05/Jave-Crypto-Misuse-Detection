package u3;

import o3.t;

/* loaded from: classes.dex */
public abstract class q {
    public static int a() {
        Integer a6 = t.a();
        if (a6 != null) {
            return a6.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
