package z;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4009b {
    public static Object a(int i8, Object obj, InterfaceC4008a interfaceC4008a, InterfaceC4010c interfaceC4010c) {
        Object apply;
        if (i8 < 1) {
            return interfaceC4008a.apply(obj);
        }
        do {
            apply = interfaceC4008a.apply(obj);
            obj = interfaceC4010c.a(obj, apply);
            if (obj == null) {
                break;
            }
            i8--;
        } while (i8 >= 1);
        return apply;
    }
}
