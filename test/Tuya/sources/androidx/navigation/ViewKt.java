package androidx.navigation;

import android.view.View;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ViewKt {
    public static final NavController findNavController(View view) {
        AbstractC3159y.i(view, "<this>");
        return Navigation.findNavController(view);
    }
}
