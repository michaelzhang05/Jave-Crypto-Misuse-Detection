package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

@Immutable
/* loaded from: classes.dex */
public final class ChangeSize {
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final Function1 size;

    /* renamed from: androidx.compose.animation.ChangeSize$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntSize.m5336boximpl(m158invokemzRDjE0(((IntSize) obj).m5348unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m158invokemzRDjE0(long j8) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    public ChangeSize(Alignment alignment, Function1 size, FiniteAnimationSpec<IntSize> animationSpec, boolean z8) {
        AbstractC3159y.i(alignment, "alignment");
        AbstractC3159y.i(size, "size");
        AbstractC3159y.i(animationSpec, "animationSpec");
        this.alignment = alignment;
        this.size = size;
        this.animationSpec = animationSpec;
        this.clip = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i8 & 2) != 0) {
            function1 = changeSize.size;
        }
        if ((i8 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i8 & 8) != 0) {
            z8 = changeSize.clip;
        }
        return changeSize.copy(alignment, function1, finiteAnimationSpec, z8);
    }

    public final Alignment component1() {
        return this.alignment;
    }

    public final Function1 component2() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    public final ChangeSize copy(Alignment alignment, Function1 size, FiniteAnimationSpec<IntSize> animationSpec, boolean z8) {
        AbstractC3159y.i(alignment, "alignment");
        AbstractC3159y.i(size, "size");
        AbstractC3159y.i(animationSpec, "animationSpec");
        return new ChangeSize(alignment, size, animationSpec, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return AbstractC3159y.d(this.alignment, changeSize.alignment) && AbstractC3159y.d(this.size, changeSize.size) && AbstractC3159y.d(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final Function1 getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31;
        boolean z8 = this.clip;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return hashCode + i8;
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    public /* synthetic */ ChangeSize(Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this(alignment, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : function1, finiteAnimationSpec, (i8 & 8) != 0 ? true : z8);
    }
}
