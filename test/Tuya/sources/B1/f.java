package B1;

import android.content.Context;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static f f682b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f683a;

    private f() {
    }

    public static f c() {
        return f682b;
    }

    public Context a() {
        return this.f683a;
    }

    public void b(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f683a = context2;
    }
}
