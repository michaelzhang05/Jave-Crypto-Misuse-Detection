package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f3020a = new LegacySavedStateHandleController();

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0061a {
        @Override // androidx.savedstate.a.InterfaceC0061a
        public void a(i0.d dVar) {
            f5.h.e(dVar, "owner");
            if (!(dVar instanceof j0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            i0 n6 = ((j0) dVar).n();
            androidx.savedstate.a d6 = dVar.d();
            Iterator it = n6.c().iterator();
            while (it.hasNext()) {
                e0 b6 = n6.b((String) it.next());
                f5.h.b(b6);
                LegacySavedStateHandleController.a(b6, d6, dVar.r());
            }
            if (!n6.c().isEmpty()) {
                d6.i(a.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(e0 e0Var, androidx.savedstate.a aVar, h hVar) {
        f5.h.e(e0Var, "viewModel");
        f5.h.e(aVar, "registry");
        f5.h.e(hVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) e0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.h(aVar, hVar);
        f3020a.c(aVar, hVar);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, h hVar, String str, Bundle bundle) {
        f5.h.e(aVar, "registry");
        f5.h.e(hVar, "lifecycle");
        f5.h.b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, y.f3127f.a(aVar.b(str), bundle));
        savedStateHandleController.h(aVar, hVar);
        f3020a.c(aVar, hVar);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final h hVar) {
        h.b b6 = hVar.b();
        if (b6 == h.b.INITIALIZED || b6.b(h.b.STARTED)) {
            aVar.i(a.class);
        } else {
            hVar.a(new k() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.k
                public void d(m mVar, h.a aVar2) {
                    f5.h.e(mVar, "source");
                    f5.h.e(aVar2, "event");
                    if (aVar2 == h.a.ON_START) {
                        h.this.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
