package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Handler create() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
