package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.h;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    private Random f159a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final Map f160b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f161c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f162d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    ArrayList f163e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    final transient Map f164f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Map f165g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Bundle f166h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f172b;

        a(String str, c.a aVar) {
            this.f171a = str;
            this.f172b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, h hVar) {
            Integer num = (Integer) ActivityResultRegistry.this.f161c.get(this.f171a);
            if (num != null) {
                ActivityResultRegistry.this.f163e.add(this.f171a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f172b, obj, hVar);
                    return;
                } catch (Exception e6) {
                    ActivityResultRegistry.this.f163e.remove(this.f171a);
                    throw e6;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f172b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f171a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f174a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f175b;

        b(String str, c.a aVar) {
            this.f174a = str;
            this.f175b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, h hVar) {
            Integer num = (Integer) ActivityResultRegistry.this.f161c.get(this.f174a);
            if (num != null) {
                ActivityResultRegistry.this.f163e.add(this.f174a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f175b, obj, hVar);
                    return;
                } catch (Exception e6) {
                    ActivityResultRegistry.this.f163e.remove(this.f174a);
                    throw e6;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f175b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f174a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b f177a;

        /* renamed from: b, reason: collision with root package name */
        final c.a f178b;

        c(androidx.activity.result.b bVar, c.a aVar) {
            this.f177a = bVar;
            this.f178b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.h f179a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f180b = new ArrayList();

        d(androidx.lifecycle.h hVar) {
            this.f179a = hVar;
        }

        void a(k kVar) {
            this.f179a.a(kVar);
            this.f180b.add(kVar);
        }

        void b() {
            Iterator it = this.f180b.iterator();
            while (it.hasNext()) {
                this.f179a.c((k) it.next());
            }
            this.f180b.clear();
        }
    }

    private void a(int i6, String str) {
        this.f160b.put(Integer.valueOf(i6), str);
        this.f161c.put(str, Integer.valueOf(i6));
    }

    private void d(String str, int i6, Intent intent, c cVar) {
        if (cVar == null || cVar.f177a == null || !this.f163e.contains(str)) {
            this.f165g.remove(str);
            this.f166h.putParcelable(str, new androidx.activity.result.a(i6, intent));
        } else {
            cVar.f177a.a(cVar.f178b.c(i6, intent));
            this.f163e.remove(str);
        }
    }

    private int e() {
        int nextInt = this.f159a.nextInt(2147418112);
        while (true) {
            int i6 = nextInt + 65536;
            if (!this.f160b.containsKey(Integer.valueOf(i6))) {
                return i6;
            }
            nextInt = this.f159a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (((Integer) this.f161c.get(str)) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i6, int i7, Intent intent) {
        String str = (String) this.f160b.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        d(str, i7, intent, (c) this.f164f.get(str));
        return true;
    }

    public final boolean c(int i6, Object obj) {
        androidx.activity.result.b bVar;
        String str = (String) this.f160b.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f164f.get(str);
        if (cVar == null || (bVar = cVar.f177a) == null) {
            this.f166h.remove(str);
            this.f165g.put(str, obj);
            return true;
        }
        if (!this.f163e.remove(str)) {
            return true;
        }
        bVar.a(obj);
        return true;
    }

    public abstract void f(int i6, c.a aVar, Object obj, h hVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f163e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f159a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f166h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
            String str = stringArrayList.get(i6);
            if (this.f161c.containsKey(str)) {
                Integer num = (Integer) this.f161c.remove(str);
                if (!this.f166h.containsKey(str)) {
                    this.f160b.remove(num);
                }
            }
            a(integerArrayList.get(i6).intValue(), stringArrayList.get(i6));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f161c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f161c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f163e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f166h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f159a);
    }

    public final androidx.activity.result.c i(final String str, m mVar, final c.a aVar, final androidx.activity.result.b bVar) {
        androidx.lifecycle.h r5 = mVar.r();
        if (r5.b().b(h.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + mVar + " is attempting to register while current state is " + r5.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = (d) this.f162d.get(str);
        if (dVar == null) {
            dVar = new d(r5);
        }
        dVar.a(new k() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.k
            public void d(m mVar2, h.a aVar2) {
                if (!h.a.ON_START.equals(aVar2)) {
                    if (h.a.ON_STOP.equals(aVar2)) {
                        ActivityResultRegistry.this.f164f.remove(str);
                        return;
                    } else {
                        if (h.a.ON_DESTROY.equals(aVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f164f.put(str, new c(bVar, aVar));
                if (ActivityResultRegistry.this.f165g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f165g.get(str);
                    ActivityResultRegistry.this.f165g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) ActivityResultRegistry.this.f166h.getParcelable(str);
                if (aVar3 != null) {
                    ActivityResultRegistry.this.f166h.remove(str);
                    bVar.a(aVar.c(aVar3.b(), aVar3.a()));
                }
            }
        });
        this.f162d.put(str, dVar);
        return new a(str, aVar);
    }

    public final androidx.activity.result.c j(String str, c.a aVar, androidx.activity.result.b bVar) {
        k(str);
        this.f164f.put(str, new c(bVar, aVar));
        if (this.f165g.containsKey(str)) {
            Object obj = this.f165g.get(str);
            this.f165g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f166h.getParcelable(str);
        if (aVar2 != null) {
            this.f166h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer num;
        if (!this.f163e.contains(str) && (num = (Integer) this.f161c.remove(str)) != null) {
            this.f160b.remove(num);
        }
        this.f164f.remove(str);
        if (this.f165g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f165g.get(str));
            this.f165g.remove(str);
        }
        if (this.f166h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f166h.getParcelable(str));
            this.f166h.remove(str);
        }
        d dVar = (d) this.f162d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f162d.remove(str);
        }
    }
}
