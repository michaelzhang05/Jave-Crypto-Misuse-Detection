package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;

/* compiled from: SavedStateRegistryController.java */
/* loaded from: classes.dex */
public final class a {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f1729b = new SavedStateRegistry();

    private a(b bVar) {
        this.a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f1729b;
    }

    public void c(Bundle bundle) {
        f lifecycle = this.a.getLifecycle();
        if (lifecycle.b() == f.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.a));
            this.f1729b.b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.f1729b.c(bundle);
    }
}
