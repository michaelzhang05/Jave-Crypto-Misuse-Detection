package P;

import Q.AbstractC1400p;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: P.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1359d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8643a;

    public C1359d(Activity activity) {
        AbstractC1400p.m(activity, "Activity must not be null");
        this.f8643a = activity;
    }

    public final Activity a() {
        return (Activity) this.f8643a;
    }

    public final FragmentActivity b() {
        return (FragmentActivity) this.f8643a;
    }

    public final boolean c() {
        return this.f8643a instanceof Activity;
    }

    public final boolean d() {
        return this.f8643a instanceof FragmentActivity;
    }
}
