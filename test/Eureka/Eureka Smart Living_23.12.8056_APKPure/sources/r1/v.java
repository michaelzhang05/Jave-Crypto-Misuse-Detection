package r1;

import android.os.Bundle;

/* loaded from: classes.dex */
final class v extends t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v(int i6, int i7, Bundle bundle) {
        super(i6, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // r1.t
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // r1.t
    public final boolean b() {
        return false;
    }
}
