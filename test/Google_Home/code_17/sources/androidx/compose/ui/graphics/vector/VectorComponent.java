package androidx.compose.ui.graphics.vector;

import O5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    private final DrawCache cacheDrawScope;
    private final Function1 drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private Function0 invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final MutableState viewportSize$delegate;

    /* renamed from: androidx.compose.ui.graphics.vector.VectorComponent$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((VNode) obj);
            return I.f8278a;
        }

        public final void invoke(VNode vNode) {
            VectorComponent.this.doInvalidate();
        }
    }

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new AnonymousClass1());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = VectorComponent$invalidateCallback$1.INSTANCE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.intrinsicColorFilter$delegate = mutableStateOf$default;
        Size.Companion companion = Size.Companion;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2797boximpl(companion.m2818getZeroNHjbRc()), null, 2, null);
        this.viewportSize$delegate = mutableStateOf$default2;
        this.previousDrawSize = companion.m2817getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new VectorComponent$drawVectorBlock$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(DrawScope drawScope, float f8, ColorFilter colorFilter) {
        int m3177getArgb8888_sVssgQ;
        if (this.root.isTintable() && this.root.m3522getTintColor0d7_KjU() != Color.Companion.m3012getUnspecified0d7_KjU() && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && VectorKt.tintableWithAlphaMask(colorFilter)) {
            m3177getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m3176getAlpha8_sVssgQ();
        } else {
            m3177getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m3177getArgb8888_sVssgQ();
        }
        int i8 = m3177getArgb8888_sVssgQ;
        if (this.isDirty || !Size.m2805equalsimpl0(this.previousDrawSize, drawScope.mo3419getSizeNHjbRc()) || !ImageBitmapConfig.m3172equalsimpl0(i8, m3537getCacheBitmapConfig_sVssgQ$ui_release())) {
            this.tintFilter = ImageBitmapConfig.m3172equalsimpl0(i8, ImageBitmapConfig.Companion.m3176getAlpha8_sVssgQ()) ? ColorFilter.Companion.m3017tintxETnrds$default(ColorFilter.Companion, this.root.m3522getTintColor0d7_KjU(), 0, 2, null) : null;
            this.rootScaleX = Size.m2809getWidthimpl(drawScope.mo3419getSizeNHjbRc()) / Size.m2809getWidthimpl(m3538getViewportSizeNHjbRc$ui_release());
            this.rootScaleY = Size.m2806getHeightimpl(drawScope.mo3419getSizeNHjbRc()) / Size.m2806getHeightimpl(m3538getViewportSizeNHjbRc$ui_release());
            this.cacheDrawScope.m3520drawCachedImageFqjB98A(i8, IntSizeKt.IntSize((int) Math.ceil(Size.m2809getWidthimpl(drawScope.mo3419getSizeNHjbRc())), (int) Math.ceil(Size.m2806getHeightimpl(drawScope.mo3419getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo3419getSizeNHjbRc();
        }
        if (colorFilter == null) {
            if (getIntrinsicColorFilter$ui_release() != null) {
                colorFilter = getIntrinsicColorFilter$ui_release();
            } else {
                colorFilter = this.tintFilter;
            }
        }
        this.cacheDrawScope.drawInto(drawScope, f8, colorFilter);
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m3537getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        if (mCachedImage != null) {
            return mCachedImage.mo2849getConfig_sVssgQ();
        }
        return ImageBitmapConfig.Companion.m3177getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final Function0 getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    public final String getName() {
        return this.name;
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m3538getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize$delegate.getValue()).m2814unboximpl();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(Function0 function0) {
        this.invalidateCallback = function0;
    }

    public final void setName(String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m3539setViewportSizeuvyYCjk$ui_release(long j8) {
        this.viewportSize$delegate.setValue(Size.m2797boximpl(j8));
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + Size.m2809getWidthimpl(m3538getViewportSizeNHjbRc$ui_release()) + "\n\tviewportHeight: " + Size.m2806getHeightimpl(m3538getViewportSizeNHjbRc$ui_release()) + "\n";
        AbstractC3255y.h(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
