package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.f0;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class c0 extends f0.d implements f0.b {

    /* renamed from: a, reason: collision with root package name */
    private Application f3062a;

    /* renamed from: b, reason: collision with root package name */
    private final f0.b f3063b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f3064c;

    /* renamed from: d, reason: collision with root package name */
    private h f3065d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.savedstate.a f3066e;

    public c0(Application application, i0.d dVar, Bundle bundle) {
        f5.h.e(dVar, "owner");
        this.f3066e = dVar.d();
        this.f3065d = dVar.r();
        this.f3064c = bundle;
        this.f3062a = application;
        this.f3063b = application != null ? f0.a.f3075e.b(application) : new f0.a();
    }

    @Override // androidx.lifecycle.f0.b
    public e0 a(Class cls) {
        f5.h.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.f0.b
    public e0 b(Class cls, f0.a aVar) {
        f5.h.e(cls, "modelClass");
        f5.h.e(aVar, "extras");
        String str = (String) aVar.a(f0.c.f3082c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(z.f3134a) == null || aVar.a(z.f3135b) == null) {
            if (this.f3065d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(f0.a.f3077g);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor c6 = d0.c(cls, (!isAssignableFrom || application == null) ? d0.f3068b : d0.f3067a);
        return c6 == null ? this.f3063b.b(cls, aVar) : (!isAssignableFrom || application == null) ? d0.d(cls, c6, z.a(aVar)) : d0.d(cls, c6, application, z.a(aVar));
    }

    @Override // androidx.lifecycle.f0.d
    public void c(e0 e0Var) {
        f5.h.e(e0Var, "viewModel");
        if (this.f3065d != null) {
            androidx.savedstate.a aVar = this.f3066e;
            f5.h.b(aVar);
            h hVar = this.f3065d;
            f5.h.b(hVar);
            LegacySavedStateHandleController.a(e0Var, aVar, hVar);
        }
    }

    public final e0 d(String str, Class cls) {
        e0 d6;
        Application application;
        f5.h.e(str, "key");
        f5.h.e(cls, "modelClass");
        h hVar = this.f3065d;
        if (hVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor c6 = d0.c(cls, (!isAssignableFrom || this.f3062a == null) ? d0.f3068b : d0.f3067a);
        if (c6 == null) {
            return this.f3062a != null ? this.f3063b.a(cls) : f0.c.f3080a.a().a(cls);
        }
        androidx.savedstate.a aVar = this.f3066e;
        f5.h.b(aVar);
        SavedStateHandleController b6 = LegacySavedStateHandleController.b(aVar, hVar, str, this.f3064c);
        if (!isAssignableFrom || (application = this.f3062a) == null) {
            d6 = d0.d(cls, c6, b6.i());
        } else {
            f5.h.b(application);
            d6 = d0.d(cls, c6, application, b6.i());
        }
        d6.e("androidx.lifecycle.savedstate.vm.tag", b6);
        return d6;
    }
}
