package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostControllerKt$NavControllerSaver$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$NavControllerSaver$2(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavHostController invoke(Bundle bundle) {
        NavHostController createNavController;
        createNavController = NavHostControllerKt.createNavController(this.$context);
        createNavController.restoreState(bundle);
        return createNavController;
    }
}
