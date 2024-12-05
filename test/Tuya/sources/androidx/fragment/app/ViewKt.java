package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ViewKt {
    public static final <F extends Fragment> F findFragment(View view) {
        AbstractC3159y.i(view, "<this>");
        F f8 = (F) FragmentManager.findFragment(view);
        AbstractC3159y.h(f8, "findFragment(this)");
        return f8;
    }
}
