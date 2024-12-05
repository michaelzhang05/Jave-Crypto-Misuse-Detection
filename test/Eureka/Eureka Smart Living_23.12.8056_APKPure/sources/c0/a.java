package c0;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: b, reason: collision with root package name */
    private final String f3840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        f5.h.e(fragment, "fragment");
        f5.h.e(str, "previousFragmentId");
        this.f3840b = str;
    }
}
