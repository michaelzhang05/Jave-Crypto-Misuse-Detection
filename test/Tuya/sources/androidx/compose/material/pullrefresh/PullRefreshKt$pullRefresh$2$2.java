package androidx.compose.material.pullrefresh;

import P5.d;
import X5.n;
import kotlin.jvm.internal.C3136a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public /* synthetic */ class PullRefreshKt$pullRefresh$2$2 extends C3136a implements n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PullRefreshKt$pullRefresh$2$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    public final Object invoke(float f8, d dVar) {
        Object pullRefresh$lambda$1$onRelease;
        pullRefresh$lambda$1$onRelease = PullRefreshKt.pullRefresh$lambda$1$onRelease((PullRefreshState) this.receiver, f8, dVar);
        return pullRefresh$lambda$1$onRelease;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (d) obj2);
    }
}
