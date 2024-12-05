package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC3151p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = m2470constructorimpl(0);
    private static final int Node = m2470constructorimpl(1);
    private static final int ReusableNode = m2470constructorimpl(2);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m2478getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m2479getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m2480getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ GroupKind(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m2469boximpl(int i8) {
        return new GroupKind(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2470constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2471equalsimpl(int i8, Object obj) {
        return (obj instanceof GroupKind) && i8 == ((GroupKind) obj).m2477unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2472equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2473hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m2474isNodeimpl(int i8) {
        if (i8 != Companion.m2478getGroupULZAiWs()) {
            return true;
        }
        return false;
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m2475isReusableimpl(int i8) {
        if (i8 != Companion.m2479getNodeULZAiWs()) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2476toStringimpl(int i8) {
        return "GroupKind(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m2471equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2473hashCodeimpl(this.value);
    }

    public String toString() {
        return m2476toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2477unboximpl() {
        return this.value;
    }
}
