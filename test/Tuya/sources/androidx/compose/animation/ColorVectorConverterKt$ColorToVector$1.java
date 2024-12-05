package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import d6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends AbstractC3160z implements Function1 {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m159invoke8_81llA(((Color) obj).m2981unboximpl());
        }

        /* renamed from: invoke-8_81llA, reason: not valid java name */
        public final AnimationVector4D m159invoke8_81llA(long j8) {
            long m2968convertvNxB06k = Color.m2968convertvNxB06k(j8, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m2965component4impl(m2968convertvNxB06k), Color.m2962component1impl(m2968convertvNxB06k), Color.m2963component2impl(m2968convertvNxB06k), Color.m2964component3impl(m2968convertvNxB06k));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3160z implements Function1 {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Color.m2961boximpl(m160invokevNxB06k((AnimationVector4D) obj));
        }

        /* renamed from: invoke-vNxB06k, reason: not valid java name */
        public final long m160invokevNxB06k(AnimationVector4D vector) {
            AbstractC3159y.i(vector, "vector");
            return Color.m2968convertvNxB06k(ColorKt.Color(m.j(vector.getV2(), 0.0f, 1.0f), m.j(vector.getV3(), -0.5f, 0.5f), m.j(vector.getV4(), -0.5f, 0.5f), m.j(vector.getV1(), 0.0f, 1.0f), ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
        }
    }

    ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TwoWayConverter<Color, AnimationVector4D> invoke(ColorSpace colorSpace) {
        AbstractC3159y.i(colorSpace, "colorSpace");
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
