package M;

import android.os.Looper;
import android.os.Message;
import e0.HandlerC2769f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i extends HandlerC2769f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1300c f6364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1300c c1300c, Looper looper) {
        super(looper);
        this.f6364b = c1300c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1300c.g(this.f6364b, message);
    }
}
