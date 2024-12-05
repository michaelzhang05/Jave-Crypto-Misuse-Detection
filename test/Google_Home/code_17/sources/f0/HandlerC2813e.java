package f0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC2813e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f31854a;

    public HandlerC2813e(Looper looper) {
        super(looper);
        this.f31854a = Looper.getMainLooper();
    }

    public HandlerC2813e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f31854a = Looper.getMainLooper();
    }
}
