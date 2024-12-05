package N;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class s extends t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i8, int i9, Bundle bundle) {
        super(i8, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // N.t
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new u(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // N.t
    public final boolean b() {
        return true;
    }
}
