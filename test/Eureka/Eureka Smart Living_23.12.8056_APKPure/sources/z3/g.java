package z3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10005a;

    /* renamed from: b, reason: collision with root package name */
    private final c f10006b;

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f10007a;

        private b(Class cls) {
            this.f10007a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f10007a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f10007a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // z3.g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle b6 = b(context);
            if (b6 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b6.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b6.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    interface c {
        List a(Object obj);
    }

    g(Object obj, c cVar) {
        this.f10005a = obj;
        this.f10006b = cVar;
    }

    public static g c(Context context, Class cls) {
        return new g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e6) {
            throw new w(String.format("Could not instantiate %s.", str), e6);
        } catch (InstantiationException e7) {
            throw new w(String.format("Could not instantiate %s.", str), e7);
        } catch (NoSuchMethodException e8) {
            throw new w(String.format("Could not instantiate %s", str), e8);
        } catch (InvocationTargetException e9) {
            throw new w(String.format("Could not instantiate %s", str), e9);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f10006b.a(this.f10005a)) {
            arrayList.add(new k4.b() { // from class: z3.f
                @Override // k4.b
                public final Object get() {
                    ComponentRegistrar d6;
                    d6 = g.d(str);
                    return d6;
                }
            });
        }
        return arrayList;
    }
}
