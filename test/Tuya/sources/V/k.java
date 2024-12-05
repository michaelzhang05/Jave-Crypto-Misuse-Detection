package v;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final a f38600a;

    /* renamed from: b, reason: collision with root package name */
    private final i f38601b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f38602c;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38603a;

        /* renamed from: b, reason: collision with root package name */
        private Map f38604b = null;

        a(Context context) {
            this.f38603a = context;
        }

        private Map a(Context context) {
            Bundle d8 = d(context);
            if (d8 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d8.keySet()) {
                Object obj = d8.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map c() {
            if (this.f38604b == null) {
                this.f38604b = a(this.f38603a);
            }
            return this.f38604b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e8) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e8);
                return null;
            } catch (IllegalAccessException e9) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e9);
                return null;
            } catch (InstantiationException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e12);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // v.e
    public synchronized m get(String str) {
        if (this.f38602c.containsKey(str)) {
            return (m) this.f38602c.get(str);
        }
        d b8 = this.f38600a.b(str);
        if (b8 == null) {
            return null;
        }
        m create = b8.create(this.f38601b.a(str));
        this.f38602c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f38602c = new HashMap();
        this.f38600a = aVar;
        this.f38601b = iVar;
    }
}
