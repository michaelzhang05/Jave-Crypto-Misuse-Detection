package androidx.compose.material3;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.o;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", l = {1031}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 extends l implements o {
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, d dVar) {
        super(3, dVar);
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    public final Object invoke(M m8, float f8, d dVar) {
        AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(this.$scrollBehavior, dVar);
        appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1.F$0 = f8;
        return appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1.invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            float f8 = this.F$0;
            TopAppBarState state = this.$scrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$scrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$scrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            obj2 = AppBarKt.settleAppBar(state, f8, flingAnimationSpec, snapAnimationSpec, this);
            if (obj2 == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((M) obj, ((Number) obj2).floatValue(), (d) obj3);
    }
}
