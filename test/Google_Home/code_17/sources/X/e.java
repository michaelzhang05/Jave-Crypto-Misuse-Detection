package X;

import android.content.Context;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f12709b = new e();

    /* renamed from: a, reason: collision with root package name */
    private d f12710a = null;

    public static d a(Context context) {
        return f12709b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f12710a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f12710a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12710a;
    }
}
