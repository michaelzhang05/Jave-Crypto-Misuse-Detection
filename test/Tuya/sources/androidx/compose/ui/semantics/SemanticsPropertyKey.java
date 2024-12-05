package androidx.compose.ui.semantics;

import X5.n;
import androidx.compose.runtime.internal.StabilityInferred;
import e6.i;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;
    private final n mergePolicy;
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // X5.n
        public final T invoke(T t8, T t9) {
            return t8 == null ? t9 : t8;
        }
    }

    public SemanticsPropertyKey(String str, n nVar) {
        this.name = str;
        this.mergePolicy = nVar;
    }

    public final n getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, i iVar) {
        Object throwSemanticsGetNotSupported;
        throwSemanticsGetNotSupported = SemanticsPropertiesKt.throwSemanticsGetNotSupported();
        return (T) throwSemanticsGetNotSupported;
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    public final T merge(T t8, T t9) {
        return (T) this.mergePolicy.invoke(t8, t9);
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, i iVar, T t8) {
        semanticsPropertyReceiver.set(this, t8);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, n nVar, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z8) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z8;
    }

    public SemanticsPropertyKey(String str, boolean z8, n nVar) {
        this(str, nVar);
        this.isImportantForAccessibility = z8;
    }
}
