package u1;

import android.app.Activity;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9386a;

    public d(Activity activity) {
        v1.n.i(activity, "Activity must not be null");
        this.f9386a = activity;
    }

    public final Activity a() {
        return (Activity) this.f9386a;
    }

    public final androidx.fragment.app.j b() {
        return (androidx.fragment.app.j) this.f9386a;
    }

    public final boolean c() {
        return this.f9386a instanceof Activity;
    }

    public final boolean d() {
        return this.f9386a instanceof androidx.fragment.app.j;
    }
}
