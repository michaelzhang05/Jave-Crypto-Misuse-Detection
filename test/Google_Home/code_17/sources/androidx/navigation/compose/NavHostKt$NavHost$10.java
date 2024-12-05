package androidx.navigation.compose;

import O5.I;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class NavHostKt$NavHost$10 extends AbstractC3256z implements Function0 {
    final /* synthetic */ NavHostController $navController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$10(NavHostController navHostController) {
        super(0);
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5474invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5474invoke() {
        this.$navController.popBackStack();
    }
}
