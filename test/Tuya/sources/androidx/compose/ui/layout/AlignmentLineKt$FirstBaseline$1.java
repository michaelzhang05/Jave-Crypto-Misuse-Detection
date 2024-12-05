package androidx.compose.ui.layout;

import kotlin.jvm.internal.C3156v;

/* loaded from: classes.dex */
/* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends C3156v implements X5.n {
    public static final AlignmentLineKt$FirstBaseline$1 INSTANCE = new AlignmentLineKt$FirstBaseline$1();

    AlignmentLineKt$FirstBaseline$1() {
        super(2, Z5.a.class, "min", "min(II)I", 1);
    }

    public final Integer invoke(int i8, int i9) {
        return Integer.valueOf(Math.min(i8, i9));
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
