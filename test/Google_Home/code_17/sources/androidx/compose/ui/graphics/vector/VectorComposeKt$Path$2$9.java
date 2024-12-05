package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$9 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3544invokekLtJ_vA((PathComponent) obj, ((StrokeJoin) obj2).m3315unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
    public final void m3544invokekLtJ_vA(PathComponent pathComponent, int i8) {
        pathComponent.m3536setStrokeLineJoinWw9F2mQ(i8);
    }
}
