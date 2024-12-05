package c0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f3858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        f5.h.e(fragment, "fragment");
        this.f3858b = viewGroup;
    }
}
