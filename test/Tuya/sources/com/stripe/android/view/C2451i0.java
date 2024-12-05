package com.stripe.android.view;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2451i0 implements LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {

    /* renamed from: a, reason: collision with root package name */
    private final LifecycleRegistry f27740a = new LifecycleRegistry(this);

    /* renamed from: b, reason: collision with root package name */
    private final ViewModelStore f27741b = new ViewModelStore();

    /* renamed from: c, reason: collision with root package name */
    private final SavedStateRegistryController f27742c = SavedStateRegistryController.Companion.create(this);

    private final void a(View view) {
        ViewTreeLifecycleOwner.set(view, this);
        ViewTreeViewModelStoreOwner.set(view, this);
        ViewTreeSavedStateRegistryOwner.set(view, this);
    }

    public final void b(View owner) {
        AbstractC3159y.i(owner, "owner");
        if (ViewTreeLifecycleOwner.get(owner) == null) {
            this.f27740a.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            this.f27740a.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            this.f27741b.clear();
            L5.I i8 = L5.I.f6487a;
        }
    }

    public final void c(View owner) {
        AbstractC3159y.i(owner, "owner");
        if (ViewTreeLifecycleOwner.get(owner) == null) {
            this.f27742c.performRestore(null);
            this.f27740a.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            SavedStateHandleSupport.enableSavedStateHandles(this);
            a(owner);
            this.f27740a.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            L5.I i8 = L5.I.f6487a;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f27740a;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.f27742c.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.f27741b;
    }
}
