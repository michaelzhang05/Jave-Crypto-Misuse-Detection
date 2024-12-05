package j7;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3207a {

    /* renamed from: j7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0776a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34072a;

        C0776a(String str) {
            this.f34072a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f34072a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return (Class) AccessController.doPrivileged(new C0776a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
