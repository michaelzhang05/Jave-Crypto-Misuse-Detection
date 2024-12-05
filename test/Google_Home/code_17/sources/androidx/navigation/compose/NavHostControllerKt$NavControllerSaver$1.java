package androidx.navigation.compose;

import a6.InterfaceC1668n;
import android.os.Bundle;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavHostController;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class NavHostControllerKt$NavControllerSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final NavHostControllerKt$NavControllerSaver$1 INSTANCE = new NavHostControllerKt$NavControllerSaver$1();

    NavHostControllerKt$NavControllerSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Bundle invoke(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.saveState();
    }
}
