package androidx.compose.runtime.internal;

import L5.I;
import M5.AbstractC1239l;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d6.m;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.X;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl$invoke$1 extends AbstractC3160z implements n {
    final /* synthetic */ Object[] $args;
    final /* synthetic */ int $realParams;
    final /* synthetic */ ComposableLambdaNImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaNImpl$invoke$1(Object[] objArr, int i8, ComposableLambdaNImpl composableLambdaNImpl) {
        super(2);
        this.$args = objArr;
        this.$realParams = i8;
        this.this$0 = composableLambdaNImpl;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        Object[] array = AbstractC1239l.L0(this.$args, m.s(0, this.$realParams)).toArray(new Object[0]);
        Object obj = this.$args[this.$realParams + 1];
        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.Int");
        int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj).intValue());
        int length = (this.$args.length - this.$realParams) - 2;
        Object[] objArr = new Object[length];
        for (int i9 = 0; i9 < length; i9++) {
            Object obj2 = this.$args[this.$realParams + 2 + i9];
            AbstractC3159y.g(obj2, "null cannot be cast to non-null type kotlin.Int");
            objArr[i9] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj2).intValue()));
        }
        ComposableLambdaNImpl composableLambdaNImpl = this.this$0;
        X x8 = new X(4);
        x8.b(array);
        x8.a(composer);
        x8.a(Integer.valueOf(updateChangedFlags | 1));
        x8.b(objArr);
        composableLambdaNImpl.invoke(x8.d(new Object[x8.c()]));
    }
}
