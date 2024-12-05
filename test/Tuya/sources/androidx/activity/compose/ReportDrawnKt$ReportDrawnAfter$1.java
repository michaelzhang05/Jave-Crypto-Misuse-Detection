package androidx.activity.compose;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.activity.FullyDrawnReporter;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

@f(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", f = "ReportDrawn.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ReportDrawnKt$ReportDrawnAfter$1 extends l implements n {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1(FullyDrawnReporter fullyDrawnReporter, Function1 function1, d dVar) {
        super(2, dVar);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1(this.$fullyDrawnReporter, this.$block, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((ReportDrawnKt$ReportDrawnAfter$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
                try {
                    t.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            Function1 function1 = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (function1.invoke(this) == e8) {
                        return e8;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                } catch (Throwable th3) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
            return I.f6487a;
        }
        fullyDrawnReporter.removeReporter();
        return I.f6487a;
    }
}
