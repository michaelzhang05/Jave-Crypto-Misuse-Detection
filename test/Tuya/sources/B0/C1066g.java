package B0;

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

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1066g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f624a;

    /* renamed from: b, reason: collision with root package name */
    private final c f625b;

    /* renamed from: B0.g$b */
    /* loaded from: classes3.dex */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f626a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f626a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f626a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // B0.C1066g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle b8 = b(context);
            if (b8 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b8.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b8.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f626a = cls;
        }
    }

    /* renamed from: B0.g$c */
    /* loaded from: classes3.dex */
    interface c {
        List a(Object obj);
    }

    C1066g(Object obj, c cVar) {
        this.f624a = obj;
        this.f625b = cVar;
    }

    public static C1066g c(Context context, Class cls) {
        return new C1066g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e8) {
            throw new w(String.format("Could not instantiate %s.", str), e8);
        } catch (InstantiationException e9) {
            throw new w(String.format("Could not instantiate %s.", str), e9);
        } catch (NoSuchMethodException e10) {
            throw new w(String.format("Could not instantiate %s", str), e10);
        } catch (InvocationTargetException e11) {
            throw new w(String.format("Could not instantiate %s", str), e11);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f625b.a(this.f624a)) {
            arrayList.add(new Z0.b() { // from class: B0.f
                @Override // Z0.b
                public final Object get() {
                    ComponentRegistrar d8;
                    d8 = C1066g.d(str);
                    return d8;
                }
            });
        }
        return arrayList;
    }
}
