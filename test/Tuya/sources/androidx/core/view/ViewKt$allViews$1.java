package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import f6.AbstractC2682i;
import f6.InterfaceC2680g;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.k implements X5.n {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, P5.d dVar) {
        super(2, dVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // X5.n
    public final Object invoke(AbstractC2682i abstractC2682i, P5.d dVar) {
        return ((ViewKt$allViews$1) create(abstractC2682i, dVar)).invokeSuspend(L5.I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2682i abstractC2682i;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    L5.t.b(obj);
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC2682i = (AbstractC2682i) this.L$0;
            L5.t.b(obj);
        } else {
            L5.t.b(obj);
            abstractC2682i = (AbstractC2682i) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC2682i;
            this.label = 1;
            if (abstractC2682i.c(view, this) == e8) {
                return e8;
            }
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            InterfaceC2680g descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (abstractC2682i.e(descendants, this) == e8) {
                return e8;
            }
        }
        return L5.I.f6487a;
    }
}
