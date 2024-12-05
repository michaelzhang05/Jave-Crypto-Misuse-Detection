package x0;

/* renamed from: x0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4158B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(InterfaceC4157A interfaceC4157A, Object obj) {
        if (obj == interfaceC4157A) {
            return true;
        }
        if (obj instanceof InterfaceC4157A) {
            return interfaceC4157A.a().equals(((InterfaceC4157A) obj).a());
        }
        return false;
    }
}
