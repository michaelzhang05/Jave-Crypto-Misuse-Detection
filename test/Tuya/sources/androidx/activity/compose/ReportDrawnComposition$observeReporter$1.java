package androidx.activity.compose;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.O;

/* loaded from: classes.dex */
final class ReportDrawnComposition$observeReporter$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Function0 $predicate;
    final /* synthetic */ O $reporterPassed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(O o8, Function0 function0) {
        super(0);
        this.$reporterPassed = o8;
        this.$predicate = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m102invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m102invoke() {
        this.$reporterPassed.f33757a = ((Boolean) this.$predicate.invoke()).booleanValue();
    }
}
