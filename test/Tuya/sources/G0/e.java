package g0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f31170a;

    public e(Looper looper) {
        super(looper);
        this.f31170a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f31170a = Looper.getMainLooper();
    }
}
