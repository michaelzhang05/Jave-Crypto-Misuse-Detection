package m0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class y implements z {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f7546a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(View view) {
        this.f7546a = view.getOverlay();
    }

    @Override // m0.z
    public void b(Drawable drawable) {
        this.f7546a.add(drawable);
    }

    @Override // m0.z
    public void d(Drawable drawable) {
        this.f7546a.remove(drawable);
    }
}
