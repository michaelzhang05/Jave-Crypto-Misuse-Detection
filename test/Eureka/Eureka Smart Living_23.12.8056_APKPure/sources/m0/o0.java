package m0;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class o0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f7530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(View view) {
        this.f7530a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof o0) && ((o0) obj).f7530a.equals(this.f7530a);
    }

    public int hashCode() {
        return this.f7530a.hashCode();
    }
}
