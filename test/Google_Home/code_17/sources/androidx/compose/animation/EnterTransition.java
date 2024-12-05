package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, 15, null));

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final EnterTransition getNone() {
            return EnterTransition.None;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ EnterTransition(AbstractC3247p abstractC3247p) {
        this();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof EnterTransition) && AbstractC3255y.d(((EnterTransition) obj).getData$animation_release(), getData$animation_release())) {
            return true;
        }
        return false;
    }

    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    public final EnterTransition plus(EnterTransition enter) {
        AbstractC3255y.i(enter, "enter");
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = enter.getData$animation_release().getFade();
        }
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = enter.getData$animation_release().getSlide();
        }
        ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = enter.getData$animation_release().getChangeSize();
        }
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = enter.getData$animation_release().getScale();
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale));
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (AbstractC3255y.d(this, None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        Fade fade = data$animation_release.getFade();
        String str4 = null;
        if (fade != null) {
            str = fade.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        Slide slide = data$animation_release.getSlide();
        if (slide != null) {
            str2 = slide.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = data$animation_release.getChangeSize();
        if (changeSize != null) {
            str3 = changeSize.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        Scale scale = data$animation_release.getScale();
        if (scale != null) {
            str4 = scale.toString();
        }
        sb.append(str4);
        return sb.toString();
    }

    private EnterTransition() {
    }
}
