package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$9 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3539invokekLtJ_vA((PathComponent) obj, ((StrokeJoin) obj2).m3310unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
    public final void m3539invokekLtJ_vA(PathComponent pathComponent, int i8) {
        pathComponent.m3531setStrokeLineJoinWw9F2mQ(i8);
    }
}
