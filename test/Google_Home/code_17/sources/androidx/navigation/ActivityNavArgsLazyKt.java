package androidx.navigation;

import android.app.Activity;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class ActivityNavArgsLazyKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(Activity activity) {
        AbstractC3255y.i(activity, "<this>");
        AbstractC3255y.n(4, "Args");
        return new NavArgsLazy<>(U.b(NavArgs.class), new ActivityNavArgsLazyKt$navArgs$1(activity));
    }
}
