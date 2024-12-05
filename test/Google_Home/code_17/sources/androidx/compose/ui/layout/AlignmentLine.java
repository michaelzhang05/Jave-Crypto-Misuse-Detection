package androidx.compose.ui.layout;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final InterfaceC1668n merger;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ AlignmentLine(InterfaceC1668n interfaceC1668n, AbstractC3247p abstractC3247p) {
        this(interfaceC1668n);
    }

    public final InterfaceC1668n getMerger$ui_release() {
        return this.merger;
    }

    private AlignmentLine(InterfaceC1668n interfaceC1668n) {
        this.merger = interfaceC1668n;
    }
}
