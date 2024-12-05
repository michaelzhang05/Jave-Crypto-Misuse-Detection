package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public interface PressInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Cancel implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Cancel(Press press) {
            AbstractC3159y.i(press, "press");
            this.press = press;
        }

        public final Press getPress() {
            return this.press;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Press implements PressInteraction {
        public static final int $stable = 0;
        private final long pressPosition;

        public /* synthetic */ Press(long j8, AbstractC3151p abstractC3151p) {
            this(j8);
        }

        /* renamed from: getPressPosition-F1C5BW0, reason: not valid java name */
        public final long m481getPressPositionF1C5BW0() {
            return this.pressPosition;
        }

        private Press(long j8) {
            this.pressPosition = j8;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Release implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Release(Press press) {
            AbstractC3159y.i(press, "press");
            this.press = press;
        }

        public final Press getPress() {
            return this.press;
        }
    }
}
