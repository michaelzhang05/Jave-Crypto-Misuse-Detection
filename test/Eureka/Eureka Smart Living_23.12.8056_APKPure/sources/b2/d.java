package b2;

import android.content.Context;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static d f3823b = new d();

    /* renamed from: a, reason: collision with root package name */
    private c f3824a = null;

    public static c a(Context context) {
        return f3823b.b(context);
    }

    public final synchronized c b(Context context) {
        if (this.f3824a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3824a = new c(context);
        }
        return this.f3824a;
    }
}
