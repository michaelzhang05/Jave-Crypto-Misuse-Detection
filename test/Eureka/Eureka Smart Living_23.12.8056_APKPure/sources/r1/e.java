package r1;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends e2.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f9074a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Looper looper) {
        super(looper);
        this.f9074a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.d(this.f9074a, message);
    }
}
