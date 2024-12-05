package g7;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2730a {

    /* renamed from: g7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0751a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31345a;

        C0751a(String str) {
            this.f31345a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f31345a);
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
            return (Class) AccessController.doPrivileged(new C0751a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
