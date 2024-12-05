package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    private Bundle f1726b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1727c;
    private c.b.a.b.b<String, b> a = new c.b.a.b.b<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f1728d = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f1727c) {
            Bundle bundle = this.f1726b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1726b.remove(str);
            if (this.f1726b.isEmpty()) {
                this.f1726b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f fVar, Bundle bundle) {
        if (!this.f1727c) {
            if (bundle != null) {
                this.f1726b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            fVar.a(new h() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.h
                public void a(j jVar, f.a aVar) {
                    if (aVar == f.a.ON_START) {
                        SavedStateRegistry.this.f1728d = true;
                    } else if (aVar == f.a.ON_STOP) {
                        SavedStateRegistry.this.f1728d = false;
                    }
                }
            });
            this.f1727c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1726b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        c.b.a.b.b<String, b>.d o = this.a.o();
        while (o.hasNext()) {
            Map.Entry next = o.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
