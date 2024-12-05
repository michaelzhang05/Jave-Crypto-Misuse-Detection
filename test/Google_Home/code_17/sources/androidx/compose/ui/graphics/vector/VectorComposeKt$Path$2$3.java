package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.graphics.PathFillType;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$3 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Path$2$3 INSTANCE = new VectorComposeKt$Path$2$3();

    VectorComposeKt$Path$2$3() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3543invokepweu1eQ((PathComponent) obj, ((PathFillType) obj2).m3235unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-pweu1eQ, reason: not valid java name */
    public final void m3543invokepweu1eQ(PathComponent pathComponent, int i8) {
        pathComponent.m3534setPathFillTypeoQ8Xj4U(i8);
    }
}
