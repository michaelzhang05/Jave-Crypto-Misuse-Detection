package m0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class u implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f7544a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(ViewGroup viewGroup) {
        this.f7544a = viewGroup.getOverlay();
    }

    @Override // m0.v
    public void a(View view) {
        this.f7544a.add(view);
    }

    @Override // m0.z
    public void b(Drawable drawable) {
        this.f7544a.add(drawable);
    }

    @Override // m0.v
    public void c(View view) {
        this.f7544a.remove(view);
    }

    @Override // m0.z
    public void d(Drawable drawable) {
        this.f7544a.remove(drawable);
    }
}
