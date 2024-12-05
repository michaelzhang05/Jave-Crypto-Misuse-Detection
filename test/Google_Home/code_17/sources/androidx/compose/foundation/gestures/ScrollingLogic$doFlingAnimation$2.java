package androidx.compose.foundation.gestures;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.S;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {500}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends l implements InterfaceC1668n {
    final /* synthetic */ long $available;
    final /* synthetic */ S $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, S s8, long j8, S5.d dVar) {
        super(2, dVar);
        this.this$0 = scrollingLogic;
        this.$result = s8;
        this.$available = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, dVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(ScrollScope scrollScope, S5.d dVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        S s8;
        ScrollingLogic scrollingLogic2;
        long j8;
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                j8 = this.J$0;
                s8 = (S) this.L$2;
                scrollingLogic = (ScrollingLogic) this.L$1;
                scrollingLogic2 = (ScrollingLogic) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            final ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 scrollingLogic$doFlingAnimation$2$outerScopeScroll$1 = new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(this.this$0, (ScrollScope) this.L$0);
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f8) {
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return scrollingLogic4.m472toFloatk4lQ0M(((Offset) scrollingLogic$doFlingAnimation$2$outerScopeScroll$1.invoke(Offset.m2729boximpl(scrollingLogic4.m473toOffsettuRUvjQ(f8)))).m2750unboximpl());
                }
            };
            scrollingLogic = this.this$0;
            S s9 = this.$result;
            long j9 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.getFlingBehavior();
            long j10 = s9.f34161a;
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m471toFloatTH1AsA0(j9));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = s9;
            this.J$0 = j10;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope, reverseIfNeeded, this);
            if (obj == e8) {
                return e8;
            }
            s8 = s9;
            scrollingLogic2 = scrollingLogic;
            j8 = j10;
        }
        s8.f34161a = scrollingLogic.m474updateQWom1Mo(j8, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return I.f8278a;
    }
}
