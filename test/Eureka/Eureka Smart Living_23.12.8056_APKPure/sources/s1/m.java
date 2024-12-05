package s1;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends d2.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9233a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f9234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f9234b = fVar;
        this.f9233a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i6 = message.what;
        if (i6 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i6);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int e6 = this.f9234b.e(this.f9233a);
        if (this.f9234b.h(e6)) {
            this.f9234b.m(this.f9233a, e6);
        }
    }
}
