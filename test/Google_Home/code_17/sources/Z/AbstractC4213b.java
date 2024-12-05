package z;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4213b {
    public static Object a(int i8, Object obj, InterfaceC4212a interfaceC4212a, InterfaceC4214c interfaceC4214c) {
        Object apply;
        if (i8 < 1) {
            return interfaceC4212a.apply(obj);
        }
        do {
            apply = interfaceC4212a.apply(obj);
            obj = interfaceC4214c.a(obj, apply);
            if (obj == null) {
                break;
            }
            i8--;
        } while (i8 >= 1);
        return apply;
    }
}
