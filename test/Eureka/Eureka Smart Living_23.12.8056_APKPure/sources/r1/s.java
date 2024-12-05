package r1;

import android.os.Bundle;

/* loaded from: classes.dex */
final class s extends t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i6, int i7, Bundle bundle) {
        super(i6, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // r1.t
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new u(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // r1.t
    public final boolean b() {
        return true;
    }
}
