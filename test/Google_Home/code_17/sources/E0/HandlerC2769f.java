package e0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC2769f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f31240a;

    public HandlerC2769f(Looper looper) {
        super(looper);
        this.f31240a = Looper.getMainLooper();
    }

    public HandlerC2769f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f31240a = Looper.getMainLooper();
    }
}
