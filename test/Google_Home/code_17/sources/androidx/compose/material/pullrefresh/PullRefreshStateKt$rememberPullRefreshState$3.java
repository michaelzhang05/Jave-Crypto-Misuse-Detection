package androidx.compose.material.pullrefresh;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
final class PullRefreshStateKt$rememberPullRefreshState$3 extends AbstractC3256z implements Function0 {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ P $refreshingOffsetPx;
    final /* synthetic */ PullRefreshState $state;
    final /* synthetic */ P $thresholdPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshStateKt$rememberPullRefreshState$3(PullRefreshState pullRefreshState, boolean z8, P p8, P p9) {
        super(0);
        this.$state = pullRefreshState;
        this.$refreshing = z8;
        this.$thresholdPx = p8;
        this.$refreshingOffsetPx = p9;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1439invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1439invoke() {
        this.$state.setRefreshing$material_release(this.$refreshing);
        this.$state.setThreshold$material_release(this.$thresholdPx.f34159a);
        this.$state.setRefreshingOffset$material_release(this.$refreshingOffsetPx.f34159a);
    }
}
