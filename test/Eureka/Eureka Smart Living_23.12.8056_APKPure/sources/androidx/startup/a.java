package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.c;
import l0.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f3674d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f3675e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f3678c;

    /* renamed from: b, reason: collision with root package name */
    final Set f3677b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f3676a = new HashMap();

    a(Context context) {
        this.f3678c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (b.d()) {
            try {
                b.a(cls.getSimpleName());
            } finally {
                b.b();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f3676a.containsKey(cls)) {
            obj = this.f3676a.get(cls);
        } else {
            set.add(cls);
            try {
                k0.a aVar = (k0.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a6 = aVar.a();
                if (!a6.isEmpty()) {
                    for (Class cls2 : a6) {
                        if (!this.f3676a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = aVar.b(this.f3678c);
                set.remove(cls);
                this.f3676a.put(cls, obj);
            } catch (Throwable th) {
                throw new c(th);
            }
        }
        return obj;
    }

    public static a e(Context context) {
        if (f3674d == null) {
            synchronized (f3675e) {
                if (f3674d == null) {
                    f3674d = new a(context);
                }
            }
        }
        return f3674d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                b.a("Startup");
                b(this.f3678c.getPackageManager().getProviderInfo(new ComponentName(this.f3678c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e6) {
                throw new c(e6);
            }
        } finally {
            b.b();
        }
    }

    void b(Bundle bundle) {
        String string = this.f3678c.getString(k0.b.f7095a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (k0.a.class.isAssignableFrom(cls)) {
                            this.f3677b.add(cls);
                        }
                    }
                }
                Iterator it = this.f3677b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e6) {
                throw new c(e6);
            }
        }
    }

    Object c(Class cls) {
        Object obj;
        synchronized (f3675e) {
            obj = this.f3676a.get(cls);
            if (obj == null) {
                obj = d(cls, new HashSet());
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f3677b.contains(cls);
    }
}
