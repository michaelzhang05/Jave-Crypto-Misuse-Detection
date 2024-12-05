package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.savedstate.a;
import f5.f;
import f5.h;
import i0.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Recreator implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3625b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f3626a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f3627a;

        public b(androidx.savedstate.a aVar) {
            h.e(aVar, "registry");
            this.f3627a = new LinkedHashSet();
            aVar.h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3627a));
            return bundle;
        }

        public final void b(String str) {
            h.e(str, "className");
            this.f3627a.add(str);
        }
    }

    public Recreator(d dVar) {
        h.e(dVar, "owner");
        this.f3626a = dVar;
    }

    private final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0061a.class);
            h.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    h.d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0061a) newInstance).a(this.f3626a);
                } catch (Exception e6) {
                    throw new RuntimeException("Failed to instantiate " + str, e6);
                }
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("Class " + str + " wasn't found", e8);
        }
    }

    @Override // androidx.lifecycle.k
    public void d(m mVar, h.a aVar) {
        f5.h.e(mVar, "source");
        f5.h.e(aVar, "event");
        if (aVar != h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        mVar.r().c(this);
        Bundle b6 = this.f3626a.d().b("androidx.savedstate.Restarter");
        if (b6 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b6.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }
}
