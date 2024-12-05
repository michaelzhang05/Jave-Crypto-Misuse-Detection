package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.savedstate.Recreator;
import f5.f;
import i.b;
import i0.d;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final b f3628g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f3630b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f3631c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3632d;

    /* renamed from: e, reason: collision with root package name */
    private Recreator.b f3633e;

    /* renamed from: a, reason: collision with root package name */
    private final i.b f3629a = new i.b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f3634f = true;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0061a {
        void a(d dVar);
    }

    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, m mVar, h.a aVar2) {
        boolean z5;
        f5.h.e(aVar, "this$0");
        f5.h.e(mVar, "<anonymous parameter 0>");
        f5.h.e(aVar2, "event");
        if (aVar2 == h.a.ON_START) {
            z5 = true;
        } else if (aVar2 != h.a.ON_STOP) {
            return;
        } else {
            z5 = false;
        }
        aVar.f3634f = z5;
    }

    public final Bundle b(String str) {
        f5.h.e(str, "key");
        if (!this.f3632d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f3631c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3631c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3631c;
        boolean z5 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z5 = true;
        }
        if (!z5) {
            this.f3631c = null;
        }
        return bundle2;
    }

    public final c c(String str) {
        f5.h.e(str, "key");
        Iterator it = this.f3629a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f5.h.d(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (f5.h.a(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(h hVar) {
        f5.h.e(hVar, "lifecycle");
        if (!(!this.f3630b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        hVar.a(new k() { // from class: i0.b
            @Override // androidx.lifecycle.k
            public final void d(m mVar, h.a aVar) {
                androidx.savedstate.a.d(androidx.savedstate.a.this, mVar, aVar);
            }
        });
        this.f3630b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f3630b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f3632d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f3631c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f3632d = true;
    }

    public final void g(Bundle bundle) {
        f5.h.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3631c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.d k6 = this.f3629a.k();
        f5.h.d(k6, "this.components.iteratorWithAdditions()");
        while (k6.hasNext()) {
            Map.Entry entry = (Map.Entry) k6.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        f5.h.e(str, "key");
        f5.h.e(cVar, "provider");
        if (!(((c) this.f3629a.n(str, cVar)) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class cls) {
        f5.h.e(cls, "clazz");
        if (!this.f3634f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f3633e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f3633e = bVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f3633e;
            if (bVar2 != null) {
                String name = cls.getName();
                f5.h.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }
}
