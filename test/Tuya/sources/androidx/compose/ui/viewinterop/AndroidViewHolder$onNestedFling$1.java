package androidx.compose.ui.viewinterop;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {560, 565}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedFling$1 extends l implements n {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z8, AndroidViewHolder androidViewHolder, long j8, d dVar) {
        super(2, dVar);
        this.$consumed = z8;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((AndroidViewHolder$onNestedFling$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        NestedScrollDispatcher nestedScrollDispatcher2;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1 && i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            if (!this.$consumed) {
                nestedScrollDispatcher2 = this.this$0.dispatcher;
                long m5420getZero9UxMQ8M = Velocity.Companion.m5420getZero9UxMQ8M();
                long j8 = this.$viewVelocity;
                this.label = 1;
                if (nestedScrollDispatcher2.m3911dispatchPostFlingRZ2iAVY(m5420getZero9UxMQ8M, j8, this) == e8) {
                    return e8;
                }
            } else {
                nestedScrollDispatcher = this.this$0.dispatcher;
                long j9 = this.$viewVelocity;
                long m5420getZero9UxMQ8M2 = Velocity.Companion.m5420getZero9UxMQ8M();
                this.label = 2;
                if (nestedScrollDispatcher.m3911dispatchPostFlingRZ2iAVY(j9, m5420getZero9UxMQ8M2, this) == e8) {
                    return e8;
                }
            }
        }
        return I.f6487a;
    }
}
