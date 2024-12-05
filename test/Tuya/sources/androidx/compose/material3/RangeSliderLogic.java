package androidx.compose.material3;

import X5.n;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import i6.AbstractC2829k;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final State<n> onDrag;
    private final State<Float> rawOffsetEnd;
    private final State<Float> rawOffsetStart;
    private final MutableInteractionSource startInteractionSource;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State<Float> rawOffsetStart, State<Float> rawOffsetEnd, State<? extends n> onDrag) {
        AbstractC3159y.i(startInteractionSource, "startInteractionSource");
        AbstractC3159y.i(endInteractionSource, "endInteractionSource");
        AbstractC3159y.i(rawOffsetStart, "rawOffsetStart");
        AbstractC3159y.i(rawOffsetEnd, "rawOffsetEnd");
        AbstractC3159y.i(onDrag, "onDrag");
        this.startInteractionSource = startInteractionSource;
        this.endInteractionSource = endInteractionSource;
        this.rawOffsetStart = rawOffsetStart;
        this.rawOffsetEnd = rawOffsetEnd;
        this.onDrag = onDrag;
    }

    public final MutableInteractionSource activeInteraction(boolean z8) {
        if (z8) {
            return this.startInteractionSource;
        }
        return this.endInteractionSource;
    }

    public final void captureThumb(boolean z8, float f8, Interaction interaction, M scope) {
        State<Float> state;
        AbstractC3159y.i(interaction, "interaction");
        AbstractC3159y.i(scope, "scope");
        n value = this.onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(z8);
        if (z8) {
            state = this.rawOffsetStart;
        } else {
            state = this.rawOffsetEnd;
        }
        value.invoke(valueOf, Float.valueOf(f8 - state.getValue().floatValue()));
        AbstractC2829k.d(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z8, interaction, null), 3, null);
    }

    public final int compareOffsets(float f8) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - f8), Math.abs(this.rawOffsetEnd.getValue().floatValue() - f8));
    }

    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    public final State<n> getOnDrag() {
        return this.onDrag;
    }

    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
