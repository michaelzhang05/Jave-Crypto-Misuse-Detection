package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import androidx.compose.ui.graphics.PathFillType;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$3 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Path$2$3 INSTANCE = new VectorComposeKt$Path$2$3();

    VectorComposeKt$Path$2$3() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3538invokepweu1eQ((PathComponent) obj, ((PathFillType) obj2).m3230unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-pweu1eQ, reason: not valid java name */
    public final void m3538invokepweu1eQ(PathComponent pathComponent, int i8) {
        pathComponent.m3529setPathFillTypeoQ8Xj4U(i8);
    }
}
