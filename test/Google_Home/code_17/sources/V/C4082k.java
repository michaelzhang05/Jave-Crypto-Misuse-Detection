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

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4082k implements InterfaceC4076e {

    /* renamed from: a, reason: collision with root package name */
    private final a f40096a;

    /* renamed from: b, reason: collision with root package name */
    private final C4080i f40097b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f40098c;

    /* renamed from: v.k$a */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f40099a;

        /* renamed from: b, reason: collision with root package name */
        private Map f40100b = null;

        a(Context context) {
            this.f40099a = context;
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
            if (this.f40100b == null) {
                this.f40100b = a(this.f40099a);
            }
            return this.f40100b;
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

        InterfaceC4075d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC4075d) Class.forName(str2).asSubclass(InterfaceC4075d.class).getDeclaredConstructor(null).newInstance(null);
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
    public C4082k(Context context, C4080i c4080i) {
        this(new a(context), c4080i);
    }

    @Override // v.InterfaceC4076e
    public synchronized InterfaceC4084m get(String str) {
        if (this.f40098c.containsKey(str)) {
            return (InterfaceC4084m) this.f40098c.get(str);
        }
        InterfaceC4075d b8 = this.f40096a.b(str);
        if (b8 == null) {
            return null;
        }
        InterfaceC4084m create = b8.create(this.f40097b.a(str));
        this.f40098c.put(str, create);
        return create;
    }

    C4082k(a aVar, C4080i c4080i) {
        this.f40098c = new HashMap();
        this.f40096a = aVar;
        this.f40097b = c4080i;
    }
}
