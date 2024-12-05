package d0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC2730i extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f31129a;

    public HandlerC2730i(Looper looper) {
        super(looper);
        this.f31129a = Looper.getMainLooper();
    }

    public HandlerC2730i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f31129a = Looper.getMainLooper();
    }
}
