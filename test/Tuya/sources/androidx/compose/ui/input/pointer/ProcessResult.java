package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m4089boximpl(int i8) {
        return new ProcessResult(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4090constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4091equalsimpl(int i8, Object obj) {
        return (obj instanceof ProcessResult) && i8 == ((ProcessResult) obj).m4097unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4092equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m4093getAnyMovementConsumedimpl(int i8) {
        return (i8 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m4094getDispatchedToAPointerInputModifierimpl(int i8) {
        return (i8 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4095hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4096toStringimpl(int i8) {
        return "ProcessResult(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m4091equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4095hashCodeimpl(this.value);
    }

    public String toString() {
        return m4096toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4097unboximpl() {
        return this.value;
    }
}
