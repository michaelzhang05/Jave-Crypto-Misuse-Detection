package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface PageSize {

    @StabilityInferred(parameters = 0)
    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public static final class Fill implements PageSize {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i8, int i9) {
            AbstractC3159y.i(density, "<this>");
            return i8;
        }
    }

    @StabilityInferred(parameters = 0)
    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        public /* synthetic */ Fixed(float f8, AbstractC3151p abstractC3151p) {
            this(f8);
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i8, int i9) {
            AbstractC3159y.i(density, "<this>");
            return density.mo442roundToPx0680j_4(this.pageSize);
        }

        /* renamed from: getPageSize-D9Ej5fM, reason: not valid java name */
        public final float m806getPageSizeD9Ej5fM() {
            return this.pageSize;
        }

        private Fixed(float f8) {
            this.pageSize = f8;
        }
    }

    int calculateMainAxisPageSize(Density density, int i8, int i9);
}
