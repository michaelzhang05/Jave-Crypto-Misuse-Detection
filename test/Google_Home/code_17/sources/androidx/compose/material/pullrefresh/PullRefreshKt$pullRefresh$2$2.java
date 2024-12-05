package androidx.compose.material.pullrefresh;

import S5.d;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.C3232a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public /* synthetic */ class PullRefreshKt$pullRefresh$2$2 extends C3232a implements InterfaceC1668n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PullRefreshKt$pullRefresh$2$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    public final Object invoke(float f8, d dVar) {
        Object pullRefresh$lambda$1$onRelease;
        pullRefresh$lambda$1$onRelease = PullRefreshKt.pullRefresh$lambda$1$onRelease((PullRefreshState) this.receiver, f8, dVar);
        return pullRefresh$lambda$1$onRelease;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (d) obj2);
    }
}
