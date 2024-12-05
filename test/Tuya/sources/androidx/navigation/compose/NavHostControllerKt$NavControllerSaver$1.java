package androidx.navigation.compose;

import X5.n;
import android.os.Bundle;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavHostController;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class NavHostControllerKt$NavControllerSaver$1 extends AbstractC3160z implements n {
    public static final NavHostControllerKt$NavControllerSaver$1 INSTANCE = new NavHostControllerKt$NavControllerSaver$1();

    NavHostControllerKt$NavControllerSaver$1() {
        super(2);
    }

    @Override // X5.n
    public final Bundle invoke(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.saveState();
    }
}
