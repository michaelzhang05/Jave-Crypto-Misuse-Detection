package androidx.core.view;

import a6.InterfaceC1668n;
import android.view.View;
import android.view.ViewGroup;
import i6.AbstractC3000i;
import i6.InterfaceC2998g;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.k implements InterfaceC1668n {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, S5.d dVar) {
        super(2, dVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(AbstractC3000i abstractC3000i, S5.d dVar) {
        return ((ViewKt$allViews$1) create(abstractC3000i, dVar)).invokeSuspend(O5.I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3000i abstractC3000i;
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    O5.t.b(obj);
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC3000i = (AbstractC3000i) this.L$0;
            O5.t.b(obj);
        } else {
            O5.t.b(obj);
            abstractC3000i = (AbstractC3000i) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC3000i;
            this.label = 1;
            if (abstractC3000i.a(view, this) == e8) {
                return e8;
            }
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            InterfaceC2998g descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (abstractC3000i.c(descendants, this) == e8) {
                return e8;
            }
        }
        return O5.I.f8278a;
    }
}
