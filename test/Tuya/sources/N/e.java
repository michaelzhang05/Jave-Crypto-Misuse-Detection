package N;

import android.os.Looper;
import android.os.Message;
import f0.HandlerC2656f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e extends HandlerC2656f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1255c f7106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C1255c c1255c, Looper looper) {
        super(looper);
        this.f7106a = c1255c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1255c.d(this.f7106a, message);
    }
}
