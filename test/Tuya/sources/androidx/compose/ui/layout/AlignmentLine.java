package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final X5.n merger;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ AlignmentLine(X5.n nVar, AbstractC3151p abstractC3151p) {
        this(nVar);
    }

    public final X5.n getMerger$ui_release() {
        return this.merger;
    }

    private AlignmentLine(X5.n nVar) {
        this.merger = nVar;
    }
}
