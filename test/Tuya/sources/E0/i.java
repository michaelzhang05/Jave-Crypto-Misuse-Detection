package e0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class i extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f30223a;

    public i(Looper looper) {
        super(looper);
        this.f30223a = Looper.getMainLooper();
    }

    public i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f30223a = Looper.getMainLooper();
    }
}
