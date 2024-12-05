package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final l.g f2942a = new l.g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        l.g gVar = f2942a;
        l.g gVar2 = (l.g) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new l.g();
            gVar.put(classLoader, gVar2);
        }
        Class cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e6) {
            throw new Fragment.k("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e6);
        } catch (ClassNotFoundException e7) {
            throw new Fragment.k("Unable to instantiate fragment " + str + ": make sure class name exists", e7);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
