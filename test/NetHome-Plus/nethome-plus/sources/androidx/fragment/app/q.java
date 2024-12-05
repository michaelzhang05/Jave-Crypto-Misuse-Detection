package androidx.fragment.app;

import androidx.lifecycle.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public class q implements androidx.lifecycle.j {

    /* renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.k f1227f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f.a aVar) {
        this.f1227f.i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1227f == null) {
            this.f1227f = new androidx.lifecycle.k(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f1227f != null;
    }

    @Override // androidx.lifecycle.j
    public androidx.lifecycle.f getLifecycle() {
        b();
        return this.f1227f;
    }
}
