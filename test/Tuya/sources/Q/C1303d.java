package Q;

import R.AbstractC1319p;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: Q.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1303d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8152a;

    public C1303d(Activity activity) {
        AbstractC1319p.m(activity, "Activity must not be null");
        this.f8152a = activity;
    }

    public final Activity a() {
        return (Activity) this.f8152a;
    }

    public final FragmentActivity b() {
        return (FragmentActivity) this.f8152a;
    }

    public final boolean c() {
        return this.f8152a instanceof Activity;
    }

    public final boolean d() {
        return this.f8152a instanceof FragmentActivity;
    }
}
