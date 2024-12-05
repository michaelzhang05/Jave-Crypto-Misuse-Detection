package c0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f3860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        f5.h.e(fragment, "fragment");
        f5.h.e(viewGroup, "container");
        this.f3860b = viewGroup;
    }
}
