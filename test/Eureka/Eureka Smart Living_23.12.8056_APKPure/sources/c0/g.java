package c0;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f3859a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Fragment fragment, String str) {
        super(str);
        f5.h.e(fragment, "fragment");
        this.f3859a = fragment;
    }

    public final Fragment a() {
        return this.f3859a;
    }
}
