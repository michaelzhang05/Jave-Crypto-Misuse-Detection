package O;

import android.content.Context;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q extends e0.i {

    /* renamed from: b, reason: collision with root package name */
    private final Context f7684b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1263g f7685c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(O.C1263g r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f7685c = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f7684b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.q.<init>(O.g, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i8);
            return;
        }
        C1263g c1263g = this.f7685c;
        int g8 = c1263g.g(this.f7684b);
        if (c1263g.j(g8)) {
            this.f7685c.p(this.f7684b, g8);
        }
    }
}
